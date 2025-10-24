DO $$
BEGIN
    IF NOT EXISTS (SELECT FROM pg_database WHERE datname = 'samokat-db') THEN
       CREATE DATABASE samokat-db;
END IF;
END $$;