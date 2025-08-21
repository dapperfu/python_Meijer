package uc;

/* renamed from: uc.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17374g {

    /* renamed from: uc.g$a */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public abstract long b();

    public abstract a c();

    public static AbstractC17374g a() {
        return new C17369b(a.FATAL_ERROR, -1L);
    }

    public static AbstractC17374g d() {
        return new C17369b(a.INVALID_PAYLOAD, -1L);
    }

    public static AbstractC17374g e(long j10) {
        return new C17369b(a.OK, j10);
    }

    public static AbstractC17374g f() {
        return new C17369b(a.TRANSIENT_ERROR, -1L);
    }
}
