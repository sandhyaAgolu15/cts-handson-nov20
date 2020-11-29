create database cts_db;
use cts_db;
create table employee(
id integer primary key,
name varchar(15),
salary double
);

insert into employee
values
(1, "sandhya", 40000),
(2, "abhishek", 30000),
(3, "prem", 20000);
