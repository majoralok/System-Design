import com.dpw.runner.kafka.lib.config.QueueConfig;
import com.dpw.runner.kafka.lib.exception.KafkaUtilException;
import com.dpw.runner.kafka.lib.producer.IKafkaProducer;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@Import({QueueConfig.class})
public abstract class KafkaProducer implements IKafkaProducer {
    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    public KafkaProducer() {
    }

    public <T> void publishToTopic(String key, T object) {
        try {
            this.publishToTopic(key, this.objectMapper.writeValueAsString(object));
        } catch (Exception var4) {
            log.error("Exception encountered while publishing String to kafka topic : {} , Exception is : {}", this.getTopic(), var4.getMessage());
        }

    }

    public <T> void publishToTopic(String key, T object, Map<String, String> headerMap) {
        try {
            Message<?> message = MessageBuilder.withPayload(this.objectMapper.writeValueAsString(object)).setHeader("kafka_topic", this.getTopic()).setHeader("kafka_messageKey", key).copyHeaders(headerMap).build();
            this.publishToTopic(message);
        } catch (Exception var5) {
            log.error("Exception encountered while publishing String to kafka topic : {} , Exception is : {}", this.getTopic(), var5.getMessage());
        }

    }

    public <T> void publishToTopicSync(String key, T object) {
        try {
            this.publishToTopicSync(key, this.objectMapper.writeValueAsString(object));
            log.info("Message published successfully to kafka topic : " + this.getTopic());
        } catch (Exception var4) {
            log.error("Exception encountered while publishing String to kafka topic : {} , Exception is : {}", this.getTopic(), var4.getMessage());
        }

    }

    public <T> void publishToTopicSync(String key, T object, Map<String, String> headerMap) {
        try {
            Message<?> message = MessageBuilder.withPayload(this.objectMapper.writeValueAsString(object)).setHeader("kafka_topic", this.getTopic()).setHeader("kafka_messageKey", key).copyHeaders(headerMap).build();
            this.publishToTopicSync(message);
        } catch (Exception var5) {
            log.error("Exception encountered while publishing String to kafka topic : {} , Exception is : {}", this.getTopic(), var5.getMessage());
        }

    }

    public void publishToTopic(String key, String object, Map<String, String> headerMap) {
        try {
            Message<?> message = MessageBuilder.withPayload(this.objectMapper.writeValueAsString(object)).setHeader("kafka_topic", this.getTopic()).setHeader("kafka_messageKey", key).copyHeaders(headerMap).build();
            this.publishToTopic(message);
        } catch (Exception var5) {
            log.error("Exception encountered while publishing String to kafka topic : {} , Exception is : {}", this.getTopic(), var5.getMessage());
        }

    }

    public void publishToTopicSync(String key, String object, Map<String, String> headerMap) {
        try {
            Message<?> message = MessageBuilder.withPayload(this.objectMapper.writeValueAsString(object)).setHeader("kafka_topic", this.getTopic()).setHeader("kafka_messageKey", key).copyHeaders(headerMap).build();
            this.publishToTopicSync(message);
        } catch (Exception var5) {
            log.error("Exception encountered while publishing String to kafka topic : {} , Exception is : {}", this.getTopic(), var5.getMessage());
        }

    }

    public void publishToTopic(String key, String message) {
        try {
            this.kafkaTemplate.send(this.getTopic(), key, message);
        } catch (Exception var4) {
            log.error("Exception encountered while publishing String to kafka topic : {} , Exception is : {}", this.getTopic(), var4.getMessage());
            throw new KafkaUtilException(var4.getMessage());
        }
    }

    private void publishToTopic(Message<?> message) {
        try {
            this.kafkaTemplate.send(message);
            log.info("Message published successfully to kafka topic : " + this.getTopic());
        } catch (Exception var3) {
            log.error("Exception encountered while publishing String to kafka topic : {} , Exception is : {}", this.getTopic(), var3.getMessage());
            throw new KafkaUtilException(var3.getMessage());
        }
    }

    public void publishToTopicSync(String key, String message) {
        try {
            this.kafkaTemplate.send(this.getTopic(), key, message).get();
            log.info("Message published successfully to kafka topic : " + this.getTopic());
        } catch (Exception var4) {
            log.error("Exception encountered while publishing String to kafka topic : {} , Exception is : {}", this.getTopic(), var4.getMessage());
            throw new KafkaUtilException(var4.getMessage());
        }
    }

    private void publishToTopicSync(Message<?> message) {
        try {
            this.kafkaTemplate.send(message).get();
            log.info("Message published successfully to kafka topic : " + this.getTopic());
        } catch (Exception var3) {
            log.error("Exception encountered while publishing String to kafka topic : {} , Exception is : {}", this.getTopic(), var3.getMessage());
            throw new KafkaUtilException(var3.getMessage());
        }
    }
}
