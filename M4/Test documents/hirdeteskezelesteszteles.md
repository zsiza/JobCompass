
# Tesztjegyzőkönyv - `Hirdetések kezeléséről`

A tesztdokumentum a `JobCompass` hirdetések teszteléséhez készült. Felelős: `Zsemberi Izabella`

## 1. Teszteljárások (TP)

### 1.1. Hirdetések megtekintésének tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01
- Leírás: Hirdetések megtekintésének tesztelése
    0. lépés: Nyissuk meg a JobCompass weboldalt, és navigáljunk a szolgáltatások oldalra.
    1. lépés: A legördülő listából válasszuk ki a kívánt szűrést.
    2. lépés: Ellenőrizzük, hogy kilistázta e a hirdetéseket. 
    Elvárt eredmény: Hirdetések megjelennek.

## 2. Teszesetek (TC)

### 2.1. Hirdetések létrehozásának tesztelése

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: Hirdetések létrehozásának tesztelése
- Navigáljunk a szolgáltatások oldalra.
- Kattintsunk a plusz gombra.
- elvárás: megnyílik egy új ablak kitöltendő hirdetéssel. Kitöltjük, majd az eredmény a szűrésnél megtaláljuk.
