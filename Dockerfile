FROM airhacks/glassfish
COPY ./target/demo-high-performance.war ${DEPLOYMENT_DIR}
