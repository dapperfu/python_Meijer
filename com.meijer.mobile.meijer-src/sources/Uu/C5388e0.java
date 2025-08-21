package Uu;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: Uu.e0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5388e0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final Future<? extends T> f38459a;

    /* renamed from: b, reason: collision with root package name */
    final long f38460b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f38461c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        Pu.k kVar = new Pu.k(sVar);
        sVar.onSubscribe(kVar);
        if (kVar.isDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.f38461c;
            kVar.c(Nu.b.e(timeUnit != null ? this.f38459a.get(this.f38460b, timeUnit) : this.f38459a.get(), "Future returned null"));
        } catch (Throwable th2) {
            Ku.a.b(th2);
            if (kVar.isDisposed()) {
                return;
            }
            sVar.onError(th2);
        }
    }

    public C5388e0(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f38459a = future;
        this.f38460b = j10;
        this.f38461c = timeUnit;
    }
}
