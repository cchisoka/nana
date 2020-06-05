CREATE TABLE test (
  id bigint(20)  not null auto_increment,
  name varchar(255) NOT NULL,
  age tinyint(1) unsigned DEFAULT NULL,
  primary key (id)
) ;


insert into test(name, age) values('rose', 18);