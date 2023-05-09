## TestNG podstawy

#### Zadanie 1 - Anotacje
1. Utwórz paczkę `basics` a w niej klasę `AnnotationTest`
2. Utwórz w niej dwie metody oznaczone anotacją `@Test`, a w nich wydrukuj jakiś unikalny numer
```java
System.out.println("Test X");
```
3. Dodaj kolejne metody z anotacjami (a w nich wydrukuj nazwę anotacji):
   - @BeforeTest
   - @AfterTest
   - @BeforeClass
   - @AfterClass
```java
System.out.println("@Anotacja");
```
4. Uruchom testy, w jakiej kolejności uruchomiły się zadania?

#### Zadanie 2 - services
1. Zapoznaj się w paczke `src/main/java/services` z klasą `Calculator`
2. Napisz testy które pokryją 100% kodu (nie 100% przypadków).
3. Pamiętaj o asercjach.

#### Zadanie 3 - assertJ 
1. Możesz utworzyć obiekt Names, przekazując do konstruktora dowolną liczbę Stringów po przecinku. 
2. .getNames() powinno zwrócić listę imion w porządku alfabetycznym (A-Z).
3. Napisz test (lub testy), które udowodnią że kod nie działa tak jak powinien.
4. Napraw kod tak żeby zwracał listę w porządku alfabetycznym (zrób to dopiero po napisaniu testów).
5. Uruchom testy ponownie i zobacz czy tym razem przechodzą.

#### Zadanie 4 - parametryzacja
1. Parametry dla funkcji .add() którą chcemy przetestować
```csv
1,1,2
2,3,5
4,2,6
```
2. Użyj parametryzacji testów i napisz testy dla `Calculator.java` które utworzą kilka przypadków testowych z parametrów powyżej.
3. Uruchom testy.

#### Zadanie 5 - WeirdStuff

1. Szalony developer napisał funkcję `public static String isItTheAnswerToUltimateQuestionOfLife(int n)` w klasie `WeirdStuf.java`.
2. Funkcja ta nigdy nie powinna zwrócić napisu `That should not happen at all` nieważne jaki parametr n zastosujemy.
3. Napisz testy, które sprawdzą wszystkie możliwe liczby, znajdź błąd w kodzie.
