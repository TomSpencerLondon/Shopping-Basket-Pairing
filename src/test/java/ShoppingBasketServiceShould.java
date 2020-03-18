import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ShoppingBasketServiceShould {

    @Mock
    private ShoppingBasketRepository repository;

    @Mock
    private Basket basket;
    private ShoppingBasketService service;
    private User user;
    private Product product;
    private int quantity;

    @BeforeEach
    void setUp() {
        user = new User("ABC123");
        product = new Product("ABC789", "Bike", 5);
        quantity = 5;
        service = new ShoppingBasketService(repository);
    }

    @Test
    void addItem_retrieves_basket() {
        given(repository.findOrCreate(user)).willReturn(basket);

        service.addItem(user, product, quantity);

        verify(repository).findOrCreate(user);
    }


    @Test
    void addItem_adds_product_to_basket() {
        given(repository.findOrCreate(user)).willReturn(basket);

        service.addItem(user, product, quantity);

        verify(basket).addItem(product, quantity);
    }

    @Test
    void addItem_saves_basket_to_repo() {
        given(repository.findOrCreate(user)).willReturn(basket);

        service.addItem(user, product, quantity);

        verify(repository).save(basket);
    }


}
