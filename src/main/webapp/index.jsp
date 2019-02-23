<html>
<head>
    <title>home</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <script type="application/javascript" src="js/jquery/jquery-3.1.0.js"></script>
    <script>

        function add(){
            $("#add").click(function () {
                $.ajax({
                    type: "POST",
                    url:"/ssm/addStudent",
                    data:$('#addForm').serialize(),// 序列化表单值
                    async: true,
                    error: function(err) {
                        alert(err);
                    },
                    success: function(data) {
                        alert(data);
                    }
                });
            });
        }

        $("#query").click(function () {
            $.ajax({
                type: "POST",
                url:"/ssm/query",
                data:$('#queryForm').serialize(),// 序列化表单值
                async: true,
                error: function(err) {
                    alert(err);
                },
                success: function(data) {
                    alert(data);
                }
            });
        });

    </script>
</head>
<body>
<h2>Hello! Welcome to my site.</h2>
<div >
    <form id="addForm">
        <label>number:</label><input type="text" name="number" required="required" /><br/>
        <label>name:</label><input type="text" name="name" /><br/>
        <label>age:</label><input type="number" min="1" max="100" name="age" /><br/>
        <button id="add">save</button>
    </form>
</div>
<div id="list">
    <div id="condition">
        <form id="queryForm">
            <label>number:</label><input type="text" name="number" /><br/>
            <label>name:</label><input type="text" name="name" /><br/>
            <label>age:</label><input type="number" min="1" max="100" name="age" /><br/>
            <button id="query">query</button>
        </form>
    </div>
    <div id="result">
        <table border="2">
            <tr>
                <th>number</th>
                <th>name</th>
                <th>age</th>
                <th>options</th>
            </tr>
        </table>
    </div>
</div>
</body>
</html>
