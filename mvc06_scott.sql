<<<<<<< HEAD
select user
from dual;

--�� ���� ���̺� ����
DROP TABLE TBL_MEMBERLIST;
--==>> Table TBL_MEMBERLIST��(��) �����Ǿ����ϴ�.


-- �ǽ� ���̺� �ٽ� ����
CREATE TABLE TBL_MEMBERLIST
( ID        VARCHAR2(30)
, PW        VARCHAR2(20)
, NAME      VARCHAR2(50)        
=======
SELECT USER
FROM DUAL;
--==>> SCOTT

-- �� ���� ���̺� ����
DROP TABLE TBL_MEMBERLIST;
--==>> Table TBL_MEMBERLIST��(��) �����Ǿ����ϴ�.

-- �� �ǽ� ���̺� �ٽ� ����
CREATE TABLE TBL_MEMBERLIST
( ID        VARCHAR2(30)
, PW        VARCHAR2(20)
, NAME      VARCHAR2(50)
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
, TEL       VARCHAR2(50)
, EMAIL     VARCHAR2(100)
, CONSTRAINT MEMBERLIST_ID_PK PRIMARY KEY(ID)
);
--==>> Table TBL_MEMBERLIST��(��) �����Ǿ����ϴ�.

<<<<<<< HEAD
--�� ������ �Է�
INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL , EMAIL) VALUES('admin', CRYPTPACK.ENCRYPT('java006$', 'java006$'), '������', '010-1212-3434', 'kth@test.com')
;

-- Ȯ��
=======
-- �� ������ �Է�
INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL)
VALUES('admin', CRYPTPACK.ENCRYPT('java006$', 'java006$')
      , '������', '010-1212-3434', 'kth@test.com');
--> �� �� ����      
INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL) VALUES('admin', CRYPTPACK.ENCRYPT('java006$', 'java006$'), '������', '010-1212-3434', 'kth@test.com')
;      
--==>> 1 �� ��(��) ���ԵǾ����ϴ�.

-- �� Ȯ��
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
SELECT *
FROM TBL_MEMBERLIST;
--==>> admin	???^	������	010-1212-3434	kth@test.com

<<<<<<< HEAD
-- Ŀ��
=======
-- �� Ŀ��
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
COMMIT;
--==>> Ŀ�� �Ϸ�.


<<<<<<< HEAD
SELECT ID, NAME, TEL, EMAIL FROM TBL_MEMBERLIST
;





















=======
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c




<<<<<<< HEAD
=======
 
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
