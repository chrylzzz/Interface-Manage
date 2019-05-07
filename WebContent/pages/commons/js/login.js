function login() {
	$.ajax({
		url : contextPath+'/im/login',
		// 序列化，&key=value
		data : $("#login-form").serialize(),
		type : 'post',
		success : function(msg) {
			console.log("login成功");
		}
	});
}