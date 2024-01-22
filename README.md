# Java-Kurs

In diesem Repository werden die Lektionen für den Java-Kurs verwaltet. Der Kurs soll eine kurze Einführung in
wichtige Bereiche der Java-Programmierung geben. Dabei sollen die Konzepte anhand von zwei Beispiel-Projekten erläutert werden und durch selbständiges Programmieren erlernt werden.

## Lernmaterialien

Die Lernmaterialien sind zum Selbststudium und Nachschlagen da. Einmal auf deutsch (z. B. Java ist auch eine Insel) und einmal auf englisch (z. B. Oracle Java Tutorials).

- [Java ist auch eine Insel - Openbook](https://openbook.rheinwerk-verlag.de/javainsel/)
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/index.html)
- [Das Git-Buch](https://gitbu.ch/pr01.html)
- [The Git Book](https://git-scm.com/book/en/v2) - auch auf deutsch: [The Git Book - DE](https://git-scm.com/book/de/v2)
- Visuelle Lernseite (Sandbox) für git-Befehle: [Git via D3](https://onlywei.github.io/explain-git-with-d3/)

## Agenda

### Code-Verwaltung
- Versionskontrolle mit Git --> [Das Git-Buch](https://gitbu.ch/ch01.html) und [The Git-Book](https://git-scm.com/book/en/v2/Getting-Started-What-is-Git%3F)
  - Was sind Branches und Commits?
  - Was bedeuten Push und Pull?
  - Was sind Pull-Requests? --> [Github Docs: Pull Requests](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests)

### Java-Einstieg
- Hello World implementieren --> [in Java ist auch eine Insel](https://openbook.rheinwerk-verlag.de/javainsel/02_002.html#u2.2.3)
  - Was ist Java?
  - Was bedeuten JRE, JDK und JVM?

### Einstiegsprojekt: Einfacher Taschenrechner
- Primitive Datentypen --> [in Java ist auch eine Insel](https://openbook.rheinwerk-verlag.de/javainsel/02_003.html#u2.3.1) und [im Oracle Trail](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- Schleifen (for, while) --> [in Java ist auch eine Insel](https://openbook.rheinwerk-verlag.de/javainsel/02_006.html#u2.6) und [im Oracle Trail](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- Konditionale Strukturen (if, switch) --> [in Java ist auch eine Insel](https://openbook.rheinwerk-verlag.de/javainsel/02_005.html#u2.5) und [im Oracle Trail](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- Methoden --> [in Java ist auch eine Insel](https://openbook.rheinwerk-verlag.de/javainsel/02_007.html#u2.7) und [im Oracle Trail](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- Error Handling (try-catch) --> [in Java ist auch eine Insel](https://openbook.rheinwerk-verlag.de/javainsel/08_001.html#u8) und [im Oracle Trail](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- Klassen --> [in Java ist auch eine Insel](https://openbook.rheinwerk-verlag.de/javainsel/02_002.html#u2.2.2) und [im Oracle Trail](https://docs.oracle.com/javase/tutorial/java/concepts/class.html)
- Access Modifier --> [in Java ist auch eine Insel](https://openbook.rheinwerk-verlag.de/javainsel/06_002.html#u6.2) und [im Oracle Trail](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- Objekte --> [in Java ist auch eine Insel](https://openbook.rheinwerk-verlag.de/javainsel/03_004.html#u3.4) und [im Oracle Trail](https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html)
  - Was ist der Unterschied zwischen primitiven Datentypen und Klassentypen?
  - Wie hängen Klassen und Objekte zusammen?
- *Rückblick: BigDecimal* für genaue Berechnung

### Projekt: Mitarbeiter Management System
- Datenbankzugriffe
  - Hello Database
- GUIs (Graphical User Interfaces) mit Swing
  - Hello Swing
- Zusammenführung der beiden Teile
  - tabellarische Anzeige der Mitarbeiterdaten
  - ändern der Daten eines Mitarbeiters
  - hinzufügen eines neuen Mitarbeiters
- *Optional:* Drill-Down auf Salaries per Doppelklick auf Mitarbeiter-Zeile in der tabellarischen Übersicht
 
### Optionale Vertiefungen
- Testing
- Strukturierung von Java-Programmen und MVC-Pattern (Model-View-Controller-Pattern)
- Interfaces
- Vererbung
- Wiederverwendbarkeit
- Bibliotheken
- Java-Projektmanagement mit Maven