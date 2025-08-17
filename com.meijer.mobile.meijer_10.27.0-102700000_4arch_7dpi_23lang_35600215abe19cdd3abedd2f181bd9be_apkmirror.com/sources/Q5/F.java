package Q5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class F extends n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5073e f29770a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5080l f29771b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f29772c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f29773d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f29774e;

    public F(InterfaceC5073e interfaceC5073e, InterfaceC5080l interfaceC5080l) throws IllegalArgumentException {
        this(interfaceC5073e, interfaceC5080l, Executors.newSingleThreadScheduledExecutor());
    }

    F(InterfaceC5073e interfaceC5073e, InterfaceC5080l interfaceC5080l, ScheduledExecutorService scheduledExecutorService) {
        this.f29772c = new AtomicBoolean(true);
        this.f29774e = new AtomicBoolean(false);
        if (interfaceC5073e == null || interfaceC5080l == null) {
            throw new IllegalArgumentException("Null value is not allowed in PersistentHitQueue Constructor.");
        }
        this.f29770a = interfaceC5073e;
        this.f29771b = interfaceC5080l;
        this.f29773d = scheduledExecutorService;
    }

    public static /* synthetic */ void g(final F f10) {
        final C5072d c5072dPeek = f10.f29770a.peek();
        if (c5072dPeek == null) {
            f10.f29774e.set(false);
        } else {
            f10.f29771b.b(c5072dPeek, new m() { // from class: Q5.D
                @Override // Q5.m
                public final void a(boolean z10) {
                    F.i(this.f29767a, c5072dPeek, z10);
                }
            });
        }
    }

    public static /* synthetic */ void h(F f10) {
        f10.f29774e.set(false);
        f10.j();
    }

    public static /* synthetic */ void i(final F f10, C5072d c5072d, boolean z10) {
        if (!z10) {
            f10.f29773d.schedule(new Runnable() { // from class: Q5.E
                @Override // java.lang.Runnable
                public final void run() {
                    F.h(this.f29769a);
                }
            }, f10.f29771b.a(c5072d), TimeUnit.SECONDS);
        } else {
            f10.f29770a.remove();
            f10.f29774e.set(false);
            f10.j();
        }
    }

    private void j() {
        if (!this.f29772c.get() && this.f29774e.compareAndSet(false, true)) {
            this.f29773d.execute(new Runnable() { // from class: Q5.C
                @Override // java.lang.Runnable
                public final void run() {
                    F.g(this.f29766a);
                }
            });
        }
    }

    @Override // Q5.n
    public void a() {
        this.f29772c.set(false);
        j();
    }

    @Override // Q5.n
    public void b() {
        this.f29770a.clear();
    }

    @Override // Q5.n
    public boolean e(C5072d c5072d) {
        boolean zB = this.f29770a.b(c5072d);
        j();
        return zB;
    }

    @Override // Q5.n
    public void f() {
        this.f29772c.set(true);
    }

    @Override // Q5.n
    public void c() {
        f();
        this.f29770a.close();
        this.f29773d.shutdown();
    }
}
