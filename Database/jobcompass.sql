DROP TABLE if exists "Review", "Message", "Purchase", "Service", "Category", "User", "Profile";

CREATE SEQUENCE profile_id_seq START 1;
CREATE SEQUENCE users_id_seq START 1;
CREATE SEQUENCE category_id_seq START 1;
CREATE SEQUENCE service_id_seq START 1;
CREATE SEQUENCE purchases_id_seq START 1;
CREATE SEQUENCE message_id_seq START 1;
CREATE SEQUENCE review_id_seq START 1;

CREATE TABLE "Profile" (
    id BIGINT PRIMARY KEY DEFAULT nextval('profile_id_seq'),
    skills TEXT,
    certifications TEXT,
    experience TEXT,
    education TEXT,
    contact TEXT,
    socials TEXT,
    portfolio_links TEXT,
    profile_picture TEXT
);

CREATE TABLE "User" (
    id BIGINT PRIMARY KEY DEFAULT nextval('users_id_seq'),
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    profile_ID BIGINT,
    is_admin BOOLEAN NOT NULL,
    seller_ID BIGINT,
    balance DECIMAL(10, 2),
	FOREIGN KEY (profile_ID) REFERENCES "Profile"(id) ON DELETE CASCADE
);

CREATE TABLE "Category" (
    id BIGINT PRIMARY KEY DEFAULT nextval('category_id_seq'),
    name VARCHAR(100) NOT NULL,
    description TEXT NOT NULL
);

CREATE TABLE "Service" (
    id BIGINT PRIMARY KEY DEFAULT nextval('service_id_seq'),
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    delivery_time INT NOT NULL,
    category_ID BIGINT NOT NULL,
	seller_ID BIGINT NOT NULL,
	FOREIGN KEY (category_ID) REFERENCES "Category"(id) ON DELETE CASCADE, 
	FOREIGN KEY (seller_ID) REFERENCES "User"(id) ON DELETE CASCADE
);

CREATE TABLE "Purchase" (
    id BIGINT PRIMARY KEY DEFAULT nextval('purchases_id_seq'),
    buyer_ID BIGINT,
    service_ID BIGINT,
    purchase_time TIMESTAMP NOT NULL,
    status VARCHAR(50) NOT NULL,
	FOREIGN KEY (buyer_ID) REFERENCES "User"(id) ON DELETE CASCADE,
	FOREIGN KEY (service_ID) REFERENCES "Service"(id) ON DELETE CASCADE
);

CREATE TABLE "Message" (
    id BIGINT PRIMARY KEY DEFAULT nextval('message_id_seq'),
    sender_ID BIGINT,
    receiver_ID BIGINT,
    content TEXT NOT NULL,
    timestamp TIMESTAMP NOT NULL,
	FOREIGN KEY (sender_ID) REFERENCES "User"(id) ON DELETE CASCADE,
	FOREIGN KEY (receiver_ID) REFERENCES "User"(id) ON DELETE CASCADE
);

CREATE TABLE "Review" (
    id BIGINT PRIMARY KEY DEFAULT nextval('review_id_seq'),
    rating INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    reviewer_ID BIGINT,
    reviewed_ID BIGINT,
	FOREIGN KEY (reviewer_ID) REFERENCES "User"(id) ON DELETE CASCADE,
	FOREIGN KEY (reviewed_ID) REFERENCES "Service"(id) ON DELETE CASCADE
);