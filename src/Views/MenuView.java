package Views;

import Views.Asker.GenericAsker;
import Views.Shower.GenericShower;

import java.util.List;

public class MenuView {
    private final GenericAsker menuAsker;
    private final GenericShower menuShower;

    public MenuView() {
        this.menuAsker = new GenericAsker();
        this.menuShower = new GenericShower();
    }

    public void showMenu(){
        this.menuShower.show("---------GESTION DE CLIENTES----------\n" +
                "1. Alta de nuevos clientes.\n" +
                "2. DEJADO AL FINAL.\n" +
                "3. Determinar si el cliente se encuentra registrado.\n" +
                "4. Listar clientes.\n" +
                "5. NO IMPLEMENTADO.\n" +
                "------------------------------------\n"
        );
    }

    public int nextOption(){
        return this.menuAsker.askInt("opcion");
    }
}
