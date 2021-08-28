REM   Script: Activity1
REM   My Activity1

Select * from Salesman;

Select * from salesman;

Select * from scott;

Select * from EMP;

Select * from emp;

Create table Salesman( 
CustomerID int,CustomerName varchar2(52),ContactName varchar(32));

Select * from Salesman;

Select CustomerName from Salesman;

Describe Salesman


Insert into Salesman Values(90,Jasleen Kaur,Jazz);

Insert into Salesman Values(90,'Jasleen Kaur','Jazz');

Select * from Salesman;

Select CustomerID from Salesman;

Select * from Salesman where salesman_city='Paris';

Select * from Salesman where customerName='Jasleen';

Select * from Salesman where customerName='Jasleen Kaur';

Alter table Salesman  
modify CustomerName SalesmanName;

Alter table Salesman  
add salesman_city place;

Alter table Salesman  
add salesman_city varchar2(52);

Insert Into salesman Values(91,'Deepak','Deepu','Gwalior');

Select * from Salesman;

Select CustomerName from Salesman where Salesman_city='Gwalior';

