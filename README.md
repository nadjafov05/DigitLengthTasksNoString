# DigitLengthTasksNoString

Bu repozitoriyada `String` və `String.valueOf()` istifadə etmədən, sadəcə **ədədlərin rəqəm sayını tapmaq** mövzusuna həsr olunmuş **50 mərhələli Java tapşırıqları** yer alır.

---

## 🎯 Məqsəd

Bu layihənin məqsədi aşağıdakı fundamental Java biliklərini möhkəmləndirməkdir:

- `while` dövrləri ilə işləmək
- Bölmə (`/`) və qalıq (`%`) operatorları
- `if`, `else` kimi şərt strukturları
- Massiv (array) anlayışı və dövrlə oxuma
- Rəqəmlərlə məntiqi düşünmə və analiz bacarığını artırmaq

---

## 🔢 Tapşırıq Strukturu

Tapşırıqlar çətinlik səviyyəsinə görə bölünüb:

- ✅ 10 Asan Tapşırıq  
- ✅ 10 Orta-Asan Tapşırıq  
- ✅ 10 Orta Səviyyəli Tapşırıq  
- ✅ 10 Orta-Çətin Tapşırıq  
- ✅ 10 Çətin Tapşırıq  

Hər tapşırıq yalnız **rəqəmsal üsullarla** (yəni, ədədin `while` dövrü ilə bölünməsi) yerinə yetirilməlidir.

---

## ❗ Qaydalar

- `String`, `String.valueOf()`, `.length()` və oxşar metodlar **istifadə olunmur**
- Yalnız rəqəm əsaslı (rəqəmi 10-a bölərək) məntiq tətbiq olunur
- Kənar kitabxanalar istifadə olunmur, sadəcə **saf Java**

---

## 📌 Nümunə Tapşırıq

> Massivdə neçə ədədin rəqəm sayı cütdür?  
> (Amma `String.valueOf()` olmadan)

**Yanaşma:**
- Hər bir ədəd üçün `while (number > 0)` dövrü qur
- Hər bölmədə `length++` artır
- Əgər `length % 2 == 0`, sayacı artır

---

## 💻 Müəllif

Bu layihə **özünü inkişaf etdirmək** və `String`-siz məntiq qurmaq bacarığını təkmilləşdirmək üçün hazırlanmış təcrübə proyektidir.

---
