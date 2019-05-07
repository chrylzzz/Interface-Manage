package com.lnsoft.commons.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class ImDownloadUtil {
	// 输出日志
	private static Logger logger = Logger.getLogger(FtpUtil.class.getName());
	// 创建对象
	private static FTPClient ftpclient = new FTPClient();
	// 定义对象
	private static ImDownloadUtil INSTANCE = null;

	// 单例模式对象
	public static ImDownloadUtil getInstance() {
		if (INSTANCE == null) {
			synchronized (ImDownloadUtil.class) {
				if (INSTANCE == null) {
					INSTANCE = new ImDownloadUtil();
				}
			}
		}
		return INSTANCE;
	}

	public List<Map<String, String>> downLoad(String host, int port,
			String username, String password, String remotePath, String fina) {// fina：2017.01.02
		String fileName = ImDownloadUtil.changeFina(fina);// 2018-01-02.txt

		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		try {
			/*
			 * String server = "10.141.17.14"; String user = "qxuser"; String
			 * password = "qxuser"; String path = "/tqyb/"; // 2017-08-30.text
			 * // String filename = fina;// //
			 * "00cd1b71-8482-4928-b4ed-58092720f084_disp.jpg" // ¶Ë¿ÚºÅ int
			 * port = 2222;
			 */

			ftpclient.connect(host, port);
			ftpclient.login(username, password);
			// 判断是否连接 连接尝试后的查询
			if (disConnect()) {
				logger.info("下载未连接到FTP，关闭资源");
				return null;
			}
			// 设置上传目录 转移到FTP服务器目录
			ftpclient.enterLocalPassiveMode();
			ftpclient.changeWorkingDirectory(remotePath);
			//
			InputStream in = null;
			try {
				// 下载信息到流
				in = ftpclient.retrieveFileStream(fileName);
				if (in == null) {
					return null;
				}
				//
				InputStreamReader isr = new InputStreamReader(in, "GBK");
				//
				BufferedReader bufferReader = new BufferedReader(isr);
				String readLine = null;
				while ((readLine = bufferReader.readLine()) != null) {
					String[] line = readLine.split(",");
					Map<String, String> mateMap = new HashMap<String, String>();
					// String code = "";
					// String zq = "";
					for (String mate : line) {
						String[] mapElement = mate.split("&");
						String key = mapElement[0];// map的key
						String value = mapElement[1];// map的value
						/*
						 * if ("state_id".equals(key)) { code = value; } if
						 * ("type".equals(key)) { zq = value; }
						 */
						// 放到map中
						mateMap.put(key, value);
					}
					/*
					 * if ("37061124".equals(code + zq)) {
					 * System.out.println(code + zq); }
					 */
					list.add(mateMap);
				}

			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ftpclient.logout();
				if (ftpclient.isConnected()) {
					ftpclient.disconnect();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	// 2018.01.02 ->2018-01-02.txt
	public static String changeFina(String fina) {
		return fina.replace(".", "-") + ".txt";
	}

	// 连接尝试后的查询 true表示未连接 false表示已连接
	private static boolean disConnect() throws IOException {
		boolean b = !FTPReply.isPositiveCompletion(ftpclient.getReplyCode());
		if (b) {
			logger.info("未连接到FTP，用户名或密码错误。");
			// 关闭连接
			ftpclient.disconnect();
		} else {
			logger.info("FTP连接成功。");
		}

		return b;
	}
}
