import javax.xml.transform.TransformerException;

public class Main {
    public static void main(String[] args) {

        Transport[] transports = new Transport[]{
                new Car("car1", 4),
                new Car("car2", 4),

            new Truck("truck1", 6),
            new Truck("truck2", 8),

            new Bicycle("bicycle1", 2),
            new Bicycle("bicycle2", 2)
        };

        ServiceStation station = new ServiceStation();
        for (int i = 0; i < transports.length; i++) {
            Transport tmp = transports[i];
            if (i == 0 || i == 1) {
                Car car = new Car(tmp.getModelName(), tmp.getWheelsCount());
                station.check(car, null, null);
            }
            if (i==2 || i==3) {
                Truck truck = new Truck(tmp.getModelName(), tmp.getWheelsCount());
                station.check(null, null, truck);
            }
            if (i==4 || i==5) {
                Bicycle bicycle = new Bicycle(tmp.getModelName(), tmp.getWheelsCount());
                station.check(null, bicycle, null);
            }
        }
    }
}