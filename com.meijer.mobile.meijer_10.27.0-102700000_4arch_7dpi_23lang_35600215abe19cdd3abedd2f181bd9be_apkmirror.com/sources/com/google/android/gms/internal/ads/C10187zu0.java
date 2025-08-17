package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10187zu0 implements InterfaceC8906nv0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C10187zu0 f80543a = new C10187zu0();

    private C10187zu0() {
    }

    public static C10187zu0 a() {
        return f80543a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8906nv0
    public final InterfaceC8799mv0 zzb(Class cls) {
        if (!Gu0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC8799mv0) Gu0.I(cls.asSubclass(Gu0.class)).v();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8906nv0
    public final boolean zzc(Class cls) {
        return Gu0.class.isAssignableFrom(cls);
    }
}
