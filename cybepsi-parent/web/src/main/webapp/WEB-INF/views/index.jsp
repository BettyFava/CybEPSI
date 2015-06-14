<!DOCTYPE html>
<html lang="fr">

	<head>

		<meta charset="utf-8">
		<title>Mon application</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="Connexion à mon application">
		<link rel="stylesheet" type="text/css" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" />
    	 <link rel='stylesheet' href='/resources/style/index.css'>

		<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />
		<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lato:400,700,300" />
		<script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

	</head>

	<body>
		<div class="container">
			<div class="row">
				<div class="col-xs-12">
					<div class="main">
						<div class="row">
							<div class="col-xs-12 col-sm-6 col-sm-offset-1">
								<h1>Projet SOA</h1>
								<h2>Bienvenue sur notre projet de SOA.</h2>
								<form action="/users/login" name="login" role="form" class="form-horizontal" method="post" accept-charset="utf-8">
									<div class="form-group">
									<div class="col-md-8"><input name="username" placeholder="Identifiant" class="form-control" type="text" id="UserUsername"/></div>
									</div>
									<div class="form-group">
									<div class="col-md-8"><input name="password" placeholder="Mot de passe" class="form-control" type="password" id="UserPassword"/></div>
									</div>
									<div class="form-group">
									<div class="col-md-offset-0 col-md-8"><a class="btn btn-success btn btn-success" href="home">Connexion</a></div>
									</div>
								</form>
								<p class="credits">Développé par l'équipe n°2.</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>

</html>
