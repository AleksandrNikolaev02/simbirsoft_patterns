package abstracts;


import storage.QRCode;

public abstract class AbstractProduct {
    private QRCode qrCode;
    
    public AbstractProduct(QRCode qrCode){
        this.qrCode = qrCode;
    }

    public final void find() {
        getProductType();
        getProductCategory();
        getProductWeight();
    }

    public String getProductType() {
        return qrCode.getProductType();
    }

    public String getProductCategory() {
        return qrCode.getProductCategory();
    }

    public void setProductType(String type) {
        qrCode.setProductType(type);
    }

    abstract public int getProductWeight();
}
