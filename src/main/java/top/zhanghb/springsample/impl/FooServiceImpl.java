package top.zhanghb.springsample.impl;

import org.springframework.transaction.annotation.Transactional;
import top.zhanghb.springsample.api.FooService;
import top.zhanghb.springsample.dto.Foo;
import top.zhanghb.springsample.exception.InstrumentNotFoundException;
import top.zhanghb.springsample.exception.NoProductInStockException;

public class FooServiceImpl implements FooService {

    public Foo getFoo(String fooName) {
        throw new UnsupportedOperationException();
    }

    @Transactional(transactionManager = "txManager1",rollbackFor = NoProductInStockException.class)
    public Foo getFoo(String fooName, String barName) throws NoProductInStockException {
        throw new NoProductInStockException();
    }

    @Transactional(transactionManager = "txManager2")
    public void insertFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

    @Transactional(transactionManager = "txManager2")
    public void updateFoo(Foo foo) throws InstrumentNotFoundException {
        throw new InstrumentNotFoundException();
    }

}
