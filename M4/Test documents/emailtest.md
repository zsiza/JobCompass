
# Tesztjegyzőkönyv - `Napi értesítő e-mail küldésének tesztelése`

A tesztdokumentum a `JobCompass` weboldal napi értesítő e-mail küldésének teszteléséhez készült. Felelős: `Nagy Szilvia Kamilla`

## 1. Teszteljárások (TP)

### 1.1. Napi értesítő e-mail küldésének tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01
- Leírás: A napi értesítő e-mail küldésének tesztelése
    0. lépés: Nyissuk meg a JobCompass weboldalt, és jelentkezzünk be a `USERDATA` felhasználói adatokkal.
    1. lépés: Várjuk meg a következő napi 16:00-kor érkező e-mailt.
    2. lépés: Ellenőrizzük, hogy megérkezett-e az e-mail. Elvárt eredmény: érkezzen egy automatikus értesítő e-mail, amely arra hívja fel a figyelmet, hogy ellenőrizzük a weboldalt, mert lehet, hogy van új megbízásunk.

## 2. Teszesetek (TC)

### 2.1. Napi értesítő e-mail küldésének tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: Napi értesítő e-mail küldésének tesztelése
- Bemenet: `USERDATA` = regisztrált felhasználói adatok
- Művelet: Várjuk meg a következő napi 16:00-kor érkező e-mailt.
- Elvárt kimenet: Az e-mail címre érkezik egy automatikus értesítő e-mail, amely arra hívja fel a figyelmet, hogy ellenőrizzük a weboldalt, mert lehet, hogy van új megbízásunk.

## 3. Tesztriportok (TR)

### 3.1. Napi értesítő e-mail küldésének tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: Bejelentkeztem a `USERDATA` felhasználói adatokkal.
    2. lépés: Vártam a következő napi 16:00-kor érkező e-mailt.
    3. lépés: Megérkezett az automatikus értesítő e-mail, amely arra hívta fel a figyelmet, hogy ellenőrizzem a weboldalt, mert lehet, hogy van új megbízásom. A teszt sikeres volt.
