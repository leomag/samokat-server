
CREATE TABLE orders
(
    id                  SERIAL PRIMARY KEY,
    price               INTEGER                 NOT NULL,
    creation_date       timestamp DEFAULT now() NOT NULL
);