package cc;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f61683b;

    /* renamed from: a, reason: collision with root package name */
    public Zb.f<String> f61684a = new Zb.d(String.class, 5184000, "proximity.payloads");

    public static b a() {
        if (f61683b == null) {
            f61683b = new b();
        }
        return f61683b;
    }

    public static String b(String str) {
        if (str != null) {
            return str.toUpperCase();
        }
        return null;
    }

    private b() {
    }
}
