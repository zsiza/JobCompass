### Tesztelési dokumentum a `3.` mérföldkőben elkészített fájlokról

### Tesztelt: `Fodor Döme`



#### Tesztelési folyamat: Statikus

 - Az elkészült kódok az IDE-k szerint (Webstorm, IntelliJ) a programkód megfelelően működik, hiba nélkül lefordul.
 - Egy hibás merge után bizonyos backend funkciók törlésre kerültek (e-mail-es értesítés, biztonsági mentés). Ezek a tesztelés pillanatában nem lettek pótolva.
 - A backend kódok, CRUD műveletek "fejben futtatva" a vártnak megfelelően működnek, logikai hibát nem találtam benne.
 - Az adatbázis táblái létre lettek hozva, adatokkal fel lehet tölteni, azokat olvasni, módosítani és törölni is.
 - A frontend-en megvalósított funkciók működnek. A jelenleg nem (megfelelően) működő gombok helyén jelenleg placeholder-ek állnak. 
 - A deploy nem a vártnak megfelelően történt, hibára fut. Ennek ellenére bizonyos részei működőképesek, pl. a backend-en keresztül elérhető az adatbázis.