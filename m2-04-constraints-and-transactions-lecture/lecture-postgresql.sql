-- INSERT

-- 1. Add Klingon as a spoken language in the USA
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage) VALUES ('USA', 'Klingon', false, .025);
-- 2. Add Klingon as a spoken language in Great Britain
INSERT INTO countrylanguage VALUES ('GBR', 'Klingon', false, 5.5);


-- UPDATE

-- 1. Update the capital of the USA to Columbus, OH
UPDATE country
SET capital = 3807
WHERE code = 'USA';

-- 2. Update the capital of the USA to Washington DC and the head of state
UPDATE country
SET capital = (select id from city where name like 'Washington'), 
    headofstate = 'John Fulton'
WHERE code = 'USA';


-- DELETE

-- 1. Delete English as a spoken language in the USA
DELETE FROM countrylanguage WHERE countrycode = 'USA' AND language = 'English';

-- 2. Delete all occurrences of the Klingon language 
DELETE FROM countrylanguage WHERE language = 'Klingon'


-- REFERENTIAL INTEGRITY

-- 1. Try just adding Elvish to the country language table.
INSERT INTO countrylanguage (language) VALUES ('Elvish');

-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage) VALUES ('ZZZ', 'Elvish', true, 100);

-- 3. Try deleting the country USA. What happens?
DELETE FROM country WHERE code = 'USA';


-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage) VALUES ('USA', 'English', true, 100);

-- 2. Try again. What happens?
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage) VALUES ('USA', 'English', true, 100);
-- We are not able to add the country language a second time because the primary key is based on the country code and the language. 
-- The combination of these two values must be unique.

-- 3. Let's relocate the USA to the continent - 'Outer Space'
UPDATE country SET continent = 'Outer Space' WHERE code = 'USA';
-- We cannot do this because there is a check constraint on the continent.


-- How to view all of the constraints
SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS

-- This query can be used to view the rules for a check constraint
SELECT tc.constraint_catalog, tc.constraint_schema, tc.table_name, cc.constraint_name, cc.check_clause, cc.*
FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS tc
JOIN INFORMATION_SCHEMA.CHECK_CONSTRAINTS cc
ON tc.constraint_name = cc.constraint_name
AND tc.constraint_catalog = cc.constraint_catalog
AND tc.constraint_schema = cc.constraint_schema
AND tc.constraint_schema = 'public';

-- TRANSACTIONS

-- 1. Try deleting all of the rows from the country language table and roll it back.
START TRANSACTION;

DELETE FROM countrylanguage;

ROLLBACK;--COMMMT;

-- 2. Try updating all of the cities to be in the USA and roll it back
START TRANSACTION;

UPDATE city SET countrycode = 'USA';

ROLLBACK;--COMMMT;

-- 3. Demonstrate two different SQL connections trying to access the same table where one happens to be inside of a transaction but hasn't committed yet.
