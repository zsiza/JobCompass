# Tesztjegyzőkönyv - `Felhasználói munkamenet tesztelése`

A tesztdokumentum a `JobCompass` weboldal bejelentkezési és kijelentkezési funkciójának teszteléséhez készült. Felelős: `Nagy Szilvia Kamilla`

## 1. Teszteljárások (TP)

### 1.1. Bejelentkezés tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: A bejelentkezési funkció tesztelése
    0. lépés: Nyissuk meg a JobCompass weboldalt.
    1. lépés: Kattintsunk a bejelentkezés gombra.
    2. lépés: Adjuk meg a felhasználói adatokat.
    3. lépés: Kattintsunk a bejelentkezés gombra.
    4. lépés: Ellenőrizzük, hogy megjelenik-e a sikeres bejelentkezés üzenet.

### 1.2. Kijelentkezés tesztelése
- Azonosító: TP-02
- Tesztesetek: TC-03
- Leírás: A kijelentkezési funkció tesztelése
    0. lépés: Nyissuk meg a JobCompass weboldalt, és jelentkezzünk be a felhasználói adatokkal.
    1. lépés: Kattintsunk a kijelentkezés gombra.
    2. lépés: Ellenőrizzük, hogy megjelenik-e a sikeres kijelentkezés üzenet.

## 2. Teszesetek (TC)

### 2.1. Bejelentkezés tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: Sikeres bejelentkezés tesztelése
- Bemenet: `USERDATA` = regisztrált felhasználói adatok
- Művelet: Kattintsunk a bejelentkezés gombra.
- Elvárt kimenet: A rendszer kiírja, hogy "sikeres bejelentkezés".

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: Sikertelen bejelentkezés tesztelése
- Bemenet: `USERDATA` = nem regisztrált felhasználói adatok
- Művelet: Kattintsunk a bejelentkezés gombra.
- Elvárt kimenet: A rendszer figyelmeztet, hogy "a felhasználónév, vagy jelszó nem helyes".

### 2.2. Kijelentkezés tesztesetei

#### 2.2.1. TC-03
- TP: TP-02
- Leírás: Sikeres kijelentkezés tesztelése
- Bemenet: `USERDATA` = regisztrált felhasználói adatok
- Művelet: Kattintsunk a kijelentkezés gombra.
- Elvárt kimenet: A rendszer kiírja, hogy "sikeres kijelentkezés".

## 3. Tesztriportok (TR)

### 3.1. Bejelentkezés tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: Megnyitottam a JobCompass weboldalt.
    2. lépés: Kattintottam a bejelentkezés gombra.
    3. lépés: Megadtam a `USERDATA` felhasználói adatokat.
    4. lépés: Kattintottam a bejelentkezés gombra.
    5. lépés: Megjelent a "sikeres bejelentkezés" üzenet. A teszt sikeres volt.

#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: Megnyitottam a JobCompass weboldalt.
    2. lépés: Kattintottam a bejelentkezés gombra.
    3. lépés: Megadtam a nem regisztrált `USERDATA` felhasználói adatokat.
    4. lépés: Kattintottam a bejelentkezés gombra.
    5. lépés: Megjelent a "a felhasználónév, vagy jelszó nem helyes" figyelmeztetés. A teszt sikeres volt.

### 3.2. Kijelentkezés tesztriportjai

#### 3.2.1. TR-03 (TC-03)
- TP: TP-02
    1. lépés: Megnyitottam a JobCompass weboldalt, és bejelentkeztem a `USERDATA` felhasználói adatokkal.
    2. lépés: Kattintottam a kijelentkezés gombra.
    3. lépés: Megjelent a "sikeres kijelentkezés" üzenet. A teszt sikeres volt.