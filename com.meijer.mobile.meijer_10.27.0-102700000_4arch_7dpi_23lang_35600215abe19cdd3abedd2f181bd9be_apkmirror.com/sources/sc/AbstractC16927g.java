package sc;

/* renamed from: sc.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16927g {

    /* renamed from: sc.g$a */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public abstract long b();

    public abstract a c();

    public static AbstractC16927g a() {
        return new C16922b(a.FATAL_ERROR, -1L);
    }

    public static AbstractC16927g d() {
        return new C16922b(a.INVALID_PAYLOAD, -1L);
    }

    public static AbstractC16927g e(long j10) {
        return new C16922b(a.OK, j10);
    }

    public static AbstractC16927g f() {
        return new C16922b(a.TRANSIENT_ERROR, -1L);
    }
}
