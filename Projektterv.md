rendszerfejlesztés projekt terv

összefoglaló
Projektünk alapja a Fiverr nevű külföldi oldal, amit hazánkban kevesen ismernek. Ezzel az oldallal próbáljuk meg betölteni azt a piaci rést, ami jelenleg a magyar szabadúszó piacon általánosnak mondható. Projektünk célja egy olyan weboldalt létrehozni, ami egyaránt nyújt helyet a szabadúszó munkavállalóknak és munkások keresésének. 

2. A projekt bemutatása
Ez a projektterv egy Fiverr-alapú projektet mutat be, amely 2023-09-20-tól, 2023-12-04-ig tart, 
Ez a projektterv a Szallítmányozás projektet mutatja be, amely 2021-09-20-től 2021-11-27-ig tart, azaz összesen 68 napon keresztül fog futni. A projekten három fejlesztő fog dolgozni, az elvégzett feladatokat pedig négy alkalommal fogjuk prezentálni a megrendelőnek, annak érdekében, hogy biztosítsuk a projekt folyamatos előrehaladását.
A megvalósítás további általános leírása, pl. mennyi ideig tart a projekt, mennyi főből áll a csapat, 
mennyi átadandó lesz a megrendelőnek átadva a félév során (szintén 2-3 mondattal leírva).
2.1. Rendszerspecifikáció
A rendszernek képesnek kell lennie arra, hogy egy adott szállítmányozó cég raktárait illetve a raktárak állapotát (telítettség, fizikai pozíció, speciális tulajdonság pl. veszélyes anyag tárolás) nyilvántartsa annak érdekében, hogy az adminisztrátorok képesek legyenek egy-egy bejövő szállítmányozási kérést kiszolgálni a raktárak vagy külső helyszín között. Ezenkívül a szállítmányozó cég alkalmazásában álló sofőröket, illetve a cég kamionjait is kezelnie kell (pl. van-e képzettsége veszélyes anyag szállítására, elérhető-e éppen a megfelelő pótkocsi a szállításhoz). A bejövő szállítmányozási kérés alapján az alkalmazás számolja ki leghamarabb mikor teljesíthető a kérés, majd jelenítsük meg grafikusan egy útvonalat, amely alapján - akár több raktár érintésével - a külső helyszínre szállítja az anyagot. Minden funkció a megfelelő felhasználói jogosultság mellett használható, annak függvényében írható, olvasható vagy nem megtekinthető az adat.
Itt már specifikusabban, részletesebben írd le, hogy mik a fő célok, mit fog tudni a rendszer (4-6 mondatban), 
ami a projekt keretében kerül megvalósításra. Mik a megrendelő és a felhasználók igényei?
2.2. Funkcionális követelmények
Felhasználók kezelése (admin, raktáros, sofőr) (CRUD)
Felhasználói munkamenet megvalósítása több jogosultsági szinttel
Raktárak kezelése (CRUD)
Árukészletek kezelése (CRUD)
Járművek kezelése (CRUD)
Fuvarok/szállítmányok kezelése (CRUD)
Email-es kiértesítés új szállítmány esetén az adott raktárosnak és sofőrnek
Fuvar útvonalának megjelenítése térképen a kezdő és a végponttal együtt
Biztonsági mentés automatikus létrehozása
Itt lehet pontosan felsorolni a rendszerrel szemben támasztott funkcionális igényeket, azaz amit a rendszernek tudnia kell. 
Ezeket a feladatokat kell majd a csapattagok között szétosztani a 8-as fejezetben.

A CRUD rövidítés a következőt jelenti: Create, Read, Update, Delete.
Azaz a funkcióhoz tartozó adat létrehozása, olvasása, frissítése, törlése.
2.3. Nem funkcionális követelmények
A kliens oldal böngészőfüggetlen legyen
Reszponzív megjelenés
Az érzékeny adatokat biztonságosan tároljuk
A legfrissebb technológiákat használja a rendszer
A rendszer nem funkcionális követelményei, pl.: milyen környezetben fusson, milyen teljesítményt kell produkálnia, 
milyen megjelenéssel kell rendelkeznie. Ha lehetséges, akkor ezeket a feladatokat is ki kell osztani a csapattagok között.
3. Költség- és erőforrás-szükségletek
Az erőforrásigényünk összesen 57 személynap, átlagosan 19 személynap/fő.
A rendelkezésünkre áll összesen 3 * 70 = 210 pont.
Becsült sarokszámok, a rendelkezésre álló erőforrás fejenként általában 17-21 személynap, 
a pontok száma = fejenként a projektre kapható maxpont * tagok száma.
4. Szervezeti felépítés és felelősségmegosztás
A projekt megrendelője Dr. Márkus András. A Szállítmányozás projektet a projektcsapat fogja végrehajtani, amely jelenleg három fejlesztőből áll. A csapatban található tapasztalt és pályakezdő webprogramozó is, A tapasztalt projekttagok több éve dolgoznak az iparban, számos sikeres projektten vannak túl.
Teszt Elek (3 év ipari tapasztalat a Számító Gép Kft.-nél)
Remek Elek (3 év egyetemi tapasztalat)
Lev Elek (<1 év tapasztalatő)
Itt lehet részletezni pl. a tagok szakmai tapasztalatait, vagy akár a releváns gyakorlati helyeket, munkahelyeket megemlíteni.
4.1 Projektcsapat
A projekt a következő emberekből áll:
Név
Pozíció
E-mail cím (stud-os)
Teszt Elek
Projektmenedzser
h123456@stud.u-szeged.hu
Remek Elek
Projekt tag
h654321@stud.u-szeged.hu
Lev Elek
Projekt tag
h000000@stud.u-szeged.hu

