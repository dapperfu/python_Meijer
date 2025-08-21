package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
final class H0 implements InterfaceC10366n1 {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f81664a = new H0();

    private H0() {
    }

    public static H0 a() {
        return f81664a;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10366n1
    public final InterfaceC10363m1 zzb(Class cls) {
        if (!K0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC10363m1) K0.h(cls.asSubclass(K0.class)).e(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10366n1
    public final boolean zzc(Class cls) {
        return K0.class.isAssignableFrom(cls);
    }
}
