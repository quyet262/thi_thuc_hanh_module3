
CREATE DATABASE RentalManagement;
USE RentalManagement;


CREATE TABLE TrangThai (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           ten_trang_thai VARCHAR(50) NOT NULL
);


INSERT INTO TrangThai (ten_trang_thai) VALUES
                                           ('trống'),
                                           ('hạ tầng'),
                                           ('đầy đủ');


CREATE TABLE MatBang (
                        id_mat_bang int auto_increment primary key ,
                         ma_mat_bang VARCHAR(9) ,
                         trang_thai_id INT NOT NULL,
                         dien_tich FLOAT NOT NULL CHECK (dien_tich > 20),
                         tang INT NOT NULL CHECK (tang BETWEEN 1 AND 15),
                         loai_mat_bang BOOLEAN DEFAULT TRUE,
                         gia_tien DECIMAL(15, 2) NOT NULL CHECK (gia_tien > 1000000),
                         ngay_bat_dau DATE NOT NULL,
                         ngay_ket_thuc DATE NOT NULL,
                         CHECK (ngay_bat_dau <= ngay_ket_thuc),
                         CHECK (ma_mat_bang REGEXP '^[A-Z0-9]{3}-[A-Z0-9]{2}-[A-Z0-9]{2}$'),
    FOREIGN KEY (trang_thai_id) REFERENCES TrangThai(id)
);


INSERT INTO MatBang (ma_mat_bang, trang_thai_id, dien_tich, tang, loai_mat_bang, gia_tien, ngay_bat_dau, ngay_ket_thuc)
VALUES
    ('ABC-12-34', 1, 30.5, 5, TRUE, 2000000, '2024-08-01', '2024-12-31'),
    ('XYZ-56-78', 2, 50.0, 10, FALSE, 5000000, '2024-09-01', '2025-01-31');

select id_mat_bang, ma_mat_bang, ten_trang_thai, dien_tich, tang, loai_mat_bang,gia_tien, ngay_bat_dau, ngay_ket_thuc from MatBang
join TrangThai on MatBang.trang_thai_id = TrangThai.id;
select ten_trang_thai from TrangThai;