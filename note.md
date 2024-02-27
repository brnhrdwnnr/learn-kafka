Download the latest Kafka release and extract it:

$ tar -xzf kafka_2.13-3.6.1.tgz
$ cd kafka_2.13-3.6.1

# Start the ZooKeeper service
$ bin/zookeeper-server-start.sh config/zookeeper.properties

# Start the Kafka broker service
$ bin/kafka-server-start.sh config/server.properties

Open another terminal session and run the console consumer client to read the events you just created:

$ bin/kafka-console-consumer.sh --topic bernhard --from-beginning --bootstrap-serve