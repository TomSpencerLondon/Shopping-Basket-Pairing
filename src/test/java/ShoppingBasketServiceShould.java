import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ShoppingBasketServiceShould {
  @Mock
  ShoppingBasketRepository repository;

  @Test
  void add_an_item_to_basket_repository() {
    ShoppingBasketService service = new ShoppingBasketService(repository);
    User user = new User("ABC123");
    Product product = new Product("ABC789", "Bike", 5);
    int quantity = 1;
    service.addItem(user, product, quantity);

    verify(repository).addToBasket(user, product, quantity);
  }
}
