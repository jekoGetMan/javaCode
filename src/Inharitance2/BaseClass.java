package Inharitance2;

    public class BaseClass{
        //Открытое поле
        public String publicField = "BaseClass.publicField"; // public виден всем
        // Закрытое поле
        private String privateField = "BaseClass.privateField"; // private виден до конца класса
        // Защищонное поле
        protected String protectedField = "BaseClass.protectedField";
        // int a = 10 // модификатор доступа - пакетный. // default виден только в рамках пакета.

    }