<%@page import="dao.CompanyDao" %>
<jsp:useBean id="obj" class="dto.Company"></jsp:useBean>
<jsp:setProperty name="obj" property="*"></jsp:setProperty>

<%
    String email = request.getParameter("email");
    CompanyDao rd = new CompanyDao();
    int i = rd.addCompany(obj);
    if(i>0)
    {
        session.setAttribute("email", email);
%>
<script>alert("Company Registration Successfull");</script>
<jsp:include page="companyhome.jsp"></jsp:include>
<%}else{%>
<script>alert("Error Occured");</script>
<jsp:include page="index.jsp"></jsp:include>
<%}%>