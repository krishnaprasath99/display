<!DOCTYPE html>
<html>
<head>
    <link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>
    <style>
        body {
            font-family: 'Ubuntu';font-size: 22px;
        }
    </style>

    <script>
        function myFunction() {
            document.forms[0].action="Associate";
            document.forms[0].submit();
        }
        function myFunction1() {
            document.forms[0].action="Disassociate";
            document.forms[0].submit();
        }
        function myFunction2() {
            document.forms[0].action="Test";
            document.forms[0].submit();
        }
    </script>
</head>

<body>
<p id="demo"></p>


<form id="form1" method="post">
    App-id:<br><br>
    <input type="text" name="aid">
    <br><br>
    S-No:<br><br>
    <input type="text" name="sno">
    <br><br>
    <input type="submit"  onclick="myFunction()" value="Associate"><br><br>
    <input type="submit"  onclick="myFunction1();" value="Disassociate"><br><br>
    <input type="submit"  onclick="myFunction2();" value="Test"><br><br>
</form>

</body>
</html>
