create table teams (id serial primary key, name varchar(80) not null);
create table renners (id serial primary key, name varchar(80) not null , birthdate date not null, team_id serial references teams(id));
