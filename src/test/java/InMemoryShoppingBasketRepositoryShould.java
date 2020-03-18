import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryShoppingBasketRepositoryShould {


  @Test
  void creates_a_basket_attached_to_a_user() {
    User user = new User("ABC123");
    InMemoryShoppingBasketRepository repository = new InMemoryShoppingBasketRepository();
    Product product = new Product("ABC678", "bike", 5);

    repository.addToBasket(user, product, 1);

    assertNotNull(repository.getBasketBy(user));
  }
}