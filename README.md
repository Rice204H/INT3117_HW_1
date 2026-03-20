# AR System 

## Giới thiệu

Dự án này triển khai và kiểm thử một hệ thống đánh giá trải nghiệm người dùng cho ứng dụng AR dựa trên 3 tiêu chí:

* **FPS (Frames Per Second)** – tốc độ khung hình
* **Thời gian hoàn thành (seconds)**
* **Số lỗi thao tác**

Hệ thống sẽ phân loại mức độ trải nghiệm thành:

* `GREAT`
* `GOOD`
* `FAIL`
* `INVALID`

---

## Logic đánh giá

### 1. Miền giá trị hợp lệ

| Biến | Ý nghĩa   | Miền giá trị    |
| ---- | --------- | --------------- |
| `a`  | FPS       | 0 ≤ a ≤ 120     |
| `b`  | Thời gian | 0.0 ≤ b ≤ 100.0 |
| `c`  | Số lỗi    | 0 ≤ c ≤ 10      |

Nếu vi phạm → `INVALID`

---

### 2. Các tiêu chí

* **TC1:** a ≥ 30
* **TC2:** b ≤ 20.0 
* **TC3:** c ≤ 3

---

### 3. Phân loại kết quả

| Điều kiện                               | Kết quả   |
| --------------------------------------- | --------- |
| Input không hợp lệ                      | `INVALID` |
| TC1 ∧ TC2 ∧ (c == 0)                    | `GREAT`   |
| TC1 ∧ (vi phạm tối đa 1 trong TC2, TC3) | `GOOD`    |
| Còn lại                                 | `FAIL`    |

---


### 4. Phân biệt rõ:

* `GREAT`: hoàn hảo (c == 0)
* `GOOD`: chấp nhận được (≤ 3 lỗi logic)
* `FAIL`: còn lại
