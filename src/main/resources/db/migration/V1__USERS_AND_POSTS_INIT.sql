-- Ensure the uuid-ossp extension is enabled (if not already enabled)
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Create the 'users' table with a UUID primary key
CREATE TABLE IF NOT EXISTS users (
    id UUID NOT NULL PRIMARY KEY DEFAULT (uuid_generate_v4 ()),
    username VARCHAR (100) NOT NULL,
    hashed_password VARCHAR (232) NOT NULL,
    total_posts INT DEFAULT 0,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

-- Create the 'posts' table with an integer primary key and a foreign key reference to 'users'
CREATE TABLE IF NOT EXISTS resources (
    id SERIAL PRIMARY KEY,
    title VARCHAR (100) NOT NULL,
    description VARCHAR (100),
    content TEXT NOT NULL,
    author_id UUID NOT NULL REFERENCES "users" (id),
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);