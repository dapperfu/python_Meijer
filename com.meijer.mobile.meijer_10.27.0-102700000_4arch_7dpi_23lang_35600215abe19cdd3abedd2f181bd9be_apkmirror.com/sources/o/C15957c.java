package o;

import java.util.concurrent.Executor;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C15957c extends AbstractC15959e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile C15957c f152852c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f152853d = new Executor() { // from class: o.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C15957c.h().d(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f152854e = new Executor() { // from class: o.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C15957c.h().a(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private AbstractC15959e f152855a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC15959e f152856b;

    public static Executor g() {
        return f152854e;
    }

    public static C15957c h() {
        if (f152852c != null) {
            return f152852c;
        }
        synchronized (C15957c.class) {
            try {
                if (f152852c == null) {
                    f152852c = new C15957c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f152852c;
    }

    @Override // o.AbstractC15959e
    public void a(Runnable runnable) {
        this.f152855a.a(runnable);
    }

    @Override // o.AbstractC15959e
    public boolean c() {
        return this.f152855a.c();
    }

    @Override // o.AbstractC15959e
    public void d(Runnable runnable) {
        this.f152855a.d(runnable);
    }

    private C15957c() {
        C15958d c15958d = new C15958d();
        this.f152856b = c15958d;
        this.f152855a = c15958d;
    }
}
