<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>


<%---- Form to add and update an account ----%>

	<div class="container">
		<h3>Edit account's details</h3>
		<form:form method="post" commandName="account">
			<fieldset class="form-group">
				<form:label path="iban">IBAN</form:label> 
				<form:input path="iban" type="text" class="form-control" placeholder="Enter IBAN..." required="required"/>
				<form:label path="bic">Business Identifier Code</form:label> 
				<form:input path="bic" type="text" class="form-control" placeholder="Enter Business Identifier Code..." required="required"/>
			</fieldset>
			<button type="submit" class="btn btn-success">Submit</button>
			<a class="btn btn-warning" href="/accounts">Cancel</a>
		</form:form>
	</div>

<%@ include file="common/footer.jspf" %>