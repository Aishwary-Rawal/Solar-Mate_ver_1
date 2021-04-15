<%@page import="dao.CustomerDao" %>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    CustomerDao ad = new CustomerDao();
    int i = ad.customerLogin(email,password);
    if(i>0)
    {
        session.setAttribute("email", email);
%>
<script>alert("Customer Login Successfull")</script>
<jsp:include page="customerhome.jsp"></jsp:include>
<%}else{%>
<script>alert("Error occured")</script>
<jsp:include page="customerlogin.jsp"></jsp:include>
<%}%>