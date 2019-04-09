package poo;

/** Classe relógio para demostrar o tempo.
 * @author Anderson Gaspar
 */

public class Relogio {

    private int sec;
    private int min;
    private int hora;

    /**
     * Construtores
     *
     */

    public Relogio(int sec){
        if ((sec >= 0) && (sec < 60)){
            this.sec = sec;
        }else{
            this.sec = 0;
            this.min = 0;
            this.hora = 0;
        }
    }

    public Relogio(int sec, int min){
        if ((sec >= 0) && (sec < 60)){
            if ((min >= 0) && (min < 60)) {
                this.sec = sec;
                this.min = min;
            }
        }else{
            this.sec = 0;
            this.min = 0;
            this.hora = 0;
        }
    }

    public Relogio(int sec, int min, int hora){
        if ((sec >= 0) && (sec < 60)){
            if ((min >= 0) && (min < 60)){
                if ((hora >= 0) && (hora < 24)) {
                    this.sec = sec;
                    this.min = min;
                    this.hora = hora;
                }
            }
        }else{
            this.sec = 0;
            this.min = 0;
            this.hora = 0;
        }
    }

    /**
     * Essa classe seta o segundo, caso esteja dentro dos parâmetros.
     * @param sec é o segundo
     * @return true caso esteja dentro dos parâmetros, caso não retorna 0
     */

    public boolean setSec(int sec){
        if ((sec >= 0)&&(sec <= 60)){
            if((sec >= 0)&&(sec <= 9)){
                this.sec = sec;
                return true;
            }else{
                this.sec = sec;
                return true;
            }

        }else{
            this.sec = 0;
            return false;
        }
    }

    /**
     * Essa classe seta o minuto, caso esteja dentro dos parâmentros.
     * @param min é o minuto.
     * @return
     */

    public boolean setMin(int min) {
        if ((min >= 0) && (min <= 60)) {
            this.min = min;
            return true;
        }else{
            this.min = 0;
            return false;
        }
    }

    /**
     * Essa classe seta a hora, caso esteja dentro dos parâmentros.
     * @param hora
     * @return
     */

    public boolean setHora(int hora) {
        if ((hora >= 0) && (hora < 24)) {
            this.hora = hora;
            return true;
        }else{
            this.hora = 0;
            return false;
        }
    }


    public String toString(){
        if ((hora >= 0)&&(hora <= 9)){
            return String.format("0", String.valueOf(hora));
        }
        return String.format("0",String.valueOf(hora)) +":"+ String.format(String.valueOf(min)) +":"+ String.format(String.valueOf(sec));
    }

//    public String toFormat(int x){
//        if (x == 0){
//            x = 00;
//        }
//        return null;
//    }

}
