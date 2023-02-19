[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=10196756)
# Практична робота "Масиви, вирази, керування виконанням програми"

Цей репозиторій містить стартовий код для виконання практичної роботи, який містить заготовки двох класів, що демонструють структуру проекту для виконання завдань на масиви, керуючі конструкції та вирази.

## В рамках практичної роботи ви маєте зробити наступне:
1. модифікувати стартовий код таким чином, щоб метод ```Calculate``` класу ```Exercise``` містив код обчислення значення у відповідності до обраного вами завдання (у разі необхідності можна додавати до класу нові приватні методи)
2. рядок, який виводиться у результаті виконання методу ```main``` класу ```TestResult``` теж слід скоригувати у відповідності до специфіки завдання
3. **README.MD репозиторію має містити опис обраного вами завдання** (краще - з картинками та форматуванням :blush:)!
4. **УВАГА!** Не слід вважати, що завдання дуже прості! Вам необхідно подбати про:
    * **оптимізацію програми - обрати оптимальні з точки зору обсягу використовуваної пам'яті типи даних**
    * **іменування змінних і констант у відповідності до рекомендацій**
    * **javadoc-коментарі для класу ```Exercise```, які пояснюють що саме обчислюється і які вихідні дані для цього потрібні**
5. здати завдання. **Нагадую, що здаючи завдання через Google Classroom, слід вказати посилання на створений для вас репозиторій!**

**P.S.** Ви можете обрати завдання на власний розсуд - реалізувати алгоритм, який вас зацікавив, однак якщо буде надто багато однакових класів, завдання не буде зараховано - намагайтесь робити самотужки та у власному стилі! Звісно ж, ніхто не забороняє користуватись Інтернетом, шукати й використовувати знайдене у Мережі. А ще - обговорювати завдання в девелоперському мессенджері **Gitter** - у відповідній [чат-кімнаті](https://gitter.im/PPC-SE-2020/OOP?utm_source=share-link&utm_medium=link&utm_campaign=share-link).

[![Gitter](https://badges.gitter.im/PPC-SE-2020/OOP.svg)](https://gitter.im/PPC-SE-2020/OOP?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

----

## Список завдань
4. Знайти в масиві число, яке повторюється найбільшу кількість разів

 ```java
package test;

import domain.*;

import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть мінімальне число");
        int min = scanner.nextInt();
        System.out.println("Введіть максимальне число");
        int max = scanner.nextInt();
        System.out.println("Введіть кількість комірок");
        int num = scanner.nextInt();
        Exercise.Calculate(min, max, num);

    }
}
```
```java
package domain;

public class Exercise {
    public static void Calculate(int minNum, int maxNum, int N) {

        int min = minNum;
        int max = maxNum;
        int range = max - min + 1;

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = (int) (Math.random() * range) + min;
        }

        long result = 0;

        for (int i = 0; i < N; i++) {
            short sing = (short) (Math.random() * (4 - 0 + 1));
            if (sing == 1 || sing == 0) {
                System.out.println((i + 1) + ". " + result + " + " + numbers[i]);
                result += numbers[i];
            } else if (sing == 2) {
                System.out.println((i + 1) + ". " + result + " - " + numbers[i]);
                result -= numbers[i];
            } else if (sing == 3) {
                System.out.println((i + 1) + ". " + result + " * " + numbers[i]);
                result *= numbers[i];
            } else if (sing == 4) {
                System.out.println((i + 1) + ". " + result + " : " + numbers[i]);
                result /= numbers[i];
            }
        }
        System.out.println(" ");
        System.out.println("Результ обчислення: " + result);
    }
}
```
