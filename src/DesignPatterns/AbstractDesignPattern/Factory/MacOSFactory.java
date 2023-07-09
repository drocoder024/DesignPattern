package AbstractDesignPattern.Factory;

import AbstractDesignPattern.Button.IButton;
import AbstractDesignPattern.Button.MacOSButton;
import AbstractDesignPattern.CheckBox.ICheckBox;
import AbstractDesignPattern.CheckBox.MacCheckbox;
import AbstractDesignPattern.Factory.GUIFactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new MacCheckbox();
    }
}
