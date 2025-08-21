package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Oq0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Oq0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private Zt0 zze = Zt0.f73122b;
    private Uq0 zzf;

    public final int b0() {
        return this.zzd;
    }

    public final Zt0 g0() {
        return this.zze;
    }

    static {
        Oq0 oq0 = new Oq0();
        zza = oq0;
        Gu0.E(Oq0.class, oq0);
    }

    public static Mq0 c0() {
        return (Mq0) zza.n();
    }

    public static Oq0 e0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (Oq0) Gu0.N(zza, zt0, c9350qu0);
    }

    public static InterfaceC9993wv0 h0() {
        return zza.u();
    }

    public final Uq0 f0() {
        Uq0 uq0 = this.zzf;
        return uq0 == null ? Uq0.e0() : uq0;
    }

    private Oq0() {
    }

    static /* synthetic */ void j0(Oq0 oq0, Uq0 uq0) {
        uq0.getClass();
        oq0.zzf = uq0;
        oq0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Nq0 nq0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Oq0.class) {
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
                    return new Mq0(nq0);
                }
                return new Oq0();
            }
            return Gu0.x(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
