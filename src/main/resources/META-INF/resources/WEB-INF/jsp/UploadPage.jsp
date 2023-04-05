<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Upload a file</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="icon" type="image/x-icon" href="https://static.vecteezy.com/system/resources/thumbnails/003/586/433/small/document-icon-isolated-graphic-paper-document-page-icon-element-agreement-file-symbol-free-vector.jpg">

    <style>
        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>


</head>
<body class="bg-light">
<div class="container">
    <main>
        <div class="py-5 text-center">
            <img class="d-block mx-auto mb-4" src="https://static.vecteezy.com/system/resources/thumbnails/003/586/433/small/document-icon-isolated-graphic-paper-document-page-icon-element-agreement-file-symbol-free-vector.jpg" alt="" width="72" height="57">
            <h2>Upload a file</h2>
        </div>
        <div>
            <form action="/saveFile" method="post" enctype="multipart/form-data">
                <div class="col-md-6">
                    <label class="form-label">Select File:</label>
                    <input class="form-control" type="file" name="file" required/>
                </div>
                <div class="col-md-6">
                    <label class="form-label">Description:</label>
                    <input class="form-control" type="text" name="description" placeholder="Enter description" required>
                </div>
                <div class="input-group-append">
                    <button type="submit" class="btn btn-primary" value="Upload file">UPLOAD</button>
                </div>
            </form>
        </div>
    </main>

</div>


<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>
