<%@ page language="java" 
	import="it.its.webapp.domain.*,java.util.ArrayList,java.util.List"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
	List<Utente> users = (List<Utente>) request.getAttribute("utenti");
	%>
	<p>Utenti registrati:</p>
	<table>
	<%
		for(Utente u : users) {
			%>

			<tr>
				<td><%= u.getNome() %></td>
				<td><%= u.getCognome() %></td>
			</tr>
			<%
        }
	%>
	</table>
	
</body>
</html>