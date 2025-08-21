package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Pr0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Pr0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private Vr0 zze;
    private Zt0 zzf = Zt0.f73122b;

    public static Pr0 e0() {
        return zza;
    }

    public final int b0() {
        return this.zzd;
    }

    public final Zt0 h0() {
        return this.zzf;
    }

    static {
        Pr0 pr0 = new Pr0();
        zza = pr0;
        Gu0.E(Pr0.class, pr0);
    }

    public static Mr0 c0() {
        return (Mr0) zza.n();
    }

    public static Pr0 f0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (Pr0) Gu0.N(zza, zt0, c9350qu0);
    }

    public static InterfaceC9993wv0 i0() {
        return zza.u();
    }

    public final Vr0 g0() {
        Vr0 vr0 = this.zze;
        return vr0 == null ? Vr0.f0() : vr0;
    }

    private Pr0() {
    }

    static /* synthetic */ void k0(Pr0 pr0, Vr0 vr0) {
        vr0.getClass();
        pr0.zze = vr0;
        pr0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Or0 or0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Pr0.class) {
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
                    return new Mr0(or0);
                }
                return new Pr0();
            }
            return Gu0.x(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
