public class QRCode {
    private String ProductType;
    private String ProductCategory;

    public QRCode(String ProductType, String ProductCategory) {
        this.ProductCategory = ProductCategory;
        this.ProductType = ProductType;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String type) {
        this.ProductType = type;
    }

    public String getProductCategory() {
        return ProductCategory;
    }
}
