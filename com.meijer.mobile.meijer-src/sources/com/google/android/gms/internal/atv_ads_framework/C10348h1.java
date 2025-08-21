package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10348h1 implements A1 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC10366n1 f81843b = new C10342f1();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10366n1 f81844a;

    public C10348h1() {
        InterfaceC10366n1 interfaceC10366n1;
        H0 h0A = H0.a();
        try {
            interfaceC10366n1 = (InterfaceC10366n1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC10366n1 = f81843b;
        }
        C10345g1 c10345g1 = new C10345g1(h0A, interfaceC10366n1);
        byte[] bArr = S0.f81715d;
        this.f81844a = c10345g1;
    }

    private static boolean a(InterfaceC10363m1 interfaceC10363m1) {
        if (interfaceC10363m1.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.A1
    public final InterfaceC10401z1 zza(Class cls) {
        C1.b(cls);
        InterfaceC10363m1 interfaceC10363m1Zzb = this.f81844a.zzb(cls);
        if (interfaceC10363m1Zzb.zzb()) {
            if (K0.class.isAssignableFrom(cls)) {
                return C10383t1.d(C1.U(), D0.b(), interfaceC10363m1Zzb.zza());
            }
            return C10383t1.d(C1.T(), D0.a(), interfaceC10363m1Zzb.zza());
        }
        if (K0.class.isAssignableFrom(cls)) {
            if (a(interfaceC10363m1Zzb)) {
                return C10380s1.k(cls, interfaceC10363m1Zzb, C10389v1.b(), AbstractC10336d1.d(), C1.U(), D0.b(), C10360l1.b());
            }
            return C10380s1.k(cls, interfaceC10363m1Zzb, C10389v1.b(), AbstractC10336d1.d(), C1.U(), null, C10360l1.b());
        }
        if (a(interfaceC10363m1Zzb)) {
            return C10380s1.k(cls, interfaceC10363m1Zzb, C10389v1.a(), AbstractC10336d1.c(), C1.T(), D0.a(), C10360l1.a());
        }
        return C10380s1.k(cls, interfaceC10363m1Zzb, C10389v1.a(), AbstractC10336d1.c(), C1.T(), null, C10360l1.a());
    }
}
