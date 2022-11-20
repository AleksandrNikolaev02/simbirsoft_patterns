package concrets;


import abstracts.AbstractProduct;
import storage.QRCode;

public class ConcreteProduct extends AbstractProduct{

    private int ProductWeight;

    public ConcreteProduct(QRCode qrCode, int ProductWeight) {
        super(qrCode);
        this.ProductWeight = ProductWeight;
    }

    @Override
    public int getProductWeight() {
        return ProductWeight;
    }

}
