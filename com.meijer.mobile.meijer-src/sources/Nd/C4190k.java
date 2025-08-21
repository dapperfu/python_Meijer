package Nd;

/* renamed from: Nd.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4190k {
    public static byte a(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean b(byte b10) {
        if (b10 == 0) {
            return Boolean.FALSE;
        }
        if (b10 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
