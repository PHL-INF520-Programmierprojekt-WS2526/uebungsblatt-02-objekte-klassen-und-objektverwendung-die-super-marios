[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/7c-jlDZz)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=21462240&assignment_repo_type=AssignmentRepo)
# Übungsblatt: Grundlagen von Objekten, Klassen und Objektverwendung
[Link to English version](./README_en.md)

In diesem Übungsblatt üben Sie die Instanziierung und grundlegende Verwendung von Objekten basierend auf einer vorhandenen API.

## Übung: Pet-Adoption-Center

In dieser Übung verwenden wir die Pet Adoption Center API, um verschiedene Haustiere und ihre Adoptierenden zu verwalten.

### API Beschreibung

Die Pet Adoption Center API bietet drei Klassen zur Verwaltung von Haustieren [`Pet`](src/main/java/de/phl/programmingproject/petadoption/Pet.java), Adoptierenden  ([`Adopter`](src/main/java/de/phl/programmingproject/petadoption/Adopter.java)) und Adoptionen ([`Adoption`](src/main/java/de/phl/programmingproject/petadoption/Adoption.java)).
Der Quellcode befindet sich im Paket [`de.phl.programmingproject.petadoption`](src/main/java/de/phl/programmingproject/petadoption/).

#### Pet Klasse

Die [`Pet`](src/main/java/de/phl/programmingproject/petadoption/Pet.java)  Klasse repräsentiert ein Haustier im Adoption Center. Sie hat folgende Methoden:

- `Pet(final String name, final int age, final String breed)`: Ein Konstruktor, um ein neues Pet-Objekt mit dem gegebenen Namen, Alter und Rasse zu erstellen.
- `String getInfo()`: Gibt einen String mit dem Namen, Alter und der Rasse des Haustiers zurück.
- `boolean isAdopted()`: Gibt einen Boolean zurück, der anzeigt, ob das Haustier adoptiert wurde oder nicht.
- `Adoption adopt(final Adopter adopter, final Date date)`: Ändert den Adoptionsstatus des Haustiers auf true und erstellt eine neue Adoption für einen gegebenen Adoptierenden und Datum.

#### Adopter Klasse

Die [`Adopter`](src/main/java/de/phl/programmingproject/petadoption/Adopter.java)  Klasse repräsentiert eine Person, die ein Haustier adoptiert. Sie hat folgende Methoden:

- `Adopter(final String name, final String phone, final String email)`: Ein Konstruktor, um ein neues Adopter-Objekt mit dem gegebenen Namen, Telefon und E-Mail zu erstellen.
- `String getInfo()`: Gibt einen String mit dem Namen, Telefon und E-Mail des Adoptierenden zurück.

#### Adoption Klasse

Die [`Adoption`](src/main/java/de/phl/programmingproject/petadoption/Adoption.java)  Klasse repräsentiert eine Haustieradoption. Sie hat folgende Methoden:

- `Adoption(final Pet pet, final Adopter adopter, final Date date)`: Ein Konstruktor, um ein neues `Adoption` Objekt mit dem gegebenen `Pet`, `Adopter` und Adoptionsdatum zu erstellen.
- `String getInfo()`: Gibt einen String mit dem Namen des Haustiers, dem Namen des Adoptierenden und dem Adoptionsdatum zurück.

### Aufgaben

Implementieren Sie die folgenden Aufgaben in der `main` Methode, die sich in der [`Main`](src/main/java/de/phl/programmingproject/petadoption/Main.java) Klasse im Paket `de.phl.programmingproject.petadoption` befindet.

1. Erstellen Sie ein neues `Pet` Objekt mit dem Namen "Buddy", Alter 3 und Rasse "Labrador Retriever".
2. Erstellen Sie ein neues `Adopter` Objekt mit dem Namen "Jane Smith", Telefon "555-555-5555" und E-Mail "janesmith@email.com".
3. Geben Sie die Informationen des Haustiers mit der `getInfo()`-Methode aus.
4. Geben Sie die Informationen des Adoptierenden mit der `getInfo()`-Methode aus.
5. Überprüfen Sie, ob das Haustier mit der `isAdopted()`-Methode adoptiert wurde und geben Sie das Ergebnis aus.
6. Adoptieren Sie das Haustier mit der `adopt(final Adopter adopter, final Date date)`-Methode und speichern Sie die `Adoption`.
7. Geben Sie die Adoptionsinformationen mit der `getInfo()`-Methode aus.
8. Überprüfen Sie erneut, ob das Haustier mit der `isAdopted()`-Methode adoptiert wurde und geben Sie das Ergebnis aus.



## Übung: Studenten-Enrollment-System

