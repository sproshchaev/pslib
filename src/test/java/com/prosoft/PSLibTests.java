package com.prosoft;

import junit.framework.TestCase;
import org.junit.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс PSLibTests выполняет Модульное тестирование JUnit класса PSLib
 *
 * @author Sergey Proshchaev
 * @version 1.1
 * @see com.prosoft.PSLib
 */
public class PSLibTests extends TestCase {

    /**
     * Метод testVersion() выполняет Модульное тестирование JUnit
     * метода version() класса PSLib
     */
    public void testVersion() {
        String resultExpected = "version 1.2";
        Assert.assertEquals(PSLib.version(), resultExpected);
        Assert.assertEquals(PSLib.version().length(), 11);
    }

    /**
     * Метод testDateToStr() выполняет Модульное тестирование JUnit
     * метода dateToStr() класса PSLib
     */
    public void testDateToStr() {
        String resultExpected = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
        Assert.assertEquals(PSLib.dateToStr(), resultExpected);
        Assert.assertEquals(PSLib.dateToStr().length(), 10);
    }

    /**
     * Метод testTimeToStr() выполняет Модульное тестирование JUnit
     * метода timeToStr() класса PSLib
     */
    public void testTimeToStr() {
        String resultExpected = new SimpleDateFormat("HH:mm:ss").format(new Date());
        Assert.assertEquals(PSLib.timeToStr(), resultExpected);
        Assert.assertEquals(PSLib.timeToStr().length(), 8);
    }

    /**
     * Метод testDateTimeToStr() выполняет Модульное тестирование JUnit
     * метода dateTimeToStr() класса PSLib
     */
    public void testDateTimeToStr() {
        String resultExpected = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
        Assert.assertEquals(PSLib.dateTimeToStr(), resultExpected);
        Assert.assertEquals(PSLib.dateTimeToStr().length(), 19);
    }

    /**
     * Метод testSubString() выполняет Модульное тестирование JUnit
     * метода subString() класса PSLib
     */
    public void testSubString() {
        String resultExpected = "123";
        Assert.assertEquals(PSLib.subString("012345678", 1, 3), resultExpected);
    }


}