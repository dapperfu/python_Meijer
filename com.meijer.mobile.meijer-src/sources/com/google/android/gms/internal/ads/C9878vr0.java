package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9878vr0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C9878vr0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private Zt0 zzd = Zt0.f73122b;

    public final int b0() {
        return this.zzc;
    }

    public final Zt0 f0() {
        return this.zzd;
    }

    static {
        C9878vr0 c9878vr0 = new C9878vr0();
        zza = c9878vr0;
        Gu0.E(C9878vr0.class, c9878vr0);
    }

    public static C9664tr0 c0() {
        return (C9664tr0) zza.n();
    }

    public static C9878vr0 e0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (C9878vr0) Gu0.N(zza, zt0, c9350qu0);
    }

    public static InterfaceC9993wv0 g0() {
        return zza.u();
    }

    private C9878vr0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9771ur0 c9771ur0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C9878vr0.class) {
                                        try {
                                            bu0 = zzb;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zza);
                                                zzb = bu0;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    return bu0;
                                }
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new C9664tr0(c9771ur0);
                }
                return new C9878vr0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
