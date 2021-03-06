package webshop.objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class representing one product.
 */
@Entity
public class Product {
    /**
     * The ID of the product.
     */
    @Id
    @GeneratedValue
    private long id;
    /**
     * The Price of the product.
     */
    private  int price;
    /**
     * The name of the product.
     */
    private  String productName;
    /**
     * The description of the product.
     */
    private String description;
    /**
     * The image source of the product.
     */
    private  String imgSrc;

    public Product() {
    }

    public Product(int price, String productName, String description, String src) {
        this.price = price;
        this.productName = productName;
        this.description = description;
        this.imgSrc = src;
    }

    public Product(int id, int price, String productName, String description, String src) {
        this.price = price;
        this.productName = productName;
        this.description = description;
        this.imgSrc = src;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }
}
