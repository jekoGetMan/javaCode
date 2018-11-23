package Inharitance2;

public class DerivedClass extends BaseClass {
    // Конструктор производного класса
    public DerivedClass() {
        // Изменяем все доступные поля унаследованые от базового класса, перезаписываем
        publicField = "Derived.publicField";
        protectedField = "Derived.protectedField";
    }
}
