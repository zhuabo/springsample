package top.zhanghb.springsample.impl;

import top.zhanghb.springsample.api.FooService;
import top.zhanghb.springsample.dto.Foo;
import top.zhanghb.springsample.exception.InstrumentNotFoundException;
import top.zhanghb.springsample.exception.NoProductInStockException;

public class FooServiceImpl implements FooService {

    public Foo getFoo(String fooName) {
        throw new UnsupportedOperationException();
    }

    public Foo getFoo(String fooName, String barName) throws NoProductInStockException {
        throw new NoProductInStockException();
    }

    public void insertFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

    public void updateFoo(Foo foo) throws InstrumentNotFoundException {
        throw new InstrumentNotFoundException();
    }

}
