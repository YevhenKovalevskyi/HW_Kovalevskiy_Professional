package com.cbsystematics.homeworks.hw05.task2;

import java.util.Arrays;
import java.util.Collections;

/**
 * Main Class represents homework #5 #task2
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        String text = "Объекты String являются неизменяемыми, поэтому все операции, которые изменяют строки, фактически приводят к созданию новой строки, что сказывается на производительности приложения. Для решения этой проблемы, чтобы работа со строками проходила с меньшими издержками в Java были добавлены классы StringBuffer и StringBuilder. По сути они напоминает расширяемую строку, которую можно изменять без ущерба для производительности. Эти классы похожи, практически двойники, они имеют одинаковые конструкторы, одни и те же методы, которые одинаково используются. Единственное их различие состоит в том, что класс StringBuffer синхронизированный и потокобезопасный. То есть класс StringBuffer удобнее использовать в многопоточных приложениях, где объект данного класса может меняться в различных потоках. Если же речь о многопоточных приложениях не идет, то лучше использовать класс StringBuilder, который не потокобезопасный, но при этом работает быстрее, чем StringBuffer в однопоточных приложениях.";
        
        String[] textParts = text.split("([.!?])[ ]*");
        
        if (textParts.length == 0) {
            System.out.println("String is empty!");
            System.exit(0);
        }
    
        System.out.println("-> Original:");
        Arrays.stream(textParts).forEach(item -> System.out.println(item + "."));
    
        System.out.println("\n-> Changed:");
        Arrays.stream(textParts)
                .map(item -> {
                    String[] words = item.split(" ");
                    Collections.swap(Arrays.asList(words), 0, (words.length - 1));
                    
                    return String.join(" ", words);
                })
                .forEach(item -> System.out.println(item + "."))
        ;
    }
}

/*
    В этом случае существует вероятность повторяемых слов(совпадающих с 1-м и последним).
    По этому простой replace() тут не подходит.
    Разбиваем по пробелу, без учета знаков пунктуации, меняем местами и объединяем.
*/