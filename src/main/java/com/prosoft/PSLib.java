package com.prosoft;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс PSLib содержит статические методы для работы с датой, временем, строками
 * упрощающих написание кода в новых проектах
 *
 * @version 1.0
 * @author Sergey Proshchaev
 */
public class PSLib {

    /**
     * Функция dateToStr() возвращает текущую дату в строке формата DD.MM.YYYY
     *
     * @return - дата в формате DD.MM.YYYY
     */
    public static String dateToStr() {
        return new SimpleDateFormat("dd.MM.yyyy").format(new Date());
    }

    /**
     * Функция timeToStr() возвращает текущее время в строке формата HH.MM.SS
     *
     * @return - время в формате HH.MM.SS
     */
    public static String timeToStr() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    /**
     * Функция dateTimeToStr() возвращает текущую дату и время в строке формата HH.MM.SS
     *
     * @return - дата и время в формате DD.MM.YYYY HH.MM.SS
     */
    public static String dateTimeToStr() {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
    }


}
