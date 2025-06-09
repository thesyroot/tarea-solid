package Controllers.ModelControllers;

import Views.ClaimView;
import lombok.Getter;
import models.Claim;
import models.Client;
import models.State;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ClaimController implements GenericModelController{
    private final ClaimView claimView;
    @Getter
    private final Set<Claim> claimSet;

    public ClaimController(ClaimView claimView) {
        this.claimView = claimView;
        this.claimSet = new HashSet<>();
    }

    public boolean add(){
        Claim cla = this.exist();
        if(this.exist() == null) return false;

        claimSet.add(cla);
        return true;
    }

    public boolean alredyExist(){
        return this.exist() == null;
    }

    public Claim exist(){
//        Client client, ServiceDescription serviceDescription, String details, LocalDate date, State state
        Claim cla = new Claim();

        if(claimSet.contains(cla)) return null;
        return cla;
    }

    public void showList(){
        this.claimView.showList(new ArrayList<>(claimSet));
    }
}
