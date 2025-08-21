package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8916mr0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C8916mr0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private C9557sr0 zze;
    private Zt0 zzf = Zt0.f73122b;

    public final int b0() {
        return this.zzd;
    }

    public final Zt0 g0() {
        return this.zzf;
    }

    static {
        C8916mr0 c8916mr0 = new C8916mr0();
        zza = c8916mr0;
        Gu0.E(C8916mr0.class, c8916mr0);
    }

    public static C8702kr0 c0() {
        return (C8702kr0) zza.n();
    }

    public static C8916mr0 e0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (C8916mr0) Gu0.N(zza, zt0, c9350qu0);
    }

    public static InterfaceC9993wv0 h0() {
        return zza.u();
    }

    public final C9557sr0 f0() {
        C9557sr0 c9557sr0 = this.zze;
        return c9557sr0 == null ? C9557sr0.e0() : c9557sr0;
    }

    private C8916mr0() {
    }

    static /* synthetic */ void j0(C8916mr0 c8916mr0, C9557sr0 c9557sr0) {
        c9557sr0.getClass();
        c8916mr0.zze = c9557sr0;
        c8916mr0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8809lr0 c8809lr0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C8916mr0.class) {
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
                    return new C8702kr0(c8809lr0);
                }
                return new C8916mr0();
            }
            return Gu0.x(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
