public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private double totalWeight = 0;
    private int limit;

    public Basket (){
        items = "Список товаров: ";
        this.limit = 10000;
    }

    public Basket (int limit) {
        this ();
        this.limit = limit;
    }

    public Basket (String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = getTotalWeight ();
    }


    public void add (String name, int price, int count, double weight){
        if (contains(name)){
            return;
        }
        if (totalPrice + price >= limit){
            return;
        }
        items = items + "\n" + name + " - " + count + " шт " + price + " рублей " + weight + " грамм";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;


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

