DROP TABLE one;
DROP TABLE two;

CREATE TABLE one (
        number integer,
        description varchar(255)
);

CREATE TABLE two (
        number integer,
        description varchar(255)
);

INSERT INTO one (number, description) VALUES (100, 'ONE - 100');
INSERT INTO one (number, description) VALUES (101, 'ONE - 101');
INSERT INTO one (number, description) VALUES (102, 'ONE - 102');
INSERT INTO one (number, description) VALUES (103, 'ONE - 103');
INSERT INTO one (number, description) VALUES (104, 'ONE - 104');
INSERT INTO one (number, description) VALUES (105, 'ONE - 105');

INSERT INTO two (number, description) VALUES (200, 'TWO - 200');
INSERT INTO two (number, description) VALUES (201, 'TWO - 201');
INSERT INTO two (number, description) VALUES (202, 'TWO - 202');
INSERT INTO two (number, description) VALUES (203, 'TWO - 203');
INSERT INTO two (number, description) VALUES (204, 'TWO - 204');
INSERT INTO two (number, description) VALUES (205, 'TWO - 205');

INSERT INTO two (number, description) VALUES (990, 'TWO-BOTH - 990');
INSERT INTO two (number, description) VALUES (991, 'TWO-BOTH - 991');
INSERT INTO two (number, description) VALUES (992, 'TWO-BOTH - 992');
INSERT INTO two (number, description) VALUES (993, 'TWO-BOTH - 993');
INSERT INTO two (number, description) VALUES (994, 'TWO-BOTH - 994');
INSERT INTO two (number, description) VALUES (995, 'TWO-BOTH - 995');

INSERT INTO one (number, description) VALUES (990, 'ONE-BOTH - 990');
INSERT INTO one (number, description) VALUES (991, 'ONE-BOTH - 991');
INSERT INTO one (number, description) VALUES (992, 'ONE-BOTH - 992');
INSERT INTO one (number, description) VALUES (993, 'ONE-BOTH - 993');
INSERT INTO one (number, description) VALUES (994, 'ONE-BOTH - 994');
INSERT INTO one (number, description) VALUES (995, 'ONE-BOTH - 995');

--LEFT JOIN
SELECT *
FROM one
LEFT JOIN two ON one.number = two.number

--RIGHT JOIN
SELECT *
FROM one
RIGHT JOIN two ON one.number = two.number

--INNER JOIN  (DEFAULT IF JUST USE JOIN)
SELECT *
FROM one
INNER JOIN two ON one.number = two.number

--LEFT OUTER JOIN
SELECT *
FROM one
LEFT JOIN two ON one.number = two.number
WHERE two.number IS NULL

--RIGHT OUTER JOIN
SELECT *
FROM one
RIGHT JOIN two ON one.number = two.number
WHERE one.number IS NULL

--FULL OUTER JOIN
SELECT *
FROM one
FULL OUTER JOIN two ON one.number = two.number

--OUTER JOIN
SELECT *
FROM one
FULL OUTER JOIN two ON one.number = two.number
WHERE one.number IS NULL OR two.number IS NULL

--UNION
SELECT number, description FROM one
UNION
SELECT number, description FROM two
ORDER BY number