In dieser Übung erstellen wir eine API für ein Student Enrollment System, das uns die Verwaltung der Einschreibung von Studierenden in verschiedene Kurse ermöglicht.
Die Quellen finden Sie im Paket [`de.phl.programmingproject.enrollmentsystem`](src/main/java/de/phl/programmingproject/enrollmentsystem/).

### Klassen

1. [`Student`](src/main/java/de/phl/programmingproject/enrollmentsystem/Student.java): Diese Klasse hat die folgenden Attribute: Name (`String`), ID (`String`) und eine Menge (Set) von eingeschriebenen Einschreibungen (`Set<Enrollment>`). Sie besitzt auch die folgenden Methoden:

   - `getInfo()`: Gibt einen String mit dem Namen und der ID der Studierenden zurück.
   - `enroll(final Course course)`: Fügt einen Kurs zur Liste der eingeschriebenen Kurse hinzu.
   - `drop(final Course course)`: Entfernt einen Kurs aus der Liste der eingeschriebenen Kurse.
   - `isEnrolledIn()`: Überprüft, ob der Student in einem bestimmten Kurs eingeschrieben ist.
   - `getCourses()`: Gibt eine Liste der eingeschriebenen Kurse des Studenten zurück.

2. [`Course`](src/main/java/de/phl/programmingproject/enrollmentsystem/Course.java): Diese Klasse sollte die folgenden Attribute haben: Name (`String`) und eine Liste von eingeschriebenen Studenten (`List<Student>`). Sie sollte auch die folgenden Methoden haben:

   - `getInfo()`: Gibt einen String mit dem Namen des Kurses zurück.
   - `enroll(final Student student)`: Fügt eine\*n Student\*in zur Liste der eingeschriebenen Studierenden hinzu.
   - `drop(final Student student)`: Entfernt eine\*n Student*in aus der Liste der eingeschriebenen Studierenden.
   - `isStudentEnrolled(final Student student)`: Überprüft, ob der/die Student*in in diesem Kurs eingeschrieben ist.
   - `getStudents()`: Gibt eine Liste der in den Kurs eingeschriebenen Studierenden zurück.

3. [`Enrollment`](src/main/java/de/phl/programmingproject/enrollmentsystem/Enrollment.java): Diese Klasse hat die folgenden Attribute: Student\*in (`Student`), Kurs (`Course`) und Note (`double`). Sie besitzt auch die folgenden Methoden:

   - `getInfo()`: Gibt einen String mit dem Namen des/der Student\*in, dem Namen des Kurses und der Note zurück.
   - `setGrade(final double grade)`: Legt die Note für die Einschreibung fest.
   - `getStudent()`: Gibt den/die eingeschriebene*n Student\*in zurück.
   - `getCourse()`: Gibt den zugehörigen Kurs zurück.

### Aufgaben

Implementieren Sie die folgenden Aufgaben in der `main`-Methode in der Klasse `Main` im Paket `de.phl.programmingproject.enrollmentsystem`.

1. Erstellen Sie ein neues `Student`-Objekt mit den folgenden Informationen: Name: "John Doe", ID: "12345".
2. Erstellen Sie ein neues `Course`-Objekt mit den folgenden Informationen: Name: "Introduction to Computer Science".
3. Geben Sie die Informationen des `Student` und des `Course` aus.
4. Schreiben Sie den Studenten mit der `enroll()`-Methode in den Kurs ein und speichern Sie die erstellte `Enrollment`.
5. Geben Sie die Informationen des `Student` und des `Course` erneut aus, um zu zeigen, dass die Einschreibung erfolgreich war.
6. Geben Sie die Informationen der `Enrollment` aus.
7. Ändern Sie die Note der `Enrollment` auf 4.0 mit der `setGrade()`-Methode.
8. Geben Sie die Informationen der `Enrollment` erneut aus, um die aktualisierte Note zu zeigen.
9. Erstellen Sie ein weiteres `Course`-Objekt mit den folgenden Informationen: Name: "Object-Oriented Programming".
10. Schreiben Sie den Studenten mit der `enroll()`-Methode in den neuen Kurs ein.
11. Geben Sie die Liste der Kurse aus, in die der Student eingeschrieben ist, mit der `getCourses()`-Methode.
12. Geben Sie die Liste der Studierenden aus, die in den ersten Kurs eingeschrieben sind, mit der `getStudents()`-Methode.
13. Streichen Sie den Studenten aus dem ersten Kurs mit der `drop()`-Methode.
14. Geben Sie die Liste der Studenten erneut aus, die in den ersten Kurs eingeschrieben sind, um zu zeigen, dass der Student gestrichen wurde.

