package com.bitcamp.web.common.lambdas;

import java.util.function.Consumer;

@FunctionalInterface
public interface IConsumer {
    public abstract void accept(Object o);
       
}