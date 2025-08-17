package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class X0 implements InterfaceC10897t1 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC10657e1 f82939b = new V0();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10657e1 f82940a;

    public X0() {
        InterfaceC10657e1 interfaceC10657e1;
        C10960x0 c10960x0A = C10960x0.a();
        try {
            interfaceC10657e1 = (InterfaceC10657e1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC10657e1 = f82939b;
        }
        W0 w02 = new W0(c10960x0A, interfaceC10657e1);
        J0.f(w02, "messageInfoFactory");
        this.f82940a = w02;
    }

    private static boolean a(InterfaceC10640d1 interfaceC10640d1) {
        if (interfaceC10640d1.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10897t1
    public final InterfaceC10881s1 zza(Class cls) {
        C10913u1.g(cls);
        InterfaceC10640d1 interfaceC10640d1Zzb = this.f82940a.zzb(cls);
        if (interfaceC10640d1Zzb.zzb()) {
            if (B0.class.isAssignableFrom(cls)) {
                return C10754k1.d(C10913u1.b(), C10880s0.b(), interfaceC10640d1Zzb.zza());
            }
            return C10754k1.d(C10913u1.b0(), C10880s0.a(), interfaceC10640d1Zzb.zza());
        }
        if (B0.class.isAssignableFrom(cls)) {
            if (a(interfaceC10640d1Zzb)) {
                return C10738j1.D(cls, interfaceC10640d1Zzb, C10786m1.b(), T0.e(), C10913u1.b(), C10880s0.b(), C10623c1.b());
            }
            return C10738j1.D(cls, interfaceC10640d1Zzb, C10786m1.b(), T0.e(), C10913u1.b(), null, C10623c1.b());
        }
        if (a(interfaceC10640d1Zzb)) {
            return C10738j1.D(cls, interfaceC10640d1Zzb, C10786m1.a(), T0.d(), C10913u1.b0(), C10880s0.a(), C10623c1.a());
        }
        return C10738j1.D(cls, interfaceC10640d1Zzb, C10786m1.a(), T0.d(), C10913u1.a(), null, C10623c1.a());
    }
}
