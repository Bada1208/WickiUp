
### Single Responsibility Principle (Принцип единственной обязанности)

> ***На каждый объект должна быть возложена одна единственная обязанность.
> Каждый объект должен иметь одну обязанность и эта обязанность должна быть полностью инкапсулирована в класс.
> Все его сервисы должны быть направлены исключительно на обеспечение этой обязанности.***

Т.е. конкретный класс должен решать конкретную задачу — ни больше, ни меньше.

Другими словами, вы должны писать, изменять и поддерживать класс только для одной цели. 
Если это модель класса, то она должна строго представлять собой одну функцию или действие. 
Это даст вам возможность вносить изменения в будущем, не боясь влияния изменений на другие объекты.

Множество маленьких интерфейсов `принцип разделения интерфейса` помогут добиться `принципа единственной обязанности`
 
Следование `принципу единственной обязанности` ведет к уменьшению привязанности и увеличению связи.

> _**`Идемподентность`**_ - если выполнить операцию N раз, это не должно поменять состояние 
> системы по сравнению с первым выполнением операции.
> Например, если выполнять операцию удаления товара один раз и попробовать удалить его потом N раз
> товар по прежнему будет удален

[Single responsibility example](https://github.com/LinnykOleh/AlgorithmsDataStructures/blob/master/src/main/java/solid/s/)
