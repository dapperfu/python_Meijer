package Vu;

import io.reactivex.u;
import io.reactivex.w;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class d<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends Throwable> f40465a;

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        try {
            th = (Throwable) Nu.b.e(this.f40465a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            Ku.a.b(th);
        }
        Mu.e.o(th, wVar);
    }

    public d(Callable<? extends Throwable> callable) {
        this.f40465a = callable;
    }
}
