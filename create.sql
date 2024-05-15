create table ANONYMOUS.EMPLOYEE_WORKED_HOURS (workedHours number(10,0), employee_id number(19,0), id number(19,0) not null, workedDate timestamp(6), primary key (id));
create table ANONYMOUS.EMPLOYEES (birthdate timestamp(6), gender_id number(19,0), id number(19,0) not null, job_id number(19,0), last_name varchar2(255 char), name varchar2(255 char), primary key (id));
create table ANONYMOUS.GENDERS (id number(19,0) not null, name varchar2(255 char), primary key (id));
create table ANONYMOUS.JOBS (salary float(24), id number(19,0) not null, name varchar2(255 char), primary key (id));
alter table ANONYMOUS.EMPLOYEE_WORKED_HOURS add constraint FKs6bbhel3btdcpq2dpljbvnpgg foreign key (employee_id) references ANONYMOUS.EMPLOYEES;
alter table ANONYMOUS.EMPLOYEES add constraint FKd7y5v8rjwv4m3tvyexeso588r foreign key (gender_id) references ANONYMOUS.GENDERS;
alter table ANONYMOUS.EMPLOYEES add constraint FKl1o0ed8d3c716m48p2xkgs87d foreign key (job_id) references ANONYMOUS.JOBS;
