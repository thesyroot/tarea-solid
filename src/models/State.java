package models;

import lombok.Getter;

@Getter
public class State {
    private int id;
    private String nombre;

    public State() {}

    public State(String nombre) {
        this.nombre = nombre;
    }
}
