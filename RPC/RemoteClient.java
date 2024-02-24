import java.rmi.Naming;

public class RemoteClient {
    public static void main(String[] args) {
        try {
            RemoteInterface server = (RemoteInterface) Naming.lookup("//localhost/RemoteServer");
            String message = server.sayHello();
            int add = server.add(5, 6);
            System.out.println("Message from server: " + message);
            System.out.println("Message for addition from server: " + add);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
