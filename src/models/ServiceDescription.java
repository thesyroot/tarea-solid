package models;

import lombok.Data;

@Data
public class ServiceDescription {
    private String serviceName;
    private String description;

    public ServiceDescription() {}

    public ServiceDescription(String serviceName, String description) {
        this.serviceName = serviceName;
        this.description = description;
    }
}
