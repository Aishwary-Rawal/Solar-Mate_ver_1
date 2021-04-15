<%@page import="dao.CustomerDao" %>
<jsp:useBean id="obj" class="dto.Customer"></jsp:useBean>
<jsp:setProperty name="obj" property="*"></jsp:setProperty>

<%
    String email = request.getParameter("email");
    CustomerDao rd = new CustomerDao();
    int i = rd.addCustomer(obj);
    if(i>0)
    {
        session.setAttribute("email", email);
%>
<script>alert("Customer Registration Successfull");</script>
<jsp:include page="customerhome.jsp"></jsp:include>
<%}else{%>
<script>alert("Error Occured");</script>
<jsp:include page="customer_reg.jsp"></jsp:include>
<%}%>