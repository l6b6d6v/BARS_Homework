<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>dogovor</th>
            <th>dog_no</th>
            <th>dog_date</th>
            <th>update_time</th>
            <th>is_updated</th>
        </tr>
        <#list dogovors as dogovor>
            <tr>
                <td>${dogovor.dogovor}</td>
                <td>${dogovor.dog_no}</td>
                <td>${dogovor.dog_date}</td>
                <td>${dogovor.update_time}</td>
                <td>${dogovor.is_updated?c}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>
