package p7;

import java.util.concurrent.Executor;

/* renamed from: p7.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16268e {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f155655a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f155656b = new b();

    /* renamed from: p7.e$a */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.u(runnable);
        }
    }

    /* renamed from: p7.e$b */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f155656b;
    }

    public static Executor b() {
        return f155655a;
    }
}
