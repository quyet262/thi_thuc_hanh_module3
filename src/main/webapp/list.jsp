<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 8/8/2024
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sach mat bang</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Danh sach mat bang</h2>
    <table class="table table-bordered table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Ma mat bang</th>
            <th>Trang thai</th>
            <th>Dien tich (m²)</th>
            <th>Tang</th>
            <th>Loai mat bang</th>
            <th>Gia tien (VND)</th>
            <th>Ngay bat dau</th>
            <th>Ngay ket thuc</th>
            <th>Hanh dong</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="matBang" items="${matBangDTOS}">
            <tr>
                <td>${matBang.id}</td>
                <td>${matBang.maMatBang}</td>
                <td>${matBang.trangThai}</td>
                <td>${matBang.dienTich}</td>
                <td>${matBang.tang}</td>
                <td><c:choose>
                    <c:when test="${matBang.loaiMatBang}">Văn phòng chia sẻ</c:when>
                    <c:otherwise>Văn phòng trọn gói</c:otherwise>
                </c:choose></td>
                <td>${matBang.giaTien}</td>
                <td>${matBang.ngayBatDau}</td>
                <td>${matBang.ngayKetthuc}</td>
                <td>
                    <a href="matbang?action=edit&id=${matBang.id}" class="btn btn-info btn-sm">Sua</a>
                    <a href="matbang?action=delete&id=${matBang.id}" class="btn btn-danger btn-sm">Xoa</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="matbang?action=create" class="btn btn-success">Thêm mặt bằng mới</a>
</div>
<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

