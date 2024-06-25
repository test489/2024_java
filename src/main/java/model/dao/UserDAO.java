/**
 * 
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.UserBean;

/**
 * 
 */
public class UserDAO {

	/***
	 * ログイン認証を行う
	 * @param userid　ユーザID
	 * @param pass　パスワード
	 * @return　認証成功はtrue,認証失敗はfalse
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean login(String userid, String pass) throws ClassNotFoundException, SQLException {
		
		String sql = "SELECT * FROM m_user WHERE user_id = ?, password = ?";
		
		//データベースへの接続、PreparedStatementの取得
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			// プレースホルダへの値の設定
			pstmt.setString(1, userid);
			pstmt.setString(2, pass);

			// SQLステートメントの実行
			ResultSet res = pstmt.executeQuery();

			// 結果の操作
			if (res.next()) {
				return true;
			}
		}
		return false;
		
	}
	/***
	 * ユーザリストを返す
	 * @return　ユーザリスト
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public List<UserBean>select() throws SQLException, ClassNotFoundException{
		
		String sql = "SELECT * FROM m_user";
		
		List<UserBean> userList = new ArrayList<UserBean>();
		
		// データベースへの接続の取得、PreparedStatementの取得、SQLステートメントの実行
				try (Connection con = ConnectionManager.getConnection();
						Statement pstmt = con.createStatement();
						ResultSet res = pstmt.executeQuery(sql)) {

					//結果の操作
					while (res.next()) {
						
						//Beanの生成
						UserBean user = new UserBean();
						
						user.setUserId(res.getString("user_id"));
						user.setName(res.getString("name"));
						user.setAge(res.getInt("age"));
						
						//リストに値を格納
						userList.add(user);
						
					}
					
				}
				return userList;
		
	}
}
