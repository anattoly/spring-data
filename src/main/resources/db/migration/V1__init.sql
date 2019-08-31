create sequence author_seq
    start with 1
    increment by 50;

create sequence book_seq
    start with 1
    increment by 50;

create table author
(
    id         bigint not null,
    first_name varchar(100),
    last_name  varchar(100),
    primary key (id)
);

create table book
(
    id          bigint not null,
    description varchar(255),
    genre       varchar(20),
    rate        double,
    title       varchar(100),
    author_id   bigint not null,
    primary key (id)
);

alter table book
    add constraint FKklnrv3weler2ftkweewlky958 foreign key (author_id) references author;