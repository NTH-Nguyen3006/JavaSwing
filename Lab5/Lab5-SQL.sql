-- Create the database
CREATE DATABASE QuanLyBanHang;
GO

-- Use the database
USE QuanLyBanHang;
GO

CREATE TABLE dbo.LOAISANPHAM (
    MALOAI INT PRIMARY KEY NOT NULL,
    TENLOAI NVARCHAR(255) NULL
);
GO

CREATE TABLE dbo.SanPham (
    maSanPham NVARCHAR(5) PRIMARY KEY NOT NULL,
    tenSP NVARCHAR(50) NOT NULL,
    donGia MONEY NOT NULL,
    soLuong INT NOT NULL,
    MALOAI INT NOT NULL,
    FOREIGN KEY (MALOAI) REFERENCES dbo.LOAISANPHAM(MALOAI)
);
GO


INSERT INTO dbo.LOAISANPHAM (MALOAI, TENLOAI)
VALUES (1, N'Điện thoại');

INSERT INTO dbo.LOAISANPHAM (MALOAI, TENLOAI)
VALUES (2, N'Máy tính');

INSERT INTO dbo.LOAISANPHAM (MALOAI, TENLOAI)
VALUES (3, N'Phụ kiện');
GO


INSERT INTO dbo.SanPham (maSanPham, tenSP, donGia, soLuong, MALOAI)
VALUES (N'SP001', N'Iphone 15', 25000000, 50, 1);

INSERT INTO dbo.SanPham (maSanPham, tenSP, donGia, soLuong, MALOAI)
VALUES (N'SP002', N'Samsung Galaxy S23', 22000000, 40, 1);

INSERT INTO dbo.SanPham (maSanPham, tenSP, donGia, soLuong, MALOAI)
VALUES (N'SP003', N'Macbook Pro 16', 60000000, 20, 2);

INSERT INTO dbo.SanPham (maSanPham, tenSP, donGia, soLuong, MALOAI)
VALUES (N'SP004', N'Chuột không dây', 250000, 100, 3);
GO

SELECT * FROM dbo.LOAISANPHAM
SELECT * FROM dbo.SanPham