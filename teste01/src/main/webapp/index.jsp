<%@page import="java.util.*, java.text.SimpleDateFormat"%>
<html>
<body>
<h2>Teste 03</h2>

<%
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	out.println("Data corrente: " + sdf.format(new Date()));
%>

</body>
</html>
