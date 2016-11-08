# file run.sh
#!/bin/sh

if [ -z "$TCP_HOST" ]; then
    echo "HOST is empty"
else
    echo "HOST is $TCP_HOST"
fi

if [ -z "$TCP_PORT" ]; then
    echo "HOST is empty"
else
    echo "HOST is $TCP_PORT"
fi

if [ -z "$PROFILE" ]; then
    echo "HOST is empty"
else
    echo "HOST is $PROFILE"
fi

if [ -z "$OPTS" ]; then
    echo "OPTS is empty"
    java -jar /app.jar
else
    echo "HOST is $OPTS"
    java $OPTS -jar /app.jar
fi