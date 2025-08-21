package qf;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f158319a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f158320b = new AtomicInteger();

    public void a() {
        this.f158320b.getAndIncrement();
    }

    public void b() {
        this.f158319a.getAndIncrement();
    }

    public void c() {
        this.f158320b.set(0);
    }
}
