public class Task9Test {
    public static int[] array = {1, 2, 3, 4, 1, 2, 2, 6, 6}; //Наш массив
    public static int pCh[] = new int[array.length]; //Массив предыдущих чисел
    public static int i;
    public static int[] n = new int[array.length];   //Номера ячеек с одинаковыми числами


    public static void main(String[] args) {
        massive();
    }

    public static void massive() {
        int count = 0, temp;
        for (i = 0; i < array.length; i++) {
            if (!povtor(temp = array[i])) {              //Проверяем, небыло ли раньше этого числа
                temp = array[i];
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == temp) {   //Если числа одинаковые...
                        n[count] = j;  //записываем номер ячеек. +1 из-за того, что нумерация с 0
                        count++;         //Количество совпадений
                    }
                }
                if (count > 1) {            //Если совпадений больше 1...
                    System.out.print("Совпадение в позиции");
                    for (int k = 0; k < count; k++) {
                        System.out.print(" " + n[k]);
                    }
                    System.out.println(": " + temp);
                }
                count = 0; //Обнуляем
                pCh[i] = temp; //Записываем чичло в список чисел, которые уже были.
            }

        }
    }


    static boolean povtor(int x) {          //Возвращает true, если уже было это число.
        for (int a = 0; a < i; a++) {
            if (pCh[a] == x) return true;
        }
        return false;
    }

}
