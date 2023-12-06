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