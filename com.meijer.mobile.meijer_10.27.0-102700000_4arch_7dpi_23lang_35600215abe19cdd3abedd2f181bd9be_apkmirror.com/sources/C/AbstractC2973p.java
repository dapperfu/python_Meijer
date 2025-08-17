package C;

/* renamed from: C.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2973p {

    /* renamed from: C.p$a */
    public static abstract class a {
        public static a a(int i10) {
            return b(i10, null);
        }

        public abstract Throwable c();

        public abstract int d();

        public static a b(int i10, Throwable th2) {
            return new C2960c(i10, th2);
        }
    }

    /* renamed from: C.p$b */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static AbstractC2973p a(b bVar) {
        return b(bVar, null);
    }

    public abstract a c();

    public abstract b d();

    public static AbstractC2973p b(b bVar, a aVar) {
        return new C2959b(bVar, aVar);
    }
}
