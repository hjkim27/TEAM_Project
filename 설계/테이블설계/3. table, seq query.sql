create table MEMBER(
NUM number primary key,
EMAIL varchar2(50) not null unique,
NICKNAME varchar2(20) not null unique,
PASSWORD varchar2(50) not null,
NAME varchar2(20) not null,
GENDER varchar2(10),
STOREDATE date
);


create table MEMBER_AUTO(
NUM number primary key,
NICKNAME varchar2(20) not null unique,
WARNCOUNT number default 0,
POINT number default 0,
REGDATE date,
MODDATE date default sysdate,
SESSIONID varchar2(100),
LOGINTIME date
);

create table MEMBER_ADDR(
NUM number primary key,
NICKNAME varchar2(20) not null unique,
PHONE1 varchar2(10),
PHONE2 varchar2(20),
ADDRNUM varchar2(10),
ADDR varchar2(100),
ADDRSUB varchar2(100)
);

create table POINT(
NUM number primary key,
NICKNAME varchar2(20) not null,
CHANGEDATE date default sysdate,
CHANGEPOINT number not null,
CHANGEWHY varchar2(20) not null
);

create table BOARD(
NUM number primary key,
BOARDCODE varchar2(20) not null,
WRITER varchar2(20) not null,
TITLE varchar2(50) not null,
CONTENT varchar2(4000) not null,
REGDATE date default sysdate,
MODDATE date default sysdate,
HIT number default 0,
HEART number default 0
);

create table BOARD_REF(
NUM number primary key,
BOARDNUM number not null,
WRITER varchar2(20) not null,
CONTENT varchar2(1000) not null,
REGDATE date default sysdate,
MODDATE date default sysdate,
DEPTH number default 0,
REFNUM number default 0
);

create table BOARD_IMAGE(
NUM number primary key,
BOARDNUM number not null,
ORIGINNAME varchar2(50) not null,
SAVENAME varchar2(100) not null,
FILETYPE varchar2(10) not null
);

create table BOARD_TERM(
NUM number primary key,
BOARDNUM number not null,
STARTDATE date not null,
ENDDATE date not null
);

create table GOODS(
NUM number primary key,
GOODSCODE varchar2(100),
GOODSNAME varchar2(100) not null,
CONTENT varchar2(100) not null,
PRICE number default 0,
REGDATE date default sysdate not null,
HEART varchar2(10) default 'NO' not null,
STOCK number default 20
);

create table GOODS_IMAGE(
NUM number primary key,
GOODSCODE varchar2(100) not null,
SAVENAME varchar2(100) not null
);

create table GOODS_SALES(
NUM number primary key,
GOODSCODE varchar2(100) not null,
NICKNAME varchar2(20) not null,
PRICE number not null,
ORDERDATE date default sysdate
);


create table ASSATALK(
NUM number primary key,
SPEAKER varchar2(20) not null,
LISTENER varchar2(20) not null,
CONTENT varchar2(200) not null,
SENDTIME timestamp default systimestamp
);

create table ASSATALK_KEYWORD(
NUM number primary key,
KEYWORD varchar2(20) not null unique,
ANSWERTYPE varchar2(20) not null,
ANSWER varchar2(4000) not null
);

create table QUESTION(
NUM number primary key,
ASKTYPE varchar2(20) not null,
NICKNAME varchar2(20) not null,
TITLE varchar2(50) not null,
CONTENT varchar2(4000) not null,
ANSWER varchar2(4000),
ASKDATE date default sysdate,
ANSWERDATE date
);

create table WARNING(
NUM number primary key,
NICKNAME varchar2(20) not null,
BOARDNUM number not null,
WARNTYPE varchar2(30),
WARNWHY varchar2(300),
WARNTIME date default sysdate
);


create sequence MEMBER_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence MEMBER_AUTO_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence MEMBER_ADDR_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence POINT_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence BOARD_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence BOARD_REF_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence BOARD_IMAGE_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence BOARD_TERM_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence GOODS_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence GOODS_IMAGE_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence GOODS_SALES_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence ASSATALK_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence ASSATALK_KEYWORD_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence QUESTION_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence WARNING_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;

