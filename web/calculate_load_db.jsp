<%@page import="dao.CustomerDao" %>
<%
    String sanction_load = request.getParameter("sanction_load");
    String consumption1 = request.getParameter("consumption1");
    String consumption2 = request.getParameter("consumption2");
    String consumption3 = request.getParameter("consumption3");
    String consumption4 = request.getParameter("consumption4");
    String consumption5 = request.getParameter("consumption5");
    String consumption6 = request.getParameter("consumption6");
    
    CustomerDao ad = new CustomerDao();
    int i = ad.calculateLoad(sanction_load,consumption1,consumption2,consumption3,consumption4,consumption5,consumption6);
    if(i>0)
    {
        session.setAttribute("load",i);
%>
<script>alert("Calculated load is: "+<%= session.getAttribute("load")%>);</script>
<jsp:include page="customerhome.jsp"></jsp:include>
<%}else{%>
<script>alert("Error occured");</script>
<jsp:include page="customerlogin.jsp"></jsp:include>
<%}%>