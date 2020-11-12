import java.util.Random;

 public class Luchador extends Thread {

     Cuadrilatero cuadrilatero;
     public Luchador(Cuadrilatero cuadrilatero) {
         this.cuadrilatero = cuadrilatero;
     }
        @Override
        public void run() {
            try {
                cuadrilatero.comenzarPelea(this);
                int duracion = new Random().nextInt(4000) + 1000;
                System.out.println("Soy el "+getName()+" voy a ganar!! en "+ duracion);
                sleep(duracion);
                System.out.println(getName()+" ha perdido, que entre el siguiente");
                cuadrilatero.terminarPelea(this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

