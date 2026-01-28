# 🧪 SwagLabs Katalon Automation

![Katalon Studio](https://img.shields.io/badge/Katalon%20Studio-10.4.3-green?style=for-the-badge&logo=katalon)
![Groovy](https://img.shields.io/badge/Groovy-Script-blue?style=for-the-badge&logo=apache-groovy)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-orange?style=for-the-badge&logo=selenium)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

Proyek otomasi testing menggunakan **Katalon Studio** untuk website demo e-commerce [Swag Labs (Sauce Demo)](https://www.saucedemo.com/).

---

## 📋 Deskripsi

Proyek ini berisi kumpulan test cases dan test suites untuk melakukan automated testing pada website **Swag Labs** (https://www.saucedemo.com/). Website ini merupakan sample e-commerce yang biasa digunakan untuk latihan automation testing.

### Fitur yang Ditest:
- ✅ **Login** - Validasi login dengan berbagai skenario user
- ✅ **Add to Cart** - Menambahkan produk ke keranjang
- ✅ **Checkout** - Proses checkout lengkap dari awal hingga selesai
- ✅ **Error Handling** - Validasi pesan error (locked out user)

---

## 🏗️ Struktur Project

```
SwagLabs_Auto/
├── 📁 Data Files/              # Test data (Excel/CSV)
│   ├── DataCheckout.xlsx       # Data checkout information
│   └── Test_Checkout.dat       # Test data binding configuration
├── 📁 Include/                 # Custom keywords & scripts
├── 📁 Object Repository/       # Page objects (UI elements)
│   └── Page_Swag Labs/         # Swag Labs page objects
│       ├── btn_login.rs
│       ├── btn_AddToCart*.rs
│       ├── txt_username.rs
│       ├── txt_password.rs
│       └── ... (21 objects)
├── 📁 Profiles/                # Execution profiles
├── 📁 Scripts/                 # Groovy test scripts
│   ├── TC_Checkout_Success/    # Checkout success script
│   └── TC_Login_LockedOut/     # Locked user login script
├── 📁 Test Cases/              # Test case definitions
│   ├── TC_Checkout_Success.tc
│   └── TC_Login_LockedOut.tc
├── 📁 Test Suites/             # Test suite collections
│   └── TS_Checkout.ts
└── 📄 SwagLabs_Auto.prj        # Katalon project file
```

---

## 📝 Test Cases

### 1. TC_Checkout_Success
Test case untuk memvalidasi proses checkout yang berhasil.

**Skenario:**
1. Buka browser dan navigasi ke Swag Labs
2. Login dengan user `standard_user`
3. Pilih produk (Sauce Labs Backpack)
4. Tambahkan ke keranjang dari halaman detail
5. Kembali ke halaman produk
6. Tambahkan produk lain ke keranjang
7. Hapus salah satu produk
8. Verifikasi jumlah item di keranjang = 1
9. Buka keranjang dan checkout
10. Isi informasi checkout (First Name, Last Name, Zip Code)
11. Lanjutkan ke overview dan finish
12. Verifikasi order berhasil

**Variables:**
| Variable | Deskripsi |
|----------|-----------|
| `var_first` | First Name untuk checkout |
| `var_last` | Last Name untuk checkout |
| `var_zip` | Zip/Postal Code untuk checkout |

### 2. TC_Login_LockedOut
Test case untuk memvalidasi error message ketika login dengan user yang terkunci.

**Skenario:**
1. Buka browser dan navigasi ke Swag Labs
2. Login dengan user `locked_out_user`
3. Verifikasi pesan error "locked out" ditampilkan

---

## 📊 Test Suites

### TS_Checkout
Test suite yang menjalankan semua test cases dengan data-driven testing.

**Test Cases Included:**
- TC_Checkout_Success (dengan data binding dari `Data Files/Test_Checkout`)
- TC_Login_LockedOut

---

## 🚀 Cara Menjalankan

### Prerequisites
- **Katalon Studio** versi 10.4.3 atau lebih baru
- **Browser** Chrome/Firefox/Edge yang terinstall
- **WebDriver** yang sesuai dengan versi browser

### Langkah-langkah:

1. **Clone repository ini:**
   ```bash
   git clone https://github.com/username/SwagLabs-Katalon-Automation.git
   ```

2. **Buka Katalon Studio**

3. **Import Project:**
   - File → Open Project
   - Pilih folder `SwagLabs_Auto`
   - Klik Open

4. **Jalankan Test:**
   - **Single Test Case:** Klik kanan pada test case → Run
   - **Test Suite:** Klik kanan pada test suite → Run

### Command Line Execution:
```bash
katalonc -noSplash -runMode=console -projectPath="path/to/SwagLabs_Auto.prj" -testSuitePath="Test Suites/TS_Checkout" -browserType="Chrome"
```

---

## 🔧 Test Data

### DataCheckout.xlsx
File Excel yang berisi data untuk checkout testing:

| First Name | Last Name | Zip |
|------------|-----------|-----|
| John | Doe | 12345 |
| Jane | Smith | 67890 |
| ... | ... | ... |

---

## 🎯 Page Objects

Semua element UI disimpan dalam **Object Repository** dengan naming convention:
- `btn_` - Button elements
- `txt_` - Text input fields
- `lbl_` - Label/text elements
- `cart_` - Cart related elements
- `input_` - Input elements

---

## 🔐 Test Credentials

| Username | Password | Deskripsi |
|----------|----------|-----------|
| `standard_user` | `secret_sauce` | User normal untuk testing |
| `locked_out_user` | `secret_sauce` | User terkunci untuk negative testing |

> ⚠️ **Note:** Password di-encrypt menggunakan Katalon encryption

---

## 📈 Reporting

Katalon Studio secara otomatis menggenerate report setelah eksekusi:
- **HTML Report** - Di folder `Reports/`
- **JUnit XML** - Untuk integrasi CI/CD
- **PDF Report** - Export manual dari Katalon

---

## 🤝 Contributing

1. Fork repository ini
2. Buat branch baru (`git checkout -b feature/new-test-case`)
3. Commit perubahan (`git commit -m 'Add new test case'`)
4. Push ke branch (`git push origin feature/new-test-case`)
5. Buat Pull Request

---

## 📄 License

Project ini menggunakan lisensi MIT. Lihat file [LICENSE](LICENSE) untuk detail lebih lanjut.

---

## 👨‍💻 Author

**QA Engineer**

---

## 📚 Resources

- [Katalon Studio Documentation](https://docs.katalon.com/)
- [Swag Labs Demo Site](https://www.saucedemo.com/)
- [Selenium WebDriver](https://www.selenium.dev/)
- [Groovy Documentation](https://groovy-lang.org/documentation.html)
