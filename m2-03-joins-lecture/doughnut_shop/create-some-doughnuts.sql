TRUNCATE doughnut, filling, topping CASCADE;

INSERT INTO filling (id, name) VALUES (1, 'Pastry Creme');
INSERT INTO filling (id, name) VALUES (2, 'Vanilla Custard');
INSERT INTO filling (id, name) VALUES (3, 'Chocolate Creme');
INSERT INTO filling (id, name) VALUES (4, 'Peanut Butter Creme');
INSERT INTO filling (id, name) VALUES (5, 'Snozzberry Jelly');
INSERT INTO filling (id, name) VALUES (6, 'Reduced Corn Solids');

INSERT INTO topping (id, name) VALUES (1, 'Chocolate Ganache');
INSERT INTO topping (id, name) VALUES (2, 'Chocolate Frosting');
INSERT INTO topping (id, name) VALUES (3, 'Caramel Frosting');
INSERT INTO topping (id, name) VALUES (4, 'Bacon Bits');
INSERT INTO topping (id, name) VALUES (5, 'Maple Frosting');
INSERT INTO topping (id, name) VALUES (6, 'Pecans');
INSERT INTO topping (id, name) VALUES (7, 'Hyrdrogenated Peanut Oil');
INSERT INTO topping (id, name) VALUES (8, 'Sprinkles');
INSERT INTO topping (id, name) VALUES (9, 'Pink Vanilla Frosting');

INSERT INTO doughnut (id, name, filling_id) VALUES (1, 'Homer Simpson', null);
INSERT INTO doughnut (id, name, filling_id) VALUES (2, 'Chocolate Bismark', 1);
INSERT INTO doughnut (id, name, filling_id) VALUES (3, 'Plain and Uninsipred', null);
INSERT INTO doughnut (id, name, filling_id) VALUES (4, 'Buckeye', 4);
INSERT INTO doughnut (id, name, filling_id) VALUES (5, 'Wonka''s Delight', 5);
INSERT INTO doughnut (id, name, filling_id) VALUES (6, 'The Bunyan', 1);

INSERT INTO doughnut_topping VALUES (1, 9);
INSERT INTO doughnut_topping VALUES (1, 8);
INSERT INTO doughnut_topping VALUES (2, 2);
INSERT INTO doughnut_topping VALUES (4, 1);
INSERT INTO doughnut_topping VALUES (5, 9);
INSERT INTO doughnut_topping VALUES (5, 8);
INSERT INTO doughnut_topping VALUES (6, 4);
INSERT INTO doughnut_topping VALUES (6, 5);
INSERT INTO doughnut_topping VALUES (6, 6);

-- WITH create_filling as (
--   INSERT INTO filling (name)
--   VALUES ('Pastry Cream')
--   RETURNING id
-- )

-- INSERT INTO doughnut (name, filling_id)
-- SELECT 'Chocolate Bismark', cf.id
--   FROM create_filling cf;

-- INSERT INTO doughnut (name)
-- VALUES ('Plain');

-- INSERT INTO doughnut (name)
-- VALUES ('')

-- GET ALL OF THE DOUGHNUTS, AND THE ASSOCIATED FILLING IF IT HAS ONE
-- SELECT * 
--   FROM doughnut d
--   LEFT JOIN filling f
--     ON d.filling_id = f.id
