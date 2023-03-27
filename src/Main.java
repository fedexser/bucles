public class Main {
    public static void main(String[] args) {

        int numeroIf= -1;

        if(numeroIf>0){
            System.out.println("El numero es Positivo");
        }
        else{
            System.out.println("El numero es Negativo");
        }

        int numeroWhile= 0;
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println("El numero While es: "+numeroWhile);
        }

        int numeroDoWhile= 4;
        do{
            System.out.println("El numero Do While es: "+numeroDoWhile);
            numeroDoWhile++;

        }while(numeroDoWhile<5);

        int numeroFor= 0;

        for(;numeroFor<=3;numeroFor++){
            System.out.println("El numero For es: "+numeroFor);
        }

        var estacion= "verano";
        switch(estacion){
            case "verano":
                System.out.println("Estamos en Verano");
                break;

            case "primavera":
                System.out.println("Estamos en Primavera");
                break;

            case "invierno":
                System.out.println("Estamos en Invierno");
                break;

            case "otoño":
                System.out.println("Estamos en Otoño");
                break;

            default:
                System.out.println("No es una Estacion Valida");
        }
    }
}