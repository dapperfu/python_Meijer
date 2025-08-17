package Zu;

import io.reactivex.u;
import io.reactivex.w;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class d<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends Throwable> f43289a;

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        try {
            th = (Throwable) Ru.b.e(this.f43289a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            Ou.a.b(th);
        }
        Qu.e.o(th, wVar);
    }

    public d(Callable<? extends Throwable> callable) {
        this.f43289a = callable;
    }
}
