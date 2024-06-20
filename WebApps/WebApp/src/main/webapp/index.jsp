
<%@ page language="java" 
    import="it.its.webapp.domain.*,java.util.ArrayList,java.util.List"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrazione Utente</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<h1>REGISTRAZIONE</h1>
				<%
					List<String> errori = (List<String>) request.getAttribute("errori");
					Utente utente = (Utente) request.getAttribute("utente");
					if(errori != null && !errori.isEmpty()){
						%>
						<div class="text-danger">
							<h4>Correggere i seguenti errori:</h4>
							<ul>
                                <%
                                    for(String errore : errori){
                                        %>
                                        <li><%= errore %></li>
                                        <%
                                    }
                                %>
                            </ul>
						</div>
						
						<%
					}
				%>
				
				
				<form method="post" action="MyServlet">
					<div class="form-group">
						<label for="nome">Nome</label> 
						<input type="text" class="form-control" id="nome" name="nome" value="<%=utente!= null ? utente.getNome():""%>">
					</div>
					<div class="form-group">
						<label for="cognome">Cognome</label> 
						<input type="text" class="form-control" id="cognome" name="cognome" value="<%=utente!= null ? utente.getCognome():""%>">
					</div>
					<div class="form-group">
						<label for="email">Email</label> 
						<input type="email" class="form-control" id="email" name="email" value="<%=utente!= null ? utente.getEmail():""%>">
					</div>
					<div class="form-group">
						<label for="eta">Eta</label> 
						<input type="number" class="form-control" id="eta" name="eta" value="<%=utente!= null ? utente.getEta():""%>">
					</div>
					<div class="form-group">
						<label for="sesso">Sesso</label>
						<div class="radio">
							<label><input type="radio" name="sesso" value="M" <%=utente != null ? (utente.getSesso()!= null && utente.getSesso().equals("M")) ? "checked":"" : ""%>>Maschio</label>
						</div>
						<div class="radio">
							<label><input type="radio" name="sesso" value="F" <%=utente != null ? (utente.getSesso()!= null && utente.getSesso().equals("F")) ? "checked":"" : ""%>>Femmina</label>
						</div>
					</div>
					<div class="form-group">
						<label for="dataNascita">Data di nascita</label> 
						<input type="date" class="form-control" id="dataNascita" name="dataNascita" value="<%=utente!= null ? utente.getDataDiNascita() :""%>">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>