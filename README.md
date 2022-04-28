[![Java](https://img.shields.io/badge/Java-E43222??style=for-the-badge&logo=java&logoColor=FFFFFF)](https://java.com/)
[![Apache_POI](https://img.shields.io/badge/Apache_POI-F7F7F7??style=for-the-badge&logo=Apache&logoColor=C85D38)](https://poi.apache.org/)

# PSLib

Maven Repository на Github (library of frequently used methods)

### Публикация (deploy) в репозитории Github 
1. Перейти в ветку "main"
2. Пройти тесты в окне "Terminal" ввести: "mvn test"
3. Опубликовать в Github в окне "Terminal" ввести: "mvn clean deploy"
4. Создать документацию Javadoc для проекта "mvn javadoc:javadoc"

### Подключение зависимости в новых проектах:
1. Добавить в pom.xml ссылку на репозиторий на Github: 

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

  </repositories> 
-->

<pre><code>  &lt;repositories&gt;

    &lt;repository&gt;
      &lt;id&gt;PSLib&lt;/id&gt;
      &lt;url&gt;https://raw.github.com/sproshchaev/PSLib/main/&lt;/url&gt;
      &lt;snapshots&gt;
        &lt;enabled&gt;true&lt;/enabled&gt;
        &lt;updatePolicy&gt;always&lt;/updatePolicy&gt;
      &lt;/snapshots&gt;
    &lt;/repository&gt;

  &lt;/repositories&gt; 
</code></pre>

2. Добавить в pom.xml зависимость: 

<!--
    <dependency>
      <groupId>com.prosoft</groupId>
      <artifactId>PSLib</artifactId>
      <version>1.2</version>
    </dependency> 
-->

<pre><code>    &lt;dependency&gt;
      &lt;groupId&gt;com.prosoft&lt;/groupId&gt;
      &lt;artifactId&gt;PSLib&lt;/artifactId&gt;
      &lt;version&gt;1.2&lt;/version&gt;
    &lt;/dependency&gt; 
</code></pre>

3. Проверить актуальную версию в "version". Номер версии должен соответствовать актуальной! 

4. Запустить в меню IDE IntelliJ IDEA "Reload All Maven Projects"

### Статьи по теме
Как сделать свой Maven Repository на Github? https://bit.ly/3vyf78C


<!-- Пример проекта для тестирования Java\IDEAProjects2 (класс PSLibTest) -->

