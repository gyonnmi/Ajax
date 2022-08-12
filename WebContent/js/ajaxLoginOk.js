/*loginOk.js*/

const loginForm=document.querySelector('#loginForm');
const userId=document.querySelector('#userId');
const userPw=document.querySelector('#userPw');
const loginOkBtn=document.querySelector('#loginOkBtn');


//1
const xhr=new XMLHttpRequest();

//유효성 검사
loginOkBtn.addEventListener('click', ()=>{
	if(userId==null || userId.value=="" || userId.value<=0) {
		alert("아이디를 입력하세요!");
		userId.focus();
		return false;
	}
	if(userPw==null || userPw.value=="" || userPw.value<=0) {
		alert("비밀번호를 입력하세요!");
		userPw.focus();
		return false;
	}
	
	loginOk();
	
});

function loginOk() {
	let data="userId="+userId.value+"&";
		data+="userPw="+userPw.value;
	const url="loginOk.ax";
	console.log(data);
	
	xhr.open("POST", url, true);
	xhr.setRequestHeader("content-type",
		"application/x-www-form-urlencoded;charset=utf8");
	xhr.onreadystatechange=function() {
		if(xhr.readyState == 4 && xhr.status == 200) {
			const result=xhr.responseText; //서버에서 response data
			if(result == 1) {
				alert("로그인 성공");
				location.href="/ajaxProject_0811/index.ax";
			} else {
				alert("로그인 실패");
				history.go(-1);
			}
		}
	}
	xhr.send(data);
}




