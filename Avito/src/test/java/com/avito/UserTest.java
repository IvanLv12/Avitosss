package com.avito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    // Тест для метода getUserCount
    @Test
    public void testGetUserCount() {
        long startTime = System.currentTimeMillis();

        User user = new User("Иван", 25);
        int count = user.getUserCount();
        
        // Печать времени выполнения теста
        System.out.println("Время выполнения теста testGetUserCount: " + (System.currentTimeMillis() - startTime) + " миллисекунд");

        // Проверка количества пользователей
        assertEquals(3, count, "Проверка количества пользователей");
    }

    // Тест для метода getUserByName
    @Test
    public void testGetUserByName() {
        long startTime = System.currentTimeMillis();

        User user = new User("Иван", 25);
        User foundUser = user.getUserByName("Мария");

        // Печать времени выполнения теста
        System.out.println("Время выполнения теста testGetUserByName: " + (System.currentTimeMillis() - startTime) + " миллисекунд");

        // Проверка на null и правильность имени
        assertNotNull(foundUser, "Пользователь найден");
        assertEquals("Мария", foundUser.getName(), "Имя найденного пользователя");
    }
}
