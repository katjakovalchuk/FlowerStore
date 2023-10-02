package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.store.filters.SearchFilter;
import flower.store.items.Item;

public class Store {
    public List<Item> items;

    public List<Item> search(SearchFilter searchFilter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items) {
            if (searchFilter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
