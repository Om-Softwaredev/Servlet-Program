<%@ page language="java" isELIgnored='false' %>
    <h1>Working with Implicit object(9)...</h1>
    <h1>
        Session id is :: <%= session.getId() %><br />
            Is Session newly Created :: <%= session.isNew() %> <br />
                Session Time out is :: <%= session.getMaxInactiveInterval() %> seconds<br />
    </h1>