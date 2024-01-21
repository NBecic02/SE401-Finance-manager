CREATE DATABASE IF NOT EXISTS `se401_finance_manager`;
USE `se401_finance_manager`;


CREATE TABLE categories (
  category_id int(11) NOT NULL PRIMARY KEY,
  category_name varchar(256) NOT NULL,
  category_description varchar(256) NOT NULL
);

CREATE TABLE users (
  user_id int(11) NOT NULL PRIMARY KEY,
  first_name varchar(256) NOT NULL,
  last_name varchar(256) NOT NULL,
  username varchar(256) NOT NULL,
  password VARCHAR(256) NOT NULL
);


CREATE TABLE expenses (
  expense_id int(11) NOT NULL PRIMARY KEY,
  user_id int(11) NOT NULL,
  category_id int(11) NOT NULL,
  date datetime NOT NULL,
  shop varchar(256) NOT NULL,
  cost decimal NOT NULL
);

ALTER TABLE expenses
ADD FOREIGN KEY (user_id) REFERENCES users(user_id);
ALTER TABLE expenses
ADD FOREIGN KEY (category_id) REFERENCES categories(category_id);

CREATE TABLE incomes (
  income_id int(11) NOT NULL PRIMARY KEY,
  user_id int(11) NOT NULL,
  date datetime NOT NULL,
  source varchar(256) NOT NULL,
  earning decimal NOT NULL
);

ALTER TABLE incomes
ADD FOREIGN KEY (user_id) REFERENCES users(user_id);

CREATE TABLE questions (
  question_id int(11) NOT NULL PRIMARY KEY,
  question varchar(256) NOT NULL,
  answer varchar(256)
);

CREATE TABLE hibernate_sequence ( next_val BIGINT );
INSERT INTO hibernate_sequence VALUES (1);

CREATE TABLE income_sequence ( next_val BIGINT );
INSERT INTO income_sequence VALUES (1);

CREATE TABLE expense_sequence ( next_val BIGINT );
INSERT INTO expense_sequence VALUES (1);

CREATE TABLE questions_sequence ( next_val BIGINT );
INSERT INTO questions_sequence VALUES (1);

CREATE TABLE category_sequence ( next_val BIGINT );
INSERT INTO category_sequence VALUES (1);