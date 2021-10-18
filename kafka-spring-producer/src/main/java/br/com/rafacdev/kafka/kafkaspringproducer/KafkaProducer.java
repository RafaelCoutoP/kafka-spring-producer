package br.com.rafacdev.kafka.kafkaspringproducer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer implements CommandLineRunner {

    private final ObjectMapper objectMapper;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public void run(String... args) throws Exception {

        String json = objectMapper.writeValueAsString(new Coffer(1, "Inspirazione Vineza", 4));
        System.out.println(kafkaTemplate.send("coffers", json).get());
    }
}