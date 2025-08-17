package of;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f153467a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f153468b = new AtomicInteger();

    public void a() {
        this.f153468b.getAndIncrement();
    }

    public void b() {
        this.f153467a.getAndIncrement();
    }

    public void c() {
        this.f153468b.set(0);
    }
}
