package com.epam.mjc;

import java.util.LinkedList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        Operation operation = (arg) -> {

            List<Integer> list = new LinkedList<>();

            for(Object i : arg) {

                list.add((int)i/divider);

            }

            return list;
        };

        return operation;

    }
}
