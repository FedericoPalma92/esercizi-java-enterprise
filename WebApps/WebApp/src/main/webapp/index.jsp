
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
				<form method="post" action="MyServlet">
					<div class="form-group">
						<label for="nome">Nome</label> 
						<input type="text" class="form-control" id="nome" name="nome">
					</div>
					<div class="form-group">
						<label for="cognome">Cognome</label> 
						<input type="text" class="form-control" id="cognome" name="cognome">
					</div>
					<div class="form-group">
						<label for="email">Email</label> 
						<input type="email" class="form-control" id="email" name="email">
					</div>
					<div class="form-group">
						<label for="eta">Eta</label> 
						<input type="number" class="form-control" id="eta" name="eta">
					</div>
					<div class="form-group">
						<label for="sesso">Sesso</label>
						<div class="radio">
							<label><input type="radio" name="sesso" value="M">Maschio</label>
						</div>
						<div class="radio">
							<label><input type="radio" name="sesso" value="F">Femmina</label>
						</div>
					</div>
					<div class="form-group">
						<label for="dataNascita">Data di nascita</label> 
						<input type="date" class="form-control" id="dataNascita" name="dataNascita">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>