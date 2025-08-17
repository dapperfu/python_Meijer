package Yu;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: Yu.e0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5449e0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final Future<? extends T> f41234a;

    /* renamed from: b, reason: collision with root package name */
    final long f41235b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f41236c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        Tu.k kVar = new Tu.k(sVar);
        sVar.onSubscribe(kVar);
        if (kVar.isDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.f41236c;
            kVar.c(Ru.b.e(timeUnit != null ? this.f41234a.get(this.f41235b, timeUnit) : this.f41234a.get(), "Future returned null"));
        } catch (Throwable th2) {
            Ou.a.b(th2);
            if (kVar.isDisposed()) {
                return;
            }
            sVar.onError(th2);
        }
    }

    public C5449e0(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f41234a = future;
        this.f41235b = j10;
        this.f41236c = timeUnit;
    }
}
