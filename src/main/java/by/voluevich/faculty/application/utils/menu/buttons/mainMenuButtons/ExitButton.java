package by.voluevich.faculty.application.utils.menu.buttons.mainMenuButtons;

import by.voluevich.faculty.application.utils.menu.buttons.ButtonAction;

public class ExitButton implements ButtonAction {

    @Override
    public void tap() {
        System.out.println("Good bye!");
        System.exit(0);
    }

    @Override
    public String name() {
        return "Exit.";
    }
}
