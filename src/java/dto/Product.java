package dto;
import java.io.Serializable;
public class Product implements Serializable{
    private String id,company_name,product_name,output,price;
    public Product() {
    }

    public Product(String id,String company_name,String product_name,String output,String price) {
        this.id = id;
        this.company_name = company_name;
        this.product_name = product_name;
        this.output = output;
        this.price = price;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
