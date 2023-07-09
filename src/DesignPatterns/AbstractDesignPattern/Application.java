package AbstractDesignPattern;

import AbstractDesignPattern.Button.IButton;
import AbstractDesignPattern.CheckBox.ICheckBox;
import AbstractDesignPattern.Factory.GUIFactory;

public class Application {
    private IButton button;
    private ICheckBox checkbox;

    public Application(GUIFactory factory) {
       button= factory.createButton();
       checkbox=factory.createCheckBox();
    }
    public void work()
    {
        button.paint();
        checkbox.paint();

    }
}
