package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8350hb extends Gu0 implements InterfaceC9352qv0 {
    private static final C8350hb zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private C8669kb zzd;
    private Zt0 zze;
    private Zt0 zzf;

    public final Zt0 e0() {
        return this.zzf;
    }

    public final Zt0 f0() {
        return this.zze;
    }

    static {
        C8350hb c8350hb = new C8350hb();
        zza = c8350hb;
        Gu0.E(C8350hb.class, c8350hb);
    }

    public static C8350hb c0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (C8350hb) Gu0.N(zza, zt0, c9350qu0);
    }

    public final C8669kb d0() {
        C8669kb c8669kb = this.zzd;
        return c8669kb == null ? C8669kb.g0() : c8669kb;
    }

    private C8350hb() {
        Zt0 zt0 = Zt0.f73122b;
        this.zze = zt0;
        this.zzf = zt0;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8243gb c8243gb = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C8350hb.class) {
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
                    return new C8136fb(c8243gb);
                }
                return new C8350hb();
            }
            return Gu0.x(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
