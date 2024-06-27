
package model.entity;
import java.io.Serializable;

/**
 * ユーザを表します。
 * m_userのDTOであり、Beanオブジェクトです。
 * @author 
 */
public class UserBean implements Serializable {

	/**
	 * ユーザID
	 */
	private String userId;

	/**
	 * 氏名
	 */
	private String name;

	/**
	 * 年齢
	 */
    private int age;

    /**
	 * UserBeanを構築します。
	 */
	public UserBean() {

	}

	/**
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
