FROM mysql

COPY CreateTables.sql /docker-entrypoint-initdb.d/CreateTables.sql
COPY CreateTestData.sql /docker-entrypoint-initdb.d/CreateTestData.sql