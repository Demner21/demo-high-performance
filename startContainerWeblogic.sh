 docker run --rm -d -p 7001:7001 -p 9002:9002 \
 -v C:\\Users\\rlopezcr\\volumen-docker\\properties_weblogic:/u01/oracle/properties \
 -e ADMINISTRATION_PORT_ENABLED=true \
 -e DOMAIN_NAME=docker_domain \
 oracle/weblogic:12.2.1.3-developer