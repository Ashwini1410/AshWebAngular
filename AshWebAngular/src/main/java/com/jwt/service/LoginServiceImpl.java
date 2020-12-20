/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.LoginDAO;
import com.jwt.model.Login;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{ 
    
        @Autowired
	private LoginDAO loginDAO;

    public void setLoginDAO(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

	@Override
	@Transactional
	public void addRegistration(Login login) {
		loginDAO.addRegistration(login);
	}
        
        @Override
	@Transactional
        public List<Login> getAllUsers() {
            return loginDAO.getAllUsers();        
        }
        
        @Override
	@Transactional
	public void deleteuser(Integer loginId) {
		loginDAO.deleteuser(loginId);
	}

	public Login getlogin(int loginId) {
		return loginDAO.getlogin(loginId);
	}

	public Login updateuser(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.updateuser(login);
	}

	
        
        
        

//        public Login validateUser(Login login) {
//            return loginDAO.validateUser(login);
//        }
        
//        public boolean findByLogin(String loginname, String loginpassword) {	
//		boolean login = loginDAO.findByLogin(loginname, loginpassword);
//		
//		if(stud != null && login.().equals(password)) {
//			return true;
//		} 
//		
//		return false;		
//	}

        
}
