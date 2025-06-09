package Controllers.Commands;

import Controllers.ModelControllers.GenericModelController;
import lombok.Getter;
import org.hibernate.boot.internal.Abstract;

@Getter
public abstract class GenericCommand {
    private final GenericModelController modelController;

    public GenericCommand(GenericModelController modelController) {
        this.modelController = modelController;
    }

    abstract public void execute();
}
