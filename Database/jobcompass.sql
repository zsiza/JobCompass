DROP TABLE IF EXISTS Users, Profile, Service, Purchase, Message, Category, Review;

CREATE SEQUENCE profile_id_seq START 0;
CREATE SEQUENCE users_id_seq START 0;
CREATE SEQUENCE category_id_seq START 0;
CREATE SEQUENCE service_id_seq START 0;
CREATE SEQUENCE purchases_id_seq START 0;
CREATE SEQUENCE message_id_seq START 0;
CREATE SEQUENCE review_id_seq START 0;

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
    id INT PRIMARY KEY DEFAULT nextval('users_id_seq'),
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    profile_ID INT,
    is_admin BOOLEAN NOT NULL,
    seller_ID INT,
    balance DECIMAL(10, 2),
	FOREIGN KEY (profile_ID) REFERENCES Profile(id) ON DELETE CASCADE
);

CREATE TABLE Service (
    id INT PRIMARY KEY DEFAULT nextval('service_id_seq'),
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    delivery_time INT NOT NULL,
    category_ID INT NOT NULL,
	seller_ID INT NOT NULL,
	FOREIGN KEY (category_ID) REFERENCES Category(id) ON DELETE CASCADE, 
	FOREIGN KEY (seller_ID) REFERENCES Users(id) ON DELETE CASCADE
);

CREATE TABLE Purchases (
    id INT PRIMARY KEY DEFAULT nextval('purchases_id_seq'),
    buyer_ID INT,
    service_ID INT,
    purchase_time TIMESTAMP NOT NULL,
    status VARCHAR(50) NOT NULL,
	FOREIGN KEY (buyer_ID) REFERENCES Users(id) ON DELETE CASCADE,
	FOREIGN KEY (service_ID) REFERENCES Service(id) ON DELETE CASCADE
);

CREATE TABLE Message (
    id INT PRIMARY KEY DEFAULT nextval('message_id_seq'),
    sender_ID INT,
    receiver_ID INT,
    content TEXT NOT NULL,
    timestamp TIMESTAMP NOT NULL,
	FOREIGN KEY (sender_ID) REFERENCES Users(id) ON DELETE CASCADE,
	FOREIGN KEY (receiver_ID) REFERENCES Users(id) ON DELETE CASCADE
);

CREATE TABLE Review (
    id INT PRIMARY KEY DEFAULT nextval('review_id_seq'),
    rating INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    reviewer_ID INT,
    reviewed_ID INT,
	FOREIGN KEY (reviewer_ID) REFERENCES Users(id) ON DELETE CASCADE,
	FOREIGN KEY (reviewed_ID) REFERENCES Service(id) ON DELETE CASCADE
);
