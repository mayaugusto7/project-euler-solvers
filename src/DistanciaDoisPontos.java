/**
 * Created by MayconRibeiro on 26/12/16.
 */
public class DistanciaDoisPontos {

    private static final Double R = 6371.0;

    public static Double distanciaPontosGPS(Double p1LA, Double p1LO,  Double p2LA, Double p2LO) {

        p1LA = p1LA * Math.PI / 180.0;
        p1LO = p1LO * Math.PI / 180.0;
        p2LA = p2LA * Math.PI / 180.0;
        p2LO = p2LO * Math.PI / 180.0;

        Double dLat = p2LA - p1LA;
        Double dLong = p2LO - p1LO;

        Double a =  Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                    Math.cos(p1LA) * Math.cos(p2LA) * Math.sin(dLong / 2) * Math.sin(dLong / 2);

        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return Double.valueOf(Math.round(R * c * 1000)); // resultado em metros.
    }

    public static void main(String[] args) {


    }

}
