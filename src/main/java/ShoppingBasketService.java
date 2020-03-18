public class ShoppingBasketService {
    private ShoppingBasketRepository shoppingBasketRepository;

    public ShoppingBasketService(ShoppingBasketRepository shoppingBasketRepository) {

        this.shoppingBasketRepository = shoppingBasketRepository;
    }

    public void addItem(User user, Product product, int quantity) {
        shoppingBasketRepository.addToBasket(user, product, quantity);
    }

    public Basket basketFor(User user) {
        throw new UnsupportedOperationException();
    }
}
