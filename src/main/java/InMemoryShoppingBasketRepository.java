public class InMemoryShoppingBasketRepository implements ShoppingBasketRepository {

  // attribute stored baskets
  // HashSet(key = userID, value = basket)

  public void addToBasket(User user, Product product, int quantity) {
    // Add basket to the HashSet with UserID

  }

  public Basket getBasketBy(User user) {
    throw new UnsupportedOperationException();
  }
}
