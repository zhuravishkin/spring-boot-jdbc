drop table if exists big_data;

create table big_data
(
    name      varchar   not null,
    age       integer   not null,
    uri       varchar  not null,
    date_time timestamp not null
);