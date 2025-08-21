package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10418f0;

/* renamed from: com.google.android.gms.internal.clearcut.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10474y0 implements InterfaceC10407b1 {

    /* renamed from: b, reason: collision with root package name */
    private static final I0 f82448b = new C10477z0();

    /* renamed from: a, reason: collision with root package name */
    private final I0 f82449a;

    public C10474y0() {
        this(new A0(C10415e0.a(), c()));
    }

    private static boolean b(H0 h02) {
        return h02.a() == AbstractC10418f0.e.f82282i;
    }

    private static I0 c() {
        try {
            return (I0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f82448b;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10407b1
    public final <T> InterfaceC10404a1<T> a(Class<T> cls) {
        C10410c1.I(cls);
        H0 h0Zzb = this.f82449a.zzb(cls);
        if (h0Zzb.b()) {
            return AbstractC10418f0.class.isAssignableFrom(cls) ? O0.i(C10410c1.B(), V.b(), h0Zzb.c()) : O0.i(C10410c1.z(), V.c(), h0Zzb.c());
        }
        if (AbstractC10418f0.class.isAssignableFrom(cls)) {
            return b(h0Zzb) ? N0.r(cls, h0Zzb, S0.b(), AbstractC10459t0.d(), C10410c1.B(), V.b(), G0.b()) : N0.r(cls, h0Zzb, S0.b(), AbstractC10459t0.d(), C10410c1.B(), null, G0.b());
        }
        boolean zB = b(h0Zzb);
        Q0 q0A = S0.a();
        AbstractC10459t0 abstractC10459t0C = AbstractC10459t0.c();
        return zB ? N0.r(cls, h0Zzb, q0A, abstractC10459t0C, C10410c1.z(), V.c(), G0.a()) : N0.r(cls, h0Zzb, q0A, abstractC10459t0C, C10410c1.A(), null, G0.a());
    }

    private C10474y0(I0 i02) {
        this.f82449a = (I0) C10424h0.e(i02, "messageInfoFactory");
    }
}
