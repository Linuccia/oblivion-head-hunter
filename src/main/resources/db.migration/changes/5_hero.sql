create table if not exists hero
(
    name varchar(255) primary key,
    gender varchar(255) not null,
    level int not null check (level > 0),
    race_name varchar(255) not null references race (name),
    hero_class_name varchar(255) not null references hero_class (name),
    galaxy_name varchar(255) not null references galaxy (name),
    attributes_id  bigint  not null references attributes (id)
);

insert into attributes values(33,  100, 100, 100, 100, 100, 100, 100, 100);
insert into attributes values(34,  100, 100, 100, 100, 100, 100, 100, 100);
insert into attributes values(35,  100, 100, 100, 100, 100, 100, 100, 100);
insert into attributes values(36,  100, 100, 100, 100, 100, 100, 100, 100);
insert into attributes values(37,  100, 100, 100, 100, 100, 100, 100, 100);

insert into hero values ('Вилена Донтон', 'женский', 100, 'Имперец', 'Воин', 'Воин', 33);
insert into hero values ('Ганнибал Травен', 'мужской', 100, 'Бретонец', 'Маг', 'Маг', 34);
insert into hero values ('Серый Лис', 'мужской', 100, 'Имперец', 'Вор', 'Вор', 35);
insert into hero values ('Агронак гро-Малог', 'мужской', 100, 'Орк', 'Воин', 'Воин', 36);
insert into hero values ('Анголим', 'мужской', 100, 'Лесной эльф', 'Ассасин', 'Тень', 37);