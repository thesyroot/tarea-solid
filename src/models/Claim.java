package models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Claim {
    private int id;
    private Client client;
    private ServiceDescription serviceDescription;
    private String details;
    private LocalDate date;
    private State state;

    public Claim() {}

    public Claim(Client client, ServiceDescription serviceDescription, String details, LocalDate date, State state) {
        this.client = client;
        this.serviceDescription = serviceDescription;
        this.details = details;
        this.date = date;
        this.state = state;
    }
}
