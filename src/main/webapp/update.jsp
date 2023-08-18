<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f1f1f1;
            padding: 20px;
        }

        h1 {
            color: black;
        }

        form {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            margin: 0 auto;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: black;
        }

        input[type="text"],
        input[type="email"],
        select {
            width: 100%;
            padding: 8px;
            border: 1px solid #dddddd;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: #ffffff;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<h1 style="text-align: center;">Student Registration Form</h1>
<form action="edit">
    <label for="id">Id:</label>
    <input type="number" id="id" name="id" required>

    <label for="name">Name:</label>
    <input type="text" id="name" name="name">

    <label for="phone">Phone:</label>
    <input type="text" id="phone" name="phone">

    <label for="email">Email:</label>
    <input type="email" id="email" name="email">

    <label for="gender">Gender:</label>
    <input type="text" id="gender" name="gender">

    <label for="class">Class:</label>
    <input type="text" id="class" name="class">


    <input type="submit" value="Update">
</form>
</body>
</html>


