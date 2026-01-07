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
  8,
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
             10,
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
             8,
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
             13,
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
             22,
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
             17,
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
             35,
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
             35,
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
             9,
             'Warburtons Plain Bagels',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/fa7a99ea-d1e7-4951-a256-b7a71d12d249/1280x1280.webp',
             9,
             1,
             'ITEM',
             5,
             'item',
             4,
             'week',
             1.90,
             10,
             4.9,
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
             10,
             'Mr Kipling Almond Slices',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/dd37b9c2-1466-4106-86ac-f8c34f56249d/1280x1280.webp',
             11,
             1,
             'ITEM',
             6,
             'item',
             12,
             'month',
             2.75,
             15,
             4.9,
             20
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
             11,
             'M&S Made Without Gluten Free Tiger Loaf',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/2ef4a1a9-3b92-4e14-af19-8291bfda6ecd/1280x1280.webp',
             12,
             1,
             'WEIGHT',
             400,
             'g',
             2,
             'week',
             3.50,
             10,
             5,
             20
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
             12,
             'Ocado British Skimmed Milk 2 Pints',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/1d03ccfe-ff1b-4329-8c8d-14d4f78ff22e/1280x1280.webp',
             13,
             1,
             'VOLUME',
             1.136,
             'l',
             1,
             'week',
             1.20,
             18,
             4.8,
             36
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
             13,
             'Castello Tickler Mature Cheddar Cheese',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/97207f9e-0eb5-4655-a8c8-e102e22f7fda/1280x1280.webp',
             14,
             1,
             'WEIGHT',
             300,
             'g',
             3,
             'month',
             4.50,
             10,
             4,
             30
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
             14,
             'Entremont Grated Emmental',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/df1a5cfc-6728-4530-9ecc-782c5af530f8/1280x1280.webp',
             14,
             1,
             'WEIGHT',
             160,
             'g',
             5,
             'weeks',
             2,
             14,
             4,
             20
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
             15,
             'Snowdonia Red Storm Vintage Red Leicester',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/4e8923b8-b954-4780-ae80-e87fd9d080aa/1280x1280.webp',
             14,
             1,
             'WEIGHT',
             200,
             'g',
             2,
             'months',
             5.50,
             15,
             5,
             20
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
             16,
             'Country Life British Salted Block Butter',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/63c1b7bd-0af6-44a7-88f3-1b627dfd14d1/1280x1280.webp',
             15,
             1,
             'WEIGHT',
             200,
             'g',
             4,
             'weeks',
             1.75,
             18,
             5,
             20
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
             17,
             'Yeo Valley Organic Spreadable Blend of Butter and Rapeseed Oil',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/4043dbc6-cbab-4e46-9750-8398a6d27c34/1280x1280.webp',
             15,
             1,
             'WEIGHT',
             400,
             'g',
             5,
             'weeks',
             3.50,
             30,
             4,
             45
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
             18,
             'Ocado British Large Double Cream',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/7068a3c2-1448-4e41-9b33-aea906b0623d/1280x1280.webp',
             16,
             1,
             'VOLUME',
             600,
             'ml',
             1,
             'week',
             2.90,
             14,
             4,
             20
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
             19,
             'Ocado British Small Double Cream',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/781eec64-cc45-4167-ab01-c582818ddfaa/1280x1280.webp',
             16,
             1,
             'VOLUME',
             300,
             'ml',
             1,
             'week',
             1.60,
             26,
             4,
             30
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
             20,
             'Boursin Garlic & Herbs Vegan Alternative to Cheese',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/29559966-435a-4a60-b5c0-4e4615edc9ee/1280x1280.webp',
             18,
             1,
             'WEIGHT',
            150,
             'g',
             1,
             'week',
             3.00,
             16,
             4.5,
             20
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
             21,
             'Elmlea Plant LargeDouble Vegan Alternative to Cream',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/0732a22e-d294-4f51-bef7-e31bc5ea29f0/1280x1280.webp',
             18,
             1,
             'VOLUME',
             250,
             'ml',
             4,
             'weeks',
             1.50,
             26,
             4,
             30
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
             22,
             'Alpro Plant Based High Protein Banana Biscuit Yoghurt Alternative',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/8509fefc-ef64-441f-ad39-0f97c1997a92/1280x1280.webp',
             18,
             1,
             'WEIGHT',
             200,
             'g',
             1,
             'week',
             1.50,
             10,
             3.5,
             40
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
             23,
             'Alpro Greek Style Plain Dairy Free Yoghurt Alternative',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/2589d261-111b-4c9a-b93f-d98930c3444f/1280x1280.webp',
             18,
             1,
             'WEIGHT',
             400,
             'g',
             2,
             'weeks',
             2.30,
             18,
             4,
             36
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
             24,
             'Alpro High Protein Soya Original Long Life Dairy Free Drink',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/adbe1963-ceab-4582-bbd0-d5ff7242a3ff/1280x1280.webp',
             18,
             1,
             'VOLUME',
             1,
             'l',
             5,
             'years',
             2.30,
             20,
             4.5,
             30
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
             25,
             'The Estate Dairy Greek Style Yoghurt',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/0a6e03f2-d128-48a1-994c-eeaa08667597/1280x1280.webp',
             19,
             1,
             'WEIGHT',
             500,
             'g',
             2,
             'weeks',
             3.20,
             18,
             4.9,
             30
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
             26,
             'Bonne Maman Raspberry Yoghurt',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/46cee78c-1f9c-4f0e-b096-7f1d5467f541/1280x1280.webp',
             19,
             1,
             'WEIGHT',
             460,
             'g',
             1,
             'week',
             2.95,
             10,
             4.7,
             26
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
             27,
             'Activia Strawberry Gut Health Fruit Yoghurt Multipack',
             'https://www.ocado.com/images-v3/eafa5127-d256-497b-9609-4869092accd6/5035a427-b2c4-41e5-aeea-74bff6e47ded/1280x1280.webp',
             19,
             1,
             'WEIGHT',
             460,
             'g',
             1,
             'week',
             2.50,
             16,
             4.9,
             26
         );


