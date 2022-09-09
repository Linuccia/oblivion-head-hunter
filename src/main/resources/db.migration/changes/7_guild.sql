create table if not exists guild
(
    name varchar(255) primary key,
    admin_name varchar(255) not null unique references hero (name)
);

insert into guild values ('Гильдия бойцов', 'Вилена Донтон');
insert into guild values ('Гильдия магов', 'Ганнибал Травен');
insert into guild values ('Гильдия воров', 'Серый Лис');
insert into guild values ('Арена', 'Агронак гро-Малог');
insert into guild values ('Темное Братство', 'Анголим');