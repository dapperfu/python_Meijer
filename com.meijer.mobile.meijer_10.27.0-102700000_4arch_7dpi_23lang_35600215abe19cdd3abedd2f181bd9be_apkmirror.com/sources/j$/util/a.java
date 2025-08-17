package j$.util;

/* loaded from: classes3.dex */
public final class a extends RuntimeException {
    public static void a(String str, Object obj) {
        throw new a("Unsupported " + str + " :" + obj);
    }
}
