create table product (
    id serial primary key,
    name varchar(100) not null,
    description text,
    price numeric(10, 2) not null,
    created_at timestamp default current_timestamp
);

insert into product (name, description, price) values
('Product 1', 'Description for product 1', 10.00),
('Product 2', 'Description for product 2', 20.00),
('Product 3', 'Description for product 3', 30.00),
('Product 4', 'Description for product 4', 40.00),
('Product 5', 'Description for product 5', 50.00);