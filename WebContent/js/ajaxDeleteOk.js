/*deleteOk.js*/

const deleteForm=document.querySelector('#deleteForm');
const userId=document.querySelector('#userId');
const userPw=document.querySelector('#userPw');
const deleteOkBtn=document.querySelector('#deleteOkBtn');


//1
const xhr3=new XMLHttpRequest();

//유효성 검사
deleteOkBtn.addEventListener('click', ()=>{
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
	
	deleteOk();
	
});

function deleteOk() {
	let data="userId="+userId.value+"&";
		data+="userPw="+userPw.value;
	const url="deleteOk.ax";
	console.log(data);
	
	xhr3.open("POST", url, true);
	xhr3.setRequestHeader("content-type",
		"application/x-www-form-urlencoded;charset=utf8");
	xhr3.onreadystatechange=function() {
		if(xhr3.readyState == 4 && xhr3.status == 200) {
			const result=xhr3.responseText; //서버에서 response data
			if(result == 1) {
				alert("회원탈퇴 성공");
				location.href="/ajaxProject_0811/index.ax";
			} else {
				alert("회원탈퇴 실패");
				history.go(-1);
			}
		}
	}
	xhr3.send(data);
}




