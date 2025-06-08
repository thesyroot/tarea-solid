package Views;

import Views.Asker.GenericAsker;
import Views.Shower.GenericShower;
import models.Claim;

import java.util.List;

public class ClaimView {
    private GenericAsker claimAsker;
    private GenericShower claimShower;

    public ClaimView() {
        this.claimAsker = new GenericAsker();
        this.claimShower = new GenericShower();
    }

    public void showList(List<Claim> claims){
        this.claimShower.showFromList(claims);
    }
}
