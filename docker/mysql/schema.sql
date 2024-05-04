CREATE DATABASE IF NOT EXISTS `careerwry-member`;
CREATE USER IF NOT EXISTS 'careerwry' IDENTIFIED BY 'careerwry';
GRANT ALL PRIVILEGES ON `careerwry-member`.* TO 'careerwry';
SET PASSWORD FOR 'careerwry' = '1q2w3e4r';
