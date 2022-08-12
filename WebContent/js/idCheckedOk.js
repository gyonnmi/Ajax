/*idCheckedOk.js*/

const joinForm=document.querySelector('#joinForm');
const joinOkBtn=document.querySelector('#joinOkBtn');
const userId=document.querySelector('#userId');
const userPw=document.querySelector('#userPw');
const userPhone=document.querySelector('#userPhone');
const idCheckBtn=document.querySelector('#idCheckBtn');
const content=document.querySelector('.content');

//1
const xhr=new XMLHttpRequest();

idCheckBtn.addEventListener('click', ()=>{
	const data="userId="+userId.value; //"userId=값"
	const url="ajaxIdChecked.ax";
	//2		//방식	url 비동기(기본)
	xhr.open("POST", url, true);
	//3
	xhr.setRequestHeader("content-type",
		"application/x-www-form-urlencoded;charset=utf8");
	//4
	xhr.onreadystatechange=function() {
		if(xhr.readyState == 4 && xhr.status == 200) {
			console.log("Success!!");
			const result=xhr.responseText; //서버에서 response data
			
			content.innerText=result;
			
			console.log(result+" << result");
			//아이디가 있으면 select count(*) from 테이블명 where userId=? -> 1
			//아이디가 없으면 select count(*) from 테이블명 where userId=? -> !1
			if(result == 1) {
				alert("중복된 아이디 입니다.");
				userId.classList.remove('c1');
				userId.focus();
			} else {
				alert("사용할 수 있는 아이디 입니다.");
				userId.classList.add('c1');
				userPw.focus();
			}
		}
	}
	xhr.send(data);
});

joinOkBtn.addEventListener('click', ()=>{
	if(userId==null || userId.value=="" || userId.value<=0) {
		alert("아이디 미입력");
		userId.focus();
		return false;
	}
	if(!userId.classList.contains('c1')) {
		alert("아이디 체크를 하지 않으셨군요.");
		idCheckBtn.focus();
		return false;
	}
	if(userPw==null || userPw.value=="" || userPw.value<=0) {
		alert("비밀번호 미입력");
		userPw.focus();
		return false;
	}
	if(userPhone==null || userPhone.value=="" || userPhone.value<=0) {
		alert("전화번호 미입력");
		userPhone.focus();
		return false;
	}
	
	joinOk();
	
});


function joinOk() {
	let data="userId="+userId.value+"&"+
		  "userPw="+userPw.value+"&"+
		  "userPhone="+userPhone.value;
		  
	const url="joinOk.ax";
	console.log(data);
	
	xhr.open("POST", url, true);
	xhr.setRequestHeader("content-type",
		"application/x-www-form-urlencoded;charset=utf8");
	xhr.onreadystatechange=function() {
		if(xhr.readyState == 4 && xhr.status == 200) {
			const result=xhr.responseText; //서버에서 response data
			
			content.innerText=result;
			
			if(result == 1) {
				alert("회원가입 성공");
				location.href="/ajaxProject_0811/loginView.ax";
			} else {
				alert("회원가입 실패");
			}
		}
	}
	xhr.send(data);
}
















