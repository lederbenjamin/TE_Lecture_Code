# Doughnut Shop

This database has been designed to demonstrate a real world context for table joins.

## Setup

- `cd` into the doughnut_shop directory. There should be several sql files in this directory. doughnut-shop.sql contains the DDL script for creating the tables and constraints, and the create-some-doughnuts.sql script contains the DML for creating some delicious doughnuts.
- In terminal, run the command `createdb -U postgres doughnut_shop`
- In terminal, run the command `psql -U postgres -d doughnut_shop -f doughnut-shop.sql`
- In terminal, run the command `psql -U postgres -d doughnut_shop -f create-some-doughnuts.sql`

## Queries

There is another file in the same directory that includes the queries that explain the difference between the various types of joins represented in a Venn Diagram called doughnut-shop-venn-queries.sql.

