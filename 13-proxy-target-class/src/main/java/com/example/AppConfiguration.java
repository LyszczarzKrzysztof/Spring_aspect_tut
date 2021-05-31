package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example")
@EnableAspectJAutoProxy(proxyTargetClass = true)         //ta adnotacja jest potrzebna do działąnia aspektowego, proxy target class przy implementacji interfejsu przez beana
public class AppConfiguration {

    //do generowania proxy uzywane jest JDKDynamicProxy - dla beanow klas implementujacych interface
    //lub cglib dla klas ktore nie implementuja interfejsow
    //jak damy tworzenie beana z kontekstu przez intefejs to tworzy przez JDKDynamicProxy
    //jak damy tworzenie beana przez klase, ktora implementuje intefejs rzuca wyjatek i trzeba wtedy
    //albo tworzyc przez interfejs albo dalej przez klase ale trzeba ustawic proxyTargetClass = true
    //jesli chcemy przez
}
