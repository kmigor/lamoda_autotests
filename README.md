# Автотесты для сайта [lamoda](https://www.lamoda.ru/).

## Содержание

* <a href="#tests">Описание проверок</a>
* <a href="#tools">Технологии</a>
* <a href="#jenkins">Запуск тестов</a>
* <a href="#allure">Отчет в Allure</a>
* <a href="#telegramBot">Бот в Telegram</a>
* <a href="#video">Видео прохождения тестов</a>

---
<a id="tests"></a>
## <a name="Описание проверок">**Описание проверок**</a>

Представленные смок тесты проверяют:
1) Т001 - Проверка поиска товара (кольцо Sokolov) по артикулу.
2) Т002 - Проверка поиска мяча Demix через ключевое слово "мяч" в поиске.
3) Т003 - Проверка работы корзины. Добавление товара (кольцо Sokolov) в корзину, удаление товара из корзины.
4) Т004 - Проверка работы фильтров Материала (полиэстер), Цвета (мультиколор), Размера (7), Бренда (GSD), Страны производства (Китай), при поиске по ключевому слову "мяч".
5) Т005 - Проверка сортировки товара по цене, по возрастанию, при поиске по ключевому слову "плед".

---
<a id="tools"></a>
## <a name="Технологии:">**Технологии:**</a>

1) Проект автотестов написан с использованием Java
2) Проверки реализованы при помощи JUnit5
3) В качестве сборщика проектов используется Gradle
4) Для работы с элементами вебстраниц используется Selenide
5) Результаты автотестов преобразуются в Allure-отчет
6) Для выполнения автотестов с различными входными параметрами используется Jenkins
7) Полученный Allure-отчет выгружается в чат telegram при помощи бота


<p align="center">  
<a href="https://www.java.com/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="50" height="50"  alt="Java"/></a>   
<a href="https://junit.org/junit5/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="https://avatars.githubusercontent.com/u/43955696?s=48&v=4" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://github.com/allure-framework/allure2"><img src="https://allurereport.org/svg/logo-report-sign.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://www.jenkins.io/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://telegram.org/"><img src="https://www.svgrepo.com/show/452115/telegram.svg" width="50" height="50"  alt="Jenkins"/></a> 
</p>

---
<a id="Запуск тестов"></a>
## <a name="Запуск тестов">**Запуск тестов**</a>

Присутствует возможность локального и удаленного запуска тестов.

Для удаленного запуска используется [Jenkins](https://jenkins.autotests.cloud/job/C30-M_X_M2-lamodaAutotests/)  

<img src="attachments/images/Jenkins.png" width="900">

В качестве переменных параметров используются:
1) Стенд (IFT, PSI, LT, PROM)
2) Браузер (Chrome/Firefox)
3) Версия браузера (Для Chrome: 121, 122, для Firefox: 124, 125)
4) Разрешения браузера: 1280х1024 и 1920х1080

Для локального запуска достаточно запустить тесты из IDE или из командной строки bash при помощи команды **gradle test**

При локальном запуске используется Chrome с разрешеним 1920x1080.

---

<a id="allure"></a>
## <a name="Отчет в Allure">**Отчет в Allure**</a>

После выполнения тестов имеется возможность ознакомиться с отчетом в [Allure](https://jenkins.autotests.cloud/job/C30-M_X_M2-lamodaAutotests/allure)
### На скриншоте представлен пример результата выполнения тестов:


<img src="attachments/images/AllureReport.png" width="900">

---

<a id="telegramBot"></a>
## <a name="Бот в Telegram">**Бот в Telegram**</a>

После выполнения тестов, бот в Telegram присылает краткий отчет о результатах тестирования:
<p align="center">
    <img src="attachments/images/TelegramBot.png">
</p>

---

<a id="video"></a>
<h1>Пример прохождения тестов</h1>
<img title="testResultsVideo" src="attachments/video/testResultsVideo.gif" width="700" height="400"  alt="video">   
