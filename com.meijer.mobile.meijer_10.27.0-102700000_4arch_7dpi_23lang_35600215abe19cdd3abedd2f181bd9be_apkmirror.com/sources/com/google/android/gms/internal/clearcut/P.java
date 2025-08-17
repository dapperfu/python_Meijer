package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
final class P {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f81187a = a();

    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Q b() {
        Class<?> cls = f81187a;
        if (cls != null) {
            try {
                return (Q) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return Q.f81194c;
    }
}
