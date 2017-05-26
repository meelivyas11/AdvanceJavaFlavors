-- DROP USER DBUSER CASCADE;
-- For Oracle --
/* Create a new User in Oracle SQL Developer */
CREATE USER DBUSER IDENTIFIED BY DBUSER; -- (User_Name = DBUSER and  Selected_Password = DBUSER)
GRANT CONNECT, RESOURCE TO DBUSER;
/* Create a new Connection with name DBUSER */

--------------------------------------------------------
--  DDL for Table LOGIN
--------------------------------------------------------

  CREATE TABLE "DBUSER"."LOGIN" 
   (	"USERID" VARCHAR2(20 BYTE), 
    "USERNAME" VARCHAR2(20 BYTE), 
	"PASSWORD" VARCHAR2(20 BYTE), 
	"ROLE" VARCHAR2(20 BYTE)	
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
  
  --------------------------------------------------------
--  DDL for Sequence LOGIN_SEQ
--------------------------------------------------------
  CREATE SEQUENCE LOGIN_SEQ START WITH 1 INCREMENT BY 1 ; 
