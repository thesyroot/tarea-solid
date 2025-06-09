package Controllers;

import Controllers.Commands.GenericCommand;
import Controllers.Commands.NewClientCommand;
import Controllers.Commands.ShowListClientCommand;
import Controllers.ModelControllers.ClaimController;
import Controllers.ModelControllers.ClientController;
import Controllers.ModelControllers.GenericModelController;
import Views.ClaimView;
import Views.ClientView;
import lombok.Getter;

import java.util.HashMap;

@Getter
public class CoreController {
    private final HashMap<Integer, GenericCommand> commands;

    private final GenericModelController clientController;
    private final GenericModelController claimController;

    public CoreController() {
        this.clientController = new ClientController(new ClientView());
        this.claimController = new ClaimController(new ClaimView());

        commands = new HashMap<>();

        commands.put(1, new NewClientCommand( this.clientController ));
        commands.put(4, new ShowListClientCommand( this.clientController ));
    }
}
