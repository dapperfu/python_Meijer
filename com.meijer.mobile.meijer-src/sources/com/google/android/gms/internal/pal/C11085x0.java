package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.x0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11085x0 implements InterfaceC10782e1 {

    /* renamed from: a, reason: collision with root package name */
    private static final C11085x0 f85037a = new C11085x0();

    private C11085x0() {
    }

    public static C11085x0 a() {
        return f85037a;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10782e1
    public final InterfaceC10765d1 zzb(Class cls) {
        if (!B0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC10765d1) B0.m(cls.asSubclass(B0.class)).r(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10782e1
    public final boolean zzc(Class cls) {
        return B0.class.isAssignableFrom(cls);
    }
}
