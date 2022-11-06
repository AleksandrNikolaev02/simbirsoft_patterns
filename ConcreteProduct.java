public class ConcreteProduct extends AbstractProduct{

    private int ProductWeight;

    public ConcreteProduct(QRCode qrCode, int ProductWeight) {
        super(qrCode);
        this.ProductWeight = ProductWeight;
    }

    @Override
    int getProductWeight() {
        return ProductWeight;
    }

}
