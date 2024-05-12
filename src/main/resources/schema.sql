CREATE TABLE IF NOT EXISTS products
(
    id              INTEGER PRIMARY KEY,
    reference       VARCHAR(12) NOT NULL,
    size            VARCHAR(4) NOT NULL,
    active          BOOLEAN NOT NULL,
    price           NUMERIC(10, 1) NOT NULL
);