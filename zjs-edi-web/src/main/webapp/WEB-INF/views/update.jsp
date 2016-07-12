<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
   String contextPath = request.getContextPath(); 
   request.setAttribute("contextPath", contextPath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>EdiUser Update</title>
<link type="text/css" rel="stylesheet" href="${contextPath}/css/bootstrap.min.css" >
<link type="text/css" rel="stylesheet" href="${contextPath}/css/bootstrap-responsive.min.css" >
<link type="text/css" rel="stylesheet" href="${contextPath}/plugin/buttons/css/font-awesome.min.css" />
<link type="text/css" rel="stylesheet" href="${contextPath}/plugin/buttons/css/buttons.css" />
<style type="text/css">
a:hover{color:white;text-decoration:none;}
table{border-collapse:separate;}
</style>
</head>
<body>
   <div class="container" style="margin-top:30px;">
    	<fieldset>
		    <legend>EdiUser Update    <a id="index-btn" href="#" class="button button-rounded button-flat-action" style="margin-left:300px;margin-bottom:10px;"><i class="icon-home"></i>ediUser list</a>
		    </legend>
		    	<form class="form-horizontal" action="${contextPath}/front/ediuser_update.action">
				  <div class="control-group">
				    <label class="control-label" for="inputId">id</label>
				    <div class="controls">
				      <input type="text" id="inputId" name="ediUser.id" value="${ediUser.id}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputName">name</label>
				    <div class="controls">
				      <input type="text" id="inputName" name="ediUser.name" value="${ediUser.name}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputIp">ip</label>
				    <div class="controls">
				      <input type="text" id="inputIp" name="ediUser.ip" value="${ediUser.ip}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputXid">xid</label>
				    <div class="controls">
				      <input type="text" id="inputXid" name="ediUser.xid" value="${ediUser.xid}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputDatatype">datatype</label>
				    <div class="controls">
				      <input type="text" id="inputDatatype" name="ediUser.datatype" value="${ediUser.datatype}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputClientflag">clientflag</label>
				    <div class="controls">
				      <input type="text" id="inputClientflag" name="ediUser.clientflag" value="${ediUser.clientflag}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputVerifyseed">verifyseed</label>
				    <div class="controls">
				      <input type="text" id="inputVerifyseed" name="ediUser.verifyseed" value="${ediUser.verifyseed}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputDataflag">dataflag</label>
				    <div class="controls">
				      <input type="text" id="inputDataflag" name="ediUser.dataflag" value="${ediUser.dataflag}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputOrdertype">ordertype</label>
				    <div class="controls">
				      <input type="text" id="inputOrdertype" name="ediUser.ordertype" value="${ediUser.ordertype}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputUpdatetime">updatetime</label>
				    <div class="controls">
				      <input type="text" id="inputUpdatetime" name="ediUser.updatetime" value="${ediUser.updatetime}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputRecordtime">recordtime</label>
				    <div class="controls">
				      <input type="text" id="inputRecordtime" name="ediUser.recordtime" value="${ediUser.recordtime}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputId">id</label>
				    <div class="controls">
				      <input type="text" id="inputId" name="ediUser.id" value="${ediUser.id}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputName">name</label>
				    <div class="controls">
				      <input type="text" id="inputName" name="ediUser.name" value="${ediUser.name}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputIp">ip</label>
				    <div class="controls">
				      <input type="text" id="inputIp" name="ediUser.ip" value="${ediUser.ip}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputXid">xid</label>
				    <div class="controls">
				      <input type="text" id="inputXid" name="ediUser.xid" value="${ediUser.xid}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputDatatype">datatype</label>
				    <div class="controls">
				      <input type="text" id="inputDatatype" name="ediUser.datatype" value="${ediUser.datatype}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputClientflag">clientflag</label>
				    <div class="controls">
				      <input type="text" id="inputClientflag" name="ediUser.clientflag" value="${ediUser.clientflag}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputVerifyseed">verifyseed</label>
				    <div class="controls">
				      <input type="text" id="inputVerifyseed" name="ediUser.verifyseed" value="${ediUser.verifyseed}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputDataflag">dataflag</label>
				    <div class="controls">
				      <input type="text" id="inputDataflag" name="ediUser.dataflag" value="${ediUser.dataflag}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputOrdertype">ordertype</label>
				    <div class="controls">
				      <input type="text" id="inputOrdertype" name="ediUser.ordertype" value="${ediUser.ordertype}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputUpdatetime">updatetime</label>
				    <div class="controls">
				      <input type="text" id="inputUpdatetime" name="ediUser.updatetime" value="${ediUser.updatetime}">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputRecordtime">recordtime</label>
				    <div class="controls">
				      <input type="text" id="inputRecordtime" name="ediUser.recordtime" value="${ediUser.recordtime}">
				    </div>
				  </div>
				  <div class="control-group">
				    <div class="controls">
				      <a href="#" id="update-btn" class="button button-rounded button-flat-action">保存</a>
                  	  <a href="#" id="cancel-btn" class="button button-rounded button-flat-primary">取消</a>
				    </div>
				  </div>
				</form>
		</fieldset>
   </div><!-- container end -->
<script type="text/javascript" src="${contextPath}/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap.min.js"></script>
<script>
$(function(){
	$("#cancel-btn").click(function(){
		window.self.location = "${contextPath}/front/ediuser_index.action";
	});
	$("#index-btn").click(function(){
		window.self.location = "${contextPath}/front/ediuser_index.action";
	});
	$("#update-btn").click(function(){
		$(".form-horizontal").submit();
	});
});
</script>
</body>
</html>