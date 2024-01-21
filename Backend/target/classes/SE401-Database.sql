
CREATE DATABASE IF NOT EXISTS `se401_finance_manager`;
USE `se401_finance_manager`;

CREATE TABLE IF NOT EXISTS `categories` (
    `category_id` int NOT NULL,
    `category_name` varchar(256) NOT NULL,
    `category_description` varchar(256) NOT NULL,
    PRIMARY KEY (`category_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `categories` (`category_id`, `category_name`, `category_description`) VALUES
    (1, 'House', 'This category contains all the money spent on house. '),
    (2, 'Car', 'This category contains all the money spent on car. '),
    (3, 'Food', 'This category contains all the money spent on food and drinks. '),
    (4, 'Technology', 'This category contains all the money spent on technology. '),
    (5, 'Daily expenses', 'This category contains all the money spent on daily expenses. '),
    (6, 'Sport equipment', 'This category contains all the money spent on sport equipment. '),
    (7, 'Make-up', 'This category contains all the money spent on make-up.'),
    (8, 'Clothes', 'This category contains all the money spent on clothes.'),
    (9, 'Shoes', 'This category contains all the money spent on shoes.'),
    (10, 'Furniture', 'This category contains all the money spent on furniture.'),
    (11, 'Construction materials', 'This category contains all the money spent on construction materials.'),
    (12, 'Medicines', 'This category contains all the money spent on medicines.'),
    (13, 'Healthy goods', 'This category contains all the money spent on healthy goods.'),
    (14, 'Accessories', 'This category contains all the money spent on accesories.'),
    (15, 'Games', 'This category contains all the money spent on any type of games.');

CREATE TABLE IF NOT EXISTS `category_sequence` (
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `category_sequence` (`next_val`) VALUES
    (16);

CREATE TABLE IF NOT EXISTS `users` (
    `user_id` int NOT NULL,
    `first_name` varchar(256) NOT NULL,
    `last_name` varchar(256) NOT NULL,
    `username` varchar(256) NOT NULL,
    `password` varchar(256) NOT NULL,
    PRIMARY KEY (`user_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `users` (`user_id`, `first_name`, `last_name`, `username`, `password`) VALUES
    (1, 'Nikola', 'Becic', 'nikola.becic', '$2a$08$BA83gAatWfjsWSFjLluraunxUfql/KKvcfGz5jJDvvaDoDA0WQsUW');

CREATE TABLE IF NOT EXISTS `expenses` (
    `expense_id` int NOT NULL,
    `user_id` int NOT NULL,
    `category_id` int NOT NULL,
    `date` datetime NOT NULL,
    `shop` varchar(256) NOT NULL,
    `cost` decimal(10,0) NOT NULL,
    PRIMARY KEY (`expense_id`),
    KEY `user_id` (`user_id`),
    KEY `category_id` (`category_id`),
    CONSTRAINT `expenses_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
    CONSTRAINT `expenses_ibfk_2` FOREIGN KEY (`category_id`) REFERENCES `categories` (`category_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `expenses` (`expense_id`, `user_id`, `category_id`, `date`, `shop`, `cost`) VALUES
     (1, 1, 6, '2023-07-07 00:00:00', 'Sport vision', 5000),
     (2, 1, 3, '2023-09-07 00:00:00', 'Idea', 1200),
     (3, 1, 1, '2023-11-15 00:00:00', 'Metro', 12000),
     (4, 1, 2, '2023-11-26 00:00:00', 'Metro', 3550),
     (5, 1, 3, '2023-12-30 00:00:00', 'Mega maxi', 21000),
     (6, 1, 15, '2024-01-03 00:00:00', 'GameS', 8000),
     (7, 1, 15, '2023-12-13 00:00:00', 'GameS', 2000),
     (8, 1, 2, '2023-01-05 00:00:00', 'Nis petrol', 12000),
     (9, 1, 13, '2024-01-19 00:00:00', 'DM', 4500),
     (10, 1, 8, '2024-01-12 00:00:00', 'Legend', 9000),
     (11, 1, 4, '2023-06-23 00:00:00', 'Gigatron', 120000),
     (12, 1, 2, '2024-01-20 00:00:00', 'Nis petrol', 6500);

CREATE TABLE IF NOT EXISTS `expense_sequence` (
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `expense_sequence` (`next_val`) VALUES
    (13);

CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
    (2);

CREATE TABLE IF NOT EXISTS `incomes` (
                                         `income_id` int NOT NULL,
                                         `user_id` int NOT NULL,
                                         `date` datetime NOT NULL,
                                         `source` varchar(256) NOT NULL,
    `earning` decimal(10,0) NOT NULL,
    PRIMARY KEY (`income_id`),
    KEY `user_id` (`user_id`),
    CONSTRAINT `incomes_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `incomes` (`income_id`, `user_id`, `date`, `source`, `earning`) VALUES
                                                                                (1, 1, '2023-01-05 00:00:00', 'Job', 110000),
                                                                                (2, 1, '2023-02-05 00:00:00', 'Job', 110000),
                                                                                (3, 1, '2023-03-05 00:00:00', 'Job', 110000),
                                                                                (4, 1, '2023-04-05 00:00:00', 'Job', 110000),
                                                                                (5, 1, '2023-05-05 00:00:00', 'Job', 110000),
                                                                                (6, 1, '2023-06-05 00:00:00', 'Job', 110000),
                                                                                (7, 1, '2023-07-05 00:00:00', 'Job', 110000),
                                                                                (8, 1, '2023-08-05 00:00:00', 'Job', 110000),
                                                                                (9, 1, '2023-09-05 00:00:00', 'Job', 110000),
                                                                                (10, 1, '2023-10-05 00:00:00', 'Job', 110000),
                                                                                (11, 1, '2023-11-05 00:00:00', 'Job', 110000),
                                                                                (12, 1, '2023-12-05 00:00:00', 'Job', 110000),
                                                                                (13, 1, '2024-01-05 00:00:00', 'Job', 110000);

CREATE TABLE IF NOT EXISTS `income_sequence` (
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `income_sequence` (`next_val`) VALUES
    (14);

CREATE TABLE IF NOT EXISTS `questions` (
                                           `question_id` int NOT NULL,
                                           `question` varchar(256) NOT NULL,
    `answer` varchar(256) DEFAULT NULL,
    PRIMARY KEY (`question_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `questions` (`question_id`, `question`, `answer`) VALUES
                                                                  (1, 'How to add new expense?', 'First, log in to the system, then click the "Add expense" button and fill out the form that includes: date, shop, cost, category and then click the "Save" button.'),
                                                                  (2, 'How to add new income', 'First, log in to the system, then click on button "Incomes" and then click the "Add income" button, then fill out the form that includes: date, source, income and then click the "Save" button.'),
                                                                  (3, 'How to check statistics?', 'First, log in to the system, then in the menu click the stats icom and choose which stats u need.');

CREATE TABLE IF NOT EXISTS `questions_sequence` (
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `questions_sequence` (`next_val`) VALUES
    (1);