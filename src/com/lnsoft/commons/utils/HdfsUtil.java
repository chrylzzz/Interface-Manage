package com.lnsoft.commons.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.permission.FsAction;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.hadoop.io.compress.CompressionInputStream;
import org.apache.hadoop.io.compress.CompressionOutputStream;
import org.apache.hadoop.util.Progressable;
import org.apache.hadoop.util.ReflectionUtils;
/**
 * 
 * @author Chr
 *
 */
public class HdfsUtil {
	private static Configuration conf;
	private static String fsPath;
	static {
		conf = new Configuration();
		fsPath = "hdfs://nncluster";
	}

	public static void main(String[] args) {
		// System.setProperty("HADOOP_USER_NAME", "hadoop");
		// getPermission("/data4");
		 mkDir("/testDir1");
		// createFile("/testDir/testFile");
		// deleteFile("/data");
		// uploadFile("F://ok/数据/datas", "/data4");
		// downloadFile("/data3", "F://aa");
		// uploadFileWithCompress("F://ok/数据/datas", "/data3", "");
		// downloadFileWithUncompress("/data1", "F://aa", "gzip");
		// uploadFileWithPermission("F://ok/数据/data", "data", "hadoop", "000");
		// downloadFileWithPermission("data", "F://data", "hadoop");
		// copyFromLocalFile("F://ok/数据/data", "/data");
		// copyToLocalFile("/data", "F://data");
		// readFile("/data");
		// reName("/data1", "/data");
		// listStatus("/");
	}

