WEEK 07 BOOK
Ahol szükséges, használd a teszt osztályokban található információkat! A teszteknek végül sikeresen le kell futniuk.

Nulladik feladat
Készíts UML diagramot az alkalmazásról, és töltsd fel a repository-dba képfájlként a következő mappába: src/resourse

Első feladat
Hozz létre egy Quality nevű enumot! Értékei: NEW, OLD, ANCIENT

Mindegyikhez tartozzon egy value (String) érték: "It's a new book.", "It's an old book.", "Wow! An ancient book."

Második feladat
Hozz létre egy Book nevű abstract osztályt! Attribútumai: quality (Quality), numberOfPages (int)

A következőket hozd létre a Book osztályban:

kétparaméteres konstruktor
getter a quality-nek, ami Stringként adja vissza
getter a numberOfPages-nek, ami Stringként adja vissza
abstract metódus getHeroMotto néven String visszatérési értékkel
Harmadik feladat
Hozz létre egy AdventureBook osztályt, amely leszármazik a Book-ból!

Írd felül a quality attribútum getterét, hogy az ősosztály visszatérési értékéhez még fűzzön hozzá egy Stringet! (Lásd teszt!)

Negyedik feladat
Hozz létre egy HorrorBook osztályt, amely leszármazik a Book-ból!

Írd felül a numberOfPages attribútum getterét! (Lásd teszt!)

Ötödik feladat
Hozz létre egy FantasyBook osztályt, amely leszármazik a Book-ból!

Hozz létre egy getNumberOfPages nevű metódust String visszatérési értékkel és egy ancientCorrection nevűt double változóval! Amennyiben egy ősi könyvről van szó, néhány lap hiányzik, ezért adja vissza a korrigált oldalak számát! (Lásd teszt!)
