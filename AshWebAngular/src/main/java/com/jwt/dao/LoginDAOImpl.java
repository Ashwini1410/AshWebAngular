/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Login;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addRegistration(Login login) {
		sessionFactory.getCurrentSession().saveOrUpdate(login);

	}

	@SuppressWarnings("unchecked")
	public List<Login> getAllUsers() {

		return sessionFactory.getCurrentSession().createQuery("from Login")
				.list();
	}

	@Override
	public void deleteuser(Integer loginId) {
		Login employee = (Login) sessionFactory.getCurrentSession().load(
				Login.class, loginId);
		if (null != employee) {
			this.sessionFactory.getCurrentSession().delete(loginId);
		}

	}

	public Login getlogin(int loginId) {
		return (Login) sessionFactory.getCurrentSession().get(
				Login.class, loginId);
	}

	@Override
	public Login updateuser(Login login) {
		sessionFactory.getCurrentSession().update(login);
		return login;
	}

}


//import java.util.List;
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.jwt.model.Login;
//
//@Repository
//public class LoginDAOImpl implements LoginDAO{
//    @Autowired
//	private SessionFactory sessionFactory;
//    
//	public void addRegistration(Login login) {
//		sessionFactory.getCurrentSession().saveOrUpdate(login);
//
//	}
//        @SuppressWarnings("unchecked")
//	public List<Login> getAllUsers() {
//		return sessionFactory.getCurrentSession().createQuery("from Login")
//				.list();
//	}
////  public Login validateUser(Login login) {
////    String sql = "select * from users where username='" + login.getLoginname() + "' and password='" + login.getLoginpassword()
////    + "'";
////    List<Login> users = jdbcTemplate.query(sql, new UserMapper());
////    return users.size() > 0 ? users.get(0) : null;
////    }
////
////  
////  class UserMapper implements RowMapper<Login> {
////  public Login mapRow(ResultSet rs, int arg1) throws SQLException {
////    Login user = new Login();
////    user.setLoginname(rs.getString("Loginname"));
////    user.setLoginpassword(rs.getString("loginpassword")); 
////    user.setLoginid(rs.getInt("id"));
////    return user;
////  }
////  }
//  
////    @Override
////    public boolean findByLogin(String loginname, String loginpassword) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
//
//  }
