
import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class ToyStore { 
    private PriorityQueue<Toy> toyQueue;

    public ToyStore() {
        toyQueue = new PriorityQueue<>();
    }

    public void addToy(int id, String name, int frequency) {
        Toy toy = new Toy(id, name, frequency);
        toyQueue.add(toy);
    }

    public void raffleToys(int times, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 0; i < times; i++) {
                Toy toy = toyQueue.poll();
                if (toy != null) {
                    writer.write(toy.toString() + "\n");
                    toyQueue.add(toy); //Add the toy back to the queue
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}