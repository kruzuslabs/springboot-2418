CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS users
(
  id              UUID         NOT NULL PRIMARY KEY DEFAULT (uuid_generate_v4()),
  username        VARCHAR(100) NOT NULL,
  hashed_password VARCHAR(232) NOT NULL,
  total_posts     INT                               DEFAULT 0,
  created_at      TIMESTAMP WITH TIME ZONE          DEFAULT NOW(),
  updated_at      TIMESTAMP WITH TIME ZONE          DEFAULT NOW()
);


CREATE TABLE IF NOT EXISTS resources
(
  id          SERIAL PRIMARY KEY,
  title       VARCHAR(100) NOT NULL,
  description VARCHAR(100),
  content     TEXT         NOT NULL,
  author_id   UUID         NOT NULL REFERENCES "users" (id),
  created_at  TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);
