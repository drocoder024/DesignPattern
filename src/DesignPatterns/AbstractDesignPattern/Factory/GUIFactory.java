package AbstractDesignPattern.Factory;

import AbstractDesignPattern.Button.IButton;
import AbstractDesignPattern.CheckBox.ICheckBox;


public interface GUIFactory {
   IButton createButton();
   ICheckBox createCheckBox();

}
