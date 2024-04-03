package com.mycompany.designpatterns.Singleton;

public class SingletonPatternDemo {
    public static void init() {
        // SingleObject object = new SingleObject();
        // o codigo acima da erro de compilação
        
        SingleObject object = SingleObject.getInstance();
        
        object.showMessage();
    }
}
