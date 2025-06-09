package Controllers;

import Controllers.ModelControllers.ClientController;
import Controllers.ModelControllers.GenericModelController;
import Views.MenuView;

public class MenuController {
    private final MenuView menuView;
    private final CoreController coreController;

    public MenuController(MenuView menuView) {
        this.menuView = menuView;
        this.coreController = new CoreController();
    }

    public void begin(){
        int option = 1;
        while(option != 0){
            menuView.showMenu();
            option = menuView.nextOption();

            this.coreController.getCommands().get(option).execute();
        }
    }
}
