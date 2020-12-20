/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Master")
public class Login  implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String firstname;

    
	@Column(name="Lastname")
	private String lastname;

	@Column
	private String address;

	@Column
	private String emailid;
        
        @Column
        private String loginname;

        @Column
        private String loginpassword;
        
        @Column
        private String contactNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String Lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
        
        


	
}







//
//
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
////import javax.validation.constraints.Pattern;
////import javax.validation.constraints.Size;
//////import org.hibernate.validator.constraints.NotEmpty;
//
///**
// *
// * @author Abhijita
// */
//@Entity
//@Table(name = "User_Master")
//public class Login implements Serializable{
//    
//    private static final long serialVersionUID = -3465813074586302847L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private int loginid;
//    
////    @NotEmpty
////    @Pattern(regexp="[^0-9]+")
////    @Size(min=6,max=20)
////    @Column(name = "Loginname")
//    @Column
//     private String loginname;
//    
////    @NotEmpty
////    @Pattern(regexp="[^0-9]+")
////    @Size(min=6,max=20)
////    @Column(name = "Loginpassword")
//    @Column
//    private String loginpassword;
//    
////     @NotEmpty
////    @Pattern(regexp="[^0-9]+")
////    @Size(min=6,max=20)
////    @Column(name = "Firstname")
//    @Column
//    private String Firstname;
//     
////     @NotEmpty
////    @Pattern(regexp="[^0-9]+")
////    @Size(min=6,max=20)
////    @Column(name = "Lastname")
//    @Column
//    private String Lastname;
//    
////    @NotEmpty
////    @Pattern(regexp="[^0-9]+")
////    @Size(min=6,max=20)
////    @Column(name = "address")
//    @Column
//    private String address;
//            
////     @NotEmpty
////    @Pattern(regexp="[^0-9]+")
////    @Size(min=6,max=20)
////    @Column(name = "emailid")
//    @Column
//    private String emailid;
//             
////    @NotEmpty
////    @Pattern(regexp="[^0-9]+")
////    @Size(min=6,max=20)
////    @Column(name = "contactNo")
//    @Column
//    private String contactNo;
//
//    public int getLoginid() {
//        return loginid;
//    }
//
//    public void setLoginid(int loginid) {
//        this.loginid = loginid;
//    }
//
//    public String getFirstname() {
//        return Firstname;
//    }
//
//    public void setFirstname(String Firstname) {
//        this.Firstname = Firstname;
//    }
//
//    public String getLastname() {
//        return Lastname;
//    }
//
//    public void setLastname(String Lastname) {
//        this.Lastname = Lastname;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getEmailid() {
//        return emailid;
//    }
//
//    public void setEmailid(String emailid) {
//        this.emailid = emailid;
//    }
//
//    public String getContactNo() {
//        return contactNo;
//    }
//
//    public void setContactNo(String contactNo) {
//        this.contactNo = contactNo;
//    }
//    
//
//    public String getLoginname() {
//        return loginname;
//    }
//
//    public void setLoginname(String loginname) {
//        this.loginname = loginname;
//    }
//
//    public String getLoginpassword() {
//        return loginpassword;
//    }
//
//    public void setLoginpassword(String loginpassword) {
//        this.loginpassword = loginpassword;
//    }
//    
//    
//}
