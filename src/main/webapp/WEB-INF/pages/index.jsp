<!DOCTYPE html>
<head>
    <meta charset="GBK">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>hbase-�����ֵ�</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">hbase�����ֵ�</div>
        <%--<!-- ͷ�����򣨿����layui���е�ˮƽ������ -->--%>
        <%--<ul class="layui-nav layui-layout-left">--%>
        <%--<li class="layui-nav-item"><a href="">����̨</a></li>--%>
        <%--<li class="layui-nav-item"><a href="">��Ʒ����</a></li>--%>
        <%--<li class="layui-nav-item"><a href="">�û�</a></li>--%>
        <%--<li class="layui-nav-item">--%>
            <%--<a href="javascript:;">����ϵͳ</a>--%>
            <%--<dl class="layui-nav-child">--%>
                <%--<dd><a href="">�ʼ�����</a></dd>--%>
                <%--<dd><a href="">��Ϣ����</a></dd>--%>
                <%--<dd><a href="">��Ȩ����</a></dd>--%>
                <%--</dl>--%>
            <%--</li>--%>
        <%--</ul>--%>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    ���ǹ���Ա
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">��������</a></dd>
                    <dd><a href="">��ȫ����</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">�˳�</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- ��ർ�����򣨿����layui���еĴ�ֱ������ -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">������Ʒ</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">�б�һ</a></dd>
                        <dd><a href="javascript:;">�б���</a></dd>
                        <dd><a href="javascript:;">�б���</a></dd>
                        <dd><a href="">������</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">�������</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">�б�һ</a></dd>
                        <dd><a href="javascript:;">�б���</a></dd>
                        <dd><a href="">������</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">���г�</a></li>
                <li class="layui-nav-item"><a href="">������Ʒ</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- ������������ -->
        <div style="padding: 15px;">������������</div>
    </div>

    <div class="layui-footer">
        <!-- �ײ��̶����� -->
        ? layui.com - �ײ��̶�����
    </div>
</div>
<script src="../../layui/layui.js"></script>
<script>
    //JavaScript��������
    layui.use('element', function(){
        var element = layui.element;

    });
</script>
</body>
</html>