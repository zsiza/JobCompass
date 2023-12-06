# Tesztjegyzőkönyv-`Hirdetések`

Az alábbi tesztdokumentum a `JobCompass` projekthez tartozó `8.4.6 Hirdetések kezelésének tesztelése` funkcióihoz készült. Felelőse: `Madai Zsuzsanna` 

``` 

## 1. Teszteljárások (TP)

### 1.1. Szolgáltatások oldal tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02, TC-03, TC-04, TC-05 
- Leírás: Teszteljük a Szolgáltatások oldalt
    0. lépés: Nyissuk meg az alkalmazást, és kattintsunk rá a szolgáltatások menüpontra
    1. lépés: A legördülő menüből válasszuk ki `TYPE1` típust 
    2. lépés: Nyomjuk meg az `Kiválaszt` gombot
    3. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `Kilistázza a TYPE1 típusú szolgáltatásokat`

### 1.2. Plusz gomb megnyomása
- Azonosító: TP-02
- Tesztesetek: TC-06
- Leírás: Teszteljük a Szolgáltatások oldalon lévő + gombot
    0. lépés: Nyissuk meg az alkalmazást, és kattintsunk rá a szolgáltatások menüpontra
    1. lépés: Nyomjuk meg az oldal jobb alján elhelyezett `+` gombot
    2. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `Hirdetés létrehozása oldal betöltése`

### 1.3. Plusz gomb megnyomása után megjelenő létrehozás oldal 
- Azonosító: TP-03
- Tesztesetek: TC-07, TC-08
- Leírás: A `+` gomb megnyomása után a hirdetések létrehozása oldalra kerülünk
    0. lépés: Megnyomjuk a `+` gombot
    1. lépés: A legördülő menüből kiválasztunk egy `TYPE` típust  
    2. lépés: A cím mezőbe beírunk egy `CIM` szöveget 
    3. lépés: A leírás mezőbe beírunk egy `LEIRAS` szöveget
    4. lépés: A munkavégzéshez szükséges napok száma mezőbe beírjuk a `NAPOK` számot
    5. lépés: Az ár mezőbe beírjuk a `AR` számot

## 2. Teszesetek (TC)

### 2.1. Szolgáltatások oldal 

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: Szolgáltatások oldal betöltésének tesztelése
- Bemenet: `TYPE1` = Logó Készítés   
- Művelet: Megnyomjuk a Kiválaszt gombot 
- Elvárt kimenet: Továbbítás az adatbázis felé

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: Szolgáltatások oldal betöltésének tesztelése
- Bemenet: `TYPE1` = Business
- Művelet: Megnyomjuk a Kiválaszt gombot  
- Elvárt kimenet: Továbbítás az adatbázis felé 


#### 2.1.3. TC-03
- TP: TP-01
- Leírás: Szolgáltatások oldal betöltésének tesztelése
- Bemenet:  `TYPE1` = Fényképezés
- Művelet: Megnyomjuk a Kiválaszt gombot
- Elvárt kimenet: Továbbítás az adatbázis felé

#### 2.1.4. TC-04
- TP: TP-01
- Leírás: Szolgáltatások oldal betöltésének tesztelése
- Bemenet:  `TYPE1` = End-To-End Projektek
- Művelet: Megnyomjuk a Kiválaszt gombot
- Elvárt kimenet: Továbbítás az adatbázis felé


#### 2.1.5. TC-05
- TP: TP-01
- Leírás: Szolgáltatások oldal betöltésének tesztelése
- Bemenet:  `TYPE1` = Adatkezelés
- Művelet: Megnyomjuk a Kiválaszt gombot
- Elvárt kimenet: Továbbítás az adatbázis felé

### 2.2. Gomb tesztelése 

#### 2.2.1. TC-06
- TP: TP-02
- Leírás: Gomb tesztelése  
- Művelet: Megnyomjuk a `+` gombot 
- Elvárt kimenet: Megjelenik a Hirdetések kezelése oldal


### 2.3. Plusz gomb megnyomása után megjelenő létrehozás oldal tesztelése

#### 2.3.1. TC-07
- TP: TP-03
- Leírás: Helyesen kitöltött INPUT mezők
- Bemenet: `TYPE2` = Logó Készítés ; `CIM` = Cica logó ; `LEIRAS` = Cicás logó gyártása ; `NAPOK` = 126 ; `AR` = 100000  
- Művelet: Megnyomjuk a Létrehoz gombot 
- Elvárt kimenet: Sikeres hirdetés létrehozás. Továbbítás az adatbázis felé

#### 2.3.2. TC-08
- TP: TP-03
- Leírás: Helytelenül kitöltött INPUT mezők (az árhoz betű is kerül)
- Bemenet: `TYPE2` = Logó Készítés ; `CIM` = Cica logó ; `LEIRAS` = Cicás logó gyártása ; `NAPOK` = 126 ; `AR` = ezerFT  
- Művelet: Megnyomjuk a Létrehoz gombot  
- Elvárt kimenet: Sikertelen hirdetés létrehozás. Hibaüzenet: "Az ár mezőbe csak számok írhatók!" 






















