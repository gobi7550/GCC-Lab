<html>
    <head>
        <title>Enter two numbers to add up</title>
    </head>
    
    <body>
       
    <%= "<h3> Addition: "+(Integer.parseInt(request.getParameter("t1"))+Integer.parseInt(request.getParameter("t2")))+"</h1>"%>
    <%= "<h3> Subtraction: "+(Integer.parseInt(request.getParameter("t1"))-Integer.parseInt(request.getParameter("t2")))+"</h1>"%>
    <%= "<h3> Multiplication: "+(Integer.parseInt(request.getParameter("t1"))*Integer.parseInt(request.getParameter("t2")))+"</h1>"%>
     </body>
</html>
