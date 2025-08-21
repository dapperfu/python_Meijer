package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Ns0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Ns0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private Rs0 zze;

    public final int b0() {
        return this.zzd;
    }

    static {
        Ns0 ns0 = new Ns0();
        zza = ns0;
        Gu0.E(Ns0.class, ns0);
    }

    public static Ls0 c0() {
        return (Ls0) zza.n();
    }

    public static Ns0 e0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (Ns0) Gu0.N(zza, zt0, c9350qu0);
    }

    public final Rs0 f0() {
        Rs0 rs0 = this.zze;
        return rs0 == null ? Rs0.e0() : rs0;
    }

    private Ns0() {
    }

    static /* synthetic */ void g0(Ns0 ns0, Rs0 rs0) {
        rs0.getClass();
        ns0.zze = rs0;
        ns0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Ms0 ms0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Ns0.class) {
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
                    return new Ls0(ms0);
                }
                return new Ns0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
