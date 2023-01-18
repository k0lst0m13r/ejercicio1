public class Main {
    public static void main(String[] args) {
        suma(3, 4, 7);
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();

    }

    public static void suma(int a,  int b, int c){
        int resultado;
        resultado = a + b + c;

        System.out.println(resultado);
    }
    static class Coche {
        public int puertas = 3;
         public void agregarPuerta(){
          this.puertas ++;
          System.out.println(puertas);
        }

    }

}