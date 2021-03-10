

drop table users;
create table users(
	user_id serial primary key,
	user_name varchar(20) not null unique,
	pass_word varchar(20) not null,	
	details_id int references user_details(details_id) 
);

drop table user_details;
create table user_details(
	details_id serial primary key,
	first_name varchar(20),
	last_name varchar(20),
	nick_name varchar(20),
	user_email varchar(20)		
);

drop table contents;
create table contents(
input_id serial primary key,
input_content text,
category_id int references category(category_id), 
answer_id int references answer(answer_id)
);

drop table category;
create table category(
category_id serial primary key,
category_name varchar(20) unique
);

drop table answer;
create table answer(
answer_id serial primary key,
answer text,
category_id int references category(category_id)
);

--cart_id int references cart (cart_id),
--	product_id int references item (product_id) ,
--	quantity int,
--	primary key (cart_id, product_id)

drop table user_contents;
create table user_contents(
user_id int references users(user_id) on delete cascade, 
input_id int references contents(input_id) on delete cascade
);
insert into users (user_name, pass_word) values ('azra','123456');
insert into users (user_name, pass_word) values ('tugba','1234');
insert into users (user_name, pass_word) values ('amy','12345');

select * from users;

insert into user_details values (default,'azra','ozden','purple','azra@gmail.com');
insert into user_details values (default,'tugba','ozden','tooba','tugba@gmail.com');
insert into user_details values (default,'amy','ozden','pink','azra@gmail.com');

insert into category values (default, 'greeting');
insert into category values (default, 'welcome');
insert into category values (default, 'country');
insert into category values (default, 'education');
insert into category values (default, 'job');

insert into answer values (default,'My name is Tugba.');
insert into answer values (default,'I am good, thanks.');
insert into answer values (default,'My hometown is Istanbul.');

select * from answer;

insert into user_details values(4,'john','russ','john','john@gmail.com');

insert into answer values(default,'Nice to meet you!',1);
insert into answer values(default,'My name is Tugba.',1);

insert into answer values(default,'Welcome!',2);
insert into answer values(default,'Let us get practice!',2);
insert into answer values(default,'I have been living for almost 4 years in the USA.',3);
insert into answer values(default,'I left from my country since 2016.',3);
insert into answer values(default,'I like to live America!.',3);

insert into answer values(default,'Yes.I graduated College in the USA.',4);
insert into answer values(default,'I do not study right now, but I am interning.',4);

insert into answer values(default,'Kind of intership?',5);
insert into answer values(default,'Not yet, just I am preparing for it.',5);

insert into answer values(default,'I am great today.',6);
insert into answer values(default,'Great, thanks!',6);
insert into answer values(default,'I like to read books.',7);
insert into answer values(default,'I like watching movies.',7);
insert into answer values(default,'I am maried.',8);
insert into answer values(default,'I live with my husband and our children together.',8);
insert into answer values(default,'I have children.',9);
insert into answer values(default,'I like to play my children.',9);
insert into answer values(default,'I like to watch old movies.',10);
insert into answer values(default,'I like comedy movies.',10);


insert into contents values(default,'hello',1,1);
insert into contents values(default,'what is your name?',1,1);
insert into contents values(default,'your name?',1,1);
insert into contents values(default,'tel me about yourself?',1,1);

insert into contents values(default,'how long have you been?',2,2);
insert into contents values(default,'how long have you been in the USA?',2,2);
insert into contents values(default,'when did you come in the USA?',2,2);
insert into contents values(default,'when did leave from your country?',2,2);

insert into contents values(default,'where do you study?',3,3);
insert into contents values(default,'do you study right now?',3,3);
insert into contents values(default,'did you graduate from College?',3,3);
--insert into contents values(default,'',3,3);

insert into contents values(default,'',4,4);
insert into contents values(default,'',4,4);
insert into contents values(default,'',4,4);
insert into contents values(default,'',4,4);

insert into contents values(default,'do you work?',5,5);
insert into contents values(default,'work?',5,5);
insert into contents values(default,'are you working',5,5);
insert into contents values(default,'what kind of job did you work?',5,5);

insert into contents values(default,'how are you today?',6,6);
insert into contents values(default,'how is your going?',6,6);
insert into contents values(default,'how are you?',6,6);
--insert into contents values(default,'',6,6);

insert into contents values(default,'do you like to read?',7,7);
insert into contents values(default,'do you like to watch movies?',7,7);
--insert into contents values(default,'',7,7);
--insert into contents values(default,'',7,7);

insert into contents values(default,'are you married?',8,8);
insert into contents values(default,'are you a single?',8,8);
--insert into contents values(default,'',8,8);
--insert into contents values(default,'',8,8);

insert into contents values(default,'do you have any children?',9,9);
insert into contents values(default,'do you like to play your children?',9,9);
--insert into contents values(default,'',9,9);
--insert into contents values(default,'',9,9);

insert into contents values(default,'what kind of movies do you like?',10,10);
insert into contents values(default,'do you like old movies?',10,10);
--insert into contents values(default,'',10,10);
--insert into contents values(default,'',10,10);

insert into user_contents  values(1,2);
insert into user_contents  values(1,1);
insert into user_contents  values(1,3);
insert into user_contents  values(2,3);
insert into user_contents  values(2,3);
insert into user_contents  values(2,3);
insert into user_contents  values(3,2);
insert into user_contents  values(3,1);
insert into user_contents  values(3,3);

select answer from answer inner join contents on (answer.category_id=contents.input_id);
select * from contents where input_contents like '%hello%';
select * from contents where input_content  like 'hello';



