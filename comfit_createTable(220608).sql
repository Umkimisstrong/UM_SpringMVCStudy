SELECT USER
FROM DUAL;
--==>> COMFIT
--��------------------�� �Ű���� ���̺�----------------------��--
-- �� �Ű������� ���̺�(REPORTER_CATEGORY)
CREATE TABLE REPORTER_CATEGORY
( REPORTER_ID       NUMBER  
, REPORTER_PROP     VARCHAR2(20)    NOT NULL
, CONSTRAINT REPORTER_ID_PK PRIMARY KEY(REPORTER_ID)
);
--==>> Table REPORTER_CATEGORY��(��) �����Ǿ����ϴ�.

-- ��-(1)�Ű����������̺� ������(REPORTER_CATE_SEQ)
CREATE SEQUENCE REPORTER_CATE_SEQ
NOCACHE;
--==>> Sequence REPORTER_CATE_SEQ��(��) �����Ǿ����ϴ�.

-- �� �ŷ��Ű����ī�װ� ���̺�(TRANS_REP_CATEGORY)
CREATE TABLE TRANS_REP_CATEGORY
( TRANS_REP_CID         NUMBER
, REP_CATE_NAME         VARCHAR2(20)    NOT NULL
, CONSTRAINT TRANS_REP_CID_PK PRIMARY KEY(TRANS_REP_CID)
);
--==>> Table TRANS_REP_CATEGORY��(��) �����Ǿ����ϴ�.

-- ��-(1) �ŷ��Ű����ī�װ� ���̺� ������(T_REP_CATE_SEQ)
CREATE SEQUENCE T_REP_CATE_SEQ
NOCACHE;
--==>> Sequence T_REP_CATE_SEQ��(��) �����Ǿ����ϴ�.



--��------------------==================----------------------��--

