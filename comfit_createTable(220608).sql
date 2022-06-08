SELECT USER
FROM DUAL;
--==>> COMFIT
--��------------------1. �Ű���� ���̺�----------------------��--
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

-- �� ��ǰ�Ű����ī�װ� ���̺�(PD_REP_CATEGORY)
CREATE TABLE PD_REP_CATEGORY
( PD_REP_CID       NUMBER
, REP_CATE_NAME    VARCHAR2(20)    NOT NULL
, CONSTRAINT PD_REP_CID_PK PRIMARY KEY(PD_REP_CID)
);
--==>> Table PD_REP_CATEGORY��(��) �����Ǿ����ϴ�.

-- ��-(1) �ŷ��Ű����ī�װ� ���̺� ������(T_REP_CATE_SEQ)
CREATE SEQUENCE P_REP_CATE_SEQ
NOCACHE;
--==>> Sequence P_REP_CATE_SEQ��(��) �����Ǿ����ϴ�.

-- �� �Ű�ó���з����̺�(REP_HANDLE_CATEGORY)
CREATE TABLE REP_HANDLE_CATEGORY
( HAN_CATE_ID       NUMBER
, HAN_CATE_NAME     VARCHAR2(20)    NOT NULL
, CONSTRAINT HAN_CATE_ID PRIMARY KEY(HAN_CATE_ID)
);
--==>> Table REP_HANDLE_CATEGORY��(��) �����Ǿ����ϴ�.

-- ��-(1) �Ű�ó���з����̺� ������(HAN_CATE_SEQ)
CREATE SEQUENCE HAN_CATE_SEQ
NOCACHE;
--==>> Sequence HAN_CATE_SEQ��(��) �����Ǿ����ϴ�.



--��------------------==================----------------------��--





--��------------------2. ���ܰ��� ���̺�----------------------��--




--��------------------==================----------------------��--




--��------------------3. ȸ������ ���̺�----------------------��--




--��------------------==================----------------------��--




--��------------------4. ��ǰ���� ���̺�----------------------��--




--��------------------==================----------------------��--
