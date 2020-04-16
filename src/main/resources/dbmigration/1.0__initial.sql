-- apply changes
create table author (
  id                            integer auto_increment not null,
  name                          varchar(255),
  constraint pk_author primary key (id)
);

create table post (
  id                            integer auto_increment not null,
  author_id                     integer,
  title                         varchar(255),
  constraint pk_post primary key (id)
);

create index ix_post_author_id on post (author_id);
alter table post add constraint fk_post_author_id foreign key (author_id) references author (id) on delete restrict on update restrict;

