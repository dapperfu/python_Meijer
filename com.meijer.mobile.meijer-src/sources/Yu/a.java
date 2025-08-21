package Yu;

import av.k;
import io.reactivex.g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lw.b;
import lw.c;

/* loaded from: classes10.dex */
public class a<T> extends AtomicInteger implements g<T>, c {

    /* renamed from: a, reason: collision with root package name */
    final b<? super T> f43302a;

    /* renamed from: b, reason: collision with root package name */
    final av.c f43303b = new av.c();

    /* renamed from: c, reason: collision with root package name */
    final AtomicLong f43304c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<c> f43305d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f43306e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f43307f;

    @Override // lw.b
    public void onComplete() {
        this.f43307f = true;
        k.b(this.f43302a, this, this.f43303b);
    }

    @Override // lw.b
    public void onError(Throwable th2) {
        this.f43307f = true;
        k.d(this.f43302a, th2, this, this.f43303b);
    }

    @Override // lw.b
    public void b(c cVar) {
        if (this.f43306e.compareAndSet(false, true)) {
            this.f43302a.b(this);
            Zu.b.e(this.f43305d, this.f43304c, cVar);
        } else {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // lw.c
    public void cancel() {
        if (this.f43307f) {
            return;
        }
        Zu.b.a(this.f43305d);
    }

    @Override // lw.b
    public void onNext(T t10) {
        k.f(this.f43302a, t10, this, this.f43303b);
    }

    @Override // lw.c
    public void t(long j10) {
        if (j10 > 0) {
            Zu.b.b(this.f43305d, this.f43304c, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }

    public a(b<? super T> bVar) {
        this.f43302a = bVar;
    }
}
