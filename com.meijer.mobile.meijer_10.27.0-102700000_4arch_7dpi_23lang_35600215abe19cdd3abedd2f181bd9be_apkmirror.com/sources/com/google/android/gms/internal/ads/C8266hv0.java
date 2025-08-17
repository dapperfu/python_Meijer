package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8266hv0 implements Iv0 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC8906nv0 f74814b = new C8052fv0();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8906nv0 f74815a;

    public C8266hv0() {
        C10187zu0 c10187zu0A = C10187zu0.a();
        int i10 = C10082yv0.f80309d;
        C8159gv0 c8159gv0 = new C8159gv0(c10187zu0A, f74814b);
        byte[] bArr = Tu0.f70473b;
        this.f74815a = c8159gv0;
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final Hv0 zza(Class cls) {
        int i10 = Jv0.f67993b;
        if (!Gu0.class.isAssignableFrom(cls)) {
            int i11 = C10082yv0.f80309d;
        }
        InterfaceC8799mv0 interfaceC8799mv0Zzb = this.f74815a.zzb(cls);
        if (interfaceC8799mv0Zzb.zzb()) {
            int i12 = C10082yv0.f80309d;
            return C9547tv0.d(Jv0.w(), C9545tu0.a(), interfaceC8799mv0Zzb.zza());
        }
        int i13 = C10082yv0.f80309d;
        return C9440sv0.z(cls, interfaceC8799mv0Zzb, C9761vv0.a(), C7838dv0.a(), Jv0.w(), interfaceC8799mv0Zzb.zzc() + (-1) != 1 ? C9545tu0.a() : null, C8692lv0.a());
    }
}
