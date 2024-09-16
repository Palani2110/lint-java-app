# Use an official Java runtime as the base image
FROM openjdk:11-slim

# Set the working directory in the container
WORKDIR /app

# Create a user and group with unique UID and GID
RUN groupadd -g 15003 grpid_group && \
    useradd -u 150003 -g grpid_group usrid_user

# Copy the Java source files into the container
COPY Arithmetic.java /app/Arithmetic.java

# Compile the Java application inside the container
RUN javac Arithmetic.java

# restrict app src permissions to in container user.
RUN chown -R usrid_user:grpid_group /app
RUN chmod 755 /app

# Set container user uid/gid
USER usrid_user:grpid_group

# Run the compiled Java application
CMD ["java", "Arithmetic"]
