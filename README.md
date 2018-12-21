# Reversed Binary Pin Cipher --- alpha 1.0

### O aplikacji<br />
Aplikacja odpowiadająca za zakodowanie numeru PIN pprzez wykorzystanie algorytmu odwrócenia liczby binarnej

### Zasada działania<br />
* Pobrana liczba interpretowana jako ciąg znaków przerabaiana jest na tablicę pojedynczych znaków, tudzież liczb,
* Następnie każdy znak z tej tablicy parsowany jest na liczbę całkowitą,
* W kolejnym kroku liczba poddawana jest dzieleniu przez 2 i łączona w ciąg zer i jedynek, w zależności od wyniku dzielenia (<a href="http://www.edu.godula.com/?zo=sl_bintodec">Konwersja liczb bin2dec</a>),
* Po przejściu przez tablicę znaków, zwracana jest nowa lista tablicowa, zawierająca liczby binarne już odwrócone,
* W kolejnym kroku w nowej metodzie liczby binarne są rozdzielane na części,
* Nastepnie poddawane są algorytmowi konwersji z systemu binarnego na dziesiętny
* Na końcu zwracana jest liczba złożona z odpowiednio przekonwertowanych odwróconych liczb binarnych w wersji calkowitej<br />
## Zewnętrzne biblioteki
W aplikacji użyłem nastepujących zewnętrznych pakietów narzędziowych: <br /><br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **(GUI) MiGLayout** --> http://www.miglayout.com/ <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **(GUI) XSwingX** --> https://code.google.com/archive/p/xswingx/ <br /><br />

# Zobacz także:
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Trello** --> https://trello.com/b/5VjxlSCZ <br />
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **My Website** --> *<in_progress>*
