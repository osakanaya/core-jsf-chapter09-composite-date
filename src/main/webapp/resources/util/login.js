function checkForm(form, ccId) {
	var name = form[ccId + ':form:name'].value;
	var password = form[ccId + ':form:password'].value;
	
	if (name == "" || password == "") {
		alert("Please enter name and password.");

		return false;
	}
	
	return true;
}