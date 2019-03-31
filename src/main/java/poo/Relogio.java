package poo;

public class Relogio {

    private int sec;
    private int min;
    private int hora;

    public boolean setSec(int sec){
        if ((sec >= 0)&&(sec <= 60)){
            this.sec = sec;
            return true;
        }else{
            this.sec = 0;
            return false;
        }
    }

    public boolean setMin(int min) {
        if ((min >= 0) && (min <= 60)) {
            this.min = min;
            return true;
        }else{
            this.min = 0;
            return false;
        }
    }

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
        return hora +":"+ min +":"+ sec;
    }

    public void toFormat(int x){
        if (x == 0){
            x = 00;
        }
    }

}
