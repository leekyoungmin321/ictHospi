package com.spring.hospital.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
-- 회원
CREATE TABLE users(
    user_id VARCHAR2(50) PRIMARY KEY,
    user_pw VARCHAR2(50) NOT NULL,
    user_name VARCHAR2(50) NOT NULL,
    user_birth1 NUMBER(10) NOT NULL,
    user_birth2 NUMBER(10) NOT NULL,
    user_ph1 NUMBER(4) NOT NULL,
    user_ph2 NUMBER(4) NOT NULL,
    user_ph3 NUMBER(4) NOT NULL,
    user_email1 VARCHAR2(50) NOT NULL,
    user_email2 VARCHAR2(50) NOT NULL,
    addr_basic VARCHAR2(300) NOT NULL,
    addr_detail VARCHAR2(300) NOT NULL,
    addr_zip_num VARCHAR2(50) NOT NULL,
    user_mobile_ok NUMBER(2) DEFAULT 0,
    user_email_ok NUMBER(2) DEFAULT 0
);
*/

@Getter
@Setter
@ToString
public class UserVO {
	
	private String userId;
	private String userPw;
	private String userName;
	private int userBirth1;
	private int userBirth2;
	private int userPh1;
	private int userPh2;
	private int userPh3;
	private String userEmail1;
	private String userEmail2;
	private String addrBasic;
	private String addrDetail;
	private String addrZipNum;
	private int userMobileOk;
	private int userEmailOk;

}
