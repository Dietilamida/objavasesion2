public class Precio {

    static double getPrice(double precio) {
        return precio*1.22;
    }

    public static void main(String[] args) {
        double precioIva = getPrice(10.89);
        System.out.println(precioIva);
    }
}
