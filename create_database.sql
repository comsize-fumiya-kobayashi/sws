/* DB作成 */
DROP DATABASE IF EXISTS emp_sys_db;
CREATE DATABASE emp_sys_db CHARACTER SET utf8 COLLATE utf8_general_ci;

/* AUTOCOMMIT無効 */
SET AUTOCOMMIT=0;

/* DB選択 */
USE emp_sys_db;

/* 部署マスタ作成 */
CREATE TABLE emp_sys_db.m_section 
(   
	section_code       CHAR(4) DEFAULT 'S000' NOT NULL,
	section_name       VARCHAR(32) NOT NULL UNIQUE,
	update_time        TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY (section_code)
);


/* 従業員マスタ作成 */
CREATE TABLE emp_sys_db.m_employee
( 
	employee_code      CHAR(5) NOT NULL PRIMARY KEY,
	last_name          VARCHAR(16) NOT NULL,
	first_name         VARCHAR(16) NOT NULL,
	last_kana_name     VARCHAR(24),
	first_kana_name    VARCHAR(24),
	gender             CHAR(1) DEFAULT 0 NOT NULL ,
	birth_day          DATE,
	section_code       CHAR(4) DEFAULT 'S000' NOT NULL,
	hire_date          DATE ,
	update_datetime    TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	FOREIGN KEY (section_code) REFERENCES emp_sys_db.m_section(section_code)
);


/* ユーザマスタ作成 */
CREATE TABLE emp_sys_db.m_user
( 
	user_id            CHAR(24) NOT NULL,
	password           VARCHAR(32) NOT NULL,
	update_datetime    TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY (user_id)
);

/* 部署マスタINSERT */
INSERT INTO emp_sys_db.m_section VALUES('S000','所属部署未定',NOW());
INSERT INTO emp_sys_db.m_section VALUES('S110','総務部',NOW());
INSERT INTO emp_sys_db.m_section VALUES('S130','人事部',NOW());
INSERT INTO emp_sys_db.m_section VALUES('S150','経理部',NOW());
INSERT INTO emp_sys_db.m_section VALUES('S210','企画部',NOW());
INSERT INTO emp_sys_db.m_section VALUES('S230','営業部',NOW());

