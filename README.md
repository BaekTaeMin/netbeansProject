# netbeansProject
<hr>
<br>

<h1> 회원가입 UserDB 생성 및 데이터베이스 연동 방법</h1>
<h3>
1. jar파일 추가 <br>
Library -> Add JAR/Folder -> mysql-connector-java-8.0.13.jar파일추가 <br>
</h3>

<h3>
2. netbeans 데이터베이스 생성 <br>
&emsp;&emsp; SQL> create database netbeans;
<br>
</h3>

<h3>
3. 생성한 데이터베이스 사용 및 회원 테이블 생성<br>
&emsp;&emsp; SQL> use netbeans;<br><br>
&emsp;&emsp; SQL> create table netbeansUser (<br>
&emsp;&emsp;&emsp;&emsp;&emsp; u_no int(11) auto_increment primary key,<br>
&emsp;&emsp;&emsp;&emsp;&emsp; u_id varchar(20) not null,<br>
&emsp;&emsp;&emsp;&emsp;&emsp; u_salt varchar(200) not null,<br>
&emsp;&emsp;&emsp;&emsp;&emsp; u_pass varchar(200) not null,<br>
&emsp;&emsp;&emsp;&emsp;&emsp; u_date DATETIME not null<br>
&emsp;&emsp;&emsp;&emsp;&emsp; );
</h3>
<br>

<h3>
4. 데이터베이스 연동<br>
<br>
1) DB_MAN 파일 getConnection 부분에&nbsp; root에 본인 id, &nbsp;"" 부분에 본인 비밀번호 입력
</h3>

<br><br><br>

<h1>
상품 product, 재고 stock Table 추가 방법
</h1>
<h3>
1. product 테이블 생성 <br>
&emsp;&emsp; SQL> create table product( <br>
&emsp;&emsp;&emsp;&emsp;&emsp; p_no int(10) primary key, <br>
&emsp;&emsp;&emsp;&emsp;&emsp; p_brand varchar(200) not null, <br>
&emsp;&emsp;&emsp;&emsp;&emsp; p_name varchar(200) not null <br>
&emsp;&emsp;&emsp;&emsp;&emsp; ); <br>
</h3>
<h3>
2. stock 테이블 생성 <br>
&emsp;&emsp; SQL> create table stock( <br>
&emsp;&emsp;&emsp;&emsp;&emsp; p_no int(10) not null, <br>
&emsp;&emsp;&emsp;&emsp;&emsp; p_size int(10) not null, <br>
&emsp;&emsp;&emsp;&emsp;&emsp; p_qty int, <br>
&emsp;&emsp;&emsp;&emsp;&emsp; primary key(p_no, p_size), <br>
&emsp;&emsp;&emsp;&emsp;&emsp; foreign key(p_no) <br>
&emsp;&emsp;&emsp;&emsp;&emsp; references product(p_no) on update cascade <br>
&emsp;&emsp;&emsp;&emsp;&emsp; /* 외래키, 복합키 사용 */ <Br>
&emsp;&emsp;&emsp;&emsp;&emsp; ); <br>
</h3>
<h2>
ps) 테이블 relation
</h2>
product테이블의 primary key(p_no)를 stock테이블의 p_no가 참조하도록 설계 <br>
=> 조인을 활용하여 데이터 핸들링 간편화 <br>
