package Lab3;

import java.io.*;

public class XFile {
    public static Object readObject(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }

    public static void writeObject(String path, Object obj) throws IOException {
        ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(obj);
        oos.close();
    }
}
