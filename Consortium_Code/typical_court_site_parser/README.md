## About
This script parses https://oblsud--kln.sudrf.ru/ site, fetching all the act information by given date, then he compresses it

## Usage
ruby ./court_parser 03.06.2016
cd out
tar -xvf out/fetched_acts.tar.gz

cat fetched_act1.xml # =>
```xml
<?xml version="1.0" encoding="UTF-8"?>
<root>
  <act>
    <№ дела>33-2411/2016</№ дела>
    <СсылкаНаДело>https://oblsud--kln.sudrf.ru/modules.php?name=sud_delo&amp;srv_num=1&amp;name_op=case&amp;case_id=1794306&amp;delo_id=5&amp;new=5</СсылкаНаДело>
    <Дата поступления дела>10.05.2016</Дата поступления дела>
    <Категория дела>2.084 - Социальные споры -&gt; Иные социальные споры</Категория дела>
    <Докладчик>Поникаровская Наталья Викторовна</Докладчик>
    <Дата рассмотрения>18.05.2016</Дата рассмотрения>
    <Решение> РЕШЕНИЕ оставлено БЕЗ ИЗМЕНЕНИЯ</Решение>
    <Суд 1-ой инстанции>Центральный районный суд г. Калининграда</Суд 1-ой инстанции>
    <Датапоступления> 10.05.2016</Датапоступления>
    <Категория/Лица> КАТЕГОРИЯ: 2.084 - Социальные споры -&gt; Иные социальные спорыИСТЕЦ(ЗАЯВИТЕЛЬ): Саблин Е.И.ОТВЕТЧИК: ФСИН России, УФСИН России по К/обл.</Категория/Лица>
    <Судья> Поникаровская Наталья Викторовна</Судья>
    <Датарешения> 18.05.2016</Датарешения>
    <СсылкаНаСудебныйAкт>https://oblsud--kln.sudrf.ru/modules.php?name=sud_delo&amp;srv_num=1&amp;name_op=doc&amp;number=2172828&amp;delo_id=5&amp;new=5&amp;text_number=1&amp;case_id=1794306</СсылкаНаСудебныйAкт>
    <Судебныеакты>
	КАЛИНИНГРАДСКИЙ ОБЛАСТНОЙ СУД
	Судья Ласко О.Л. Дело № 33 – 2411/2016 г.
	АПЕЛЛЯЦИОННОЕ   ОПРЕДЕЛЕНИЕ
	18 мая 2016 года г. Калининград
	Судебная коллегия по гражданским делам Калининградского областного суда в составе
	председательствующего Поникаровской Н.В. 
	судей Теплинской Т.В., Коноваленко А.Б.
	при секретаре Близнюк Н.Г.
    </Судебныеакты>
  </act>
</root>
'''
