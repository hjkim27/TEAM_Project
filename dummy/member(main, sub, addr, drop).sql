drop table member;
drop table member_auto;
drop table member_addr;
drop sequence member_seq;
drop sequence member_auto_seq;
drop sequence member_addr_seq;

create table MEMBER_MAIN(
NUM number primary key,
EMAIL varchar2(50) not null unique,
NICKNAME varchar2(20) not null unique,
PASSWORD varchar2(50) not null,
SESSIONID varchar2(100),
LOGINTIME date,
REGDATE date default sysdate
);


create table MEMBER_SUB(
NUM number primary key,
NICKNAME varchar2(20) not null unique,
NAME varchar2(20) not null,
GENDER varchar2(10),
WARNCOUNT number default 0,
POINT number default 0,
MODDATE date default sysdate,
STOREDATE date
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
create table MEMBER_DROP(
NUM number primary key,
EMAIL varchar2(50) not null,
NICKNAME varchar2(20) not null,
DROPDATE date default sysdate
);
create sequence MEMBER_MAIN_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence MEMBER_SUB_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence MEMBER_ADDR_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;
create sequence MEMBER_DROP_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;





insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'aa8276@inside.home', 'jin_inside', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'stopluna@inside.home', 'eun_inside', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'vldzhdltmf@inside.home', 'seoul_inside', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'chldbs0109@inside.home', 'sun_inside', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'jhkang1151@inside.home', 'hee_inside', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'aa8276@naver.com', 'jin_naver', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'stopluna@naver.com', 'eun_naver', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'vldzhdltmf@naver.com', 'seoul_naver', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'chldbs0109@naver.com', 'sun_naver', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'jhkang1151@naver.com', 'hee_naver', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'aa8276@daum.net', 'jin_daum', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'stopluna@daum.net', 'eun_daum', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'vldzhdltmf@daum.net', 'seoul_daum', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'chldbs0109@daum.net', 'sun_daum', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'jhkang1151@daum.net', 'hee_daum', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'aa8276@kakao.com', 'jin_kakao', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'stopluna@kakao.com', 'eun_kakao', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'vldzhdltmf@kakao.com', 'seoul_kakao', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'chldbs0109@kakao.com', 'sun_kakao', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'jhkang1151@kakao.com', 'hee_kakao', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'aa8276@gmail.com', 'jin_gmail', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'stopluna@gmail.com', 'eun_gmail', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'vldzhdltmf@gmail.com', 'seoul_gmail', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'chldbs0109@gmail.com', 'sun_gmail', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'jhkang1151@gmail.com', 'hee_gmail', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'aa8276@hanmail.net', 'jin_hanmail', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'stopluna@hanmail.net', 'eun_hanmail', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'vldzhdltmf@hanmail.net', 'seoul_hanmail', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'chldbs0109@hanmail.net', 'sun_hanmail', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'jhkang1151@hanmail.net', 'hee_hanmail', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'aa8276@nate.com', 'jin_nate', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'stopluna@nate.com', 'eun_nate', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'vldzhdltmf@nate.com', 'seoul_nate', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'chldbs0109@nate.com', 'sun_nate', 'qwer1234', sysdate);
insert into MEMBER_MAIN(num, email, nickname, password, regdate) values (MEMBER_MAIN_SEQ.nextval, 'jhkang1151@nate.com', 'hee_nate', 'qwer1234', sysdate);



insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'jin_inside', '±Ë«˝¡¯', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'eun_inside', '¡§¡ˆ¿∫', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'seoul_inside', 'π⁄¿ÃΩΩ', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'sun_inside', '√÷¿±º±', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'hee_inside', '∞≠¡ˆ»Ò', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'jin_naver', '¡§«˝¡¯', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'eun_naver', 'π⁄¡ˆ¿∫', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'seoul_naver', '√÷¿ÃΩΩ', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'sun_naver', '∞≠¿±º±', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'hee_naver', '±Ë¡ˆ»Ò', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'jin_daum', 'π⁄«˝¡¯', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'eun_daum', '√÷¡ˆ¿∫', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'seoul_daum', '∞≠¿ÃΩΩ', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'sun_daum', '±Ë¿±º±', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'hee_daum', '¡§¡ˆ»Ò', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'jin_kakao', '√÷«˝¡¯', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'eun_kakao', '∞≠¡ˆ¿∫', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'seoul_kakao', '±Ë¿ÃΩΩ', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'sun_kakao', '¡§¿±º±', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'hee_kakao', 'π⁄¡ˆ»Ò', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'jin_gmail', '∞≠«˝¡¯', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'eun_gmail', '±Ë¡ˆ¿∫', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'seoul_gmail', '¡§¿ÃΩΩ', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'sun_gmail', 'π⁄¿±º±', 'm', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'hee_gmail', '√÷¡ˆ»Ò', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'jin_hanmail', '¿Ã«˝¡¯', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'eun_hanmail', '¿Ã¡ˆ¿∫', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'seoul_hanmail', '¿Ã¿ÃΩΩ', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'sun_hanmail', '¿Ã¿±º±', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'hee_hanmail', '¿Ã¡ˆ»Ò', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'jin_nate', 'æÁ«˝¡¯', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'eun_nate', 'æÁ¡ˆ¿∫', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'seoul_nate', 'æÁ¿ÃΩΩ', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'sun_nate', 'æÁ¿±º±', 'w', sysdate, (select sysdate + interval '2' year from dual));
insert into MEMBER_SUB(num, nickname, name, gender, moddate, storedate) values (MEMBER_SUB_SEQ.nextval, 'hee_nate', 'æÁ¡ˆ»Ò', 'w', sysdate, (select sysdate + interval '2' year from dual));


insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'jin_inside');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'eun_inside');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'seoul_inside');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'sun_inside');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'hee_inside');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'jin_naver');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'eun_naver');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'seoul_naver');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'sun_naver');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'hee_naver');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'jin_daum');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'eun_daum');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'seoul_daum');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'sun_daum');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'hee_daum');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'jin_kakao');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'eun_kakao');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'seoul_kakao');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'sun_kakao');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'hee_kakao');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'jin_gmail');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'eun_gmail');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'seoul_gmail');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'sun_gmail');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'hee_gmail');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'jin_hanmail');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'eun_hanmail');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'seoul_hanmail');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'sun_hanmail');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'hee_hanmail');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'jin_nate');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'eun_nate');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'seoul_nate');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'sun_nate');
insert into MEMBER_ADDR(num, nickname) values (MEMBER_ADDR_SEQ.nextval, 'hee_nate');
