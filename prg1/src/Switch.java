public class Switch {
    public static void main(String[] args) {
        int dia = 1;
        String nombreDia = "";

        switch (dia){
            case 1: nombreDia = "Lunes";
            break;

            case 2: nombreDia = "Martes";
            break;

            case 3: nombreDia = "Miércoles";
            break;

            case 4: nombreDia = "Jueves";
            break;

            case 5: nombreDia = "Viernes";
            break;

            case 6: nombreDia = "Sábado";
            break;

            case 7: nombreDia = "Domingo";
            break;

            default: nombreDia = "número de dia no válido";
            break;
        }

        System.out.println("Hoy es " + nombreDia);
    }
}