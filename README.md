[![Java](https://img.shields.io/badge/Java-E43222??style=for-the-badge&logo=java&logoColor=FFFFFF)](https://java.com/)
[![Apache_POI](https://img.shields.io/badge/Apache_POI-F7F7F7??style=for-the-badge&logo=Apache&logoColor=C85D38)](https://poi.apache.org/)

# PSLib 

Maven Repository на Github (library of frequently used methods)

Как сделать свой Maven Repository на Github? https://bit.ly/3vyf78C

# Публикация (deploy) в репозитории Github 
1. Перейти в ветку "main"
2. Пройти тесты в окне "Terminal" ввести: "mvn test"
3. Опубликовать в Github в окне "Terminal" ввести: "mvn clean deploy"

# Подключение зависимости в новых проектах:
1. Добавить в pom.xml репозиторий на Github 
  <!--  
  
    <repositories>

    <repository>
      <id>PSLib</id>
      <url>https://raw.github.com/sproshchaev/PSLib/main/</url>
      <snapshots>
        <enabled>true</enabled>
        <updatePolicy>always</updatePolicy>
      </snapshots>
    </repository>

  </repositories> -->

2. Добавить в pom.xml зависимость
 <!--  

    <dependency>
      <groupId>com.prosoft</groupId>
      <artifactId>PSLib</artifactId>
      <version>1.1</version>
    </dependency> -->

3. Проверить актуальную версию в "version". Номер версии должен соответствовать актуальной! 