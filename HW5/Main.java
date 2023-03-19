package org.example.HW5;

import org.example.HW5.view.UserView;

// Рефакторинг HW1 с учетом паттерна MVC
public class Main {
    public static void main(String[] args) {
        UserView userView = new UserView();
        userView.UserViewImpl();
    }
}
