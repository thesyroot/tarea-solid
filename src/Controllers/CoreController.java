package Controllers;

import Controllers.ModelControllers.ClaimController;
import Controllers.ModelControllers.ClientController;
import Controllers.ModelControllers.GenericModelController;
import Views.ClaimView;
import Views.ClientView;
import lombok.Getter;
import models.Client;

@Getter
public class CoreController {
    private final GenericModelController clientController;
    private final GenericModelController claimController;

    public CoreController() {
        this.clientController = new ClientController(new ClientView());
        this.claimController = new ClaimController(new ClaimView());
    }


}
