package by.voluevich.faculty.application;

import by.voluevich.faculty.application.utils.menu.MenuImpl;
import by.voluevich.faculty.exceptions.NotFoundMenuItemException;

public class Application {
    private final MenuImpl menu = new MenuImpl();

    public void start() {
        System.out.println("Welcome!");
        run();
    }

    private void run() {
        while (true) {
            menu.getName();
            menu.viewMenu();
            try {
                menu.selectButton();
            } catch (NotFoundMenuItemException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
