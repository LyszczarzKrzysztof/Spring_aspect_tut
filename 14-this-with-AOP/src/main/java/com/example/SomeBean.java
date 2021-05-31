package com.example;

import org.springframework.stereotype.Component;

@Component
public class SomeBean {
    public void method1(){
//        tak nie dziala wywolanie metody 2 przez aspekt - takze w tym momencie nie zadzialaly metody proxy
//        i nie zadzialala metoda @Before zdefiniowana w LoggingAspect
//        dlatego ze ponizej domyslnie jest tez this - i wywolanie tej metody odnosi sie do obiektu tej klasy (jakby wewnatrz tej klasy)
//        a proxy tworzace aspekt jest poza obrebem klasy i bierze method2() tylko wywolane bez this - na zewnatrz obiektu - jakos tak
//        method2();
    }

    public void method2(){
    }
}
