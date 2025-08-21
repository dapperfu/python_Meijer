package Xu;

import io.reactivex.t;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes10.dex */
public final class e extends t {

    /* renamed from: d, reason: collision with root package name */
    private static final h f42713d = new h("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f42714c;

    public e() {
        this(f42713d);
    }

    public e(ThreadFactory threadFactory) {
        this.f42714c = threadFactory;
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new f(this.f42714c);
    }
}
