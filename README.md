# netbeansProject
<hr>

<h3>
1. netbeans 데이터베이스 생성 <br>
&nbsp&nbsp&nbsp&nbsp SQL> create database netbeans;
<br>
</h3>

<h3>
2. 생성한 데이터베이스 사용 및 회원 테이블 생성<br>
&nbsp&nbsp&nbsp&nbsp SQL> use netbeans;<br>
&nbsp&nbsp&nbsp&nbsp SQL> create table netbeansUser (<br>
&nbsp&nbsp&nbsp&nbsp u_no int(11) auto_increment primary key,<br>
&nbsp&nbsp&nbsp&nbsp u_id varchar(20) not null,<br>
&nbsp&nbsp&nbsp&nbsp u_pass varchar(20) not null,<br>
&nbsp&nbsp&nbsp&nbsp u_date DATETIME not null<br>
&nbsp&nbsp&nbsp&nbsp );
</h3>
<br>

<h3>
3. 데이터베이스 연동<br>
<br>
1) DB_MAN 파일 getConnection 부분에 root에 본인 id / ""부분에 본인 비밀번호 입력
</h3>
