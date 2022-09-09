create table if not exists attributes
(
    id bigint primary key,
    power int not null,
    intellect int not null,
    willpower int not null,
    dexterity int not null,
    speed int not null,
    endurance int not null,
    charm int not null,
    luck int not null
);
