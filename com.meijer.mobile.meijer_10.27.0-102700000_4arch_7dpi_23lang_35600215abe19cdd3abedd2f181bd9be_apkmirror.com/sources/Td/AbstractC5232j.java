package Td;

import java.util.concurrent.Executor;

/* renamed from: Td.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC5232j<TResult> {
    public abstract AbstractC5232j<TResult> e(InterfaceC5228f interfaceC5228f);

    public abstract AbstractC5232j<TResult> f(Executor executor, InterfaceC5228f interfaceC5228f);

    public abstract AbstractC5232j<TResult> g(InterfaceC5229g<? super TResult> interfaceC5229g);

    public abstract AbstractC5232j<TResult> h(Executor executor, InterfaceC5229g<? super TResult> interfaceC5229g);

    public abstract Exception m();

    public abstract TResult n();

    public abstract <X extends Throwable> TResult o(Class<X> cls) throws Throwable;

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public AbstractC5232j<TResult> a(InterfaceC5226d interfaceC5226d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public AbstractC5232j<TResult> b(Executor executor, InterfaceC5226d interfaceC5226d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public AbstractC5232j<TResult> c(InterfaceC5227e<TResult> interfaceC5227e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public AbstractC5232j<TResult> d(Executor executor, InterfaceC5227e<TResult> interfaceC5227e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> AbstractC5232j<TContinuationResult> i(InterfaceC5225c<TResult, TContinuationResult> interfaceC5225c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC5232j<TContinuationResult> j(Executor executor, InterfaceC5225c<TResult, TContinuationResult> interfaceC5225c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC5232j<TContinuationResult> k(InterfaceC5225c<TResult, AbstractC5232j<TContinuationResult>> interfaceC5225c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> AbstractC5232j<TContinuationResult> l(Executor executor, InterfaceC5225c<TResult, AbstractC5232j<TContinuationResult>> interfaceC5225c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> AbstractC5232j<TContinuationResult> s(InterfaceC5231i<TResult, TContinuationResult> interfaceC5231i) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> AbstractC5232j<TContinuationResult> t(Executor executor, InterfaceC5231i<TResult, TContinuationResult> interfaceC5231i) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
