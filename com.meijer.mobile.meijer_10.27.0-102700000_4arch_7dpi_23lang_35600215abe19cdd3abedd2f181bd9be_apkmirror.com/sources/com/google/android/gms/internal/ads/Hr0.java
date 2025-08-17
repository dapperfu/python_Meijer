package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Hr0 extends Gu0 implements InterfaceC9227qv0 {
    private static final Hr0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private Zt0 zzd = Zt0.f72282b;

    public final int b0() {
        return this.zzc;
    }

    public final Zt0 f0() {
        return this.zzd;
    }

    static {
        Hr0 hr0 = new Hr0();
        zza = hr0;
        Gu0.E(Hr0.class, hr0);
    }

    public static Fr0 c0() {
        return (Fr0) zza.n();
    }

    public static Hr0 e0(Zt0 zt0, C9225qu0 c9225qu0) throws zzgyg {
        return (Hr0) Gu0.N(zza, zt0, c9225qu0);
    }

    public static InterfaceC9868wv0 g0() {
        return zza.u();
    }

    private Hr0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Gr0 gr0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (Hr0.class) {
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
                    return new Fr0(gr0);
                }
                return new Hr0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
