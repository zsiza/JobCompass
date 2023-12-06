# Tesztjegyzőkönyv - `Automatikus biztonsági mentés`

Az alábbi tesztdokumentum a `2023_ib153i-11_d` projekthez tartozó `8.4.10. Biztonsági mentés tesztelése` funkcióihoz készült. Felelőse: `Kovács Bence` 


## 1. Teszteljárások (TP)

### 1.1. Weboldal biztonsági mentésének tesztelése 
- Azonosító: TP-01
- Tesztesetek: TC-01
- Leírás: biztonsági mentés funkció tesztelése a weboldal backendjéről
    0. lépés: Futtatjuk az alkalmazást 0:00-kor
    1. lépés: Ellenőrizzük az output mappát. Elvárt eredmény: a weboldalról készült biztonsági mentés
	
### 1.2. Adatbázis biztonsági mentésének tesztelése 
- Azonosító: TP-02
- Tesztesetek: TC-01
- Leírás: biztonsági mentés funkció tesztelése a weboldal adatbázisáról
    0. lépés: Futtatjuk az alkalmazást 0:00-kor
    1. lépés: Ellenőrizzük a Heroku rendszerét. Elvárt eredmény: biztonsági mentés a felületen

## 2. Teszesetek (TC)

### 2.1. Weboldal biztonsági mentésének tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: biztonsági mentés funkció tesztelése a weboldal backendjéről 
- Bemenet: -
- Művelet: automatikus mentés 
- Elvárt kimenet: biztonsági mentés mappája a `src/main/java` mappában, `backup` néven

### 2.2. Adatbázis biztonsági mentésének tesztesetei

#### 2.2.1. TC-01
- TP: TP-02
- Leírás: biztonsági mentés funkció tesztelése a weboldal adatbázisáról 
- Bemenet: -
- Művelet: automatikus mentés 
- Elvárt kimenet: biztonsági mentés a Heroku felületén

## 3. Tesztriportok (TR)

### 3.1. Weboldal biztonsági mentésének tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    0. lépés: elindult a szerver
    1. lépés: a mappa elkészült, benne a fájlok le lettek másolva
    

### 3.2. Négyzetre emelés funkció tesztriportjai

#### 3.2.1. TR-01 (TC-01)
- TP: TP-02
    0. lépés: elindult a szerver
    1. lépés: a biztonsági mentés elkészült, az exportálható sql fájlt megtaláltam