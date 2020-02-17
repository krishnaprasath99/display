<!DOCTYPE html>
<html>
<head>
    <link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>
    <style>
        body {
            color : whitesmoke;
            font-family: 'Ubuntu';font-size: 22px;
            background-image: url("https://wallpapercave.com/wp/wp3453772.jpg");
            background-size: cover;
        }
        .center {
            margin: auto;
            width: 20%;

            padding: 10px;
        }
        input[type=text] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 2px solid whitesmoke;
            border-radius: 4px;
        }
        input[type=button], input[type=submit], input[type=reset] {
            background-color: whitesmoke;
            border: none;
            color: black;
            padding: 16px 32px;
            text-decoration: none;
            margin: 4px 2px;
            cursor: pointer;
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

<div class="center">
<form id="form1" method="post">
    <br><br><br><br><br><br><br><br><br><br>
    App-id:<br><br>
    <input type="text" name="aid">
    <br><br>
    S-No:<br><br>
    <input type="text" name="sno">
    <br><br>
    <input type="submit"  onclick="myFunction()" value="Associate">
    <input type="submit"  onclick="myFunction1();" value="Disassociate">
    <input type="submit"  onclick="myFunction2();" value="Test"><br><br>
</form>
</div>
</body>
</html>
