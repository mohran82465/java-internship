CREATE DATABASE GDSC; 
use GDSC;

create table Employee (
	id int not null auto_increment, 
    first_name varchar(255),
    last_name varchar(255),
    sex varchar(255),
    age int ,
    address varchar(255),
    phone_number varchar(255),
    vaction_balance int default 30 , 
	primary key(id)
)

alter table employee add title varchar(255) default "mr";

INSERT INTO Employee (first_name,last_name,sex,age,address,phone_number,vaction_balance ) 
values ("mohamed","mohran","male",23,"sohag","01098187312",30);

SELECT * FROM employee;


output sample : 
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=60098:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath "D:\java workspace\java-internship\JDBCTask\out\production\JDBCTask;D:\java workspace\mysql-connector-j-9.0.0\mysql-connector-j-9.0.0\mysql-connector-j-9.0.0.jar" Main
Employee{id=1, firstName='mohamed', lastName='mohran', sex='male', age=23, address='sohag', vactionBalace=30, title='eng'}
Employee{id=2, firstName='mohamed', lastName='mohran', sex='male', age=40, address='cairo', vactionBalace=30, title='mr'}
Employee{id=3, firstName='ahmed', lastName='ashraf', sex='male', age=55, address='sohag', vactionBalace=30, title='mr'}
Employee{id=4, firstName='ali', lastName='mohamed', sex='male', age=47, address='cairo', vactionBalace=30, title='mr'}
Employee{id=5, firstName='mona', lastName='soliman', sex='female', age=46, address='qenna', vactionBalace=34, title='mrs'}
Employee{id=6, firstName='omar', lastName='ali', sex='male', age=54, address='sohag', vactionBalace=55, title='mr'}
Employee{id=7, firstName='mohmed', lastName='ismal', sex='male', age=54, address='sohag', vactionBalace=30, title='mr'}
=======================================================
=======================================================
Employee{id=1, firstName='mohamed', lastName='mohran', sex='male', age=23, address='sohag', vactionBalace=30, title='eng'}
Employee{id=2, firstName='mohamed', lastName='mohran', sex='male', age=40, address='cairo', vactionBalace=30, title='mr'}
Employee{id=3, firstName='ahmed', lastName='ashraf', sex='male', age=55, address='sohag', vactionBalace=45, title='mr'}
Employee{id=4, firstName='ali', lastName='mohamed', sex='male', age=47, address='cairo', vactionBalace=45, title='mr'}
Employee{id=5, firstName='mona', lastName='soliman', sex='female', age=46, address='qenna', vactionBalace=45, title='mrs'}
Employee{id=6, firstName='omar', lastName='ali', sex='male', age=54, address='sohag', vactionBalace=45, title='mr'}
Employee{id=7, firstName='mohmed', lastName='ismal', sex='male', age=54, address='sohag', vactionBalace=45, title='mr'}

Process finished with exit code 0

