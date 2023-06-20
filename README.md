## XmlXsdPowerTool
Create an XML file and its corresponding XSD schema.
## 6. Web-services 3.3. JAX-WS and JAXB, Apache CXF
## Задание 5

Определить метод, производящий преобразование разработанного XML документа в документ, указанный в каждом задании. 

1. Оранжерея.

— Name — название растения; — Soil — почва для посадки, которая может быть следующих типов: подзолистая, грунтовая, дерново-подзолистая; — Origin — место происхождения растения; — Visual рarameters (должно быть несколько) — внешние параметры: цвет стебля, цвет листьев, средний размер растения; — Growing tips (должно быть несколько) — предпочтительные условия произрастания: температура (в градусах), освещение (светолюбиво либо нет), полив (мл в неделю); — Multiplying — размножение: листьями, черенками либо семенами. Корневой элемент назвать Flower. С помощью XSL преобразовать XML-файл в формат HTML, где отобразить растения по предпочитаемой температуре (по возрастанию).

2. Алмазный фонд.

— Name — название камня; — Preciousness — может быть драгоценным либо полудрагоценным; — Origin — место добывания; — Visual parameters (должно быть несколько) — могут быть: цвет (зеленый, красный, желтый и т. д.), прозрачность (измеряется в процентах 0–100%), способы огранки (количество граней 4–15); —Value — вес камня (измеряется в каратах). Корневой элемент назвать Gem. С помощью XSL преобразовать XML-файл в формат XML, где корневым элементом будет место происхождения.

3. Тарифы мобильных компаний.

Тарифы мобильных компаний могут иметь следующую структуру: — Name — название тарифа; — Operator name — название сотового оператора, которому принадлежит тариф; — Payroll — абонентская плата в месяц (0–n гривен); — Сall prices (должно быть несколько) — цены на звонки: внутри сети (0–n гривен в минуту), вне сети (0–n гривен в минуту), на стационарные телефоны (0–n гривен в минуту); — SMS price — цена за смс (0–n гривен); — Parameters (должно быть несколько) — наличие любимого номера (0–n), тарификация (12-секундная, поминутная), плата за подключение к тарифу (0–n гривен). Корневой элемент назвать Tariff. С помощью XSL преобразовать XML-файл в формат НTML, при выводе отсортировать тарифы по абонентской плате.

4. Лекарственные препараты.

Лекарственные препараты имеют следующие характеристики: — Name — наименование препарата; — Pharm — фирма-производитель; — Group — группа препаратов, к которым относится лекарство (антибиотики, болеутоляющие, витамины и т. п.); — Analogs (может быть несколько) — содержит наименование аналога; — Versions — варианты исполнения (консистенция/вид: таблетки, капсулы, порошок, капли и т. п.). Для каждого варианта исполнения может быть несколько производителей лекарственных препаратов со следующими характеристиками: • Certificate — свидетельство о регистрации препарата (номер, даты выдачи/истечения действия, регистрирующая организация); • Package — упаковка (тип упаковки, количество в упаковке, цена за упаковку); • Dosage — дозировка препарата, периодичность приема; Корневой элемент назвать Medicine. С помощью XSL преобразовать XML-файл в формат НTML, при выводе отсортировать лекарства по цене. 

5. Компьютеры. 

Компьютерные комплектующие имеют следующие характеристики: — Name — название комплектующего; — Origin — страна производства; — Price — цена (0 — n гривен); — Type (должно быть несколько) — периферийное либо нет, энергопотребление (ватт), наличие кулера (есть либо нет), группа комплектующих (устройства ввода-вывода, мультимедийные), порты (COM, USB, LPT);

— Critical — критично ли наличие комплектующего для работы компьютера. Корневой элемент назвать Device. С помощью XSL преобразовать XML-файл в формат XML, при выводе корневым элементом сделать Critical.

6. Электроинструменты.

Электроинструменты можно структурировать по следующей схеме: — Model — название модели; — Handy — одно- или двуручное; — Origin — страна производства; — TC (должно быть несколько) — технические характеристики: энергопотребление (низкое, среднее, высокое), производительность (в единицах в час), возможность автономного функционирования и т. д.; — Material — материал изготовления. Корневой элемент назвать PowerTools или Power. С помощью XSL преобразовать XML-файл в формат XML, при выводе корневым элементом сделать страну производства.

7. Столовые приборы.

