# Database(SQL)

## SQL 문법

* **SELECT**

  * 열에 별명 부여

    ```SQL
    SELECT ENAME,SAL,SAL*12 AS ASAL,DEPTNO AS DNO FROM EMP;
    SELECT ENAME,SAL,SAL*12 AS "ANN SAL",DEPTNO AS DNO FROM EMP;
    ```

  * 열 붙이기

    ```sql
    SELECT ENAME || ' ' || SAL AS ENAMEANDJOB
    FROM EMP; --ENAME 과 SAL 붙이기
    ```

  * 중복 행 제거

    ```sql
    SELECT DISTINCT(JOB)
    FROM EMP;
    ```

  * WHERE 구 

    ```SQL
    SELECT * FROM EMP
    WHERE JOB = 'MANAGER' --AND 중복 가능
    AND SAL > 2500
    AND NOT (SAL >= 2000);
    AND HIREDATE > '04/15/1981'; --날짜도 비교 가능
    AND ENAME LIKE 'C%';--C로 시작하는 이름
    AND ENAME LIKE '%A%';--A가 들어간 이름
    ```

  * 주석

    ```sql
    -- 구문 사이에도 가능
    -- where statment.
    /*
    Multi Comments ..
    */
    ```

  * 계산, NVL, NVL2

    ```SQL
    SELECT ENAME,SAL,
    -- 연봉을 계산 하시오 단, SAL의 세금은 13%, COMM의 세금은 12%
    ((SAL*12)*0.87) + ((NVL(COMM,0)*12)*0.88) AS ANSAL
    FROM EMP --NVL- NULL 값이 있으면 0으로 체움 , NULL 값은 연산이 안됨
    WHERE ((SAL*12)*0.87) + ((NVL(COMM,0)*12)*0.88)> 30000;;
    -- WHERE에서 ANSAL로 비교 불가 수식 그대로 기입
    WHERE ((SAL*12)*0.87) + ((NVL(COMM,0)*12)*0.88) <> 52200;
    -- <> - NOT EQUAL 
    SELECT ENAME ,NVL2(COMM,'0','1') FROM EMP; 
    --NULL이 아니면 1, NULL이면 0
    ```

  * IS , IS NOT

    ```SQL
    SELECT * FROM EMP
    WHERE COMM IS NULL; //NULL 값만 
    WHERE COMM IS NOT NULL; //NULL 아닌 값만
    ```

  * 비교 연산자

    ```SQL
    SELECT * FROM EMP
    WHERE JOB = 'MANAGER' 
    AND SAL > 2500
    AND NOT (SAL >= 2000);
    SELECT * FROM EMP
    WHERE SAL < 2000
    AND DEPTNO =30 -- 순서대로 연산 
    OR ENAME LIKE '%E%';
    
    SELECT * FROM EMP
    WHERE JOB = 'CLERK'
    AND (DEPTNO = 10 OR DEPTNO = 20); --괄호 없으면 DEPTNO 20인 모든사람 추가
    AND NOT (DEPTNO = 10 OR DEPTNO = 20);
    ```

  * 정렬

    ```sql
    SELECT ENAME,SAL FROM EMP -- ORDER BY 제일 마지막에
    WHERE SAL > 1000
    AND DEPNO = 20
    ORDER BY SAL DESC; -- 내림차순
    ORDER BY SAL; -- 오름차순
    
    SELECT ENAME,SAL, SAL*12 FROM EMP
    WHERE SAL > 1000
    ORDER BY 3;--3번째 항목 오름차순 정렬
    ```

* **FUNCTION**

  * ||연결

    ```sql
    SELECT LOWER(ENAME) || ' ' || JOB AS EJOB FROM EMP;
    --LOWER -소문자, 문자열 연결
    ```

  * SUBSTRING

    ```sql
    SELECT ENAME, SUBSTR(ENAME,1, 3) FROM EMP;
    -- SUBSTR(대상 문자열, 잘라내기 시작 위치, 잘라낼 문자 수)
    SELECT ENAME,SUBSTR(SAL,1,2)*10 FROM EMP;
    -- SUBSTR이 숫자이면 연산까지 가능 (자동 변환)
    ```

  * REPLACE

    ```sql
    SELECT ENAME, SUBSTR(ENAME,1, 3),
    REPLACE(ENAME,SUBSTR(ENAME, 2,LENGTH(ENAME)),
    LOWER(SUBSTR(ENAME, 2,LENGTH(ENAME))))
    FROM EMP; --문자열의 2번째 글자부터 끝까지만 소문자로 변경한다.
    ```

  * LENGTH

    ```sql
    SELECT NAME, LENGTH(NAME) FROM T_USER;
    ```

  * 문자 - **한글 3바이트** ,**영어 - 1바이트**

  * IN, NOT IN

    ```sql
    SELECT ENAME,SAL FROM EMP
    WHERE DEPTNO IN(20,30); --20과 30이 있는
    WHERE DEPTNO NOT IN(20,30); --20과 30이 없는
    ```

  * TO_CHAR, TO_DATE

    ```SQL
    SELECT ENAME, TO_CHAR(CURRENT_TIMESTAMP,'YYYY:MM:DD:HH:MM:SS'),
    TO_CHAR(HIREDATE,'YYYY/MM/DD'),
    HIREDATE,SYSDATE FROM EMP;
    
    INSERT INTO T_PRODUCT VALUES
    (10,'pants',100000,TO_DATE('2010/10/11','YY:MM:DD'));
    --문자를 DATE형으로 변환
    ```

  * TIME

    ```sql
    SYSDATE - HIREDATE --날짜 계산 가능
    MONTHS_BETWEEN(SYSDATE,HIREDATE) --두 날짜 사이 몇개월 지났는지 계산
    ```

  * BETWEEN

    ```sql
    SELECT ENAME ,SAL FROM EMP
    WHERE SAL BETWEEN 2000 AND 5000; --양 끝단의 값 포함
    ```

  * ROUND, TRUNC

    ```SQL
    ROUND(SAL,-2)--10단위 반올림
    TRUNC(SAL,0)--소수점 버림
    ```

    

* **CASE**

  ```SQL
  SELECT ENAME ,SAL,
  CASE WHEN SAL >= 5000
       THEN '왕'
       WHEN SAL >= 3000 AND SAL < 5000
       THEN '관리자'
       ELSE '직원'
  END AS GRADE  --GRADE COLUMN 추가
  FROM EMP;
  ```

  