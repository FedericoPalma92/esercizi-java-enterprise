
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<h1>REGISTRAZIONE</h1>
				<%
				String errore = (String) request.getAttribute("error");
				if (errore != null) {
					%>
					<div class="alert alert-danger" role="alert">
                        <%=errore%>
                    </div>
                    <%
				}
				%>
				<form method="post" action="MyServlet">
					<div class="form-group">
						<label for="nome">Nome</label> 
						<input type="text" class="form-control" id="nome" name="nome">
					</div>
					<div class="form-group">
						<label for="cognome">Cognome</label> 
						<input type="text" class="form-control" id="cognome" name="cognome">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>