package dao;
import java.util.*;
import java.sql.*;
import myconn.GetConnection;
import dto.Customer;
import java.util.UUID;
public class CustomerDao {
 public int addCustomer(Customer obj) throws SQLException
    {
        int i=0;
        String id = UUID.randomUUID().toString();
        id = id.replaceAll("-", "");
        Connection con = GetConnection.getConnect();
        String query = "insert into customer(id,name ,email,password,contact,address,ivrs_no) values (?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setString(1, id );
        ps.setString(2, obj.getName());
        ps.setString(3, obj.getEmail());
        ps.setString(4, obj.getPassword());
        ps.setString(5, obj.getContact());
        ps.setString(6, obj.getAddress());
        ps.setString(7, obj.getIvrs_no());
        

        i = ps.executeUpdate();
        con.close();
        return i;
    }
    
   public int customerLogin(String email,String password) throws SQLException
    {
        int i=0;
        Connection con = GetConnection.getConnect();
        String query = "select * from customer where email=? and password=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2, password);
        
        
        ResultSet rs = ps.executeQuery();
        if(rs.next())
            i=1;
        con.close();
        return i;
    } 
   public int calculateLoad(String sanction_load,String consumption1,String consumption2,String consumption3,String consumption4,String consumption5,String consumption6){
       int sl = Integer.parseInt(sanction_load);
       int c1 = Integer.parseInt(consumption1);
       int c2 = Integer.parseInt(consumption2);
       int c3 = Integer.parseInt(consumption3);
       int c4 = Integer.parseInt(consumption4);
       int c5 = Integer.parseInt(consumption5);
       int c6 = Integer.parseInt(consumption6);
       int sum = c1+c2+c3+c4+c5+c6;
       int i=sum/720;
       if(i>=sl)
           return sl;
       else
           return i;
   }
}
