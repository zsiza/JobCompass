DROP TABLE IF EXISTS User, Profile, Service, Message, Category, Review;

CREATE TABLE User (
    id SERIAL PRIMARY KEY,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    profile_ID INT,
    is_admin BOOLEAN NOT NULL,
    seller_ID INT,
    buyer_ID INT,
    balance DECIMAL(10, 2)
);

CREATE TABLE Profile (
    id SERIAL PRIMARY KEY,
    skills TEXT,
    certifications TEXT,
    experience TEXT,
    education TEXT,
    contact TEXT,
    socials TEXT,
    portfolio_links TEXT,
    profile_picture TEXT
);

CREATE TABLE Service (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    delivery_time INT NOT NULL,
    category_ID INT
);

CREATE TABLE Message (
    id SERIAL PRIMARY KEY,
    sender_ID INT REFERENCES User(id),
    receiver_ID INT REFERENCES User(id),
    content TEXT NOT NULL,
    timestamp TIMESTAMP NOT NULL
);

CREATE TABLE Category (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT NOT NULL
);

CREATE TABLE Review (
    id SERIAL PRIMARY KEY,
    rating INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    reviewer_ID INT REFERENCES Profile(id),
    reviewed_ID INT REFERENCES Profile(id)
);

ALTER TABLE User ADD FOREIGN KEY (profile_ID) REFERENCES Profile(id);
ALTER TABLE User ADD FOREIGN KEY (seller_ID) REFERENCES User(id);
ALTER TABLE User ADD FOREIGN KEY (buyer_ID) REFERENCES User(id);
ALTER TABLE Service ADD FOREIGN KEY (category_ID) REFERENCES Category(id);
