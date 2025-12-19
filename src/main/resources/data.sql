INSERT INTO category_entity (category_name) VALUES ('Bakery');
INSERT INTO category_entity (category_name) VALUES ('Milk & Dairy');
INSERT INTO category_entity (category_name) VALUES ('Vegatables & Fruits');
INSERT INTO category_entity (category_name) VALUES ('Cupboard');
INSERT INTO category_entity (category_name) VALUES ('Chilled products');
INSERT INTO category_entity (category_name) VALUES ('Alcohol');
INSERT INTO category_entity (category_name) VALUES ('Freezer');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Bread', '1');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Rolls & Bagels', '1');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Ciabatta & Baguettes', '1');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Cakes & Treats', '1');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Gluten Free', '1');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Milk', '2');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Cheese', '2');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Butter & Spreads', '2');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Cream', '2');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Eggs', '2');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Plant based', '2');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Yoghurts', '2');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Vegetables', '3');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Fruits', '3');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Pasta', '4');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Rice', '4');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Sugar & Baking', '4');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Ingredients', '4');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Tins & Cans', '4');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Tea, Coffe & Hot Drinks', '4');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Meat & Poultry', '5');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Fish & Seafood', '5');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Pizza', '5');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Ready meals', '5');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Vegetarian', '5');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Vegan', '5');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Soups', '5');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Beer', '6');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Wine', '6');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Spirits', '6');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Cider', '6');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Liquers', '6');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Meat & Poultry', '7');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Fish & Seafood', '7');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Pizza', '7');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Vegetarian', '7');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Vegan', '7');
INSERT INTO category_entity (category_name, parent_category_id) VALUES ('Ice Creams', '7');
INSERT INTO product_entity (
    id,
    name,
    image,
    category_id,
    number_of_items_in_pack,
    measure_type,
    measure_count,
    unit_of_measure,
    shelf_life_count,
    shelf_life_unit,
    price,
    stock_at_this_price,
    rating,
    dietary_icons,
                            stock_count
) VALUES (
    1,
    'Rye Bread',
    'https://tse1.mm.bing.net/th/id/OIP.Q1haw2yz-ByTjxq8yNUaDAHaGd?pid=Api',
  1,
          1,
  'WEIGHT',
500,
     'g',
3,
'days',
4.40,
4,
          4,
'{"suitable-for-freezing", "vegan"}',
          4
         );
INSERT INTO product_entity (
    id,
    name,
    image,
    category_id,
    number_of_items_in_pack,
    measure_type,
    measure_count,
    unit_of_measure,
    shelf_life_count,
    shelf_life_unit,
    price,
    stock_at_this_price,
    rating,
    dietary_icons,
    stock_count
) VALUES (
             2,
             'Paris Baguette',
             'https://tse4.mm.bing.net/th/id/OIP.KY9XzFZZJuZ4mNh5punCYwHaE7?r=0&pid=Api',
             1,
          1,
             'WEIGHT',
             200,
             'g',
             3,
             'days',
             2.50,
             2,
             4.5,
             '{"suitable-for-freezing"}',
             2
         );

INSERT INTO product_entity (
    id,
    name,
    image,
    category_id,
    number_of_items_in_pack,
    measure_type,
    measure_count,
    unit_of_measure,
    shelf_life_count,
    shelf_life_unit,
    price,
    stock_at_this_price,
    rating,
    dietary_icons,
    stock_count
) VALUES (
             3,
             'White Bread',
             'https://tse2.mm.bing.net/th/id/OIP.wydu4o66PZtc6xgdyVLK3AHaLH?r=0&pid=Api',
             1,
          1,
             'WEIGHT',
             600,
             'g',
             3,
             'days',
             3.50,
             5,
             4.5,
             '{"suitable-for-freezing"}',
             5
         );
INSERT INTO product_entity (
    id,
    name,
    image,
    category_id,
    number_of_items_in_pack,
    measure_type,
    measure_count,
    unit_of_measure,
    shelf_life_count,
    shelf_life_unit,
    price,
    stock_at_this_price,
    rating,
    dietary_icons,
    stock_count
) VALUES (
             4,
             'Ocado British Whole milk 4 pints',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/41d6aa8e-01fc-4ace-a725-36a2ee7f1414/1280x1280.webp',
             2,
          1,
             'VOLUME',
             2.272,
             'l',
             3,
             'days',
             2.20,
             5,
             4,
             '{}',
             5
         );
INSERT INTO product_entity (
    id,
    name,
    image,
    category_id,
    number_of_items_in_pack,
    measure_type,
    measure_count,
    unit_of_measure,
    shelf_life_count,
    shelf_life_unit,
    price,
    stock_at_this_price,
    rating,
    dietary_icons,
    stock_count
) VALUES (
             5,
             'Ocado Whole Wheat Penne',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/a1bc4333-eb9e-4434-b9b1-335c08635db1/1280x1280.webp',
             4,
          1,
             'WEIGHT',
             500,
             'g',
             12,
             'months',
             1.50,
             5,
             3.5,
             '{"vegetarian"}',
             5
         );
INSERT INTO product_entity (
    id,
    name,
    image,
    category_id,
    number_of_items_in_pack,
    measure_type,
    measure_count,
    unit_of_measure,
    shelf_life_count,
    shelf_life_unit,
    price,
    stock_at_this_price,
    rating,
    dietary_icons,
    stock_count
) VALUES (
             6,
             'Ocado Large Free Range Eggs',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/2ef8ef84-c078-4f3e-85e1-f7b86682fb10/1280x1280.webp',
             5,
          1,
             'ITEM',
             12,
             'item',
             2,
             'week',
             1.50,
             10,
             5,
             '{"vegetarian"}',
             5
         );
INSERT INTO product_entity (
    id,
    name,
    image,
    category_id,
    number_of_items_in_pack,
    measure_type,
    measure_count,
    unit_of_measure,
    shelf_life_count,
    shelf_life_unit,
    price,
    stock_at_this_price,
    rating,
    stock_count
) VALUES (
             7,
             'San Miguel Lager Beer Cans',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/9265e3d9-0039-4e4e-a9fe-8b6519f0910c/1280x1280.webp',
             6,
          4,
             'VOLUME',
             440,
             'ml',
             6,
             'month',
             5.75,
             10,
             5,
             5
         );
INSERT INTO product_entity (
    id,
    name,
    image,
    category_id,
    number_of_items_in_pack,
    measure_type,
    measure_count,
    unit_of_measure,
    shelf_life_count,
    shelf_life_unit,
    price,
    stock_at_this_price,
    rating,
    stock_count
) VALUES (
             8,
             'Leffe Blonde Beer',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/04082283-8d39-4048-b00c-14be2eda37c1/1280x1280.webp',
             6,
          4,
             'VOLUME',
             330,
             'ml',
             4,
             'week',
             6.50,
             10,
             5,
             5
         );

