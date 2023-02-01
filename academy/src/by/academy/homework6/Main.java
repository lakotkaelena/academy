package by.academy.homework6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Daniel", "Wilson", 22);
        User user2 = new User("Dean", "Bradley", 33);
        User user3 = new User("Joshua", "Arnold", 18);
        User user4 = new User("Mitchell", "Miller", 44);
        User user5 = new User("Clarence", "Hopkins", 38);
        User user6 = new User("Antony", "Hopkins", 54);
        User user7 = new User("Steve", "Dean", 46);
        User user8 = new User("Phillip", "Diaz", 30);
        User user9 = new User("Glenn", "Simmons", 13);
        User user10 = new User("Ella", "Simmons", 20);
        List<User> userList = new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10));
        for (User user : userList) {
            Function<User, String> fileName = s -> user.getName() + "_" + user.getSurname() + ".txt";
            File userFile = new File(fileName.apply(user));
            try {
                if (!userFile.exists()) {
                    userFile.createNewFile();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

            try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(userFile)))) {
                oos.writeObject(user);

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }

        }
    }
}
