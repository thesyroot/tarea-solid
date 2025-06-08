package models;

import lombok.Data;

@Data
public abstract class Person {
    private String nombre;
    private String mail;
    private long nro;

    public Person() {}

    public Person(String nombre, String mail, long nro) {
        this.nombre = nombre;
        this.mail = mail;
        this.nro = nro;
    }
}
