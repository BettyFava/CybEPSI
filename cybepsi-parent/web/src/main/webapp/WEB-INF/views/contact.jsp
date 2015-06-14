<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd' >
<html>
  <head>
    <meta charset="UTF-8">
    <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js'></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
      <script src='/resources/js/js.js'></script>
    <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css'>
    <link rel='stylesheet' href='/resources/style/style.css'>
    <title>Projet SOA</title>
  </head>
  <body>
    <nav class='navbar navbar-default'>
      <div class='container-fluid'>
        <div class='navbar-header'>
          <a class='navbar-brand navbar-logo-div' href='#'>
            <img class='navbar-logo' src='/resources/img/SOASoftware.png'>
          </a>
          <button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='#projet-soa-navbar'>
            <span class='sr-only'>Toggle navigation</span>
            <span class='icon-bar'></span>
            <span class='icon-bar'></span>
            <span class='icon-bar'></span>
          </button>
          <a class='navbar-brand' href='#'>Projet SOA</a>
        </div>

        <div class='collapse navbar-collapse' id='projet-soa-navbar'>
          <ul id='menu' class='nav navbar-nav'>
            <li class='transition'><a href='index'>HOME </a></li>
            <li><a href='about' class='transition'>ABOUT US</a></li>
            <li class='active'><a href='#'>CONTACT <span class='sr-only'>(current)</span></a></li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container">
      <div id="contacts">
        <div class="row">
          <div class="col-sm-offset-3 col-sm-6">
            <form name="sentMessage" class="well" id="contactForm"  novalidate>
              <legend>Contactez nous</legend>
              <div class="control-group">
                <div class="controls">
                  <input type="text" class="form-control" placeholder="Votre nom" id="name"/>
                    <p class="help-block"></p>
                </div>
              </div>
              <div class="control-group">
                <div class="controls">
                  <input type="email" class="form-control" placeholder="Votre email" id="email" />
                </div>
              </div>

              <div class="control-group">
                <div class="controls">
                  <textarea rows="10" cols="100" class="form-control" placeholder="Votre message" id="message" maxlength="999" style="resize:none"></textarea>
                </div>
              </div>
              <div id="success"> </div> <!-- For success/fail messages -->
                <button type="submit" class="btn btn-primary pull-right">Send</button><br />
            </form>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
