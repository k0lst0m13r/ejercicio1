public class Main {
    public void main(String[] args) {
        suma(3, 4, 7);
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.agregarPuerta());
    }

    public static void suma(int a,  int b, int c){
        int resultado;
        resultado = a + b + c;

        System.out.println(resultado);
    }
    class Coche {
        public int puertas = 3;
        public int agregarPuerta(){

            return this.puertas ++;
        }

    }

}