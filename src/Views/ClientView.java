package Views;

import Views.Asker.GenericAsker;
import Views.Shower.GenericShower;
import models.Client;

import java.util.List;

public class ClientView {
    private GenericAsker clientAsker;
    private GenericShower clientShower;

    public ClientView() {
        this.clientAsker = new GenericAsker();
        this.clientShower = new GenericShower();
    }

    public String getName(){
        return this.clientAsker.askString("nombre");
    }

    public String getMail(){
        return this.clientAsker.askString("mail");
    }

    public long getNro(){
        return this.clientAsker.askLong("nro");
    }

    public void showList(List<Client> clients){
        this.clientShower.showFromList(clients);
    }
}
