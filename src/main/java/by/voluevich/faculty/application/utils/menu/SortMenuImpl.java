package by.voluevich.faculty.application.utils.menu;

import by.voluevich.faculty.application.utils.Input;
import by.voluevich.faculty.application.utils.menu.buttons.ButtonAction;
import by.voluevich.faculty.application.utils.menu.buttons.sortMenuButtons.SortByAgeButton;
import by.voluevich.faculty.application.utils.menu.buttons.sortMenuButtons.SortByAgeButton2;
import by.voluevich.faculty.application.utils.menu.buttons.sortMenuButtons.SortByIdButton;
import by.voluevich.faculty.application.utils.menu.buttons.sortMenuButtons.SortByLastNameButton;
import by.voluevich.faculty.exceptions.NotFoundMenuItemException;

import java.util.Arrays;
import java.util.List;

public class SortMenuImpl implements Menu {
    private List<ButtonAction> buttonActions = Arrays.asList(
            new SortByIdButton(),
            new SortByLastNameButton(),
            new SortByAgeButton(),
            new SortByAgeButton2()
    );

    public SortMenuImpl(List<ButtonAction> buttonActions) {
        this.buttonActions = buttonActions;
    }

    public SortMenuImpl() {
    }

    public List<ButtonAction> getButtonActions() {
        return buttonActions;
    }

    public void setButtonActions(List<ButtonAction> buttonActions) {
        this.buttonActions = buttonActions;
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

    @Override
    public void getName() {
        System.out.println("================ Sort menu ================");
    }
}
