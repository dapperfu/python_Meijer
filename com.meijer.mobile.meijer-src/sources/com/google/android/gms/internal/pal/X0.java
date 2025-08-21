package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class X0 implements InterfaceC11022t1 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC10782e1 f83779b = new V0();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10782e1 f83780a;

    public X0() {
        InterfaceC10782e1 interfaceC10782e1;
        C11085x0 c11085x0A = C11085x0.a();
        try {
            interfaceC10782e1 = (InterfaceC10782e1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC10782e1 = f83779b;
        }
        W0 w02 = new W0(c11085x0A, interfaceC10782e1);
        J0.f(w02, "messageInfoFactory");
        this.f83780a = w02;
    }

    private static boolean a(InterfaceC10765d1 interfaceC10765d1) {
        if (interfaceC10765d1.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11022t1
    public final InterfaceC11006s1 zza(Class cls) {
        C11038u1.g(cls);
        InterfaceC10765d1 interfaceC10765d1Zzb = this.f83780a.zzb(cls);
        if (interfaceC10765d1Zzb.zzb()) {
            if (B0.class.isAssignableFrom(cls)) {
                return C10879k1.d(C11038u1.b(), C11005s0.b(), interfaceC10765d1Zzb.zza());
            }
            return C10879k1.d(C11038u1.b0(), C11005s0.a(), interfaceC10765d1Zzb.zza());
        }
        if (B0.class.isAssignableFrom(cls)) {
            if (a(interfaceC10765d1Zzb)) {
                return C10863j1.D(cls, interfaceC10765d1Zzb, C10911m1.b(), T0.e(), C11038u1.b(), C11005s0.b(), C10748c1.b());
            }
            return C10863j1.D(cls, interfaceC10765d1Zzb, C10911m1.b(), T0.e(), C11038u1.b(), null, C10748c1.b());
        }
        if (a(interfaceC10765d1Zzb)) {
            return C10863j1.D(cls, interfaceC10765d1Zzb, C10911m1.a(), T0.d(), C11038u1.b0(), C11005s0.a(), C10748c1.a());
        }
        return C10863j1.D(cls, interfaceC10765d1Zzb, C10911m1.a(), T0.d(), C11038u1.a(), null, C10748c1.a());
    }
}