Столовые приборы можно структурировать по следующей схеме: — Type — тип (нож, вилка, ложка и т. д.); — Origin — страна производства; — Visual (должно быть несколько) — визуальные характеристики: лезвие, зубец (длина лезвия, зубца [10– n см], ширина лезвия [10–n мм]), материал (лезвие [сталь, чугун, медь и т. д.]), рукоять (деревянная [если да, то указать тип дерева], пластик, металл); — Value — коллекционный либо нет. Корневой элемент назвать FlatWare. С помощью XSL преобразовать XML-файл в формат HTML, при выводе отсортировать по длине лезвия, зубца, объему.

8. Самолеты.

Самолеты можно описать по следующей схеме: — Model — название модели; — Origin — страна производства; — Chars (должно быть несколько) — характеристики, могут быть следующими: тип (пассажирский, грузовой, почтовый, пожарный, сельскохозяйственный), количество мест для экипажа, характеристики (грузоподъемность, число пассажиров), наличие радара; — Parameters — длина (в метрах), ширина (в метрах), высота (в метрах); — Price — цена (в талерах). Корневой элемент назвать Plane. С помощью XSL преобразовать XML-файл в формат HTML, при выводе отсортировать по стоимости.

9. Конфеты.

— Name — название конфеты; — Energy — калорийность (ккал); — Type (должно быть несколько) — тип конфеты (карамель, ирис, шоколадная [с начинкой либо нет]); — Ingredients (должно быть несколько) — ингредиенты: вода, сахар (в мг), фруктоза (в мг), тип шоколада (для шоколадных), ванилин (в мг); — Value — пищевая ценность: белки (в г), жиры (в г) и углеводы (в г); — Production — предприятие-изготовитель. Корневой элемент назвать Candy. С помощью XSL преобразовать XML-файл в формат HTML, при выводе отсортировать по месту изготовления.

10. Пиво.

— Name — название; — Type — тип пива (темное, светлое, лагер, живое); — Al — алкогольное либо безалкогольное; — Manufacturer — фирма-производитель; — Ingredients (должно быть несколько) — ингредиенты: вода, солод, хмель, сахар и т. д.; — Chars (должно быть несколько) — характеристики: количество оборотов (если алкогольное), прозрачность (в процентах), фильтрованное либо нет, пищевая ценность (ккал), способ разлива (объем и материал емкостей). Корневой элемент назвать Beer. С помощью XSL преобразовать XML-файл в формат XML, при выводе корневым элементом сделать производителя.

11. Периодические издания. 

— Title — название; — Type — тип (газета, журнал, буклет); — Monthly — переодичность выхода; — Chars (должно быть несколько) — характеристики: цветность (да либо нет), объем (n страниц), глянцевое (да [только для журналов и буклетов] либо нет [для газет]), подписной индекс (только для газет и журналов). Корневой элемент назвать Paper. С помощью XSL преобразовать XML-файл в формат plain text, при выводе организовать подачу информации в удобном для прочтения виде.

12. Туристические путевки. 

Туристические путевки, предлагаемые агентством, имеют следующие характеристики: — Type — тип (выходного дня, экскурсионная, отдых, паломничество и т. д.); — Country — страна, выбранная для путешествия; — Number days/nights — количество дней и ночей;

— Тransport — вид перевозки туристов (авиа, ж/д, авто, лайнер); — Hotel characteristic (должно быть несколько) — количество звезд, включено ли питание и какое (HB, BB, Al), какой номер (1-, 2-, 3-местные), есть ли телевизор, кондиционер и т. д.; — Сost — стоимость путевки (сколько и что включено). Корневой элемент назвать Тourist voucher. С помощью XSL преобразовать XML-файл в формат HTML, c выводом информации в табличном виде.

13. Старые открытки. 

— Thema — тема изображения (городской пейзаж, природа, люди, религия, спорт, архитектура...); — Type — тип (поздравительная, рекламная, обычная). Была ли отправлена; — Country — страна производства; — Year — год издания; — Author — имя автора/ов (если известен); — Valuable — историческая, коллекционная или тематическая ценность. Корневой элемент назвать Old Card. С помощью XSL преобразовать XML-файл в формат PDF c выводом информации в отдельную страницу для каждого концерта.

14. Банковские вклады. 

— Name — название банка; — Country — страна регистрации; — Type — тип вклада (до востребования, срочный, расчетный, накопительный, сберегательный, металлический); — Depositor — имя вкладчика; — Account id — номер счета; — Amount on deposit — сумма вклада; — Profitability — годовой процент; — Time constraints — срок вклада. Корневой элемент назвать Bank. С помощью XSL преобразовать XML-файл в формат PDF c выводом информации в табличном виде.



## Заметки

