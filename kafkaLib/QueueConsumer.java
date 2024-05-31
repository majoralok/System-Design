import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.kafka.annotation.KafkaListener;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@KafkaListener
public @interface QueueConsumer {
    String topics();

    String groupId();

    String containerFactory() default "kafkaListenerContainerFactory";
}
