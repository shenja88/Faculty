package by.voluevich.faculty.application.utils.menu;

import by.voluevich.faculty.application.utils.Input;
import by.voluevich.faculty.application.utils.menu.buttons.ButtonAction;
import by.voluevich.faculty.application.utils.menu.buttons.mainMenuButtons.*;
import by.voluevich.faculty.exceptions.NotFoundMenuItemException;

import java.util.Arrays;
import java.util.List;

public class MenuImpl implements Menu {
    private List<ButtonAction> buttonActions = Arrays.asList(
            new AddStudentButton(),
            new RemoveStudentButton(),
            new UpdateStudentsButton(),
            new SearchStudentsButton(),
            new ViewSortStudentsButton(),
            new ExitButton()
    );

    public MenuImpl(List<ButtonAction> buttonActions) {
        this.buttonActions = buttonActions;
    }

    public MenuImpl() {
    }

    public List<ButtonAction> getButtonActions() {
        return buttonActions;
    }

    public void setButtonActions(List<ButtonAction> buttonActions) {
        this.buttonActions = buttonActions;
    }

    @Override
    public void getName() {
        System.out.println("================ Main menu ================");
    }

    @Override
    public void viewMenu() {
        for (int i = 0; i < buttonActions.size(); i++) {
            System.out.println((i + 1) + " - " + buttonActions.get(i).name());
        }
    }

    @Override
    public void selectButton() throws NotFoundMenuItemException {
        int select = Input.getInt("Enter number for operation.") - 1;
        if(select >= buttonActions.size() || select < 0){
            throw new NotFoundMenuItemException();
        }else{
            buttonActions.get(select).tap();
        }
    }
}
