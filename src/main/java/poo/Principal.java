package poo;

public class Principal {
    public static void main(String[] args) {
       //System.out.println("Olá");

        Relogio relogio = new Relogio();

        relogio.setSec(70);
        relogio.setMin(10);
        relogio.setHora(10);

        System.out.println(relogio.toString());
    }
}
