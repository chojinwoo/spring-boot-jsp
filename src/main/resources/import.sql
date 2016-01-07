insert into users(id,name, age, password) values ('aa','woniper1', 26, 'aa');
insert into users(id,name, age, password) values ('bb','woniper2', 27, 'bb');
insert into users_auth(seq, id, authority) values(1, 'aa', 'ROLE_ADMIN');
insert into users_auth(seq, id, authority) values(2, 'aa', 'ROLE_USER');
insert into users_auth(seq, id, authority) values(3, 'bb', 'ROLE_USER');
commit;