package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Us0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Us0 zza;
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
        Us0 us0 = new Us0();
        zza = us0;
        Gu0.E(Us0.class, us0);
    }

    public static Ss0 c0() {
        return (Ss0) zza.n();
    }

    public static Us0 e0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (Us0) Gu0.N(zza, zt0, c9350qu0);
    }

    public static InterfaceC9993wv0 g0() {
        return zza.u();
    }

    private Us0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Ts0 ts0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Us0.class) {
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
                    return new Ss0(ts0);
                }
                return new Us0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
