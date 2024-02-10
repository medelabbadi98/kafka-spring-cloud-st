package com.example.demospringcloudstreamskafka;

import com.example.demospringcloudstreamskafka.entities.PageEvent;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.*;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.kafka.streams.kstream.TimeWindows;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.util.Properties;

@SpringBootApplication
public class DemoSpringcloudStreamsKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudStreamsKafkaApplication.class, args);
    }

}
