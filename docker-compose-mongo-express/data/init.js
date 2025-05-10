db = db.getSiblingDB('product-service');
db.createCollection('products');

db.products.insertMany([
    {
        name: 'Product 1',
        description: 'Description for Product 1',
        price: 10.99,
        category: 'Category 1',
        stock: 100,
        createdAt: new Date(),
        updatedAt: new Date()
    },
    {
        name: 'Product 2',
        description: 'Description for Product 2',
        price: 20.99,
        category: 'Category 2',
        stock: 50,
        createdAt: new Date(),
        updatedAt: new Date()
    }]
);