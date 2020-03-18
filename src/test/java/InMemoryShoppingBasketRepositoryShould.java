import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryShoppingBasketRepositoryShould {

    @Test
    public void find_a_basket_by_user() {
        InMemoryShoppingBasketRepository repo = new InMemoryShoppingBasketRepository();
        User user = new User("123");
        Basket basket = repo.findOrCreate(user);
        assertNotNull(basket);
        assertEquals(user, basket.getUser());
    }

    @Test
    public void save_basket() {
        InMemoryShoppingBasketRepository repo = new InMemoryShoppingBasketRepository();
        User user = new User("456");

        Basket basket = new Basket(user);
        repo.save(basket);

        assertEquals(basket, repo.findOrCreate(user));
    }

}