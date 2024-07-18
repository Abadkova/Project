public class Main {
  public static void main(String[] args) {
      ToyStore store = new ToyStore();
      store.addToy(1, "Медведь", 10);
      store.addToy(2, "Кукла", 5);
      store.addToy(3, "Машинка", 20);

      store.raffleToys(19, "raffle_result.txt");
  }  
}
