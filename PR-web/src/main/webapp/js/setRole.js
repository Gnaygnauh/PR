$(function() {
	$('#users').datagrid({
		toolbar : [ {
			iconCls : 'icon-edit',
			text : "批量权限设置",
			handler : function() {
				var msg = $("#users").datagrid('getSelections');
				var uids = [];
				$.each(msg, function(i, n) {
					uids.push(n.uId);
				});
				comms(uids, msg);
			}
		} ],
		url : 'showUsers',
		columns : [ [ {
			field : 'che',
			checkbox : true
		}, {
			field : 'uId',
			hidden : true,
			title : 'id',
			width : 100
		}, {
			field : 'uName',
			title : '姓名',
			width : 200
		}, {
			field : 'uPwd',
			title : '密码',
			width : 200
		}, {
			field : 'uTel',
			title : '电话',
			width : 200
		}, {
			field : 'rName',
			title : '权限设置',
			width : 200
		}, {
			field : 'rId',
			hidden : true,
			title : 'rId',
			width : 200
		}

		] ],
		pageList : [ 5, 10, 50, 100 ],
		pageSize : 5,
		pagination : true,
		onDblClickRow : function(rowIndex, rowData) {
			var uid = rowData.uId;
			comms(uid, rowData);
		}

	});

	// 角色窗口
	$('#RoleWindow').window({
		title : '角色设置窗口',
		width : 600,
		height : 400,
		modal : true,
		onBeforeClose : function() {
			$("#roles").text("");
		}
	});
	$('#RoleWindow').window('close');

});
function comms(uid, ndata) {
	$.ajax({
		url : 'showRoles',
		dataType : 'json',
		fitColumns : true,
		striped : true,
		type : 'post',
		success : function(data) {
			var roles = data;
			for (var i = 0; i < roles.length; i++) {
				var role = roles[i]
				var tr = $("<tr id='" + role.rid + "'></tr>");
				var td = $("<td></td>");
				td.append(role.rname);
				tr.append(td);
				$("#roles").append(tr);
				tr.click(function() {
					var rid = this.id;
		
					for (var i = 0; i < uid.length; i++) {
						if (ndata[i].rId == rid) {
							$.messager.alert("提示",ndata[i].uName + " 为重复设置，请重选!","error");
							$('#RoleWindow').window('close');
							return;
						}
					}
					$.ajax({
						url : 'commitPermission',
						dataType : 'json',
						type : 'post',
						data : {
							uids : uid,
							rid : rid
						},
						traditional : true,
						success : function(data) {
							var msg = data.msg;
							if (msg == 1) {
								$.messager.alert("提示","设置成功",'info');
								$('#users').datagrid('reload');
							} else {
								$.messager.alert("提示","设置失败",'error');
							}
							$('#RoleWindow').window('close');
						}
					});
				});
			}
			$('#RoleWindow').window('open');
		}
	});
}
