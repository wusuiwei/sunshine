# 重建 sunshine_user 数据库
drop database if exists sunshine_user;
create database sunshine_user;

use sunshine_user;

/**
 * 用户表
 */
drop table if exists user;
create table user
(
    id             int auto_increment primary key,
    mobile         varchar(20) not null,
    username       varchar(50) not null,
    password       varchar(64) not null,
    salt           varchar(20) not null,
    status         tinyint,
    create_at      mediumtext,
    update_at      mediumtext,
    create_user_id int,
    update_user_id int,
    constraint user_mobile_uindex
        unique (mobile)
);

/**
 * 角色表
 */
drop table if exists role;
create table role
(
    id             int auto_increment primary key,
    role_name      varchar(50) not null,
    status         tinyint,
    create_at      mediumtext,
    update_at      mediumtext,
    create_user_id int,
    update_user_id int
);
/*
 * 用户组
 */
drop table if exists organization;
create table organization
(
    id             int auto_increment primary key,
    role_name      varchar(50) not null,
    status         tinyint,
    create_at      mediumtext,
    update_at      mediumtext,
    create_user_id int,
    update_user_id int
);

/*
 * 权限表
 */
drop table if exists permission;
create table permission
(
    id             int auto_increment primary key,
    role_name      varchar(50) not null,
    status         tinyint,
    create_at      mediumtext,
    update_at      mediumtext,
    create_user_id int,
    update_user_id int
);