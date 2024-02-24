import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    // Define remote methods
    String sayHello() throws RemoteException;

    int add(int a, int b) throws RemoteException;
}
