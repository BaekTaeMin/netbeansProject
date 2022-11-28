# netbeansProject
<hr>
<br>

<h1> 회원가입 UserDB 생성 및 데이터베이스 연동 방법</h1>
<h3>
1. netbeans 데이터베이스 생성 <br>
&emsp;&emsp; SQL> create database netbeans;
<br>
</h3>

<h3>
2. 생성한 데이터베이스 사용 및 회원 테이블 생성<br>
&emsp;&emsp; SQL> use netbeans;<br><br>
&emsp;&emsp; SQL> create table netbeansUser (<br>
&emsp;&emsp;&emsp;&emsp;&emsp; u_no int(11) auto_increment primary key,<br>
&emsp;&emsp;&emsp;&emsp;&emsp; u_id varchar(20) not null,<br>
&emsp;&emsp;&emsp;&emsp;&emsp; u_pass varchar(20) not null,<br>
&emsp;&emsp;&emsp;&emsp;&emsp; u_date DATETIME not null<br>
&emsp;&emsp;&emsp;&emsp;&emsp; );
</h3>
<br>

<h3>
3. 데이터베이스 연동<br>
<br>
1) DB_MAN 파일 getConnection 부분에&nbsp; root에 본인 id, &nbsp;"" 부분에 본인 비밀번호 입력
</h3>
