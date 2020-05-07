# Build
mvn clean package && docker build -t com.demneru/demo-high-performance .

# RUN

docker rm -f demo-high-performance || true && docker run -d -p 8080:8080 -p 4848:4848 --name demo-high-performance com.demneru/demo-high-performance 