DROP TABLE IF EXISTS Users, Profile, Service, Purchase, Message, Category, Review;

CREATE SEQUENCE profile_id_seq START 0;

CREATE TABLE Profile (
    id INT PRIMARY KEY DEFAULT nextval('profile_id_seq'),
    skills TEXT,
    certifications TEXT,
    experience TEXT,
    education TEXT,
    contact TEXT,
    socials TEXT,
    portfolio_links TEXT,
    profile_picture TEXT
);

CREATE TABLE Users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    profile_ID INT,
    is_admin BOOLEAN NOT NULL,
    seller_ID INT,
    balance DECIMAL(10, 2),
	FOREIGN KEY (profile_ID) REFERENCES Profile(id)
);


CREATE TABLE Category (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT NOT NULL
);

CREATE TABLE Service (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    delivery_time INT NOT NULL,
    category_ID INT NOT NULL,
	seller_ID INT NOT NULL,
	FOREIGN KEY (category_ID) REFERENCES Category(id), 
	FOREIGN KEY (seller_ID) REFERENCES Users(id)
);

CREATE TABLE Purchases (
    id SERIAL PRIMARY KEY,
    buyer_ID INT,
    service_ID INT REFERENCES Service(id),
    purchase_time TIMESTAMP NOT NULL,
    status VARCHAR(50) NOT NULL,
	FOREIGN KEY (buyer_ID) REFERENCES Users(id),
	FOREIGN KEY (service_ID) REFERENCES Service(id)
);

CREATE TABLE Message (
    id SERIAL PRIMARY KEY,
    sender_ID INT,
    receiver_ID INT,
    content TEXT NOT NULL,
    timestamp TIMESTAMP NOT NULL,
	FOREIGN KEY (sender_ID) REFERENCES Users(id),
	FOREIGN KEY (receiver_ID) REFERENCES Users(id)
);


CREATE TABLE Review (
    id SERIAL PRIMARY KEY,
    rating INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    reviewer_ID INT,
    reviewed_ID INT,
	FOREIGN KEY (reviewer_ID) REFERENCES Users(id),
	FOREIGN KEY (reviewed_ID) REFERENCES Service(id)
);
