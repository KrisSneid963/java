public class OneItemBox extends Box {
    private Item storedItem;

    public OneItemBox() {
        this.storedItem = null;
    }

    @Override
    public void add(Item item) {
        if (this.storedItem == null) {
            this.storedItem = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return storedItem != null && storedItem.equals(item);
    }
}
