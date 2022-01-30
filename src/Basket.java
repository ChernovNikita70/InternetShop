public class Basket {
    private static String items = "";
    private static int totalPrice = 0;
    private static double totalWeight = 0;

    public static void main (String[] args){
        add ("Колбаса",76, 300);
        add ("Мясо", 300, 200);
        add ("Молоко", 120, 200);
        print ("Содержимое корзины:");
        System.out.println ("Общая стоимость товаров - " + getTotalPrice() + " рублей");
        System.out.println ("Общая масса товаров - " + getTotalWeight() + " грамм");
        clear();
        System.out.println ("Общая масса товаров - " + getTotalWeight() + " грамм");
        System.out.println ("Общая стоимость товаров - " + getTotalPrice() + " рублей");
        print("Содержимое корзины:");
    }
    public static void add (String name, int price, double Weight) {
        if (contains(name)){
            return;
        }
        items = items + "\n" + name + "-" + price + " рублей " + Weight + " грамм";
        totalPrice = totalPrice + price;
        totalWeight = totalWeight + Weight;
    }
    public static boolean contains (String name) {
        return items.contains (name);
    }
    public static void clear () {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }
    public static int getTotalPrice () {
        return totalPrice;
    }
    public static double getTotalWeight (){
        return totalWeight;
    }
    public static void print (String tittle) {
        System.out.println(tittle);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
