public interface ShoppingBasketRepository {
  void addToBasket(User user, Product product, int quantity);

  Basket getBasketBy(User user);
}
