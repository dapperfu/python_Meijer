package ec;

import bc.C6350d;
import bc.InterfaceC6352f;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f130065b;

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC6352f<String> f130066a = new C6350d(String.class, 5184000, "proximity.payloads");

    public static b a() {
        if (f130065b == null) {
            f130065b = new b();
        }
        return f130065b;
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
