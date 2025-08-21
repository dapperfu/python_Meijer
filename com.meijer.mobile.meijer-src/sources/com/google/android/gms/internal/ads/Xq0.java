package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Xq0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Xq0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private C7955dr0 zze;
    private Pr0 zzf;

    public final int b0() {
        return this.zzd;
    }

    static {
        Xq0 xq0 = new Xq0();
        zza = xq0;
        Gu0.E(Xq0.class, xq0);
    }

    public static Vq0 c0() {
        return (Vq0) zza.n();
    }

    public static Xq0 e0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (Xq0) Gu0.N(zza, zt0, c9350qu0);
    }

    public static InterfaceC9993wv0 h0() {
        return zza.u();
    }

    public final C7955dr0 f0() {
        C7955dr0 c7955dr0 = this.zze;
        return c7955dr0 == null ? C7955dr0.e0() : c7955dr0;
    }

    public final Pr0 g0() {
        Pr0 pr0 = this.zzf;
        return pr0 == null ? Pr0.e0() : pr0;
    }

    private Xq0() {
    }

    static /* synthetic */ void i0(Xq0 xq0, C7955dr0 c7955dr0) {
        c7955dr0.getClass();
        xq0.zze = c7955dr0;
        xq0.zzc |= 1;
    }

    static /* synthetic */ void j0(Xq0 xq0, Pr0 pr0) {
        pr0.getClass();
        xq0.zzf = pr0;
        xq0.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Wq0 wq0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Xq0.class) {
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
                    return new Vq0(wq0);
                }
                return new Xq0();
            }
            return Gu0.x(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
