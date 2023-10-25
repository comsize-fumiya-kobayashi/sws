/* DB�쐬 */
DROP DATABASE IF EXISTS emp_sys_db;
CREATE DATABASE emp_sys_db CHARACTER SET utf8 COLLATE utf8_general_ci;

/* AUTOCOMMIT���� */
SET AUTOCOMMIT=0;

/* DB�I�� */
USE emp_sys_db;

/* �����}�X�^�쐬 */
CREATE TABLE emp_sys_db.m_section 
(   
	section_code       CHAR(4) DEFAULT 'S000' NOT NULL,
	section_name       VARCHAR(32) NOT NULL UNIQUE,
	update_time        TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY (section_code)
);


/* �]�ƈ��}�X�^�쐬 */
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


/* ���[�U�}�X�^�쐬 */
CREATE TABLE emp_sys_db.m_user
( 
	user_id            CHAR(24) NOT NULL,
	password           VARCHAR(32) NOT NULL,
	update_datetime    TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY (user_id)
);

/* �����}�X�^INSERT */
INSERT INTO emp_sys_db.m_section VALUES('S000','������������',NOW());
INSERT INTO emp_sys_db.m_section VALUES('S110','������',NOW());
INSERT INTO emp_sys_db.m_section VALUES('S130','�l����',NOW());
INSERT INTO emp_sys_db.m_section VALUES('S150','�o����',NOW());
INSERT INTO emp_sys_db.m_section VALUES('S210','��敔',NOW());
INSERT INTO emp_sys_db.m_section VALUES('S230','�c�ƕ�',NOW());

