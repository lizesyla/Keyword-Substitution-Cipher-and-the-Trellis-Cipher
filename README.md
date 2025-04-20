# Keyword-Substitution Cipher & Trellis Cipher

Ky projekt paraqet implementimin e dy teknikave klasike të enkriptimit: **Keyword-Substitution Cipher** dhe **Trellis Cipher**. Të dyja këto metoda kanë rëndësi historike në kriptografi dhe demonstrojnë bazat e manipulimit të të dhënave për qëllime sigurie.

---

## Përshkrimi i Algoritmeve

### Keyword-Substitution Cipher

**Keyword-Substitution Cipher** është një metodë monoalfabetike e zëvendësimit, ku një fjalë kyçe përdoret për të krijuar një alfabet të ri të zëvendësuar.

#### Mekanizmi i Algoritmit

##### 1. Gjenerimi i Alfabetit të Zëvendësimit
* Fjalëkyçja pastrohet nga shkronjat e përsëritura.
* Shtohet pas saj pjesa tjetër e alfabetit që nuk është përfshirë në fjalëkyçe.
* Krijohet një hartë e re për zëvendësim.

##### 2. Enkriptimi
* Çdo shkronjë në plaintext zëvendësohet me shkronjën përkatëse nga alfabeti i ri.

##### 3. Dekriptimi
* Alfabeti i zëvendësimit përdoret në drejtim të kundërt për të rikuperuar tekstin origjinal.

---

### Trellis Cipher

**Trellis Cipher** është një teknikë enkriptimi më moderne që përdor një rrjet (trellis) për të organizuar dhe manipuluar karakteret, zakonisht në mënyrë diagonale, për të krijuar konfuzion.

#### Mekanizmi i Algoritmit

##### 1. Ndërtimi i Rrjetës
* Teksti origjinal vendoset në një rrjet 2D në rreshta dhe kolona.
* Karakteret vendosen një nga një në mënyrë të organizuar (zakonisht në rreshta prej 4 ose 5 karakteresh).

##### 2. Enkriptimi
* Leximi i karaktereve bëhet në mënyrë diagonale ose sipas një trajektore të paracaktuar në rrjet.
* Kjo ndryshon pozicionin e karaktereve dhe rrit sigurinë e mesazhit.

#### 3. Dekriptimi
* Rrjeta rindërtohet dhe karakteret lexohen në rendin fillestar për të rikthyer plaintext-in.

---

## Ekzekutimi i Programit në PHP

1. Sigurohuni që serveri lokal me PHP është instaluar (p.sh., XAMPP, Laragon, etj).
2. Vendosni skedarin `cipher.php` në folderin e projektit tuaj (brenda `htdocs` në XAMPP).
3. Hapni shfletuesin dhe shkruani:

http://localhost/emriProjektit/cipher.php

4. Jipni input-in që dëshironi të enkriptoni dhe ndiqni udhëzimet.

---

## Shembuj të Rezultateve

Plaintext: HELLOWORLD Keyword: SECRET

Keyword-Substitution Cipher Output: ZITTYOTYDN

Trellis Cipher Output (lexuar diagonal): HDLEOLWROL