[Методы преобразования в каждом задании](#методы-преобразования-в-каждом-задании)

[Основные элементы XSLT](#основные-элементы-xslt)

[Оператор //](#оператор-)

[Оператор ../../](#оператор--1)


### Методы преобразования в каждом задании

1. Оранжерея.

   **xsl:for-each** для перебора всех дочерних элементов ```<Plant>``` внутри ```<Flower>```.

   **xsl:sort** сортировка по значению элемента ```<Temperature>``` в возрастающем порядке.
2. Алмазный фонд.

   **xsl:value-of** для извлечения значения  ```<Name>```, ```<Preciousness>```,  ```<Origin>```, ```<Color>```,  ```<Transparency>```, ```<Facets>```   

   **xsl:apply-templates** вызов шаблона для реализации ```<VisualParameters>```
3. Тарифы мобильных компаний.

   **xsl:apply-templates select="Tariff/Rate"** вызов шаблона всем элементам ```<Rate>```, которые являются дочерними элементами элемента ```<Tariff>```.

   **xsl:sort select="Payroll" data-type="number"** Атрибут data-type="number" указывает тип данных для сортировки. В данном случае, мы указываем тип данных "number" (число), так как абонентская плата обычно представляет числовое значение.
   
   **xsl:value-of**
4. Лекарственные препараты.

   **xsl:apply-templates select="Medication/Versions/Version"**

   **xsl:sort select="Producers/Producer/Package/Price" data-type="number"**

   **xsl:value-of select="../../Name"** перейти на два уровня вверх от текущего элемента ```<Version>```, затем получить значение элемента ```<Name>``` (для каждой версии лекарства повторяется название)

5. Компьютеры.

   **xsl:strip-space elements="*"** указывает процессору XSLT на удаление пустых строк

    ```<xsl:text>&#xA;</xsl:text> ``` добавление пустой строки. Символ **&#xA;** в XML представляет собой символ новой строки (Line Feed, LF). Он используется для обозначения перевода строки или добавления пустой строки в текстовом контексте XML.

   ```
   <xsl:copy>
   <xsl:apply-templates select="node()[local-name() != 'Critical']" />
   </xsl:copy>```
   
Данный код позволяет скопировать узел кроме дочернего элемента ```Critical```

7. Столовые приборы.

```<xsl:for-each select="FlatWare/Cutlery">``` для перебора всех дочерних элементов ```<Cutlery>``` внутри ```<FlatWare>```.

```<xsl:sort select="Visual/TopPart/Length" data-type="number"/> ``` сортировка по значению элемента ```<Length>``` в возрастающем порядке.

```<xsl:value-of select="Visual/Handle/Material/@type"/>``` для извлечения значения атрибута ```type``` тега ```<Material>``` у ```<Handle>```

8. Самолеты.

Преобразовываем в текстовый формат CSV (Comma-Separated Values). Для этого указываем расширение изменяемого файла transformed_plane.csv.

```
<xsl:text>Model,Origin,Type,Price&#10;</xsl:text>
```
столбцы таблицы в текстовом файле выводятся в виде текстовой строки вместе с символом  **&#10;** новой строки

```<xsl:sort select="Price" data-type="number" order="ascending" />``` сортировка по цене

```<xsl:value-of select="concat(Model, ',', Origin, ',', Chars/Type,',', Price)" />``` Функция **concat()** в XSLT объединяет строки или значения выражений в одну строку

### Основные элементы XSLT

1. <xsl:template>: определяет шаблон для соответствия определенным узлам XML. Вы можете использовать <xsl:template> для определения, какие действия должны быть выполнены при обработке определенных узлов XML.
2. <xsl:value-of>: используется для извлечения значения элемента XML и вставки его в результат XSLT-преобразования. Вы можете указать путь к элементу, чье значение вы хотите получить, с помощью атрибута select.
3. <xsl:for-each>: позволяет выполнять итерацию по выбранным узлам XML. Вы можете использовать <xsl:for-each> для повторения определенного блока кода для каждого соответствующего узла.
4. <xsl:sort>: позволяет сортировать узлы XML по заданному критерию. Вы можете указать атрибут select, чтобы выбрать элемент, по которому будет выполняться сортировка, и атрибут order, чтобы указать порядок сортировки (например, "ascending" для возрастающего порядка или "descending" для убывающего порядка).
5. <xsl:if> и <xsl:choose>: позволяют выполнять условные проверки во время XSLT-преобразования. <xsl:if> позволяет выполнить блок кода, если условие истинно, а <xsl:choose> позволяет выбрать один из нескольких блоков кода, основываясь на условии.
6. <xsl:apply-templates>: используется для вызова других шаблонов XSLT внутри текущего шаблона. Это позволяет выполнить обработку различных узлов XML разными шаблонами.
7. <xsl:attribute>: позволяет добавить атрибут к создаваемому элементу в результате XSLT-преобразования. Вы можете указать имя атрибута и его значение.
8. <xsl:element>: позволяет создавать новый элемент в результате XSLT-преобразования. Вы можете указать имя создаваемого элемента с помощью атрибута name, а содержимое элемента можно определить внутри <xsl:element>.
9. <xsl:attribute-set>: позволяет определить набор атрибутов, которые могут быть применены к элементам в результате XSLT-преобразования. Вы можете использовать <xsl:attribute-set> для определения набора атрибутов и их значений, а затем применять этот набор атрибутов к элементам с помощью атрибута use-attribute-sets.
10. <xsl:call-template>: используется для вызова шаблона, определенного с помощью <xsl:template>. Вы можете указать имя вызываемого шаблона с помощью атрибута name. При вызове шаблона будет выполнен соответствующий блок кода.
11. <xsl:variable>: позволяет объявлять переменные внутри XSLT-преобразования. Вы можете присвоить переменной значение с помощью атрибута select, и затем использовать переменную в других частях кода.
12. <xsl:choose> и <xsl:when>: позволяют выполнять множественный выбор в XSLT-преобразовании. <xsl:choose> определяет блок кода, внутри которого могут быть несколько <xsl:when>, каждый из которых проверяет условие. Если условие истинно, будет выполнен соответствующий блок кода.
13. <xsl:comment>: позволяет добавить комментарий в результат XSLT-преобразования. Вы можете указать содержимое комментария внутри <xsl:comment>.
14. <xsl:text>: позволяет вставить текстовую строку в результат XSLT-преобразования. Вы можете указать содержимое текста внутри <xsl:text>.
15. <xsl:strip-space elements="*"/>: указывает процессору XSLT на удаление пустых строк, которые находятся внутри элементов (не учитывая текстовые узлы внутри элементов). Это приведет к сжатию вывода XML-файла и удалению лишних пустых строк.
16. <xsl:copy-of> используется для копирования содержимого выбранных узлов или узловой последовательности в результирующий документ. Он копирует узлы в точности так, как они есть, без изменений.
17. <xsl:copy> в XSLT используется для создания копии текущего узла XML в результирующем документе с возможностью внесения некоторых изменений

### Оператор //

Оператор // в XSLT используется для выборки всех узлов, независимо от их местоположения в дереве XML. Он указывает, что нужно применить шаблон ко всем узлам, которые соответствуют указанному пути.

Вот некоторые случаи, когда используется оператор // в выражении select:

```<xsl:apply-templates select="//element">```

Это применяет шаблон ко всем узлам <element>, независимо от их местоположения в дереве XML. Это полезно, когда вам нужно обработать все узлы с определенным именем в любой части XML-документа.

```<xsl:apply-templates select="//parent/child">```

Здесь //parent/child указывает, что нужно выбрать все узлы <child>, которые являются потомками узла <parent>, вне зависимости от их глубины в дереве XML.

С другой стороны, если вы хотите выбрать узлы относительно текущего контекста, вы можете использовать простой путь без оператора //. Например:

```<xsl:apply-templates select="element">```

Это применяет шаблон только к узлам <element>, которые являются непосредственными дочерними узлами текущего контекста.

```<xsl:value-of select="property">```

Здесь property выбирает значение узла <property>, который является непосредственным дочерним узлом текущего контекста.

Таким образом, использование // в выражении select зависит от того, нужно ли вам выбрать узлы в любом месте дерева XML или относительно текущего контекста.

### Оператор ../../

При использовании пути ../../Name в XSLT-шаблоне мы обращаемся к родительскому элементу Medication и затем к его дочернему элементу Name. Это делается потому, что шаблон применяется к элементу Version, а имя лекарства находится на уровне выше в структуре XML.

В структуре XML-файла <Medicine> является корневым элементом, а <Medication> является дочерним элементом <Medicine>. Имя лекарства <Name> находится внутри элемента <Medication>. Внутри <Medication> у нас есть несколько <Versions>, и шаблон применяется к каждому <Version>, поэтому нам нужно перейти на уровень выше, чтобы получить имя лекарства, используя ../../Name.

Таким образом, ../../Name означает "перейти на два уровня вверх от текущего элемента <Version>, затем получить значение элемента <Name>".