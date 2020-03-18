import java.util.HashMap;
import java.util.Map;

public class InMemoryShoppingBasketRepository implements ShoppingBasketRepository {
  private Map<User, Basket> baskets;

  public InMemoryShoppingBasketRepository() {
    this.baskets = new HashMap<>();
  }

  public void addToBasket(User user, Product product, int quantity) {
    Basket basket = new Basket();
    baskets.put(user, basket);
  }

  public Basket getBasketBy(User user) {
    return baskets.get(user);
  }
}