Betölthető pozíciók: projektmenedzser, projekt tag.
5. A munka feltételei
5.1. Munkakörnyezet
A projekt a következő munkaállomásokat fogja használni a munka során:
Munkaállomások: 3 db, Windows 10-es operációs rendszerrel
Dell Inspiron 5558 laptop (CPU: i5 5200U, RAM: 8 GB, GPU: Nvidia 920M)
Acer Aspire 573g laptop (CPU: i3 5005U, RAM: 4 GB, GPU: Nvidia 920M)
Asztali számítógép (CPU: i7 7700k, RAM: 16GB, GPU: Nvidia GTX1070)
A projekt a következő technológiákat/szoftvereket fogja használni a munka során:
Heroku platformszolgáltatás a webalkalmazás hosztolásához
Heroku által biztosított PostgreSQL adatbázisszerver
Spring Boot keretrendszer
Thymeleaf dinamikus tartalom megjelenítés a felhasználói felületen
Maven szoftverprojekt menedzselő szoftver
Eclipse IDE fejlesztőkörnyezet
Git verziókövető (GitLab)
Milyen gépet használnak a projekttagok, milyen operációs rendszeren fejlesztenek, milyen szoftverkörnyezetben, stb.
5.2. Rizikómenedzsment
Kockázat
Leírás
Valószínűség
Hatás
Betegség
Súlyosságtól függően hátráltatja vagy bizonyos esetekben teljes mértékben korlátozza a munkavégzőt, így az egész projektre kihatással van. Megoldás: a feladatok átcsoportosítása
nagy
erős
Kommunikációs fennakadás a csapattagokkal
A csapattagok között nem elégséges az információ áramlás, nem pontosan, esetleg késve vagy nem egyértelműen tájékoztatjuk egymást. Megoldás: még gyakoribb megbeszélések és ellenőrzések
kis
erős

