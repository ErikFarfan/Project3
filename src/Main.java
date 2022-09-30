public class Main {
    public static void main(String[] args) {

        System.out.println(suma(10,5,6));

        Coche myCoche = new Coche(); // se instancea la clase para que ocupe menos memoria
        myCoche.adicionarPuertas();
        myCoche.adicionarPuertas();
        System.out.println(myCoche.puertas);
    }

    public static int suma(int a,int b,int c) {
        return (a+b+c);}
}
class Coche {
    public int puertas=0;
    public void adicionarPuertas(){
        this.puertas++;
    }
}






