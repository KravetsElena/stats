package ru.netology.stats;

public class StatsService {

    public int getSummarySales(int[] sales) {  //    сумма всех продаж
        int summarySales = 0;  // сюда суммируем все значения массива

        for (int value : sales) {
            summarySales += value;
        }
        return summarySales;
    }


    public int getMiddleSales(int[] sales) {  //    средняя сумма продаж в месяц
        int middleSales = getSummarySales(sales);

        return middleSales / sales.length;
    }

    public int maxSales(int[] sales) {   //    номер месяца, в котором был пик продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {  //    номер месяца, в котором был минимум продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getBelowMiddleSales(int[] sales) { //количество месяцев, в которых продажи были ниже среднего (см. п.2);
        int midMonth = getMiddleSales(sales);
        int count = 0; // кол-во месяцев с продажами выше среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < midMonth) {
                count++;
            }
        }
        return count;
    }

    public int getHigherMiddleSales(int[] sales) {//количество месяцев, в которых продажи были выше среднего (см. п.2).
        int midMonth = getMiddleSales(sales);
        int count = 0; // кол-во месяцев с продажами ниже среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > midMonth) {
                count++;
            }
        }
        return count;
    }
}


