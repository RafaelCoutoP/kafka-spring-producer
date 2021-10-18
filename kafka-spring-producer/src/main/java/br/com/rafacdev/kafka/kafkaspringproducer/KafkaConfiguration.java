package br.com.rafacdev.kafka.kafkaspringproducer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@Configuration
public class KafkaConfiguration {

    @Bean
    public StringJsonMessageConverter jsonMessageConverter(){
        return new StringJsonMessageConverter();
    }
}