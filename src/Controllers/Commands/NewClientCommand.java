package Controllers.Commands;

import Controllers.ModelControllers.GenericModelController;

public class NewClientCommand extends GenericCommand{
    public NewClientCommand(GenericModelController modelController) {
        super(modelController);
    }

    @Override
    public void execute() {
        super.getModelController().add();
    }
}
