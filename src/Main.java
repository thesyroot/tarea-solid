import Controllers.CoreController;
import Controllers.MenuController;
import Views.MenuView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MenuController menu = new MenuController(new MenuView());
        menu.begin();
    }
}