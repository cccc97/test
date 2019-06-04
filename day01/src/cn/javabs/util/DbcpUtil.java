package cn.javabs.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;


public class DbcpUtil {
	
	// 1. ���� ��̬  quanju����  DataSource 
	private static  DataSource	ds;
	
	public static DataSource getDataSource(){
		return ds;
	}
	
	public static Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
	
	// 2. ��̬�����
	static{
		
		try {
			//2.1 ����.class.�õ��� ������  . �õ���Դ��Ϊ��  ʹ���ֽ�������  ���н���
			InputStream in = DbcpUtil.class.getClassLoader().getResourceAsStream("dbcp.properties");
			
			//2.2 ʵ���� Properties
			Properties p = new Properties();
			
			//2.3 ʹ��p ����  in
			p.load(in);
			
			//2.4 ��������Դ����.��������Դ(p)
			ds = BasicDataSourceFactory.createDataSource(p);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}

}
