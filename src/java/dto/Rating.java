package dto;
import java.io.Serializable;
public class Rating implements Serializable{
    private String company_name;
    private int rating;
    public Rating() {
    }

    public Rating(String company_name,int rating) {
        
        this.company_name = company_name;
        this.rating = rating;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
