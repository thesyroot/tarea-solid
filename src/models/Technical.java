package models;

import lombok.Data;

@Data
public class Technical extends Person{
    private int id;

    public Technical() {}

    public Technical(String nombre, String mail, long nro) {
        super(nombre, mail, nro);
    }
}
