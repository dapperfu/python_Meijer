package Vu;

import io.reactivex.u;
import io.reactivex.w;

/* loaded from: classes10.dex */
public final class e<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final T f40466a;

    public e(T t10) {
        this.f40466a = t10;
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        wVar.onSubscribe(Ju.c.a());
        wVar.onSuccess(this.f40466a);
    }
}
