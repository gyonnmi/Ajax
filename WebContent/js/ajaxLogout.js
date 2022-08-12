/*ajaxLogout.js*/

const logoutBtn=document.querySelector('#logoutBtn');

const xhr2=new XMLHttpRequest();

logoutBtn.addEventListener('click', (e)=>{
	e.preventDefault();
	
	const url="logout.ax";
	
	xhr2.open("GET", url, true);
	xhr2.setRequestHeader("content-type",
		"application/x-www-form-urlencoded;charset=utf8");
	xhr2.onreadystatechange=function() {
		if(xhr2.readyState == 4 && xhr2.status == 200) {
			const result=xhr2.responseText; //서버에서 response data
			if(result == 1) {
				alert("로그아웃 성공");
				location.href="/ajaxProject_0811/index.ax";
			} else {
				alert("로그아웃 실패");
				history.go(-1);
			}
		}
	}
	xhr2.send();
});