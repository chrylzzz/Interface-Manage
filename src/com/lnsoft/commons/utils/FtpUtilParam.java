package com.lnsoft.commons.utils;

public class FtpUtilParam {
	/*
	 * * Description: 从FTP服务器下载文件
	 * 
	 * @param host FTP服务器hostname
	 * 
	 * @param port FTP服务器端口
	 * 
	 * @param username FTP登录账号
	 * 
	 * @param password FTP登录密码
	 * 
	 * @param remotePath FTP服务器上的相对路径
	 * 
	 * @param fileName 要下载的文件名
	 * 
	 * @param localPath 下载后保存到本地的路径
	 */
	// ftp-ip
	public static final String HOST = "10.141.17.14";
	// ftp端口
	public static final int PORT = 2222;
	// ftp用户名
	public static final String USERNAME = "qxuser";
	// ftp密码
	public static final String PASSWORD = "qxuser";
	// ftp服务器地址
	// 天气预报：d:\qxfile\tqyb
	public static final String REMOTEPATH_TQYB = "D:/qxfile/tqyb";
	// 气象六要素：d:\qxfile\
	public static final String REMOTEPATH_QXLYS = "D:/qxfile/";
	//
}
