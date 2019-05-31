# Database

* DBMS(Database Management System)
* RDBMS (Relational-DBMS) : 관계형
* 무료-마리아 DB
* MySQL - 오라클 편입

* RDBMS(서버)의 지정 포트에 연결하여 사용
*  <http://127.0.0.1:8080/apex/f?p=4950>SQL DB관리자 접속

# SQL

### 명명 규칙

* 데이터베이스나 테이블,열 등의 ***이름*** 으로 사용할 수 있는 문자는 다음 세 가지다.
  * 영문자
  * 숫자
  * 언더바(_)
* 이름 첫 글자는 **영문자**로 한다 
* 이름은 중복사용 안됨

#### 데이터형

* **INTEGER**
  * 정수형
* **CHAR**
  * 고정 문자열
* **VARCHAR**
  * 가변 문자열
  * Oracle 에서는 VARCHAR2형
* **DATE**
  * 날짜를 저장하는 데이터형
  * SYSDATE(VALUES) - 시스템 시간

```sql
CREATE TABLE T_PRODUCT (
    ID VARCHAR2(10),
    NAME VARCHAR2(20),
    PRICE NUMBER(10,1),
    REGDATE DATE
);
```



## DDL

* **CREATE(표 생성)** 

  * ```sql
    CREATE TABLE T_USER (
    	ID VARCHAR2(10),
        PWD VARCHAR2(10),
        NAME VARCHAR2(20)
    );
    ```

  * DESC T_USER;  - Table 상태 출력

* **DROP(표 삭제)**

  * ```sql
    DROP TABLE T_USER ();
    ```

  * Table 전체 삭제

* **ALTER(표 변경)**

  * ```sql
    ALTER TABLE T_PRODUCT ADD (REGDATE DATE);
    //COLUMN 추가
    ALTER TABLE T_PRODUCT DROP (REGDATE);
    //COLUMN 삭제
    ALTER TABLE T_PRODUCT ADD PRIMARY KEY(ID);
    //PRIMARY KEY 추가
    ALTER TABLE T_PRODUCT MODIFY(NAME NULL);
    //속성 변경
    ALTER TABLE T_PRODUCT RENAME COLUMN NAME TO UNAME;
    //열 이름 변경
    ALTER TABLE T_PRODUCT RENAME TO PRODUCT;
    //Table 이름 변경
    ALTER TABLE T_USER MODIFY (NAME UNIQUE);
    //이름 중복 삽입 불가
    ALTER TABLE T_USER MODIFY (NAME NOT NULL);
    //이름 NULL값 불가
    ALTER TABLE T_PRODUCT MODIFY (PRICE DEFAULT 1000);
    //PRICE DEFAULT값 1000
    INSERT INTO T_PRODUCT VALUES('P04','pants4',20000,SYSDATE);
    INSERT INTO T_PRODUCT (ID,NAME,REGDATE) VALUES('P02','pants2',SYSDATE);
    // row 생성
    ```

  * 소수점 자동 반올림 (Default 소수점 첫째자리)

## DML

* **INSERT**

  * **unique constraint (DB.SYS_C007095) violated** 같은ID 입력 시 오류(PRIMARY KEY 선언 후)

    ```SQL
    INSERT INTO T_USER (ID,PWD,NAME) VALUES('id01','pwd01','이말숙');
    INSERT INTO T_USER VALUES('id06','pwd06','고말숙');
    ```

* **DELETE**

  ```sql
  DELETE FROM T_USER WHERE ID='id05';
  ```

* **UPDATE**

  ```sql
  UPDATE T_USER SET PWD='111',NAME='공말숙' WHERE ID='id03';
  ```



