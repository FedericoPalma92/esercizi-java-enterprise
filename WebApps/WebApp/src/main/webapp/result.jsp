<%@ page language="java" 
	import="it.its.webapp.domain.*,java.util.ArrayList,java.util.List"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrazione Avvenuta con successo</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	
	<div class="container">
		<div class="row">
			<div class="col-12">
				<%
				Utente utente = (Utente) request.getAttribute("utente");
				if (utente != null) {
				%>
							<h1>Registrazione avvenuta con successo</h1>
							<table class="table table-bordered">
								<tr>
									<td>Nome</td>
									<td><%=utente.getNome()%></td>
								</tr>
								<tr>
                                    <td>Cognome</td>
                                    <td><%=utente.getCognome()%></td>
                                </tr>
                                <tr>
                                    <td>Email</td>
                                    <td><%=utente.getEmail()%></td>
                                </tr>
                                <tr>
                                    <td>Età</td>
                                    <td><%=utente.getEta()%></td>
                                </tr>
                                <tr>
                                    <td>Sesso</td>
                                    <td><%=utente.getSesso().equals("M") ? "Maschio":"Femmina"%></td>
                                </tr>
                                <tr>
                                    <td>Data di nascita</td>
                                    <td><%=utente.getDataDiNascita()%></td>
                                </tr>
							</table>
						<%
					}
				%>
			</div>
		</div>
	</div>
	
	
</body>
</html>