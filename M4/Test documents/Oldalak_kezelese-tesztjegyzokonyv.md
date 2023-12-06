# Tesztjegyzőkönyv-`Oldalak kezelése`

Az alábbi tesztdokumentum a `JobCompass` projekthez tartozó `8.4.5 Oldalak kezelése` funkcióihoz készült. Felelőse: `Sötét Petra` 

---

## 1. Teszteljárások (TP)

### 1.1. Navigáció tesztelése 
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02, TC-03, TC-04, TC-05, TC-06, TC-07
- Leírás: Navigáció tesztelése
    0. lépés: Nyissuk meg az alkalmazást
    1. lépés: Kattintsunk egy menüpontra
    2. lépés: Ellenőrizzük, hogy a választott menüpont oldala jelenik-e meg. Elvárt eredmény: A választott menüpont oldalának tartalma látható

### 1.2. Footer tesztelése
- Azonosító: TP-02
- Tesztesetek: TC-08, TC-09, TC-10, TC-11, TC-12
- Leírás: Footer tesztelése
    0. lépés: Nyissuk meg az alkalmazást
    1. lépés: Kattintsunk egy footer pontra
    2. lépés: Ellenőrizzük, hogy a választott footer pont oldala jelenik-e meg. Elvárt eredmény: A választott footer pont oldalának tartalma látható

---

## 2. Teszesetek (TC)

### 2.1. Navigáció tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: A navigáció JobCompass menüpontjának tesztelése 
- Művelet: nyomjuk meg az "JobCompass" menüpontot 
- Elvárt kimenet: a főoldal tartalma látható

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: A navigáció Regisztráció menüpontjának tesztelése
- Művelet: nyomjuk meg a "Regisztráció" menüpontot 
- Elvárt kimenet: a regisztrációs oldal tartalma látható

#### 2.1.3. TC-03
- TP: TP-01
- Leírás: A navigáció Bejelentkezés menüpontjának tesztelése
- Művelet: nyomjuk meg a "Bejelentkezés" menüpontot 
- Elvárt kimenet: a bejelentkezés oldal tartalma látható

#### 2.1.4. TC-04
- TP: TP-01
- Leírás: A navigáció Szolgáltatások menüpontjának tesztelése
- Művelet: nyomjuk meg a "Szolgáltatások" menüpontot 
- Elvárt kimenet: a szolgáltatások oldal tartalma látható

#### 2.1.5. TC-05
- TP: TP-01
- Leírás: A navigáció Rólunk menüpontjának tesztelése
- Művelet: nyomjuk meg a "Rólunk" menüpontot 
- Elvárt kimenet: a rólunk oldal tartalma látható

#### 2.1.6. TC-06
- TP: TP-01
- Leírás: A navigáció Profil menüpontjának tesztelése
- Művelet: nyomjuk meg a "Profil" menüpontot 
- Elvárt kimenet: a profil oldal tartalma látható

#### 2.1.7. TC-07
- TP: TP-01
- Leírás: A navigáció Balance menüpontjának tesztelése
- Művelet: nyomjuk meg a "Balance" menüpontot (egyéb kinézet: 0 Ft)
- Elvárt kimenet: a balance oldal tartalma látható


### 2.2. Footer tesztesetei

#### 2.2.1. TC-08
- TP: TP-02
- Leírás: A footer Főoldal gombjának tesztelése
- Művelet: nyomjuk meg az "Főoldal" gombot 
- Elvárt kimenet: a főoldal tartalma látható

#### 2.2.2. TC-09
- TP: TP-02
- Leírás: A footer Rólunk gombjának tesztelése
- Művelet: nyomjuk meg az "Rólunk" gombot 
- Elvárt kimenet: a rólunk oldal tartalma látható

#### 2.2.3. TC-10
- TP: TP-02
- Leírás: A footer Regisztráció gombjának tesztelése
- Művelet: nyomjuk meg az "Regisztráció" gombot 
- Elvárt kimenet: a regisztrációs oldal tartalma látható

#### 2.2.4. TC-11
- TP: TP-02
- Leírás: A footer Bejelentkezés gombjának tesztelése
- Művelet: nyomjuk meg az "Bejelentkezés" gombot 
- Elvárt kimenet: a bejelentkezés oldal tartalma látható

#### 2.2.5. TC-12
- TP: TP-02
- Leírás: A footer Kérdések gombjának tesztelése
- Művelet: nyomjuk meg az "Kérdések" gombot 
- Elvárt kimenet: a kérdések oldal tartalma látható

---

## 3. Tesztriportok (TR)

### 3.1. Navigáció tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: megnyomtam a JobCompass menüpontot
    2. lépés: megkaptam a főoldalt
    
#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: megnyomtam a Regisztráció menüpontot
    2. lépés: megkaptam a regisztrációs oldalt

#### 3.1.3. TR-03 (TC-03)
- TP: TP-01
    1. lépés: megnyomtam a Bejelentkezés menüpontot
    2. lépés: megkaptam a bejelentkezés oldalt

#### 3.1.4. TR-04 (TC-04)
- TP: TP-01
    1. lépés: megnyomtam a Szolgáltatások menüpontot
    2. lépés: megkaptam a szolgáltatások oldalt

#### 3.1.5. TR-05 (TC-05)
- TP: TP-01
    1. lépés: megnyomtam a Rólunk menüpontot
    2. lépés: megkaptam a rólunk oldalt

#### 3.1.6. TR-06 (TC-06)
- TP: TP-01
    1. lépés: megnyomtam a Profil menüpontot
    2. lépés: megkaptam a profil oldalt
    
#### 3.1.7. TR-07 (TC-07)
- TP: TP-01
    1. lépés: megnyomtam a Balance menüpontot
    2. lépés: megkaptam a balance oldalt


### 3.2. Footer tesztriportjai

#### 3.2.1. TR-08 (TC-08)
- TP: TP-02
    1. lépés: megnyomtam a Főoldal gombot a footerben
    2. lépés: megkaptam a főoldalt

#### 3.2.2. TR-09 (TC-09)
- TP: TP-02
    1. lépés: megnyomtam a Rólunk gombot a footerben
    2. lépés: megkaptam a rólunk oldalt

#### 3.2.3. TR-10 (TC-10)
- TP: TP-02
    1. lépés: megnyomtam a Regisztráció gombot a footerben
    2. lépés: megkaptam a regisztráció oldalt

#### 3.2.4. TR-11 (TC-11)
- TP: TP-02
    1. lépés: megnyomtam a Bejelentkezés gombot a footerben
    2. lépés: megkaptam a bejelentkezés oldalt

#### 3.2.5. TR-12 (TC-12)
- TP: TP-02
    1. lépés: megnyomtam a Kérdések gombot a footerben
    2. lépés: hiba: megkaptam a főoldalt