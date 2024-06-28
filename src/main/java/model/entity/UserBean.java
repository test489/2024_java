/*
 * WebApp_t-ex01
 * model.entity.UserBean.java
 */
package model.entity;
import java.io.Serializable;

/**
 * ユーザを表します。
 * m_userのDTOであり、Beanオブジェクト
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
	 * フィールドuserIdの値を返します。
	 * @return ユーザID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * フィールドuserIdの値を設定します。
	 * @param userId ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * フィールドnameの値を返します。
	 * @return 氏名
	 */
    public String getName() {
        return name;
    }

    /**
     * フィールドnameの値を設定します。
     * @param name 氏名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * フィールドageの値を返します。
     * @return 年齢
     */
	public int getAge() {
        return age;
    }

	/**
	 * フィールドageの値を設定します。
	 * @param age 年齢
	 */
    public void setAge(int age) {
        this.age = age;
    }
}
