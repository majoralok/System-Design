import java.util.Map;

public interface IKafkaProducer {
    <T> void publishToTopic(String key, T object);

    <T> void publishToTopic(String key, T object, Map<String, String> headerMap);

    <T> void publishToTopicSync(String key, T object);

    <T> void publishToTopicSync(String key, T object, Map<String, String> headerMap);

    void publishToTopic(String key, String message);

    void publishToTopic(String key, String object, Map<String, String> headerMap);

    void publishToTopicSync(String key, String message);

    void publishToTopicSync(String key, String object, Map<String, String> headerMap);

    String getTopic();
}
