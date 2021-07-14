package by.voluevich.faculty.application.utils.menu;

import by.voluevich.faculty.exceptions.NotFoundMenuItemException;

public interface Menu {

    void getName();

    void viewMenu();

    void selectButton() throws NotFoundMenuItemException;
}
