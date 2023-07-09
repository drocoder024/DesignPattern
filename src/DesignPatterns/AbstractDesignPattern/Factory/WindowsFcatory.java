package AbstractDesignPattern.Factory;

import AbstractDesignPattern.Button.IButton;
import AbstractDesignPattern.Button.WindowsOSButton;
import AbstractDesignPattern.CheckBox.ICheckBox;
import AbstractDesignPattern.CheckBox.WindowsCheckBox;
import AbstractDesignPattern.Factory.GUIFactory;

public class WindowsFcatory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new WindowsOSButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
