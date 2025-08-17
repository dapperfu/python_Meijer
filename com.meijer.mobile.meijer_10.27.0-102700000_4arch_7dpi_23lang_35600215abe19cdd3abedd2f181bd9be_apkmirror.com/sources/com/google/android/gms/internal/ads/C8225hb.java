package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8225hb extends Gu0 implements InterfaceC9227qv0 {
    private static final C8225hb zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private C8544kb zzd;
    private Zt0 zze;
    private Zt0 zzf;

    public final Zt0 e0() {
        return this.zzf;
    }

    public final Zt0 f0() {
        return this.zze;
    }

    static {
        C8225hb c8225hb = new C8225hb();
        zza = c8225hb;
        Gu0.E(C8225hb.class, c8225hb);
    }

    public static C8225hb c0(Zt0 zt0, C9225qu0 c9225qu0) throws zzgyg {
        return (C8225hb) Gu0.N(zza, zt0, c9225qu0);
    }

    public final C8544kb d0() {
        C8544kb c8544kb = this.zzd;
        return c8544kb == null ? C8544kb.g0() : c8544kb;
    }

    private C8225hb() {
        Zt0 zt0 = Zt0.f72282b;
        this.zze = zt0;
        this.zzf = zt0;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8118gb c8118gb = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C8225hb.class) {
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
                    return new C8011fb(c8118gb);
                }
                return new C8225hb();
            }
            return Gu0.x(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
