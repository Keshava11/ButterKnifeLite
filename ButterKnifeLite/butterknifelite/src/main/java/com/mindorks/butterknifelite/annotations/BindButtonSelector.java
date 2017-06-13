package com.mindorks.butterknifelite.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * The annotation definition to get public fields and methods from the class
 * This annotation is used with both field and method
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface BindButtonSelector {

    int value();

    int defaultBgResource();

    int selectedBgResource();

    int textColorNormal();

    int textColorSelected();

    String textStrNormal();

    String textStrSelected();

}


