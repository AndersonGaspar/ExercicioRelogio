package poo;

public class Principal {


    public static void main(String[] args) {
       //System.out.println("Olá");

        Relogio relogio = new Relogio(12, 8, 8);

//        relogio.setSec(12);
//        relogio.setMin(80);
//        relogio.setHora(15);


        System.out.println(relogio.toString());
    }
}
