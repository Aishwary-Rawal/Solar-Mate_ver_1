package dao;
import java.util.*;
import java.sql.*;
import myconn.GetConnection;
import dto.Rating;
public class RatingDao {
    public int addRating(Rating obj, int rate) throws SQLException {
        int i=0;
        
        Connection con = GetConnection.getConnect();
        String query = "select rating,no_of_rating from rating where company_name=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, obj.getCompany_name());
        ResultSet rs = ps.executeQuery();
        int r = rs.getInt(1);
        int nor = (rs.getInt(2))+1;
        rate=(rate+r)/nor;
        String query1 ="update rating set rating =?,no_of_rating=? where company_name=?";
        PreparedStatement ps1 = con.prepareStatement(query1);
        ps1.setInt(1, rate);
        ps1.setInt(2, nor);
        ps1.setString(3, obj.getCompany_name());
        i= ps.executeUpdate();
        con.close();
        return i;
    }
}
