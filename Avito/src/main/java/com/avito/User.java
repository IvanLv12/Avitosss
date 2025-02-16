package com.avito;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private int age;
    
    // Статический список пользователей для примера
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("Иван", 25));
        users.add(new User("Мария", 30));
        users.add(new User("Петр", 22));
    }

    // Конструктор
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для получения количества пользователей
    public int getUserCount() {
        return users.size();
    }

    // Метод для получения пользователя по имени
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.name.equals(name)) {
                return user;
            }
        }
        return null; // Если пользователя с таким именем нет
    }

    // Геттеры для полей name и age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
