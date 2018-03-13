package com.gjj.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportDataDao {

	static String driver = "com.mysql.jdbc.Driver";
	
	public static void main(String[] args) {
		try {
			if(importSlpExam());
			System.out.println(" -----Finish");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean importSlpExam() throws Exception {
		//String url_db = "jdbc:mysql://172.18.136.32:3306/learningcell_v2?autoReconnect=true&amp;zeroDateTimeBehavior=convertToNull&amp;useUnicode=true&amp;characterEncoding=UTF-8";
		String url_db = "jdbc:mysql://172.18.136.32:3306/learningcell_v2?characterEncoding=UTF8&useServerPrepStmts=true";
		String user_username = "zhangzhen";
		String user_password = "FJKlj3fE*Pod";
		
				
		Connection conn_r = getMysqlConn(url_db,user_username,user_password);
		Connection conn_w = getMysqlConn(url_db,user_username,user_password);
		
		try {
			PreparedStatement preparedStatement = conn_r.prepareStatement(" select * from slp_exam_user where paperid =2");
			
			ResultSet rs = preparedStatement.executeQuery();
			PreparedStatement stmetW = conn_w.prepareStatement(" insert into slp_paper_data " +" (item_id,userid,score,paper_id) values(?,?,?,?)");
		
			int cnt = 0;
			while(rs.next()) {
				String userid = rs.getString("edu_id");
				int paper_id = rs.getInt("paperid");
				for(int i = 1 ; i< 63; i++) {
					String score = rs.getString("item"+i);
					if(null != score && score.length() > 0) {
						stmetW.setInt(1, i);
						stmetW.setString(2, userid);
						stmetW.setString(3, score);
						stmetW.setInt(4, paper_id);
						try {
							stmetW.execute();
						}catch(Exception ei) {
							throw ei;
						}finally {
							stmetW.clearParameters();
						}
					}else 
						break;
				}
				cnt++;
				if(cnt % 1000 == 0)
					System.out.println(" --- 学生完成" + cnt);
			}
		}finally {
			try {
				if(conn_r != null)
					conn_r.close();
				if(conn_w != null)
					conn_w.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	
	}

	private static Connection getMysqlConn(String url_db, String user_username, String user_password) {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url_db,user_username,user_password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
