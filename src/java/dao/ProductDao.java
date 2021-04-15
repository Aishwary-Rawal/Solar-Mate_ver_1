package dao;
import java.util.*;
import java.sql.*;
import myconn.GetConnection;
import dto.Product;
import java.util.UUID;
public class ProductDao {
  public int addProduct(Product obj) throws SQLException
    {
        int i=0;
        String id = UUID.randomUUID().toString();
        id = id.replaceAll("-", "");
        Connection con = GetConnection.getConnect();
        String query = "insert into product(id,company_name,product_name,output,price) values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setString(1, id );
        ps.setString(2, obj.getCompany_name());
        ps.setString(3, obj.getProduct_name());
        ps.setString(4, obj.getOutput());
        ps.setString(5, obj.getPrice());
        
        

        i = ps.executeUpdate();
        con.close();
        return i;
    }
    
    public List<Product> getProductList() throws SQLException
    {
       List<Product> list = new ArrayList<>();
        Connection con = GetConnection.getConnect();
        String query = "select * from product";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            Product v= new Product();
                v.setId(rs.getString(1));
                v.setCompany_name(rs.getString(2));
                v.setProduct_name(rs.getString(3));
                v.setOutput(rs.getString(4));
                v.setPrice(rs.getString(5));
                
            list.add(v);
        }
        return list;
    }  
}
