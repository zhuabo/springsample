package top.zhanghb.springsample.api;

import top.zhanghb.springsample.dto.Foo;
import top.zhanghb.springsample.exception.InstrumentNotFoundException;
import top.zhanghb.springsample.exception.NoProductInStockException;

public interface FooService {

    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName) throws NoProductInStockException;

    void insertFoo(Foo foo);

    void updateFoo(Foo foo) throws InstrumentNotFoundException;

}
