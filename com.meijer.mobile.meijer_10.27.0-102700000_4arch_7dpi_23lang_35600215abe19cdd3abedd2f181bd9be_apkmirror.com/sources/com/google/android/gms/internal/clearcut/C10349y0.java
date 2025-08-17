package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10293f0;

/* renamed from: com.google.android.gms.internal.clearcut.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10349y0 implements InterfaceC10282b1 {

    /* renamed from: b, reason: collision with root package name */
    private static final I0 f81608b = new C10352z0();

    /* renamed from: a, reason: collision with root package name */
    private final I0 f81609a;

    public C10349y0() {
        this(new A0(C10290e0.a(), c()));
    }

    private static boolean b(H0 h02) {
        return h02.a() == AbstractC10293f0.e.f81442i;
    }

    private static I0 c() {
        try {
            return (I0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f81608b;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10282b1
    public final <T> InterfaceC10279a1<T> a(Class<T> cls) {
        C10285c1.I(cls);
        H0 h0Zzb = this.f81609a.zzb(cls);
        if (h0Zzb.b()) {
            return AbstractC10293f0.class.isAssignableFrom(cls) ? O0.i(C10285c1.B(), V.b(), h0Zzb.c()) : O0.i(C10285c1.z(), V.c(), h0Zzb.c());
        }
        if (AbstractC10293f0.class.isAssignableFrom(cls)) {
            return b(h0Zzb) ? N0.r(cls, h0Zzb, S0.b(), AbstractC10334t0.d(), C10285c1.B(), V.b(), G0.b()) : N0.r(cls, h0Zzb, S0.b(), AbstractC10334t0.d(), C10285c1.B(), null, G0.b());
        }
        boolean zB = b(h0Zzb);
        Q0 q0A = S0.a();
        AbstractC10334t0 abstractC10334t0C = AbstractC10334t0.c();
        return zB ? N0.r(cls, h0Zzb, q0A, abstractC10334t0C, C10285c1.z(), V.c(), G0.a()) : N0.r(cls, h0Zzb, q0A, abstractC10334t0C, C10285c1.A(), null, G0.a());
    }

    private C10349y0(I0 i02) {
        this.f81609a = (I0) C10299h0.e(i02, "messageInfoFactory");
    }
}
