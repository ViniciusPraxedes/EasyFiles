<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Easy Files</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

    <link rel="icon" type="image/x-icon" href="https://static.vecteezy.com/system/resources/thumbnails/003/586/433/small/document-icon-isolated-graphic-paper-document-page-icon-element-agreement-file-symbol-free-vector.jpg">


    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>


</head>
<body>

<header class="mb-auto">
    <div>
        <nav class="navbar navbar-expand-md navbar-dark bg-dark mb-3 p-1">
            <a class="navbar-brand m-1">Easy files</a>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav">
                    <li class="nav-item"><a class="nav-link" href="/upload">Upload File</a></li>
                </ul>
            </div>
        </nav>

    </div>
</header>

<main>
    <div class="container-fluid">
        <h1>Your files: </h1>
        <table class="table table-bordered">
            <thead class="thead-dark">
            <tr>
                <th>img: </th>
                <th>File name: </th>
                <th>Description: </th>
                <th>Date of upload: </th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${fileInfos}" var="FileInfo">
                <tr>
                    <td><img src="https://easy-files-s3.s3.eu-north-1.amazonaws.com/${FileInfo.name}" alt="img" width="200" height="150"/></td>
                    <td>${FileInfo.name}</td>
                    <td>${FileInfo.description}</td>
                    <td>${FileInfo.localDate}</td>
                    <td><a href="download/${FileInfo.name}" class="btn btn-success">DOWNLOAD</a> </td>
                    <td><a href="delete/${FileInfo.name}" class="btn btn-warning">DELETE</a> </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>



</main>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>
