<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Umera: Ask</title>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link  rel="stylesheet" href="Hstyle.css">
  <link  rel="stylesheet" href="qstyle.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="header">
    <div class="container-fluid">
    <nav class="navbar navbar-inverse navbar-centre navbar-fixed-top">
      <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Umera</a>
    </div>
    <ul class="nav navbar-nav navbar-centre">
      <li class="active"><a href="home.jsp"><span class="glyphicon glyphicon-home"></span> Home</a></li>
      <li><a href="Answer.jsp"><span class="glyphicon glyphicon-edit"></span> Answer</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="Question.jsp">Add Question <span class="glyphicon glyphicon-plus"></span></a></li>
      <li><a href="logout.jsp">Logout <span class="glyphicon glyphicon-log-out"></span></a></li>

    </ul>
    <form class="navbar-form navbar-right" method="get" action="/search.jsp">
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search" name="search">
        <div class="input-group-btn">
          <button class="btn btn-default" type="submit">
            <i class="glyphicon glyphicon-search"></i>     </button>
                      </div>
                    </div>
                </form>
              </div>
            </nav>
          </div>
        </div>





<div class="container contact-form">
            <div class="contact-image">
                <img src="https://image.ibb.co/kUagtU/rocket_contact.png" alt="rocket_contact"/>
            </div>
            <form method="post" action="QuestionDao.java">
                <h3>Drop Us a Message</h3>
               <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
                            <input type="text" name="q_title" class="form-control" placeholder="Your Name *" value="" />
                        </div>
                        <div class="form-group">
                            <input type="text" name="q_postedby" class="form-control" placeholder="Your Email *" value="" />
                        </div>
                        <div class="form-group">
                            <textarea name="q_txt" class="form-control" placeholder="Your Question *" style="width: 100%; height: 150px;"></textarea>
                        </div>
                        
                        <div class="form-group">
                            <input type="submit" name="btnSubmit" class="btnContact" value="Ask" />
                        </div>
                    </div>
                    
                </div>
            </form>
</div>
</body>
</html>