package com.prosoft;

import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс PSLib содержит статические методы для работы с датой, временем, строками
 * упрощающих написание кода в новых проектах
 *
 * @author Sergey Proshchaev
 * @version 1.1
 */
public class PSLib {

    /**
     * Метод version() использует DOM (Document Object Model) для чтения данных из XML-файла
     * @return текущая версия, опубликованная в репозитории GitHub
     */
    public static String version() {

        // Найти строку
        // Получение фабрики, чтобы после получить билдер документов.
        // DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        // Получили из фабрики билдер, который парсит XML, создает структуру Document в виде иерархического дерева.
        //DocumentBuilder builder = factory.newDocumentBuilder();

        // Запарсили XML, создав структуру Document. Теперь у нас есть доступ ко всем элементам, каким нам нужно.
        //Document document = builder.parse(new File("pom.xml"));

       return "1.2";
    }

    /**
     * Метод writeToCell записывает значение в ячейку листа MS Excel
     *
     * @param - XSSFSheet excelSheet имя листа
     * @param - int row строка ячейки
     * @param - int column столбец ячейки
     * @param - String value значение, записываемое в ячейку
     * @param - byte valueType типа значения в ячейке: 1 - NUMBER, 2 - DATE, 4 - TEXT
     */
    static void writeToCell(XSSFSheet excelSheet, int row, int column, String value, int valueType) {

        XSSFRow rowObj;
        XSSFCell cellObj;

        if (excelSheet.getRow(row) == null) {
            rowObj = excelSheet.createRow((short) row);
        } else {
            rowObj = excelSheet.getRow((short) row);
        }

        if (rowObj.getCell(column) == null) {
            cellObj = rowObj.createCell(column);
        } else {
            cellObj = rowObj.getCell(column);
        }

        switch (valueType) {
            case 1:
                cellObj.setCellType(CellFormatType.NUMBER.ordinal());
                cellObj.setCellValue(Double.valueOf(value));
                break;
            case 2:
                cellObj.setCellType(CellFormatType.DATE.ordinal());
                cellObj.setCellValue(value);
                break;
            case 4:
                cellObj.setCellType(CellFormatType.TEXT.ordinal());
                cellObj.setCellValue(value);
                break;
            default:
                cellObj.setCellType(CellFormatType.TEXT.ordinal());
                cellObj.setCellValue(value);
        }
    }

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

    /**
     * Функция subString() возвращает подстроку начиная с позиции start включая count символов
     *
     * @param string исходная строка
     * @param start  позиция начала подстроки
     * @param count  число символов
     * @return подстрока с позиции start включая count символов
     */
    public static String subString(String string, int start, int count) {

        return string.substring(start, start + count);
    }

}
