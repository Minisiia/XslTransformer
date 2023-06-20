import xsl_transformer.XslTransformer;

/**
 * 1. Оранжерея.
 * Растения, содержащиеся в оранжерее, имеют следующие характеристики:
 * — Name — название растения;
 * — Soil — почва для посадки, которая может быть следующих типов: подзолистая, грунтовая, дерново-подзолистая;
 * — Origin — место происхождения растения;
 *  — Visual parameters (должно быть несколько) — внешние параметры: цвет стебля, цвет листьев, средний размер растения;
 * — Growing tips (должно быть несколько) — предпочтительные условия произрастания: температура (в градусах), освещение (светолюбиво либо нет), полив (мл в неделю);
 * — Multiplying — размножение: листьями, черенками либо семенами. Корневой элемент назвать Flower. С помощью XSL преобразовать XML-файл в формат HTML, где отобразить растения по предпочитаемой температуре (по возрастанию).
 * 2. Алмазный фонд.
 * Драгоценные и полудрагоценные камни, содержащиеся в павильоне, имеют следующие характеристики:
 * — Name — название камня;
 *  — Preciousness — может быть драгоценным либо полудрагоценным; — Origin — место добывания;
 *  — Visual parameters (должно быть несколько) — могут быть: цвет (зеленый, красный, желтый и т. д.), прозрачность (измеряется в процентах 0–100%), способы огранки (количество граней 4–15); —
 * Value — вес камня (измеряется в каратах). Корневой элемент назвать Gem. С помощью XSL преобразовать XML-файл в формат XML, где корневым элементом будет место происхождения.
 * 3. Тарифы мобильных компаний.
 * Тарифы мобильных компаний могут иметь следующую структуру: — Name — название тарифа; — Operator name — название сотового оператора, которому принадлежит тариф; — Payroll — абонентская плата в месяц (0–n гривен); — Сall prices (должно быть несколько) — цены на звонки: внутри сети (0–n гривен в минуту), вне сети (0–n гривен в минуту), на стационарные телефоны (0–n гривен в минуту); — SMS price — цена за смс (0–n гривен); — Parameters (должно быть несколько) — наличие любимого номера (0–n), тарификация (12-секундная, поминутная), плата за подключение к тарифу (0–n гривен). Корневой элемент назвать Tariff. С помощью XSL преобразовать XML-файл в формат НTML, при выводе отсортировать тарифы по абонентской плате.
 * 4. Лекарственные препараты.
 * Лекарственные препараты имеют следующие характеристики: — Name — наименование препарата; — Pharm — фирма-производитель; — Group — группа препаратов, к которым относится лекарство (антибиотики, болеутоляющие, витамины и т. п.); — Analogs (может быть несколько) — содержит наименование аналога; — Versions — варианты исполнения (консистенция/вид: таблетки, капсулы, порошок, капли и т. п.). Для каждого варианта исполнения может быть несколько производителей лекарственных препаратов со следующими характеристиками: • Certificate — свидетельство о регистрации препарата (номер, даты выдачи/истечения действия, регистрирующая организация); • Package — упаковка (тип упаковки, количество в упаковке, цена за упаковку); • Dosage — дозировка препарата, периодичность приема; Корневой элемент назвать Medicine. С помощью XSL преобразовать XML-файл в формат НTML, при выводе отсортировать лекарства по цене. 5. Компьютеры. Компьютерные комплектующие имеют следующие характеристики: — Name — название комплектующего; — Origin — страна производства; — Price — цена (0 — n гривен); — Type (должно быть несколько) — периферийное либо нет, энергопотребление (ватт), наличие кулера (есть либо нет), группа комплектующих (устройства ввода-вывода, мультимедийные), порты (COM, USB, LPT);
 * — Critical — критично ли наличие комплектующего для работы компьютера. Корневой элемент назвать Device. С помощью XSL преобразовать XML-файл в формат XML, при выводе корневым элементом сделать Critical.
 * 6. Электроинструменты.
 * Электроинструменты можно структурировать по следующей схеме: — Model — название модели; — Handy — одно- или двуручное; — Origin — страна производства; — TC (должно быть несколько) — технические характеристики: энергопотребление (низкое, среднее, высокое), производительность (в единицах в час), возможность автономного функционирования и т. д.; — Material — материал изготовления. Корневой элемент назвать PowerTools или Power. С помощью XSL преобразовать XML-файл в формат XML, при выводе корневым элементом сделать страну производства.
 * 7. Столовые приборы.
 *  Столовые приборы можно структурировать по следующей схеме: — Type — тип (нож, вилка, ложка и т. д.); — Origin — страна производства; — Visual (должно быть несколько) — визуальные характеристики: лезвие, зубец (длина лезвия, зубца [10– n см], ширина лезвия [10–n мм]), материал (лезвие [сталь, чугун, медь и т. д.]), рукоять (деревянная [если да, то указать тип дерева], пластик, металл); — Value — коллекционный либо нет. Корневой элемент назвать FlatWare. С помощью XSL преобразовать XML-файл в формат HTML, при выводе отсортировать по длине лезвия, зубца, объему.
 * 8. Самолеты.
 * Самолеты можно описать по следующей схеме: — Model — название модели; — Origin — страна производства; — Chars (должно быть несколько) — характеристики, могут быть следующими: тип (пассажирский, грузовой, почтовый, пожарный, сельскохозяйственный), количество мест для экипажа, характеристики (грузоподъемность, число пассажиров), наличие радара; — Parameters — длина (в метрах), ширина (в метрах), высота (в метрах); — Price — цена (в талерах). Корневой элемент назвать Plane. С помощью XSL преобразовать XML-файл в формат HTML, при выводе отсортировать по стоимости.
 * 9. Конфеты.
 *  — Name — название конфеты; — Energy — калорийность (ккал); — Type (должно быть несколько) — тип конфеты (карамель, ирис, шоколадная [с начинкой либо нет]); — Ingredients (должно быть несколько) — ингредиенты: вода, сахар (в мг), фруктоза (в мг), тип шоколада (для шоколадных), ванилин (в мг); — Value — пищевая ценность: белки (в г), жиры (в г) и углеводы (в г); — Production — предприятие-изготовитель. Корневой элемент назвать Candy. С помощью XSL преобразовать XML-файл в формат HTML, при выводе отсортировать по месту изготовления.
 * 10. Пиво.
 * — Name — название; — Type — тип пива (темное, светлое, лагер, живое); — Al — алкогольное либо безалкогольное; — Manufacturer — фирма-производитель; — Ingredients (должно быть несколько) — ингредиенты: вода, солод, хмель, сахар и т. д.; — Chars (должно быть несколько) — характеристики: количество оборотов (если алкогольное), прозрачность (в процентах), фильтрованное либо нет, пищевая ценность (ккал), способ разлива (объем и материал емкостей). Корневой элемент назвать Beer. С помощью XSL преобразовать XML-файл в формат XML, при выводе корневым элементом сделать производителя.
 * 11. Периодические издания. — Title — название; — Type — тип (газета, журнал, буклет); — Monthly — переодичность выхода; — Chars (должно быть несколько) — характеристики: цветность (да либо нет), объем (n страниц), глянцевое (да [только для журналов и буклетов] либо нет [для газет]), подписной индекс (только для газет и журналов). Корневой элемент назвать Paper. С помощью XSL преобразовать XML-файл в формат plain text, при выводе организовать подачу информации в удобном для прочтения виде.
 * 12. Туристические путевки. Туристические путевки, предлагаемые агентством, имеют следующие характеристики: — Type — тип (выходного дня, экскурсионная, отдых, паломничество и т. д.); — Country — страна, выбранная для путешествия; — Number days/nights — количество дней и ночей;
 * — Тransport — вид перевозки туристов (авиа, ж/д, авто, лайнер); — Hotel characteristic (должно быть несколько) — количество звезд, включено ли питание и какое (HB, BB, Al), какой номер (1-, 2-, 3-местные), есть ли телевизор, кондиционер и т. д.; — Сost — стоимость путевки (сколько и что включено). Корневой элемент назвать Тourist voucher. С помощью XSL преобразовать XML-файл в формат HTML, c выводом информации в табличном виде.
 * 13. Старые открытки. — Thema — тема изображения (городской пейзаж, природа, люди, религия, спорт, архитектура...); — Type — тип (поздравительная, рекламная, обычная). Была ли отправлена; — Country — страна производства; — Year — год издания; — Author — имя автора/ов (если известен); — Valuable — историческая, коллекционная или тематическая ценность. Корневой элемент назвать Old Card. С помощью XSL преобразовать XML-файл в формат PDF c выводом информации в отдельную страницу для каждого концерта.
 * 14. Банковские вклады. — Name — название банка; — Country — страна регистрации; — Type — тип вклада (до востребования, срочный, расчетный, накопительный, сберегательный, металлический); — Depositor — имя вкладчика; — Account id — номер счета; — Amount on deposit — сумма вклада; — Profitability — годовой процент; — Time constraints — срок вклада. Корневой элемент назвать Bank. С помощью XSL преобразовать XML-файл в формат PDF c выводом информации в табличном виде.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("1. Оранжерея");
        XslTransformer.xslTransform("1_greenhouse","greenhouse.xslt","greenhouse.xml","transformed_greenhouse.html");

        System.out.println("2. Алмазный фонд");
        XslTransformer.xslTransform("2_diamond_fund","diamond.xslt","diamond.xml","transformed_diamond.xml");

        System.out.println("3. Тарифы мобильных компаний.");
        XslTransformer.xslTransform("3_tariffs","tariffs.xslt","tariffs.xml","transformed_tariffs.html");

        System.out.println("4. Лекарственные препараты.");
        XslTransformer.xslTransform("4_medications","medications.xslt","medications.xml","transformed_medications.html");

        System.out.println("5. Компьютеры.");
        XslTransformer.xslTransform("5_computers","computers.xslt","computers.xml","transformed_computers.xml");

        System.out.println("7. Столовые приборы.");
        XslTransformer.xslTransform("7_cutlery","cutlery.xslt","cutlery.xml","transformed_cutlery.html");


    }
}
