package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10223h1 implements A1 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC10241n1 f81003b = new C10217f1();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10241n1 f81004a;

    public C10223h1() {
        InterfaceC10241n1 interfaceC10241n1;
        H0 h0A = H0.a();
        try {
            interfaceC10241n1 = (InterfaceC10241n1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC10241n1 = f81003b;
        }
        C10220g1 c10220g1 = new C10220g1(h0A, interfaceC10241n1);
        byte[] bArr = S0.f80875d;
        this.f81004a = c10220g1;
    }

    private static boolean a(InterfaceC10238m1 interfaceC10238m1) {
        if (interfaceC10238m1.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.A1
    public final InterfaceC10276z1 zza(Class cls) {
        C1.b(cls);
        InterfaceC10238m1 interfaceC10238m1Zzb = this.f81004a.zzb(cls);
        if (interfaceC10238m1Zzb.zzb()) {
            if (K0.class.isAssignableFrom(cls)) {
                return C10258t1.d(C1.U(), D0.b(), interfaceC10238m1Zzb.zza());
            }
            return C10258t1.d(C1.T(), D0.a(), interfaceC10238m1Zzb.zza());
        }
        if (K0.class.isAssignableFrom(cls)) {
            if (a(interfaceC10238m1Zzb)) {
                return C10255s1.k(cls, interfaceC10238m1Zzb, C10264v1.b(), AbstractC10211d1.d(), C1.U(), D0.b(), C10235l1.b());
            }
            return C10255s1.k(cls, interfaceC10238m1Zzb, C10264v1.b(), AbstractC10211d1.d(), C1.U(), null, C10235l1.b());
        }
        if (a(interfaceC10238m1Zzb)) {
            return C10255s1.k(cls, interfaceC10238m1Zzb, C10264v1.a(), AbstractC10211d1.c(), C1.T(), D0.a(), C10235l1.a());
        }
        return C10255s1.k(cls, interfaceC10238m1Zzb, C10264v1.a(), AbstractC10211d1.c(), C1.T(), null, C10235l1.a());
    }
}
