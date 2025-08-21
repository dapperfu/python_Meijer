package o;

import java.util.concurrent.Executor;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C16032c extends AbstractC16034e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile C16032c f153297c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f153298d = new Executor() { // from class: o.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C16032c.h().d(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f153299e = new Executor() { // from class: o.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C16032c.h().a(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private AbstractC16034e f153300a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC16034e f153301b;

    public static Executor g() {
        return f153299e;
    }

    public static C16032c h() {
        if (f153297c != null) {
            return f153297c;
        }
        synchronized (C16032c.class) {
            try {
                if (f153297c == null) {
                    f153297c = new C16032c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f153297c;
    }

    @Override // o.AbstractC16034e
    public void a(Runnable runnable) {
        this.f153300a.a(runnable);
    }

    @Override // o.AbstractC16034e
    public boolean c() {
        return this.f153300a.c();
    }

    @Override // o.AbstractC16034e
    public void d(Runnable runnable) {
        this.f153300a.d(runnable);
    }

    private C16032c() {
        C16033d c16033d = new C16033d();
        this.f153301b = c16033d;
        this.f153300a = c16033d;
    }
}