A rizikótényezők bemutatása, amely hátráltathatja a projekt befejezését. 
Minden rizikót érdemes megemlíteni, részletezve, hogy mit jelent, 
milyen valószínűséggel következhet be (kis, közepes és nagy), 
mekkora a várható hatása (gyenge, közepes és erős) 
és hogy milyen tervvel készültök, amennyiben egy ilyen esemény bekövetkezik. 
Pl.: betegség, szoftver-hardver probléma, tag kiesése, extrém ZH időszak, pandémia, stb.
6. Jelentések
6.1. Munka menedzsment
A munkát Teszt Elek koordinálja. Fő feladata, hogy folyamatosan egyeztessen a csapattagokkal az előrehaladásról és a fellépő problémákról, esetlegesen a megoldásban is segítséget nyújhat a projekt csúszásának elkerülése végett. További feladata a heti szinten tartandó csoportgyűlések időpontjának és helyszínének leszervezése, erről email-ben tájékoztatja a projektcsapatot.
Írd le, hogy ki menedzseli a munkát (tipikusan a projekt menedzser), mik a feladatai, és azokat hogyan hajtja végre.
6.2. Csoportgyűlések
A projekt hetente ülésezik, hogy megvitassák az azt megelőző hét problémáit, illetve hogy megbeszéljék a következő hét feladatait. A megbeszélésről minden esetben memó készül.
1. megbeszélés:
Időpont: 2021.09.15.
Hely: SZTE Irinyi épület - Szeged, Tisza Lajos krt. 103
Résztvevők: Teszt Elek, Remek Elek, Lev Elek
Érintett témák: Ismerkedés, projekttéma kiválasztása
2. megbeszélés:
Időpont: 2021.09.22.
Hely: Pivovár - Szeged, Vitéz utca 26.
Résztvevők: Teszt Elek, Remek Elek, Lev Elek
Érintett témák: A projektben használt technológiák rögzítése, a projektterv áttekintése, szerepkörök és vállalások kiosztása
3. Megbeszélés:
Időpont: 2021.09.29.
Hely: TIK – Szeged, Ady tér 10.
Résztvevők: Teszt Elek, Remek Elek
Érintett témák: Egyeztetés az UML diagramokról, illetve az adatbázis táblák és kapcsolatok meghatározása
A memókat a teljes projekt során vezetni kell, amely tartalmazza a következőket: 
jelenlévők listája, megbeszélés helye és ideje, megbeszélt tevékenységek, felmerült kérdések és igények. 
Lényege, hogy betekintést kapjunk hogyan szerveződnek, zajlanak a csoportgyűlések, milyen problémák, kérdések merültek fel.
6.3. Minőségbiztosítás
Az elkészült terveket a terveken nem dolgozó csapattársak közül átnézik, hogy megfelel-e a specifikációnak és az egyes diagramtípusok összhangban vannak-e egymással. A meglévő rendszerünk helyes működését a prototípusok bemutatása előtt a tesztelési dokumentumban leírtak végrehajtása alapján ellenőrizzük és összevetjük a specifikációval, hogy az elvárt eredményt kapjuk-e. További tesztelési lehetőségek: unit tesztek írása az egyes modulokhoz vagy a kód közös átnézése (code review) egy, a vizsgált modul programozásában nem résztvevő csapattaggal. Szoftverünk minőségét a végső leadás előtt javítani kell a rendszerünkre lefuttatott kódelemzés során kapott metrikaértékek és szabálysértések figyelembevételével. Az alábbi lehetőségek vannak a szoftver megfelelő minőségének biztosítására:
Specifikáció és tervek átnézése (kötelező)
Teszttervek végrehajtása (kötelező)
Unit tesztek írása (választható)
Kód átnézése (választható)
6.4. Átadás, eredmények elfogadása
A projekt eredményeit a megrendelő, Dr. Márkus András fogja elfogadni. A projektterven változásokat csak a megrendelő írásos engedélyével lehet tenni. A projekt eredményesnek bizonyul, ha specifikáció helyes és határidőn belül készül el. Az esetleges késések pontlevonást eredményeznek. Az elfogadás feltételeire és beadás formájára vonatkozó részletes leírás a következő honlapon olvasható: https://okt.inf.szte.hu/rf1/
6.5. Státuszjelentés
Minden mérföldkő leadásnál a projekten dolgozók jelentést tesznek a mérföldkőben végzett munkájukról a a megadott sablon alapján. A gyakorlatvezetővel folytatott csapatmegbeszéléseken a csapat áttekintik és felmérik az eredményeket és teendőket. Továbbá gazdálkodnak az erőforrásokkal és szükség esetén a megrendelővel egyeztetnek a projektterv módosításáról.
7. A munka tartalma
7.1. Tervezett szoftverfolyamat modell és architektúra
A szoftver fejlesztése során az agilis fejlesztési modellt alkalmazzuk, mivel a fejlesztés során nagy hangsúlyt fektetünk a folyamatos kommunikcióra. A fejlesztés során a szoftver specifikációi rugalmasan vátozhatnak, és ezzel a módszertannal tudunk a leggyorsabban alkalmazkodni az új elvárásokhoz.
A webalkalmazás az MVC (modell-view-controller) felépítést követi, a szerver és a kliens függetlenek, csupán API végpontok segítségével kommunikálnak.
Milyen szoftverfolyamat modellt követve állítja elő a csapat a specifikációnak megfelelő prototípusokat? Miért ezt választja? 
A csapat milyen architektúrát választ a projekt megvalósításához? Milyen rétegek (logikai, adat, GUI) lesznek?`
7.2. Átadandók és határidők
A főbb átadandók és határidők a projekt időtartama alatt a következők:
Szállítandó
Neve
Határideje
D1
Projektterv és Gantt chart, prezentáció, egyéni jelentés
2021-10-04
P1+D2
UML, adatbázis- és képernyőtervek, prezentáció, egyéni jelentés
2021-10-18
P1+D3
Prototípus I. és tesztelési dokumentáció, egyéni jelentés
2021-11-08
P2+D4
Prototípus II. és frissített tesztelési dokumentáció, egyéni jelentés
2021-11-27

D - dokumentáció, P - prototípus
8. Feladatlista
A következőkben a tervezett feladatok részletes összefoglalása található.
Alapvetően egy feladatnak 1 felelőse lehet, de kivételt képez pl. a 9.1.1. részfeladat, mivel az első mérföldkőben
2 kötelező feladat van, ezt nem bontjuk részfeladatokra.

