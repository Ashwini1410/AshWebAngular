/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.dao;

import java.util.List;
import com.jwt.model.Login;

public interface LoginDAO {

	public void addRegistration(Login login);

	public List<Login> getAllUsers();

	public void deleteuser(Integer loginId);

	public Login updateuser(Login login);

	public Login getlogin(int loginId);
}



//
//import com.jwt.model.Login;
//import java.util.List;
//
///**
// *
// * @author Abhijit
// */
//public interface LoginDAO {
//   public void addRegistration(Login login);
//    public List<Login> getAllUsers();
////   boolean findByLogin(String loginname, String loginpassword);
////   Login validateUser(Login login);
//}
