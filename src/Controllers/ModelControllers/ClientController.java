package Controllers.ModelControllers;

import Views.ClientView;
import lombok.Getter;
import models.Client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ClientController implements GenericModelController {
    private final ClientView clientView;
    @Getter
    private final Set<Client> clientSet;

    public ClientController(ClientView clientView) {
        this.clientView = clientView;
        this.clientSet = new HashSet<>();
    }

    public boolean add(){
        Client cli = this.exist();
        if(cli == null) return false;

        this.clientSet.add(cli);
        return true;
    }

    public boolean alredyExist(){
        return this.exist() == null;
    }

    public Client exist(){
        Client cli = new Client(
                clientView.getNro(),
                clientView.getMail(),
                clientView.getName()
        );

        if(clientSet.contains(cli)) return null;
        return cli;
    }

    public void showList(){
        this.clientView.showList(new ArrayList<>(clientSet));
    }
}
