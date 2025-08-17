package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Er0 extends Gu0 implements InterfaceC9227qv0 {
    private static final Er0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;

    public final int b0() {
        return this.zzc;
    }

    public final int c0() {
        return this.zzd;
    }

    static {
        Er0 er0 = new Er0();
        zza = er0;
        Gu0.E(Er0.class, er0);
    }

    public static Cr0 d0() {
        return (Cr0) zza.n();
    }

    public static Er0 f0(Zt0 zt0, C9225qu0 c9225qu0) throws zzgyg {
        return (Er0) Gu0.N(zza, zt0, c9225qu0);
    }

    private Er0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Dr0 dr0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (Er0.class) {
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
                                return interfaceC9868wv0;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new Cr0(dr0);
                }
                return new Er0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
        }
        return (byte) 1;
    }
}
