/*
보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 0시부터 23시까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.
*/

WITH TMP AS (
SELECT LEVEL - 1 AS HOUR
  FROM DUAL
  CONNECT BY LEVEL <= 24
) -- 시간 더미 테이블

SELECT TMP.HOUR
     , COUNT(A.CNT) AS COUNT
  FROM TMP
  LEFT OUTER JOIN (
      SELECT TO_NUMBER(TO_CHAR(datetime, 'HH24')) as HOUR
           , 1 AS CNT
        from ANIMAL_OUTS 
  ) A
  ON TMP.HOUR = A.HOUR
  GROUP BY TMP.HOUR
  ORDER BY TMP.HOUR