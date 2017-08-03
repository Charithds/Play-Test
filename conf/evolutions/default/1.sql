# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table periodic_elements (
  element                       varchar(255),
  atomic_number                 tinyint,
  symbol                        varchar(255),
  metal_group                   varchar(255)
);


# --- !Downs

drop table if exists periodic_elements;

