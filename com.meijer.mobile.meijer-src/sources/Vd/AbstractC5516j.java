package Vd;

import java.util.concurrent.Executor;

/* renamed from: Vd.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC5516j<TResult> {
    public abstract AbstractC5516j<TResult> e(InterfaceC5512f interfaceC5512f);

    public abstract AbstractC5516j<TResult> f(Executor executor, InterfaceC5512f interfaceC5512f);

    public abstract AbstractC5516j<TResult> g(InterfaceC5513g<? super TResult> interfaceC5513g);

    public abstract AbstractC5516j<TResult> h(Executor executor, InterfaceC5513g<? super TResult> interfaceC5513g);

    public abstract Exception m();

    public abstract TResult n();

    public abstract <X extends Throwable> TResult o(Class<X> cls) throws Throwable;

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public AbstractC5516j<TResult> a(InterfaceC5510d interfaceC5510d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public AbstractC5516j<TResult> b(Executor executor, InterfaceC5510d interfaceC5510d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public AbstractC5516j<TResult> c(InterfaceC5511e<TResult> interfaceC5511e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public AbstractC5516j<TResult> d(Executor executor, InterfaceC5511e<TResult> interfaceC5511e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> AbstractC5516j<TContinuationResult> i(InterfaceC5509c<TResult, TContinuationResult> interfaceC5509c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC5516j<TContinuationResult> j(Executor executor, InterfaceC5509c<TResult, TContinuationResult> interfaceC5509c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC5516j<TContinuationResult> k(InterfaceC5509c<TResult, AbstractC5516j<TContinuationResult>> interfaceC5509c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> AbstractC5516j<TContinuationResult> l(Executor executor, InterfaceC5509c<TResult, AbstractC5516j<TContinuationResult>> interfaceC5509c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> AbstractC5516j<TContinuationResult> s(InterfaceC5515i<TResult, TContinuationResult> interfaceC5515i) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> AbstractC5516j<TContinuationResult> t(Executor executor, InterfaceC5515i<TResult, TContinuationResult> interfaceC5515i) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
