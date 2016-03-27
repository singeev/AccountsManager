<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

    <h1 align="center">Oops!</h1>
    <h2 align="center">404 Not Found</h2>
    <p align="center">Sorry, an error has occured, Requested page not found!</p>
    <div class="error-actions" style="margin-top:15px;margin-bottom:15px;" align="center">
        <a href="${pageContext.request.contextPath}/accounts" class="btn btn-primary btn-lg" style="margin-right:10px;"><span class="glyphicon glyphicon-home"></span> Take Me Home </a>
        <a href="" class="btn btn-default btn-lg"><span class="glyphicon glyphicon-envelope"></span> Contact Support </a>
    </div>


<%@ include file="common/footer.jspf" %>