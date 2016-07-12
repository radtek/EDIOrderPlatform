<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<<html>
<head>

    <title>新增一个EdiUser</title>

    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="css/toastr.js"></script>
    <link href="css/toastr.min.css" rel="stylesheet" />
    <script src="js/bootstrapValidator.min.js"></script>
    <link href="css/bootstrapValidator.min.css" rel="stylesheet" />
</head>



<body>

    <form class="form-horizontal" role="form" id="defaultForm" method="post">

        <div class="form-group">
            <label class="col-sm-2 control-label" for="name">用户名称</label>
            <div class="col-sm-4">
                <input class="form-control" id="name" type="text" name="name" placeholder="用户名称" />
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label" for="ip">ip</label>
            <div class="col-sm-4">
                <input class="form-control" id="ip" type="text" name="ip" placeholder="ip" />
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label" for="datatype">数据类型 json/xml</label>
            <div class="col-sm-10">
                <select id="datatype" class="form-control" name="datatype">
                    <option value="json">json</option>
                    <option value="xml">xml</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label" for="clientflag">EID 客户标识</label>
            <div class="col-sm-4">
                <input class="form-control" id="clientflag" type="text" name="clientflag" placeholder="EID 客户标识" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label" for="verifyseed">EID 客户秘钥</label>
            <div class="col-sm-4">
                <input class="form-control" id="verifyseed" name="verifyseed" type="text" placeholder="EID 客户秘钥" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label" for="dataflag">EID 分仓标识</label>
            <div class="col-sm-4">
                <input class="form-control" id="dataflag" name="dataflag" type="text" placeholder="EID 分仓标识" />
            </div>
        </div>


        <div class="form-group">
            <label class="col-sm-2 control-label" for="ordertype">用户类型 0标准 1定制</label>
            <div class="col-sm-10">
                <select id="ordertype" name="ordertype" class="form-control">
                    <option value="0">标准</option>
                    <option value="1">定制</option>
                </select>
            </div>
        </div>

        <div class="form-group">
            <button type="submit" class="btn btn-primary">Sign up</button>
        </div>
    </form>
</body>



<script type="text/javascript">
    $(function () {

        var bootstrapValidator = function (id, fields, submitHandler) {
            $(id).bootstrapValidator({
                message: "This value is not valid",
                feedbackIcons: {
                    valid: "glyphicon glyphicon-ok",
                    invalid: "glyphicon glyphicon-remove",
                    validating: "glyphicon glyphicon-refresh"
                },
                fields: fields,
                submitHandler: submitHandler
            });
        };

        var fields = {
            name: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
            ip: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
            datatype: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
            clientflag: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
            verifyseed: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
            dataflag: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
            ordertype: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            }
        };

        var submitHandler = function (validator, form, submitButton) {

            alert(form.context[0]);
            $.ajax({
                type: "POST",
                url: 'http://10.10.12.27:8081/rest/table',
                data: form.context[0],
                success: function () {
                    alert("成功!");
                    
                },
                error: function (date) {
                    alert("失败!");
                   
                }
            });
        }; 

        bootstrapValidator("#defaultForm", fields, submitHandler);


    })
</script>


</html>
