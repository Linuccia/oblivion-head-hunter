create table if not exists hero
(
    name varchar(255) primary key,
    gender varchar(255) not null,
    level int not null check (level > 0),
    race_name varchar(255) not null references race (name),
    hero_class_name varchar(255) not null references hero_class (name),
    attributes_id  bigint  not null references attributes (id)
);

insert into attributes values(20,  100, 100, 100, 100, 100, 100, 100, 100);
insert into attributes values(21,  100, 100, 100, 100, 100, 100, 100, 100);
insert into attributes values(22,  100, 100, 100, 100, 100, 100, 100, 100);
insert into attributes values(23,  100, 100, 100, 100, 100, 100, 100, 100);
insert into attributes values(24,  100, 100, 100, 100, 100, 100, 100, 100);

insert into hero values ('Вилена Донтон', 'женский', 100, 'Имперец', 'Воин', 20);
insert into hero values ('Ганнибал Травен', 'мужской', 100, 'Бретонец', 'Маг', 21);
insert into hero values ('Серый Лис', 'мужской', 100, 'Имперец', 'Вор', 22);
insert into hero values ('Агронак гро-Малог', 'мужской', 100, 'Орк', 'Воин', 23);
insert into hero values ('Анголим', 'мужской', 100, 'Лесной эльф', 'Ассасин', 24);