

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        // your code here

        Integer price = inventory.get(productId);
        if (price == null) {
            return -1;
        }

        return price;
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        // your code here
        List<String> products = new ArrayList<>();

        for (String product : inventory.keySet()) {
            if (inventory.get(product) == price) {
                products.add(product);
            }
        }
        return products; 
    }
}