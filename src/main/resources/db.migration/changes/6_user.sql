create table if not exists users
(
    username varchar(255) primary key references hero (name),
    password varchar(255) not null,
    role varchar(255)[] not null default '{"USER"}'
);