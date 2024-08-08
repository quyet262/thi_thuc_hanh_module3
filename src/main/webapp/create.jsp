<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 8/8/2024
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thêm mặt bằng mới</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Thêm mặt bằng mới</h2>
    <c:if test="${not empty error}">
        <div class="alert alert-danger">${error}</div>
    </c:if>
    <form action="matbang?action=create" method="post">
        <div class="form-group">
            <label for="maMatBang">Mã mặt bằng</label>
            <input type="text" class="form-control" id="maMatBang" name="maMatBang" required>
        </div>
        <div class="form-group">
            <label for="trangThai">Trạng thái</label>
            <select class="form-control" id="idtrangThai" name="idtrangThai" required>
                <c:forEach var="trangThai" items="${trangThaiList}">
                    <option value="${trangThai.id}">${trangThai.name}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="dienTich">Diện tích (m²)</label>
            <input type="number" class="form-control" id="dienTich" name="dienTich" step="0.01" min="20" required>
        </div>
        <div class="form-group">
            <label for="tang">Tầng</label>
            <input type="number" class="form-control" id="tang" name="tang" min="1" max="15" required>
        </div>
        <div class="form-group">
            <label for="loaiMatBang">Loại mặt bằng</label>
            <select class="form-control" id="loaiMatBang" name="loaiMatBang">
                <option value="true">Văn phòng chia sẻ</option>
                <option value="false">Văn phòng trọn gói</option>
            </select>
        </div>
        <div class="form-group">
            <label for="giaTien">Giá tiền (VND)</label>
            <input type="number" class="form-control" id="giaTien" name="giaTien" min="1000000" required>
        </div>
        <div class="form-group">
            <label for="ngayBatDau">Ngày bắt đầu</label>
            <input type="date" class="form-control" id="ngayBatDau" name="ngayBatDau" required>
        </div>
        <div class="form-group">
            <label for="ngayKetThuc">Ngày kết thúc</label>
            <input type="date" class="form-control" id="ngayKetThuc" name="ngayKetThuc" required>
        </div>
        <button type="submit" class="btn btn-primary">Lưu</button>
        <a href="matbang" class="btn btn-secondary">Quay lại</a>
    </form>
</div>
<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

