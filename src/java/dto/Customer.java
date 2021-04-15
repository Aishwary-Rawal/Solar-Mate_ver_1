package dto;
import java.io.Serializable;
public class Customer implements Serializable{
    private String id,name,email,password,address,contact, ivrs_no;
    public Customer() {
    }

    public Customer(String id,String name, String email, String password,String contact,String address, String ivrs_no) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.address = address;
        this.ivrs_no = ivrs_no;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getIvrs_no() {
        return ivrs_no;
    }

    public void setIvrs_no(String ivrs_no) {
        this.ivrs_no = ivrs_no;
    }
    
}
