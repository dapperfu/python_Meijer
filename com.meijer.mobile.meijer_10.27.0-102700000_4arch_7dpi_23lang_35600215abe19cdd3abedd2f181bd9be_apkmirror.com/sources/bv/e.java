package bv;

import io.reactivex.t;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes9.dex */
public final class e extends t {

    /* renamed from: d, reason: collision with root package name */
    private static final h f60815d = new h("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f60816c;

    public e() {
        this(f60815d);
    }

    public e(ThreadFactory threadFactory) {
        this.f60816c = threadFactory;
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new f(this.f60816c);
    }
}
