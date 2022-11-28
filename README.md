# netbeansProject
<hr>

<h3>
1. netbeans 데이터베이스 생성 <br>
&nbsp&nbsp&nbsp&nbsp SQL> create database netbeans;
<br>
</h3>

<h3>
2. 생성한 데이터베이스 사용 및 회원 테이블 생성<br>
                     SQL> use netbeans;<br>
                     SQL> create table netbeansUser (
	u_no int(11) auto_increment primary key,
    u_id varchar(20) not null,
	u_pass varchar(20) not null,
    u_date DATETIME not null
);
</h3>
<br>

<h3>
3. 데이터베이스 연동<br>
<br>
1) DB_MAN 파일 getConnection 부분에 root에 본인 id / ""부분에 본인 비밀번호 입력
</h3>
