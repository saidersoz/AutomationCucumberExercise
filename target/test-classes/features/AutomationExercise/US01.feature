#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Signup / Login' button
#5. Verify 'New User Signup!' is visible
#6. Enter name and email address
#7. Click 'Signup' button
#8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
#9. Fill details: Title, Name, Email, Password, Date of birth
#10. Select checkbox 'Sign up for our newsletter!'
#11. Select checkbox 'Receive special offers from our partners!'
#12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#13. Click 'Create Account button'
#14. Verify that 'ACCOUNT CREATED!' is visible
#15. Click 'Continue' button
#16. Verify that 'Logged in as username' is visible
#17. Click 'Delete Account' button
#18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

# 1. Tarayıcıyı başlatın
# 2. 'http://automationexercise.com' URL'sine gidin
# 3. Ana sayfanın başarıyla göründüğünü doğrulayın
# 4. 'Kaydol / Giriş Yap' düğmesine tıklayın
# 5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
# 6. Adı ve e-posta adresini girin
# 7. 'Kaydol' düğmesini tıklayın
# 8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin göründüğünü doğrulayın
# 9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi
# 10. 'Bültenimize kaydolun!' onay kutusunu seçin.
# 11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
# 12. Ayrıntıları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
# 13. 'Hesap Oluştur düğmesini' tıklayın
# 14. 'HESAP OLUŞTURULDU!' görünür
# 15. 'Devam Et' düğmesini tıklayın
# 16. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
# 17. 'Hesabı Sil' düğmesini tıklayın
# 18. 'HESAP SİLİNDİ!' görünür ve 'Devam Et' düğmesini tıklayın

Feature: US01_Register User Test

  Scenario: TC01 Kullanici Register Test Eder
    Given Kullanici "automationexercise_Url" sayfasinda
    When Kullanci Anasayfanin basariyla goruntulendigini test eder
    And Kullanici Signup / Login butonuna tiklar
    And Kullanici New User Signup yazisinin goruntulendigini test eder
    And Kullanici name ve email address girer
    And Kullanici Signup butonuna tiklar
    And kullanici ENTER ACCOUNT INFORMATION yazisinin goruntulendigini test eder
    And kullanici Title, Name, Email, Password, Date of birth alanlarini doldurur
    And Kullanici Sign up for our newsletter! butonuna tiklar
    And Kullanici Receive special offers from our partners! butonuna tiklar
    And Kullanici First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number alanlarini doldurur
    And Kullanici Create Account button butonuna tiklar
    And Kullanici ACCOUNT CREATED! yazisinin goruntulendigini test eder
    And Kullanici Continue butonuna tiklar
    And Kullanici Logged in as username yazisinin goruntulendigini test eder
    And Kullanici Delete Account butonuna tiklar
    And Kullanici ACCOUNT DELETED! yazisinin goruntulendigini test eder
    And Kullanici Continue butonuna tiklar
    And Sayfayi kapatir
