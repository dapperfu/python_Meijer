package cv;

import dv.EnumC13584b;
import ev.k;
import io.reactivex.g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import pw.b;
import pw.c;

/* renamed from: cv.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C13425a<T> extends AtomicInteger implements g<T>, c {

    /* renamed from: a, reason: collision with root package name */
    final b<? super T> f126774a;

    /* renamed from: b, reason: collision with root package name */
    final ev.c f126775b = new ev.c();

    /* renamed from: c, reason: collision with root package name */
    final AtomicLong f126776c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<c> f126777d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f126778e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f126779f;

    @Override // pw.b
    public void onComplete() {
        this.f126779f = true;
        k.b(this.f126774a, this, this.f126775b);
    }

    @Override // pw.b
    public void onError(Throwable th2) {
        this.f126779f = true;
        k.d(this.f126774a, th2, this, this.f126775b);
    }

    @Override // pw.b
    public void b(c cVar) {
        if (this.f126778e.compareAndSet(false, true)) {
            this.f126774a.b(this);
            EnumC13584b.e(this.f126777d, this.f126776c, cVar);
        } else {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // pw.c
    public void cancel() {
        if (this.f126779f) {
            return;
        }
        EnumC13584b.a(this.f126777d);
    }

    @Override // pw.b
    public void onNext(T t10) {
        k.f(this.f126774a, t10, this, this.f126775b);
    }

    @Override // pw.c
    public void t(long j10) {
        if (j10 > 0) {
            EnumC13584b.b(this.f126777d, this.f126776c, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }

    public C13425a(b<? super T> bVar) {
        this.f126774a = bVar;
    }
}
