package com.example;

import org.springframework.stereotype.Component;

//implementacja interfejsu przez beana moze byc problem- przy pobieraniu z kontekstu trzeba korzystac z interfejsu nie z klasy
// lub przy adnotacji @EnableAspectJAutoProxy klasie konfiguracyjnej trzeba ustawić @EnableAspectJAutoProxy(proxyTargetClass = true)
@Component("someBean")
public class SomeBean implements SomeBeanInterface {
    @Override
    public String someMethod(){
        return "some value";
    }
}
