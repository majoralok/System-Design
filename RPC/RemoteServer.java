import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteServer extends UnicastRemoteObject implements RemoteInterface {

    protected RemoteServer() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello from the custom server!";
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public static void main(String[] args) {
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099); // Default RMI registry port
            RemoteInterface server = new RemoteServer();
            java.rmi.Naming.rebind("RemoteServer", server); // Bind the server to the RMI registry
            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
