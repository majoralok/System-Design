import com.dpw.runner.kafka.lib.exception.KafkaUtilException;

public class KafkaUtilConstants {
    public static final String SUCCESS_PUBLISH_MESSAGE = "Message published successfully to kafka topic : ";
    public static final String ERROR_PUBLISH_MESSAGE = "Exception encountered while publishing String to kafka topic : {} , Exception is : {}";

    private KafkaUtilConstants() {
        throw new KafkaUtilException("Utility class not allowed to instantiate");
    }
}
