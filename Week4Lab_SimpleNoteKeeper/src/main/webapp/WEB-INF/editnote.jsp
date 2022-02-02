<%-- 
    Document   : editnote
    Created on : Feb. 1, 2022, 8:04:24 p.m.
    Author     : VNune
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edit Note</h1>
        <form action="note" method="post">
            <label for="title">Title</label> 
            <input type="text" name="title" id="title" placeholder="Title"><br>
            <label for="title">Contents</label>
            <input type="text" name="contents" id="contents" placeholder="Contents">
            
            <button type="submit">Submit</button>
            
        </form>
    </body>
</html>
