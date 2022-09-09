create table if not exists request
(
    id bigint primary key,
    hero_name varchar(255) references hero (name),
    guild_name varchar(255) references guild (name)
);
