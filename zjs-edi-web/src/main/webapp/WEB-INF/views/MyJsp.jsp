<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
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
        <fieldset>
            <legend>EdiUser</legend>
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
        </fieldset>


        <fieldset>
            <legend>requestorders</legend>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].codamount">代收金额</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].codamount" type="text" name="requestorders[0].codamount" placeholder="代收金额"/>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].dataflag">数据标识(用于分仓发货,C2C 类客户省略)</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].dataflag" type="text" name="requestorders[0].dataflag" placeholder="数据标识"/>
                </div>
            </div>
             <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].flag">订单标识</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].flag" type="text" name="requestorders[0].flag" placeholder="订单标识"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].itemsname">商品总品名：品名</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].itemsname" type="text" name="requestorders[0].itemsname" placeholder="商品总品名：品名"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].itemsnumber">商品总数量</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].itemsnumber" type="text" name="requestorders[0].itemsnumber" placeholder="商品总数量"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].itemsvolume">商品尺寸：长*宽*高</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].itemsvolume" type="text" name="requestorders[0].itemsvolume" placeholder="商品尺寸"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].itemsweight">总重量（KG 精度.00）</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].itemsweight" type="text" name="requestorders[0].itemsweight" placeholder="总重量"/>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].logisticproviderid">客户标识(宅急送提供)</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].logisticproviderid" type="text" name="requestorders[0].logisticproviderid" placeholder="客户标识"/>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].mailno">客户标识(宅急送提供)</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].mailno" type="text" name="requestorders[0].mailno" placeholder="客户标识"/>
                </div>
            </div>


            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].orderno">客户单号（物流订单号）</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].orderno" type="text" name="requestorders[0].orderno" placeholder="客户单号"/>
                </div>
            </div> 
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].remark">重要提示</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].remark" type="text" name="requestorders[0].remark" placeholder="重要提示"/>
                </div>
            </div>

        </fieldset>

        <fieldset>
            <legend>发件人信息</legend>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].sender.prov">寄件省（北京市、湖北省）</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].sender.prov" type="text" name="requestorders[0].sender.prov" placeholder="寄件省（北京市、湖北省）"/>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].sender.city">寄件市（北京市、宜昌市）</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].sender.city" type="text" name="requestorders[0].sender.city" placeholder="寄件省（北京市、湖北省）"/>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].sender.district">寄件区县(如东城区、延庆县)</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].sender.district" type="text" name="requestorders[0].sender.district" placeholder="寄件区县(如东城区、延庆县)"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].sender.address">详细地址(丌要包含省市区县) </label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].sender.address" type="text" name="requestorders[0].sender.address" placeholder="详细地址(丌要包含省市区县) "/>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].sender.mobile">移劢电话 </label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].sender.mobile" type="text" name="requestorders[0].sender.mobile" placeholder="移劢电话"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].sender.name">寄件人姓名 </label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].sender.name" type="text" name="requestorders[0].sender.name" placeholder="移劢电话"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].sender.phone">固定电话，包括区号、电话号码及分机号</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].sender.phone" type="text" name="requestorders[0].sender.phone" placeholder="固定电话，包括区号、电话号码及分机号"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].sender.postcode">寄件人邮编</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].sender.postcode" type="text" name="requestorders[0].sender.postcode" placeholder="寄件人人邮编"/>
                </div>
            </div>

        </fieldset>

         <fieldset>
            <legend>收件人信息</legend> 
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].receiver.prov">收件省（北京市、湖北省）</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].receiver.prov" type="text" name="requestorders[0].receiver.prov" placeholder="收件省（北京市、湖北省）"/>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].receiver.city">收件市（北京市、宜昌市）</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].receiver.city" type="text" name="requestorders[0].receiver.city" placeholder="收件省（北京市、湖北省）"/>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].receiver.district">收件区县(如东城区、延庆县)</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].receiver.district" type="text" name="requestorders[0].receiver.district" placeholder="收件区县(如东城区、延庆县)"/>
                </div>
            </div> 
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].receiver.address">详细地址(丌要包含省市区县) </label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].receiver.address" type="text" name="requestorders[0].receiver.address" placeholder="详细地址(丌要包含省市区县) "/>
                </div>
            </div>
             
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].receiver.mobile">移劢电话 </label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].receiver.mobile" type="text" name="requestorders[0].receiver.mobile" placeholder="移劢电话"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].receiver.name">收件人姓名 </label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].receiver.name" type="text" name="requestorders[0].receiver.name" placeholder="移劢电话"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].receiver.phone">固定电话，包括区号、电话号码及分机号</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].receiver.phone" type="text" name="requestorders[0].receiver.phone" placeholder="固定电话，包括区号、电话号码及分机号"/>
                </div>
            </div> 
             <div class="form-group">
                <label class="col-sm-2 control-label" for="requestorders[0].receiver.postcode">收件人邮编</label>
                <div class="col-sm-4">
                    <input class="form-control" id="requestorders[0].receiver.postcode" type="text" name="requestorders[0].receiver.postcode" placeholder="收件人人邮编"/>
                </div>
            </div>

        </fieldset>



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
            $.ajax({
                type: "POST",
                url: 'http://10.10.12.27:8081/rest/eiduser',
                data: form.serialize(),
                success: function (date) {
                    if (date.code == 200) {
                        alert("成功!");
                    } else {
                        alert("失败：" + date.body);
                    }
                },
                error: function (date) {
                    alert("失败：" + date.body);
                }
            });
        };
        bootstrapValidator("#defaultForm", fields, submitHandler);
    })
</script>


</html>
