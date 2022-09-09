create table if not exists reward
(
    id bigint primary key,
    description text not null,
    attributes_id bigint not null references attributes (id)
);
