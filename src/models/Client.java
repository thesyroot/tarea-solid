package models;

import lombok.Data;

@Data
public class Client extends Person{
    private int id;

    public Client() {}

    public Client(long nro, String mail, String nombre) {
        super(nombre, mail, nro);
    }

    @Override
    public boolean equals(Object o){
        Client cli = (Client) o;

        if( !super.getNombre().equals(cli.getNombre()) ) return false;
        if( !super.getMail().equals(cli.getMail()) ) return false;
        return super.getNro() == cli.getNro();
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                "} " + super.toString();
    }
}
