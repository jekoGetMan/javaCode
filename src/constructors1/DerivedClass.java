package constructors1;

public class DerivedClass extends BaseClass {
    public int derivedField;

    // Конструктор по умолчанию
    public DerivedClass(){

    }

    public DerivedClass(int number1, int number2){
        super(number1); // Super или this всегда должны быть на первом месте
        derivedField = number2;
    }
}
