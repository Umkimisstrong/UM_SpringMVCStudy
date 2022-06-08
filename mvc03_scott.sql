<<<<<<< HEAD
select user from dual;
--==>> SCOTT

DESC TBL_MEMBERLIST;
/*
�̸�    ��?       ����            
----- -------- ------------- 
ID    NOT NULL VARCHAR2(30)  
PW    NOT NULL VARCHAR2(50)  
NAME  NOT NULL VARCHAR2(50)  
TEL   NOT NULL VARCHAR2(50)  
EMAIL          VARCHAR2(100) 
*/
DROP TABLE TBL_MEMBERLIST;
--==>> Table TBL_MEMBERLIST��(��) �����Ǿ����ϴ�.


--�� �ǽ� ���̺� ����(TBL_MEBERLIST)
CREATE TABLE TBL_MEMBERLIST
( MID       NUMBER
, NAME      VARCHAR2(30)
, TELEPHONE VARCHAR2(50)
=======
SELECT USER
FROM DUAL;
--==>> SCOTT

DROP TABLE TBL_MEMBERLIST;
--==>> Table TBL_MEMBERLIST��(��) �����Ǿ����ϴ�.

-- �� �ǽ� ���̺� ����(TBL_MEMBERLIST)
CREATE TABLE TBL_MEMBERLIST
( MID       NUMBER
, NAME      VARCHAR2(30)
, TEL       VARCHAR2(50)
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
, CONSTRAINT MEMBERLIST_MID_PK PRIMARY KEY(MID)
);
--==>> Table TBL_MEMBERLIST��(��) �����Ǿ����ϴ�.

<<<<<<< HEAD
--�� ������ ����
CREATE SEQUENCE MEMBERLISTSEQ
NOCACHE;
---==>> Sequence MEMBERLISTSEQ��(��) �����Ǿ����ϴ�.

--�� ���� ������ �Է�
INSERT INTO TBL_MEMBERLIST(MID, NAME, TELEPHONE) VALUES (MEMBERLISTSEQ.NEXTVAL, '������', '010-1111-1111')
;
--==>> 1 �� ��(��) ���ԵǾ����ϴ�.
INSERT INTO TBL_MEMBERLIST(MID, NAME, TELEPHONE) VALUES (MEMBERLISTSEQ.NEXTVAL, '������', '010-2222-2222')
;
--==>> 1 �� ��(��) ���ԵǾ����ϴ�.

--�� Ȯ��
SELECT *
FROM TBL_MEMBERLIST;
/*
1	������	010-1111-1111
2	������	010-2222-2222
*/

--�� Ŀ��
COMMIT;
-- Ŀ�� �Ϸ�.

--�� ����Ʈ ��ȸ ������ ����
SELECT MID, NAME, TELEPHONE
FROM TBL_MEMBERLIST
ORDER BY MID;
-- ���� ����
SELECT MID, NAME, TELEPHONE FROM TBL_MEMBERLIST ORDER BY MID
;
/*
1	������	010-1111-1111
2	������	010-2222-2222
*/

--�� �ο��� ��ȸ ���� ����
SELECT COUNT(*) AS COUNT FROM TBL_MEMBERLIST
;
--==>> 2




















=======
-- �� ������ ����(MEMBERLISTSEQ)
CREATE SEQUENCE MEMBERLISTSEQ
NOCACHE;
--==>> Sequence MEMBERLISTSEQ��(��) �����Ǿ����ϴ�.


-- �� ���� ������ �Է�
INSERT INTO TBL_MEMBERLIST(MID, NAME, TEL)
VALUES(MEMBERLISTSEQ.NEXTVAL, '������', '010-1234-1234');
--> �� �� ����
INSERT INTO TBL_MEMBERLIST(MID, NAME, TEL) VALUES(MEMBERLISTSEQ.NEXTVAL, '������', '010-1234-1234')
;
--==>>1 �� ��(��) ���ԵǾ����ϴ�.
INSERT INTO TBL_MEMBERLIST(MID, NAME, TEL) VALUES(MEMBERLISTSEQ.NEXTVAL, '������', '010-2345-2345')
;
--==>> 1 �� ��(��) ���ԵǾ����ϴ�.

-- �� Ȯ��
SELECT *
FROM TBL_MEMBERLIST;
/*
1	������	010-1234-1234
2	������	010-2345-2345
*/

-- �� Ŀ��
COMMIT;
--==>> Ŀ�� �Ϸ�.

-- �� ��ȸ ������ ����(�� ��)
SELECT MID, NAME, TEL FROM TBL_MEMBERLIST ORDER BY MID
;
-- �� �ο��� ��ȸ ������ ����(�� ��)
SELECT COUNT(*) AS COUNT FROM TBL_MEMBERLIST
;


SELECT *
FROM TBL_MEMBERLIST;
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c

