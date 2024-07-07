package org.example.lesson19.hmls19;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

//Напишите шаблонный метод equals который принимает две пары и проверяет их на эквивалентность, сравнивая по значениям все их поля

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Pair<A, B> {
    private final A first;
    private final B second;
}
