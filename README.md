# AR System 

## 📌 Giới thiệu

Dự án này triển khai và kiểm thử một hệ thống đánh giá trải nghiệm người dùng cho ứng dụng **AR (Augmented Reality)** dựa trên 3 tiêu chí:

* **FPS (Frames Per Second)** – tốc độ khung hình
* **Thời gian hoàn thành (seconds)**
* **Số lỗi thao tác**

Hệ thống sẽ phân loại mức độ trải nghiệm thành:

* `GREAT`
* `GOOD`
* `FAIL`
* `INVALID`

---

## 🧠 Logic đánh giá

### 1. Miền giá trị hợp lệ

| Biến | Ý nghĩa   | Miền giá trị    |
| ---- | --------- | --------------- |
| `a`  | FPS       | 0 ≤ a ≤ 120     |
| `b`  | Thời gian | 0.0 ≤ b ≤ 100.0 |
| `c`  | Số lỗi    | 0 ≤ c ≤ 10      |

👉 Nếu vi phạm → `INVALID`

---

### 2. Các tiêu chí

* **TC1:** a ≥ 30 (FPS đủ mượt)
* **TC2:** b ≤ 20.0 (thời gian nhanh)
* **TC3:** c ≤ 3 (ít lỗi)

---

### 3. Phân loại kết quả

| Điều kiện                               | Kết quả   |
| --------------------------------------- | --------- |
| Input không hợp lệ                      | `INVALID` |
| TC1 ∧ TC2 ∧ (c == 0)                    | `GREAT`   |
| TC1 ∧ (vi phạm tối đa 1 trong TC2, TC3) | `GOOD`    |
| Còn lại                                 | `FAIL`    |

---
### Ý tưởng xử lý

1. Validate input
2. Kiểm tra case đặc biệt `GREAT`
3. Kiểm tra `GOOD`
4. Mặc định `FAIL`

---

## 🧪 Kiểm thử

### 1. Boundary Value Testing (BVA)

* Kiểm tra các giá trị:

  * min, max
  * min±, max±
  * nominal

👉 Tổng: **19 test cases**

### 2. Decision Table Testing

* Dựa trên bảng quyết định
* Bao phủ toàn bộ logic hệ thống

### 1. Thứ tự xử lý rất quan trọng

```
INVALID → GREAT → GOOD → FAIL
```

---

### 2. Phân biệt rõ:

* `GREAT`: hoàn hảo (c == 0)
* `GOOD`: chấp nhận được (≤ 1 lỗi logic)
* `FAIL`: còn lại
