public class ShoppingBasketService {

    private ShoppingBasketRepository shoppingBasketRepository;

    public ShoppingBasketService(ShoppingBasketRepository shoppingBasketRepository) {
        this.shoppingBasketRepository = shoppingBasketRepository;
    }

    public void addItem(User user, Product product, int quantity) {
        Basket basket = shoppingBasketRepository.findOrCreate(user);
        basket.addItem(product, quantity);
        shoppingBasketRepository.save(basket);
    }

    public Basket basketFor(User user) {
        throw new UnsupportedOperationException();
    }
}
