import java.util.HashMap;
import java.util.Map;

public class InMemoryShoppingBasketRepository implements ShoppingBasketRepository {

    private Map<User, Basket> baskets;

    public InMemoryShoppingBasketRepository() {
        this.baskets = new HashMap<>();
    }

    public Basket findOrCreate(User user) {
        return baskets.getOrDefault(user, new Basket(user));
    }

    public void save(Basket basket) {
      baskets.put(basket.getUser(), basket);
    }
}