	public static void getPermission(String hdfsPath) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			FsPermission permission = fs.getFileStatus(new Path(hdfsPath))
					.getPermission();
			FsAction user = permission.getUserAction();
			FsAction group = permission.getGroupAction();
			FsAction other = permission.getOtherAction();
			System.out.println("~~~~~~~~~~用户权限~~~~~~~~~~~~");
			System.out.println(user.implies(FsAction.READ));
			System.out.println(user.implies(FsAction.WRITE));
			System.out.println(user.implies(FsAction.EXECUTE));
			System.out.println("~~~~~~~~~~用户组权限~~~~~~~~~~~~");
			System.out.println(group.implies(FsAction.READ));
			System.out.println(group.implies(FsAction.WRITE));
			System.out.println(group.implies(FsAction.EXECUTE));
			System.out.println("~~~~~~~~~~其他权限~~~~~~~~~~~~");
			System.out.println(other.implies(FsAction.READ));
			System.out.println(other.implies(FsAction.WRITE));
			System.out.println(other.implies(FsAction.EXECUTE));
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 创建文件夹
	 * 
	 * @param hdfsPath
	 */
	public static void mkDir(String hdfsPath) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			//fs.append(f)
			fs.mkdirs(new Path(hdfsPath));
			fs.close();
			System.out.println("创建文件夹成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("创建文件夹失败");
		}
	}

	/**
	 * 创建文件
	 * 
	 * @param hdfsPath
	 */
	public static void createFile(String hdfsPath) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			fs.createNewFile(new Path(hdfsPath));
			fs.close();
			System.out.println("创建文件成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("创建文件失败");
		}
	}

	/**
	 * 删除文件
	 * 
	 * @param hdfsPath
	 */
	public static void deleteFile(String hdfsPath) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			fs.delete(new Path(hdfsPath), true);
			fs.close();
			System.out.println("删除文件成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除文件失败");
		}
	}

	/**
	 * 上传
	 * 
	 * @param filePath
	 * @param hdfsPath
	 */
	public static void uploadFile(String filePath, String hdfsPath) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			fs.exists(new Path(hdfsPath));
			FileInputStream in = new FileInputStream(new File(filePath));
			FSDataOutputStream out = fs.create(new Path(hdfsPath),
					new Progressable() {
						@Override
						public void progress() {
							System.out.print(".");
						}
					});
			IOUtils.copyBytes(in, out, conf);
			IOUtils.closeStream(in);
			IOUtils.closeStream(out);
			fs.close();
			System.out.println("上传文件成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("上传文件失败");
		}
	}

	/**
	 * 下载
	 * 
	 * @param hdfsPath
	 * @param filePath
	 * @param codecName
	 */
	public static void downloadFile(String hdfsPath, String filePath) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			FSDataInputStream in = fs.open(new Path(hdfsPath));
			OutputStream out = new FileOutputStream(new File(filePath));
			IOUtils.copyBytes(in, out, conf);
			IOUtils.closeStream(in);
			IOUtils.closeStream(out);
			fs.close();
			System.out.println("下载文件成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("下载文件失败");
		}
	}

	/**
	 * 上传并压缩
	 * 
	 * @param filePath
	 * @param hdfsPath
	 * @param codecName
	 */
	public static void uploadFileWithCompress(String filePath, String hdfsPath,
			String codecName) {
		try {
			String codecClassName = getCodecClassName(codecName);
			Class<?> codecClass = Class.forName(codecClassName);
			CompressionCodec codec = (CompressionCodec) ReflectionUtils
					.newInstance(codecClass, conf);
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			FileInputStream in = new FileInputStream(new File(filePath));
			FSDataOutputStream out = fs.create(new Path(hdfsPath),
					new Progressable() {
						@Override
						public void progress() {
							System.out.print(".");
						}
					});
			CompressionOutputStream stream = codec.createOutputStream(out);
			IOUtils.copyBytes(in, stream, conf);
			IOUtils.closeStream(in);
			IOUtils.closeStream(out);
			IOUtils.closeStream(stream);
			fs.close();
			System.out.println("上传文件成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("上传文件失败");
		}
	}

	/**
	 * 下载并解压
	 * 
	 * @param hdfsPath
	 * @param filePath
	 * @param codecName
	 */
	public static void downloadFileWithUncompress(String hdfsPath,
			String filePath, String codecName) {
		try {
			String codecClassName = getCodecClassName(codecName);
			Class<?> codecClass = Class.forName(codecClassName);
			CompressionCodec codec = (CompressionCodec) ReflectionUtils
					.newInstance(codecClass, conf);
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			FSDataInputStream in = fs.open(new Path(hdfsPath));
			CompressionInputStream stream = codec.createInputStream(in);
			OutputStream out = new FileOutputStream(new File(filePath));
			IOUtils.copyBytes(stream, out, conf);
			IOUtils.closeStream(in);
			IOUtils.closeStream(stream);
			IOUtils.closeStream(out);
			fs.close();
			System.out.println("下载文件成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("下载文件失败");
		}
	}

	public static void uploadFileWithPermission(String filePath,
			String hdfsPath, String userName, String permission) {
		try {
			hdfsPath = hdfsPath.startsWith("/") ? hdfsPath.substring(1)
					: hdfsPath;
			FileSystem fs = FileSystem.get(new URI(fsPath), conf, userName);
			FileInputStream in = new FileInputStream(new File(filePath));
			FSDataOutputStream out = fs.create(new Path(hdfsPath),
					new Progressable() {
						@Override
						public void progress() {
							System.out.print(".");
						}
					});
			IOUtils.copyBytes(in, out, conf);
			IOUtils.closeStream(in);
			IOUtils.closeStream(out);
			// fs.setOwner(new Path(hdfsPath), userName, "supergroup");
			fs.setPermission(new Path(hdfsPath), new FsPermission(permission));
			fs.close();
			System.out.println("上传文件成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("上传文件失败");
		}
	}

	public static void downloadFileWithPermission(String hdfsPath,
			String filePath, String userName) {
		try {
			hdfsPath = hdfsPath.startsWith("/") ? hdfsPath.substring(1)
					: hdfsPath;
			FileSystem fs = FileSystem.get(new URI(fsPath), conf, userName);
			FSDataInputStream in = fs.open(new Path(hdfsPath));
			OutputStream out = new FileOutputStream(new File(filePath));
			IOUtils.copyBytes(in, out, conf);
			IOUtils.closeStream(in);
			IOUtils.closeStream(out);
			fs.close();
			System.out.println("下载文件成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("下载文件失败");
		}
	}

	/**
	 * 拷贝到HDFS
	 * 
	 * @param filePath
	 * @param hdfsPath
	 */
	public static void copyFromLocalFile(String filePath, String hdfsPath) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			fs.copyFromLocalFile(new Path(filePath), new Path(hdfsPath));
			fs.close();
			System.out.println("拷贝文件成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("拷贝文件失败");
		}
	}

	/**
	 * 拷贝到本地
	 * 
	 * @param hdfsPath
	 * @param filePath
	 */
	public static void copyToLocalFile(String hdfsPath, String filePath) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			fs.copyToLocalFile(new Path(hdfsPath), new Path(filePath));
			fs.close();
			System.out.println("拷贝文件成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("拷贝文件失败");
		}
	}

	/**
	 * 读取文件
	 * 
	 * @param hdfsPath
	 */
	public static void readFile(String hdfsPath) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			FSDataInputStream is = fs.open(new Path(hdfsPath));
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			StringBuffer sb = new StringBuffer();
			while (br.ready()) {
				sb.append(br.readLine() + "\n");
			}
			IOUtils.closeStream(is);
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("读取失败");
		}
	}

	/**
	 * 重命名
	 * 
	 * @param oldName
	 * @param newName
	 */
	public static void reName(String oldName, String newName) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			fs.rename(new Path(oldName), new Path(newName));
			fs.close();
			System.out.println("重命名成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("重命名失败");
		}
	}

	/**
	 * 遍历文件目录
	 * 
	 * @param hdfsPath
	 */
	public static void listStatus(String hdfsPath) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			if (fs.exists(new Path(hdfsPath))) {
				FileStatus[] status = fs.listStatus(new Path(hdfsPath));
				for (FileStatus stat : status) {
					System.out.println(stat.getPermission());
					System.out.println(stat.getOwner());
					System.out.println(stat.getGroup());
					System.out.println(stat.getLen() / 1024D);
					System.out.println(new Date(stat.getModificationTime()));
					System.out.println(stat.getBlockSize() / 1024D / 1024D);
					System.out.println(stat.getPath().getName());
					System.out.println(stat.isDirectory());
				}
			} else {
				System.out.println("文件路径无效");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("查询失败");
		}
	}

	public static String getCodecClassName(String codecName) {
		String codecClassName = "";
		switch (codecName) {
		case "gzip":
			codecClassName = "org.apache.hadoop.io.compress.GzipCodec";
			break;
		case "bzip2":
			codecClassName = "org.apache.hadoop.io.compress.BZip2Codec";
			break;
		case "snappy":
			codecClassName = "org.apache.hadoop.io.compress.SnappyCodec";
			break;
		case "lzo-bset":
			codecClassName = "";
			break;
		case "lzo":
			codecClassName = "";
			break;
		default:
			codecClassName = "org.apache.hadoop.io.compress.DefaultCodec";
			break;
		}
		return codecClassName;
	}

