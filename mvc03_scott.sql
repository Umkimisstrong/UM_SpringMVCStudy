SELECT USER
FROM DUAL;
--==>> SCOTT

DROP TABLE TBL_MEMBERLIST;
--==>> Table TBL_MEMBERLIST이(가) 삭제되었습니다.

-- ○ 실습 테이블 생성(TBL_MEMBERLIST)
CREATE TABLE TBL_MEMBERLIST
( MID       NUMBER
, NAME      VARCHAR2(30)
, TEL       VARCHAR2(50)
, CONSTRAINT MEMBERLIST_MID_PK PRIMARY KEY(MID)
);
--==>> Table TBL_MEMBERLIST이(가) 생성되었습니다.

-- ○ 시퀀스 생성(MEMBERLISTSEQ)
CREATE SEQUENCE MEMBERLISTSEQ
NOCACHE;
--==>> Sequence MEMBERLISTSEQ이(가) 생성되었습니다.


-- ○ 샘플 데이터 입력
INSERT INTO TBL_MEMBERLIST(MID, NAME, TEL)
VALUES(MEMBERLISTSEQ.NEXTVAL, '정은정', '010-1234-1234');
--> 한 줄 구성
INSERT INTO TBL_MEMBERLIST(MID, NAME, TEL) VALUES(MEMBERLISTSEQ.NEXTVAL, '정은정', '010-1234-1234')
;
--==>>1 행 이(가) 삽입되었습니다.
INSERT INTO TBL_MEMBERLIST(MID, NAME, TEL) VALUES(MEMBERLISTSEQ.NEXTVAL, '박현지', '010-2345-2345')
;
--==>> 1 행 이(가) 삽입되었습니다.

-- □ 확인
SELECT *
FROM TBL_MEMBERLIST;
/*
1	정은정	010-1234-1234
2	박현지	010-2345-2345
*/

-- ○ 커밋
COMMIT;
--==>> 커밋 완료.

-- ○ 조회 쿼리문 구성(한 줄)
SELECT MID, NAME, TEL FROM TBL_MEMBERLIST ORDER BY MID
;
-- ○ 인원수 조회 쿼리문 구성(한 줄)
SELECT COUNT(*) AS COUNT FROM TBL_MEMBERLIST
;


SELECT *
FROM TBL_MEMBERLIST;

