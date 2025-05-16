import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcion=0;
        while (opcion != 7){
            System.out.println("******************************************");
            System.out.println("Sea bienvenido al conversor de moneda!!");
            System.out.println("\n1) Dolar =>> Peso Argentno");
            System.out.println("2) Peso Argentno =>> Dolar");
            System.out.println("3) Dolar =>> Real Brasileño");
            System.out.println("4) Real Brasileño =>> Dolar");
            System.out.println("5) Dolar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dolar");
            System.out.println("7) Salir");
            System.out.println("Elija una opcion valida: ");
            System.out.println("******************************************");
            opcion = input.nextInt();
            String direccion="";
            if(opcion != 7){
                ServiceAPI api = new ServiceAPI("b575db0233e6b2debd49edb2");
                System.out.println("Ingrese el valor a convertir");
                double valor = input.nextDouble();
                switch (opcion){
                    case 1:
                        System.out.println(api.obtenerTasaCambio("USD","ARS",valor));
                        break;
                    case 2:
                        System.out.println(api.obtenerTasaCambio("ARS","USD",valor));
                        break;
                   case 3:
                       System.out.println(api.obtenerTasaCambio("USD","BRL",valor));
                       break;
                    case 4:
                        System.out.println(api.obtenerTasaCambio("BRL","USD",valor));
                        break;
                    case 5:
                        System.out.println(api.obtenerTasaCambio("USD","COP",valor));
                        break;
                    case 6:
                        System.out.println(api.obtenerTasaCambio("COP","USD",valor));
                       break;
                }
            }
        }

    }
}