//=================================USER_CHI=============================================
	/**
	 * 读取文件
	 * 
	 * @param hdfsPath
	 */
	public static ArrayList<String> readFileByDate(String hdfsPath) {
		ArrayList<String> hdfsList = new ArrayList<String>();
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			FSDataInputStream is = fs.open(new Path(hdfsPath));
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			StringBuffer sb = new StringBuffer();
			while (br.ready()) {
				sb.append(br.readLine() + "\n");
				hdfsList.add(br.readLine());
			}

			IOUtils.closeStream(is);
//			System.out.println(sb.toString());
			return hdfsList;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("读取失败");
			return null;
		}
	}
	/**
	 * 返回hdfs目录的最新也就是最后一个文件的名字作为查询文件名字
	 * 
	 * @param hdfsPath
	 */
	public static String getEndFileName(String hdfsPath) {
		try {
			FileSystem fs = FileSystem.get(new URI(fsPath), conf);
			if (fs.exists(new Path(hdfsPath))) {
				FileStatus[] status = fs.listStatus(new Path(hdfsPath));
			/*	for (FileStatus stat : status) {
					System.out.println(stat.getPermission());
					System.out.println(stat.getOwner());
					System.out.println(stat.getGroup());
					System.out.println(stat.getLen() / 1024D);
					System.out.println(new Date(stat.getModificationTime()));
					System.out.println(stat.getBlockSize() / 1024D / 1024D);
					System.out.println(stat.getPath().getName());
					System.out.println(stat.isDirectory());
					
					
					rw-r--r--
					hadoop
					supergroup
					319493.9580078125
					Fri Sep 07 01:11:22 CST 2018
					256.0
					part-r-00000-fc491e98-d665-4801-9a36-7756bfde8bf0
					false
					
				}*/
				return status[status.length-1].getPath().getName();
			} else {
				System.out.println("文件路径无效");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("查询失败");
			return null;
		}
	}
}
