<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

	<%----- Accounts table -----%>

	<div class="container">
		<h3>Your accounts are:</h3>
		<table class="table table-striped">
			<thead>
				<th>IBAN</th>
				<th>Business Identifier Code</th>
				<th>Edit / Delete</th>
			</thead>
			<tbody>
				<c:forEach items="${accounts}" var="account">
					<tr>
						<td>${account.value.getIban()}</td>
						<td>${account.value.getBic()}</td>
						<td>
							<a type="button" class="btn btn-success" href="${pageContext.request.contextPath}/update-account?id=${account.key}"><span class="glyphicon glyphicon-pencil"></span></a>
							<a type="button" class="btn btn-danger" href="${pageContext.request.contextPath}/delete-account?id=${account.key}"><span class="glyphicon glyphicon-trash"></span></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<%----- Add new account button -----%>

		<div>
			<a class="btn btn-success" href="${pageContext.request.contextPath}/account">Add new</a>
		</div>
	</div>

<%@ include file="common/footer.jspf" %>