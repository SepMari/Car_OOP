package autoracing;

import java.util.ArrayDeque;
import java.util.Queue;

public class Maintenance {

    private Queue<Transport> transports = new ArrayDeque<>();

    private void add (Transport transport) {
        transports.offer(transport);
    }

    public void addCar (Car car) {
        add(car);
    }

    public void addTrain (Train train) {
        add(train);
    }

    public void service () {
        if (!transports.isEmpty()) {
            Transport transport = transports.poll();
            boolean result = transport.service();
            if (!result) {
                transport.fixTransport();
            }
        }
    }
}
