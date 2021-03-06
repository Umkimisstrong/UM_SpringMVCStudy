SELECT USER
FROM DUAL;
--==>> COMFIT
--●------------------1. 신고관련 테이블----------------------●--
-- ① 신고자종류 테이블(REPORTER_CATEGORY)
CREATE TABLE REPORTER_CATEGORY
( REPORTER_ID       NUMBER  
, REPORTER_PROP     VARCHAR2(20)    NOT NULL
, CONSTRAINT REPORTER_ID_PK PRIMARY KEY(REPORTER_ID)
);
--==>> Table REPORTER_CATEGORY이(가) 생성되었습니다.

-- ①-(1)신고자종류테이블 시퀀스(REPORTER_CATE_SEQ)
CREATE SEQUENCE REPORTER_CATE_SEQ
NOCACHE;
--==>> Sequence REPORTER_CATE_SEQ이(가) 생성되었습니다.

-- ② 거래신고사유카테고리 테이블(TRANS_REP_CATEGORY)
CREATE TABLE TRANS_REP_CATEGORY
( TRANS_REP_CID         NUMBER
, REP_CATE_NAME         VARCHAR2(20)    NOT NULL
, CONSTRAINT TRANS_REP_CID_PK PRIMARY KEY(TRANS_REP_CID)
);
--==>> Table TRANS_REP_CATEGORY이(가) 생성되었습니다.

-- ②-(1) 거래신고사유카테고리 테이블 시퀀스(T_REP_CATE_SEQ)
CREATE SEQUENCE T_REP_CATE_SEQ
NOCACHE;
--==>> Sequence T_REP_CATE_SEQ이(가) 생성되었습니다.

-- ③ 상품신고사유카테고리 테이블(PD_REP_CATEGORY)
CREATE TABLE PD_REP_CATEGORY
( PD_REP_CID       NUMBER
, REP_CATE_NAME    VARCHAR2(20)    NOT NULL
, CONSTRAINT PD_REP_CID_PK PRIMARY KEY(PD_REP_CID)
);
--==>> Table PD_REP_CATEGORY이(가) 생성되었습니다.

-- ③-(1) 거래신고사유카테고리 테이블 시퀀스(T_REP_CATE_SEQ)
CREATE SEQUENCE P_REP_CATE_SEQ
NOCACHE;
--==>> Sequence P_REP_CATE_SEQ이(가) 생성되었습니다.

-- ④ 신고처리분류테이블(REP_HANDLE_CATEGORY)
CREATE TABLE REP_HANDLE_CATEGORY
( HAN_CATE_ID       NUMBER
, HAN_CATE_NAME     VARCHAR2(20)    NOT NULL
, CONSTRAINT HAN_CATE_ID PRIMARY KEY(HAN_CATE_ID)
);
--==>> Table REP_HANDLE_CATEGORY이(가) 생성되었습니다.

-- ④-(1) 신고처리분류테이블 시퀀스(HAN_CATE_SEQ)
CREATE SEQUENCE HAN_CATE_SEQ
NOCACHE;
--==>> Sequence HAN_CATE_SEQ이(가) 생성되었습니다.



--●------------------==================----------------------●--





--●------------------2. 차단관련 테이블----------------------●--




--●------------------==================----------------------●--




--●------------------3. 회원관련 테이블----------------------●--




--●------------------==================----------------------●--




--●------------------4. 상품관련 테이블----------------------●--




--●------------------==================----------------------●--
