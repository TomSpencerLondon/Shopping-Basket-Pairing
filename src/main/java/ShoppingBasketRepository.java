public interface ShoppingBasketRepository {

  Basket findOrCreate(User user);

  void save(Basket basket);
}
