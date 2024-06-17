create database malware;

use malware;

create table ad(
	id integer primary key auto_increment,
	username nvarchar(15),
    password nvarchar(15),
    name nvarchar(20)
);



create table ranking(
	id integer primary key auto_increment,
    ranking integer,
    description TEXT
);





create table type(
	id integer primary key auto_increment,
    typename nvarchar(15),
    information text,
    malware_type_id integer
);

create table malware(
	id integer primary key auto_increment,
    name nvarchar(50),
    other_name nvarchar(50),
    targeted_obj nvarchar(50),
    original_nation nvarchar(15),
    author nvarchar(20),
    born datetime,
    solving text,
    ranking_id integer,
    malware_type_id integer,
    foreign key (ranking_id) references ranking(id)
);

create table malware_type(
	id integer primary key auto_increment,
    type_id integer,
    malware_id integer 
);