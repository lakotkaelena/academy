package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task2 {
    public static void main(String[] args) {

        User user = new User("Ivan", "Ivanov", 30, "01.01.1993", "i_ivanov", "ewD455kiO22", "i_ivanov30@gmail.com");
        Class<User> userClass = User.class;

        try {
            System.out.println("method 1: " + userClass.getMethod("getFirstName"));
            System.out.println("Методы класса user: -------------------------");
            for (Method userMethods : userClass.getMethods()) {
                System.out.println(userMethods);
            }
            System.out.println(userClass.getField("login"));
            for (Field userField : userClass.getFields()) {
                System.out.println(userField);
            }
            System.out.println(userClass.getDeclaredMethod("printUserInfo"));
            System.out.println("Методы класса user: -------------------------");
            for (Method userMethods : userClass.getDeclaredMethods()) {
                System.out.println(userMethods);
            }
            System.out.println(userClass.getSuperclass().getDeclaredField("firstName"));
            System.out.println("Поля класса person: -------------------------");
            for (Field userField : userClass.getSuperclass().getDeclaredFields()) {
                System.out.println(userField);
            }
            Field userFirstName = userClass.getSuperclass().getDeclaredField("firstName");
            userFirstName.setAccessible(true);
            userFirstName.set(user, "Alex");

            Field userLastName = userClass.getSuperclass().getDeclaredField("lastName");
            userLastName.setAccessible(true);
            userLastName.set(user, "Sidorov");

            Field userAge = userClass.getSuperclass().getDeclaredField("age");
            userAge.setAccessible(true);
            userAge.set(user, 40);

            Field userDateOfBirth = userClass.getSuperclass().getDeclaredField("dateOfBirth");
            userDateOfBirth.setAccessible(true);
            userDateOfBirth.set(user, "01.01.1983");


            Field userLogin = userClass.getDeclaredField("login");
            userLogin.setAccessible(true);
            userLogin.set(user, "a_sidorov");

            Field userPassword = userClass.getDeclaredField("password");
            userPassword.setAccessible(true);
            userPassword.set(user, "e23kV44ot");

            Field userEmail = userClass.getDeclaredField("email");
            userEmail.setAccessible(true);
            userEmail.set(user, "a_sidorov40@gmail.com");


            Method printUserInfoMethod = userClass.getDeclaredMethod("printUserInfo");
            printUserInfoMethod.invoke(user);


        } catch (NoSuchMethodException | NoSuchFieldException | IllegalAccessException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
    }
}

