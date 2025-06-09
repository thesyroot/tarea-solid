package Controllers.Commands;

import Controllers.ModelControllers.GenericModelController;

public class ShowListClientCommand extends GenericCommand {
    public ShowListClientCommand(GenericModelController clientModelController) {
        super(clientModelController);
    }

    @Override
    public void execute() {
        super.getModelController().showList();
    }
}
