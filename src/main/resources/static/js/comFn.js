/* 공통함수 작업할 js(javascript) 파일 */

// 
function goMenu(url){
	$("form[name=frm_menu]").attr("action", url);
	$("form[name=frm_menu]").submit();
}