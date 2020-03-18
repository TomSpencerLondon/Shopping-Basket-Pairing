import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceTest {

    @Test
    void shopping_basket_returns_products_added() {
        User user = new User("ABC1234");
        ShoppingBasketRepository shoppingBasketRepository = new InMemoryShoppingBasketRepository();
        ShoppingBasketService shoppingBasketService = new ShoppingBasketService(shoppingBasketRepository);
        Product hobbit = new Product("10002", "The Hobbit", 5);
        Product breakingBad = new Product("20110", "Breaking Bad", 7);

        shoppingBasketService.addItem(user, hobbit, 2);
        shoppingBasketService.addItem(user, breakingBad, 5);

        Basket basket = shoppingBasketService.basketFor(user);
        assertEquals("01/01/2020\n" +
                "2 x The Hobbit // 2 x 5.00 = £10.00\n" +
                "5 x Breaking Bad // 5 x 7.00 = £35.00\n" +
                "Total: £45.00", basket.toString());
    }
}
