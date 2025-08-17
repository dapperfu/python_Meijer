package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Rq0 extends Gu0 implements InterfaceC9227qv0 {
    private static final Rq0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;
    private Uq0 zze;

    public final int b0() {
        return this.zzd;
    }

    static {
        Rq0 rq0 = new Rq0();
        zza = rq0;
        Gu0.E(Rq0.class, rq0);
    }

    public static Pq0 c0() {
        return (Pq0) zza.n();
    }

    public static Rq0 e0(Zt0 zt0, C9225qu0 c9225qu0) throws zzgyg {
        return (Rq0) Gu0.N(zza, zt0, c9225qu0);
    }

    public final Uq0 f0() {
        Uq0 uq0 = this.zze;
        return uq0 == null ? Uq0.e0() : uq0;
    }

    private Rq0() {
    }

    static /* synthetic */ void h0(Rq0 rq0, Uq0 uq0) {
        uq0.getClass();
        rq0.zze = uq0;
        rq0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Qq0 qq0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (Rq0.class) {
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
                    return new Pq0(qq0);
                }
                return new Rq0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
