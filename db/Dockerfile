# Use the latest MySQL image
FROM mysql/mysql-server:latest

# Set the working directory
WORKDIR /tmp

# Copy database files
COPY test_db/*.sql /tmp/
COPY test_db/*.dump /tmp/

# Load the employee database automatically
COPY test_db/employees.sql /docker-entrypoint-initdb.d/

# Set MySQL root password
ENV MYSQL_ROOT_PASSWORD=example
ENV MYSQL_ROOT_HOST=%