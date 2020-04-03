package labs_examples.generics.ryan_testing;

public class GenericClass<T, N> {

    T val;
    N val2;

    public GenericClass(T val, N val2) {
        this.val = val;
        this.val2 = val2;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public N getVal2() {
        return val2;
    }

    public void setVal2(N val2) {
        this.val2 = val2;
    }
}
