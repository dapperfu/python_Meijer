package C;

import C.a0;
import F.y0;
import androidx.camera.core.impl.h;

/* loaded from: classes.dex */
public interface a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f3798a = new a0() { // from class: C.Z
        @Override // C.a0
        public final a0.c b(a0.b bVar) {
            return a0.c.f3803d;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f3799b = new h.b(d());

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f3800c = new androidx.camera.core.impl.h(d());

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final a0 f3801a;

        /* renamed from: b, reason: collision with root package name */
        private long f3802b;

        public a0 a() {
            a0 a0Var = this.f3801a;
            return a0Var instanceof F.p0 ? ((F.p0) a0Var).c(this.f3802b) : new y0(this.f3802b, this.f3801a);
        }

        public a(a0 a0Var) {
            this.f3801a = a0Var;
            this.f3802b = a0Var.a();
        }
    }

    public interface b {
        int a();

        Throwable b();

        long c();
    }

    public static final class c {

        /* renamed from: d, reason: collision with root package name */
        public static final c f3803d = new c(false, 0);

        /* renamed from: e, reason: collision with root package name */
        public static final c f3804e = new c(true);

        /* renamed from: f, reason: collision with root package name */
        public static final c f3805f = new c(true, 100);

        /* renamed from: g, reason: collision with root package name */
        public static c f3806g = new c(false, 0, true);

        /* renamed from: a, reason: collision with root package name */
        private final long f3807a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f3808b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f3809c;

        private c(boolean z10) {
            this(z10, a());
        }

        private c(boolean z10, long j10) {
            this(z10, j10, false);
        }

        public static long a() {
            return 500L;
        }

        public long b() {
            return this.f3807a;
        }

        public boolean c() {
            return this.f3809c;
        }

        public boolean d() {
            return this.f3808b;
        }

        private c(boolean z10, long j10, boolean z11) {
            this.f3808b = z10;
            this.f3807a = j10;
            if (z11) {
                o2.i.b(!z10, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f3809c = z11;
        }
    }

    c b(b bVar);

    static long d() {
        return 6000L;
    }

    default long a() {
        return 0L;
    }
}
