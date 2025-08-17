package Zu;

import io.reactivex.u;
import io.reactivex.w;

/* loaded from: classes9.dex */
public final class e<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final T f43290a;

    public e(T t10) {
        this.f43290a = t10;
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        wVar.onSubscribe(Nu.c.a());
        wVar.onSuccess(this.f43290a);
    }
}
