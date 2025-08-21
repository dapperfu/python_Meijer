package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class M8 extends Gu0 implements InterfaceC9352qv0 {
    private static final M8 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private Zt0 zzd;
    private Zt0 zze;
    private Zt0 zzf;
    private Zt0 zzg;

    static /* synthetic */ void i0(M8 m82, Zt0 zt0) {
        m82.zzc |= 1;
        m82.zzd = zt0;
    }

    static /* synthetic */ void j0(M8 m82, Zt0 zt0) {
        m82.zzc |= 2;
        m82.zze = zt0;
    }

    static /* synthetic */ void k0(M8 m82, Zt0 zt0) {
        m82.zzc |= 8;
        m82.zzg = zt0;
    }

    static /* synthetic */ void l0(M8 m82, Zt0 zt0) {
        m82.zzc |= 4;
        m82.zzf = zt0;
    }

    public final Zt0 e0() {
        return this.zzd;
    }

    public final Zt0 f0() {
        return this.zze;
    }

    public final Zt0 g0() {
        return this.zzg;
    }

    public final Zt0 h0() {
        return this.zzf;
    }

    static {
        M8 m82 = new M8();
        zza = m82;
        Gu0.E(M8.class, m82);
    }

    public static L8 b0() {
        return (L8) zza.n();
    }

    public static M8 d0(byte[] bArr, C9350qu0 c9350qu0) throws zzgyg {
        return (M8) Gu0.P(zza, bArr, c9350qu0);
    }

    private M8() {
        Zt0 zt0 = Zt0.f73122b;
        this.zzd = zt0;
        this.zze = zt0;
        this.zzf = zt0;
        this.zzg = zt0;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Y8 y82 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (M8.class) {
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
                    return new L8(y82);
                }
                return new M8();
            }
            return Gu0.x(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
