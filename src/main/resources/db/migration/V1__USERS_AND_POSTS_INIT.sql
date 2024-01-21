CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS users (
  id UUID NOT NULL PRIMARY KEY DEFAULT (uuid_generate_v4()),
  username VARCHAR(50) NOT NULL,
  hashed_password VARCHAR(232) NOT NULL,
  total_posts integer DEFAULT 0,
  created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
  updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS tasks (
  id SERIAL PRIMARY KEY,
  title VARCHAR(100) NOT NULL,
  content TEXT NOT NULL,
  completed BOOLEAN NOT NULL DEFAULT FALSE,
  severity SMALLINT NOT NULL DEFAULT 0,
  author_id UUID NOT NULL REFERENCES "users" (id),
  created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

-- find tasks by title
CREATE INDEX ON tasks(title);

-- find tasks by content
CREATE INDEX ON tasks(content);

-- maybe something else?