create table if not exists conditions
(
    id bigint primary key,
    min_level int not null check ( conditions.min_level > 0 ),
    attributes_id bigint not null references attributes (id)
);
