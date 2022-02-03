public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private double totalWeight = 0;
    private int limit;

    public Basket (int totalPriceLimit) {

        limit = totalPriceLimit;
    }

    public void add (String name, int price, double Weight) {
        if (contains(name)){
            return;
        }
        if (totalPrice + price >= limit){
            return;
        }
        items = items + "\n" + name + "-" + price + " рублей " + Weight + " грамм";
        totalPrice = totalPrice + price;
        totalWeight = totalWeight + Weight;
    }
    public boolean contains (String name) {
        return items.contains (name);
    }
    public void clear () {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }
    public int getTotalPrice () {
        return totalPrice;
    }
    public double getTotalWeight (){
        return totalWeight;
    }
    public void print (String tittle) {
        System.out.println(tittle);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}

