package org.ajax.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.ajax.dbConnect.DBConnect;

public class AjaxDao {
	
	private static class singleton {
		private static final AjaxDao INSTANCE=new AjaxDao();
	}
	
	private AjaxDao() {}
	
	public static AjaxDao getInstance() {
		return singleton.INSTANCE;
	}
	

	//���̵�üũ
	public int idChecked(String userId) {
		int result=0;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		String query="";
		
		try {
			conn=DBConnect.getConnection();
			query="select count(*) from member_0810 where userId=?"; 
			//���̵� ������ 1, ������ 0
			pstm=conn.prepareStatement(query);
			pstm.setString(1, userId);
			rs=pstm.executeQuery();
			
			if(rs.next()) {
				result=rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
				if(rs!=null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {}
		}
		
		return result;
	}
	
	
	//ȸ������
	public int insertDo(String userId, String userPw, String userPhone) {
		int rs=0;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		String query="";
		
		try {
			conn=DBConnect.getConnection();
			query="insert into member_0810 values (?,?,?)";
			pstm=conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userPhone);
			rs=pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return rs;
	}
	
	
	//�α���
	public int loginDo(String userId, String userPw) {
		
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		String query="";
		
		try {
			conn=DBConnect.getConnection();
			query="select userPw from member_0810 where userId=?";
			pstm=conn.prepareStatement(query);
			pstm.setString(1, userId);
			
			rs=pstm.executeQuery();
			
			if(rs.next()) {
				if(rs.getString(1).equals(userPw)) {
					return 1; //�α��� ����
				} else {
					return 0; //��й�ȣ ����ġ
				}
			}
			return -1; //���̵� ����
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
				if(rs!=null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {}
		}
		return -2; //�����ͺ��̽� ����
	}
	
	
	
	
	
	
	
	
	
	
}
