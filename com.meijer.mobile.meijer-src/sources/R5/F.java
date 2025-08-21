package R5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class F extends n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5118e f31881a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5125l f31882b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f31883c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f31884d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f31885e;

    public F(InterfaceC5118e interfaceC5118e, InterfaceC5125l interfaceC5125l) throws IllegalArgumentException {
        this(interfaceC5118e, interfaceC5125l, Executors.newSingleThreadScheduledExecutor());
    }

    F(InterfaceC5118e interfaceC5118e, InterfaceC5125l interfaceC5125l, ScheduledExecutorService scheduledExecutorService) {
        this.f31883c = new AtomicBoolean(true);
        this.f31885e = new AtomicBoolean(false);
        if (interfaceC5118e == null || interfaceC5125l == null) {
            throw new IllegalArgumentException("Null value is not allowed in PersistentHitQueue Constructor.");
        }
        this.f31881a = interfaceC5118e;
        this.f31882b = interfaceC5125l;
        this.f31884d = scheduledExecutorService;
    }

    public static /* synthetic */ void g(final F f10) {
        final C5117d c5117dPeek = f10.f31881a.peek();
        if (c5117dPeek == null) {
            f10.f31885e.set(false);
        } else {
            f10.f31882b.a(c5117dPeek, new m() { // from class: R5.D
                @Override // R5.m
                public final void a(boolean z10) {
                    F.i(this.f31878a, c5117dPeek, z10);
                }
            });
        }
    }

    public static /* synthetic */ void h(F f10) {
        f10.f31885e.set(false);
        f10.j();
    }

    public static /* synthetic */ void i(final F f10, C5117d c5117d, boolean z10) {
        if (!z10) {
            f10.f31884d.schedule(new Runnable() { // from class: R5.E
                @Override // java.lang.Runnable
                public final void run() {
                    F.h(this.f31880a);
                }
            }, f10.f31882b.b(c5117d), TimeUnit.SECONDS);
        } else {
            f10.f31881a.remove();
            f10.f31885e.set(false);
            f10.j();
        }
    }

    private void j() {
        if (!this.f31883c.get() && this.f31885e.compareAndSet(false, true)) {
            this.f31884d.execute(new Runnable() { // from class: R5.C
                @Override // java.lang.Runnable
                public final void run() {
                    F.g(this.f31877a);
                }
            });
        }
    }

    @Override // R5.n
    public void a() {
        this.f31883c.set(false);
        j();
    }

    @Override // R5.n
    public void b() {
        this.f31881a.clear();
    }

    @Override // R5.n
    public boolean e(C5117d c5117d) {
        boolean zA = this.f31881a.a(c5117d);
        j();
        return zA;
    }

    @Override // R5.n
    public void f() {
        this.f31883c.set(true);
    }

    @Override // R5.n
    public void c() {
        f();
        this.f31881a.close();
        this.f31884d.shutdown();
    }
}
