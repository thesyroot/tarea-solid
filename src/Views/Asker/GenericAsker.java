package Views.Asker;

import lombok.Getter;

import java.util.Scanner;

@Getter
public class GenericAsker {
    private Scanner sc;

    public GenericAsker() {
        this.sc = new Scanner(System.in);
    }

    public String askString(String elemento) {
        System.out.print("Ingrese el "+elemento+" del Cliente: ");
        return this.sc.next();
    }

    public long askLong(String elemento) {
        System.out.print("Ingrese el "+elemento+" del Cliente: ");
        return this.sc.nextLong();
    }

    public int askInt(String elemento) {
        System.out.print("Ingrese una "+elemento+": ");
        return this.sc.nextInt();
    }
}
