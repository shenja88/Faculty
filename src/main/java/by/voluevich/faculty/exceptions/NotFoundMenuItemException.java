package by.voluevich.faculty.exceptions;

public class NotFoundMenuItemException extends Exception {

    @Override
    public String getMessage() {
        return "The menu item you selected is not available. Repeat entry.";
    }
}
