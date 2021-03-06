<%-- 
    Document   : [HrHoliday]列表页
    Created on : 2015-3-21, 0:11:48
    Author     : csx
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>[HrHoliday]列表管理</title>
<%@include file="/commons/list.jsp"%>
</head>
<body>

	<redxun:toolbar entityName="com.redxun.hr.core.entity.HrHoliday" excludeButtons="detail,popupAttachMenu,popupSettingMenu,popupSearchMenu,copyAdd,fieldSearch,query" />

	<div class="mini-fit rx-grid-fit" style="height: 100%;">
		<div id="datagrid1" class="mini-datagrid"
			style="width: 100%; height: 100%;" allowResize="false"
			url="${ctxPath}/hr/core/hrHoliday/listData.do" idField="holidayId"
			multiSelect="true" showColumnsMenu="true"
			sizeList="[5,10,20,50,100,200,500]" pageSize="20"
			allowAlternating="true" pagerButtons="#pagerButtons">
			<div property="columns">
				<div type="checkcolumn" width="20"></div>
				<div name="action" cellCls="actionIcons" width="22"
					headerAlign="center" align="center" renderer="onActionRenderer"
					cellStyle="padding:0;">操作</div>
				<div field="name" width="120" headerAlign="center"
					allowSort="true">假期名称</div>
				<div field="startDay" width="120" headerAlign="center"
					allowSort="true">开始日期</div>
				<div field="endDay" width="120" headerAlign="center"
					allowSort="true">结束日期</div>
				<div field="desc" width="120" headerAlign="center" allowSort="true">假期描述</div>
				<div field="userId" width="120" headerAlign="center"
					allowSort="true">所属用户</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		//行功能按钮
		function onActionRenderer(e) {
			var record = e.record;
			var pkId = record.pkId;
			var s = ' <span class="icon-edit" title="编辑" onclick="editRow(\''+ pkId+ '\')"></span>'
			+ ' <span class="icon-remove" title="删除" onclick="delRow(\''+ pkId + '\')"></span>';
			return s;
		}
	</script>
	<script src="${ctxPath}/scripts/common/list.js" type="text/javascript"></script>
	<redxun:gridScript gridId="datagrid1"
		entityName="com.redxun.hr.core.entity.HrHoliday" winHeight="465"
		winWidth="700" entityTitle="假期" baseUrl="hr/core/hrHoliday" />
</body>
</html>