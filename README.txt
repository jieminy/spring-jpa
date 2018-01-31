create table if not exists person(
    number int UNSIGNED AUTO_INCREMENT,
    name varchar(20) not null,
    age  int not null,
    address varchar(50) not null,
    PRIMARY KEY (number)
    );