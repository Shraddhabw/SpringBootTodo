-- This file runs automatically when MySQL container starts for the first time

USE todo_management;

-- Insert roles
INSERT IGNORE INTO roles (name) VALUES ('ROLE_USER');
INSERT IGNORE INTO roles (name) VALUES ('ROLE_ADMIN');
