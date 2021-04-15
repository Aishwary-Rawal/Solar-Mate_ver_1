package dao;
import dto.Company;
import java.sql.*;
import myconn.GetConnection;
import java.util.*;

public class AdminDao {
    public int adminLogin(String email,String password) throws SQLException
    {
        int i=0;
        Connection con = GetConnection.getConnect();
        String query = "select * from admin where email=? and password=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
            i=1;
        con.close();
        return i;
    }
    
    public List<Company> getCompanyList() throws SQLException
    {
        List<Company> list = new ArrayList<>();
        Connection con = GetConnection.getConnect();
        String query = "select * from company";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            Company r = new Company();
            r.setId(rs.getString(1));
            r.setName(rs.getString(2));
            r.setEmail(rs.getString(3));
            r.setPassword(rs.getString(4));
            r.setContact(rs.getString(5));
            r.setAddress(rs.getString(6));
            r.setVerificationstatus(rs.getString(7));
            list.add(r);
        }
        return list;
    }
    
    public int verifyCompany(String email) throws SQLException
    {
        int i=0;
        Connection con=GetConnection.getConnect();
        String query = "update company set verification status=? where email=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, "verified");
        ps.setString(2, email);
        i= ps.executeUpdate();
        con.close();
        return i;
    }
}
