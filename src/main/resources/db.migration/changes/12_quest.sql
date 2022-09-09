create table if not exists quest
(
    name varchar(255) primary key,
    guild_name varchar(255) references guild (name),
    description text not null,
    conditions_id int  not null references conditions (id),
    reward_id int  not null references reward (id),
    hero_name varchar(255) references hero (name),
    status varchar(255) not null
);
