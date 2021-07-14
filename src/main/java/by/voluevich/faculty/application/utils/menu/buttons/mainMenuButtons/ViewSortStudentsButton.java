package by.voluevich.faculty.application.utils.menu.buttons.mainMenuButtons;

import by.voluevich.faculty.application.utils.menu.SortMenuImpl;
import by.voluevich.faculty.application.utils.menu.buttons.ButtonAction;
import by.voluevich.faculty.exceptions.NotFoundMenuItemException;


public class ViewSortStudentsButton implements ButtonAction {

    @Override
    public void tap() {
        SortMenuImpl sortMenu = new SortMenuImpl();
        sortMenu.getName();
        sortMenu.viewMenu();
        try {
            sortMenu.selectButton();
        } catch (NotFoundMenuItemException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String name() {
        return "View and sorting students.";
    }
}
