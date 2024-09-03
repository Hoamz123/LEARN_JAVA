package FileIO;

import java.io.*;

class Main {
    public static void main(String[] args) {
        File file = new File("file.txt");

        /* Write object and primitive data type to output stream */
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream outputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            outputStream = new ObjectOutputStream(fileOutputStream);
            // Write int value
            outputStream.writeInt(500);

            outputStream.writeObject(new User(1, "shareprogramming.net"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /* Read object and primitive data type from input stream */
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            // Read int
            int value = objectInputStream.readInt();
            System.out.println(value);

            // Read User object
            User user = (User) objectInputStream.readObject();
            System.out.println(user);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}