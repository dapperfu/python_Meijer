package Tu;

import gv.C14313a;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class m<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    final Pu.q<? super T> f35471a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.g<? super Throwable> f35472b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.a f35473c;

    /* renamed from: d, reason: collision with root package name */
    boolean f35474d;

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f35474d) {
            return;
        }
        this.f35474d = true;
        try {
            this.f35473c.run();
        } catch (Throwable th2) {
            Ou.a.b(th2);
            C14313a.s(th2);
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f35474d) {
            C14313a.s(th2);
            return;
        }
        this.f35474d = true;
        try {
            this.f35472b.accept(th2);
        } catch (Throwable th3) {
            Ou.a.b(th3);
            C14313a.s(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f35474d) {
            return;
        }
        try {
            if (this.f35471a.test(t10)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th2) {
            Ou.a.b(th2);
            dispose();
            onError(th2);
        }
    }

    public m(Pu.q<? super T> qVar, Pu.g<? super Throwable> gVar, Pu.a aVar) {
        this.f35471a = qVar;
        this.f35472b = gVar;
        this.f35473c = aVar;
    }

    @Override // Nu.b
    public void dispose() {
        Qu.d.a(this);
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return Qu.d.b(get());
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        Qu.d.o(this, bVar);
    }
}
