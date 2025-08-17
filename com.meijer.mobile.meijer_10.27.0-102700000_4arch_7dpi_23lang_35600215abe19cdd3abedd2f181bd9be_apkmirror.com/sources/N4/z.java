package N4;

/* loaded from: classes4.dex */
public interface z {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f21448a;

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0337b f21449b;

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f21450a;

            public String toString() {
                return "FAILURE (" + this.f21450a.getMessage() + ")";
            }

            public a(Throwable th2) {
                this.f21450a = th2;
            }
        }

        /* renamed from: N4.z$b$b, reason: collision with other inner class name */
        public static final class C0337b extends b {
            private C0337b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        b() {
        }
    }

    static {
        f21448a = new b.c();
        f21449b = new b.C0337b();
    }
}
