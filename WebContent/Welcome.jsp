<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
    if(session.getAttribute("login")==null || session.getAttribute("login")=="")
    {
        response.sendRedirect("index.jsp");
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link  rel="stylesheet" href="Hstyle.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="grid-container">
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
                <div class="left" style="background-color:#FAFAFA;">
                  <h4>Why Umera Exists</h4>
                  <p>Umera’s mission is to share and grow the world’s knowledge.<br>
                     A vast amount of the knowledge that would be valuable to many<br>
                      people is currently only available to a few — either<br>
                       locked in people’s heads, or only accessible to<br>
                        select groups. We want to connect the people<br>
                         who have knowledge to the people who need it,<br>
                         to bring together people with different perspectives<br>
                          so they can understand each other better, and to<br>
                          empower everyone to share their knowledge for the<br>
                          benefit of the rest of the world.
                    <p>
                </div>
                <div class="middle" style="background-color:#FAFAFA;">Recently Featured questions</div>


</div>

</body>
</html>