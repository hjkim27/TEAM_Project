create table MEMBER_MUST(
NUM number primary key,
MEMBERID varchar2(50) not null,
PASSWORD varchar2(50) not null,
NAME varchar2(20) not null,
NICKNAME varchar2(20) not null,
PHONE1 varchar2(10) not null,
PHONE2 varchar2(10) not null,
PHONE3 varchar2(10) not null,
BIRTH varchar2(30) not null,
POINT number default 0,
WARNCOUNT number default 0
);

create table MEMBER_CHOICE(
NUM number primary key,
MEMBERID varchar2(20) not null,
ADDRNUM varchar2(10),
ADDR varchar2(100),
ADDRSUB varchar2(100),
GENDER varchar2(10),
INDATE date default sysdate,
STOREDATE date,
OUTDATE varchar2(10) default 'N'
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

create table GOODS(
GOODSCODE varchar2(100) primary key,
GOODS varchar2(100) not null,
CONTENT varchar2(100) not null,
PRICE number default 0
);

create table GOODS_IMAGE(
NUM number primary key,
GOODSCODE varchar2(100) not null,
SAVENAME varchar2(100) not null
);

create table GOODS_ORDER(
NUM number primary key,
GOODSCODE varchar2(100) not null,
NICKNAME varchar2(20) not null,
SALES number not null,
ORDERDATE date default sysdate,
PHONENUM varchar2(30) not null
);

create table POINT(
NUM number primary key,
NICKNAME varchar2(20) not null,
CHANGEDATE date default sysdate,
CHANGEPOINT number not null,
CHANGEWHY varchar2(20) not null
);

create table ASSATALK(
NUM number primary key,
SPEAKER varchar2(20) not null,
LISTENER varchar2(20) not null,
CONTENT varchar2(200) not null,
SENDTIME timestamp default systimestamp
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
maxvalue 9999999
nocycle nocache noorder
;

create sequence BOARD_SEQ
start with 1 
increment by 1 
maxvalue 9999999
nocycle nocache noorder
;

create sequence BOARD_REF_SEQ
start with 1 
increment by 1 
maxvalue 9999999
nocycle nocache noorder
;

create sequence BOARD_IMAGE_SEQ
start with 1 
increment by 1 
maxvalue 9999999
nocycle nocache noorder
;

create sequence QUESTION_SEQ
start with 1 
increment by 1 
maxvalue 9999999
nocycle nocache noorder
;

create sequence GOODS_IMAGE_SEQ
start with 1 
increment by 1 
maxvalue 9999999
nocycle nocache noorder
;

create sequence GOODS_ORDER_SEQ
start with 1 
increment by 1 
maxvalue 9999999
nocycle nocache noorder
;

create sequence POINT_SEQ
start with 1 
increment by 1 
maxvalue 9999999
nocycle nocache noorder
;

create sequence ASSATALK_SEQ
start with 1 
increment by 1 
maxvalue 9999999
nocycle nocache noorder
;

create sequence WARNING_SEQ
start with 1 
increment by 1 
maxvalue 9999999
nocycle nocache noorder
;
