package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
final class H0 implements InterfaceC10241n1 {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f80824a = new H0();

    private H0() {
    }

    public static H0 a() {
        return f80824a;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10241n1
    public final InterfaceC10238m1 zzb(Class cls) {
        if (!K0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC10238m1) K0.h(cls.asSubclass(K0.class)).e(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10241n1
    public final boolean zzc(Class cls) {
        return K0.class.isAssignableFrom(cls);
    }
}
