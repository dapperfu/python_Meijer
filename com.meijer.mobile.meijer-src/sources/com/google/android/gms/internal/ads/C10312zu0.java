package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10312zu0 implements InterfaceC9031nv0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C10312zu0 f81383a = new C10312zu0();

    private C10312zu0() {
    }

    public static C10312zu0 a() {
        return f81383a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9031nv0
    public final InterfaceC8924mv0 zzb(Class cls) {
        if (!Gu0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC8924mv0) Gu0.I(cls.asSubclass(Gu0.class)).v();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9031nv0
    public final boolean zzc(Class cls) {
        return Gu0.class.isAssignableFrom(cls);
    }
}
