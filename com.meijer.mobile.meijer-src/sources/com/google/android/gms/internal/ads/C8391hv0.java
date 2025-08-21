package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8391hv0 implements Iv0 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC9031nv0 f75654b = new C8177fv0();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9031nv0 f75655a;

    public C8391hv0() {
        C10312zu0 c10312zu0A = C10312zu0.a();
        int i10 = C10207yv0.f81149d;
        C8284gv0 c8284gv0 = new C8284gv0(c10312zu0A, f75654b);
        byte[] bArr = Tu0.f71313b;
        this.f75655a = c8284gv0;
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final Hv0 zza(Class cls) {
        int i10 = Jv0.f68833b;
        if (!Gu0.class.isAssignableFrom(cls)) {
            int i11 = C10207yv0.f81149d;
        }
        InterfaceC8924mv0 interfaceC8924mv0Zzb = this.f75655a.zzb(cls);
        if (interfaceC8924mv0Zzb.zzb()) {
            int i12 = C10207yv0.f81149d;
            return C9672tv0.d(Jv0.w(), C9670tu0.a(), interfaceC8924mv0Zzb.zza());
        }
        int i13 = C10207yv0.f81149d;
        return C9565sv0.z(cls, interfaceC8924mv0Zzb, C9886vv0.a(), C7963dv0.a(), Jv0.w(), interfaceC8924mv0Zzb.zzc() + (-1) != 1 ? C9670tu0.a() : null, C8817lv0.a());
    }
}
