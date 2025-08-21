package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class As0 extends Gu0 implements InterfaceC9352qv0 {
    private static final As0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private Ds0 zze;

    public final int b0() {
        return this.zzd;
    }

    static {
        As0 as0 = new As0();
        zza = as0;
        Gu0.E(As0.class, as0);
    }

    public static C10201ys0 c0() {
        return (C10201ys0) zza.n();
    }

    public static As0 e0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (As0) Gu0.N(zza, zt0, c9350qu0);
    }

    public static InterfaceC9993wv0 g0() {
        return zza.u();
    }

    public final Ds0 f0() {
        Ds0 ds0 = this.zze;
        return ds0 == null ? Ds0.e0() : ds0;
    }

    private As0() {
    }

    static /* synthetic */ void h0(As0 as0, Ds0 ds0) {
        ds0.getClass();
        as0.zze = ds0;
        as0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C10308zs0 c10308zs0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (As0.class) {
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
                    return new C10201ys0(c10308zs0);
                }
                return new As0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
