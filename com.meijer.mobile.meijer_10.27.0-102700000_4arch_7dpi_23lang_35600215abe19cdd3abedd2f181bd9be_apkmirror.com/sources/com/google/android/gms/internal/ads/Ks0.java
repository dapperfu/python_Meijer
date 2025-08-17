package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Ks0 extends Gu0 implements InterfaceC9227qv0 {
    private static final Ks0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;
    private Rs0 zze;
    private Zt0 zzf = Zt0.f72282b;

    public final int b0() {
        return this.zzd;
    }

    public final Zt0 g0() {
        return this.zzf;
    }

    static {
        Ks0 ks0 = new Ks0();
        zza = ks0;
        Gu0.E(Ks0.class, ks0);
    }

    public static Is0 c0() {
        return (Is0) zza.n();
    }

    public static Ks0 e0(Zt0 zt0, C9225qu0 c9225qu0) throws zzgyg {
        return (Ks0) Gu0.N(zza, zt0, c9225qu0);
    }

    public final Rs0 f0() {
        Rs0 rs0 = this.zze;
        return rs0 == null ? Rs0.e0() : rs0;
    }

    private Ks0() {
    }

    static /* synthetic */ void i0(Ks0 ks0, Rs0 rs0) {
        rs0.getClass();
        ks0.zze = rs0;
        ks0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Js0 js0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (Ks0.class) {
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
                    return new Is0(js0);
                }
                return new Ks0();
            }
            return Gu0.x(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
