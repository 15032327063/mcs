<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/common/Head.jsp" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="${basepath }/css/pintuer.css">
<link rel="stylesheet" href="${basepath }/css/admin.css">
<script src="${basepath }/js/jquery.js"></script>
<script src="${basepath }/js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加员工</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/scb.sms/sm/goAddEmployee">  
      <div class="form-group">
        <div class="label">
          <label>姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="employeeName" data-validate="required:请输入员工姓名" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>英文名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="employeeNickname" data-validate="required:请输入员工英文名" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>照片：</label>
        </div>
        <div class="field">
          <input type="text" id="url1" name="employeeImage" class="input tips" style="width:25%; float:left;"  value=""  data-toggle="hover" data-place="right" data-image="" />
          <input type="button" class="button bg-blue margin-left" id="image1" value="+ 浏览上传"  style="float:left;">
          <div class="tipss">图片尺寸：500*500</div>
        </div>
      </div>     
      
      
        
        <div class="form-group">
          <div class="label">
            <label>职位：</label>
          </div>
          <div class="field">
            <select name="positionId" class="input w50">
              <option value="">请选择职位</option>
              <option value="">软件工程师</option>
            </select>
            <div class="tips"></div>
          </div>
        </div>
        <div class="form-group">
          <div class="label">
            <label>部门：</label>
          </div>
          <div class="field">
            <select name="departmentId" class="input w50">
              <option value="">请选择部门</option>
              <option value="">RB</option>
            </select>
            <div class="tips"></div>
          </div>
        </div>
        
        <div class="form-group">
          <div class="label">
            <label>公司：</label>
          </div>
          <div class="field">
            <select name="empolyeeCompany" class="input w50">
              <option value="">请选择公司</option>
              <option value="">渣打</option>
            </select>
            <div class="tips"></div>
          </div>
        </div>
        
        <div class="form-group">
        <div class="label">
          <label>座机号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="employeeLandline" data-validate="required:请输入员工座机号" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>手机号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="employeePhone" data-validate="required:请输入员工手机号" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>住址：</label>
        </div>
        <div class="field">
          <textarea class="input" name="employeeAddress" style=" height:90px;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>籍贯：</label>
        </div>
        <div class="field">
          <textarea class="input" name="employeeNativePlace" style=" height:90px;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
	  <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body></html>