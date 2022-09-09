create table if not exists guild_member
(
    hero_name varchar(255) references hero (name),
    guild_name varchar(255) references guild (name),
    rang varchar(255) not null,
    primary key (hero_name, guild_name)
);
