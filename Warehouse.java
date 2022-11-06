public class Warehouse implements Store {
    private final int ShelfWeightMax = 20;
    private final int PalletWeightMax = 200;

    public void placing(ConcreteProduct product) {
        int weight = product.getProductWeight();
        String category = product.getProductCategory();
        if(weight <= ShelfWeightMax)
            System.out.println("Размещение на полке");
        else if(weight > ShelfWeightMax & weight <= PalletWeightMax)
            System.out.println("Размещение на палете");
            else System.out.println("Размещение на полу");

        if(category == "продукты") {
            product.setProductType("скоропортящийся");
            System.out.println("скоропортящийся");
        }
        else if(category == "хозтовары") {
            product.setProductType("Ручное определение");
            System.out.println("Ручное определение");
        }
        else {
            product.setProductType("НЕскоропортящийся");
            System.out.println("НЕскоропортящийся");
        }
    }

}

