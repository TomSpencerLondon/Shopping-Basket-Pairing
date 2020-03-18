public class Basket {

    private User user;

    public Basket(User user) {
        this.user = user;
    }

    public void addItem(Product product, int quantity) {
        throw new UnsupportedOperationException();
    }

    public User getUser() {
        return user;
    }
}
