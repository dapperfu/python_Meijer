package O4;

/* loaded from: classes4.dex */
public interface z {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f23221a;

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0379b f23222b;

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f23223a;

            public String toString() {
                return "FAILURE (" + this.f23223a.getMessage() + ")";
            }

            public a(Throwable th2) {
                this.f23223a = th2;
            }
        }

        /* renamed from: O4.z$b$b, reason: collision with other inner class name */
        public static final class C0379b extends b {
            private C0379b() {
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
        f23221a = new b.c();
        f23222b = new b.C0379b();
    }
}
