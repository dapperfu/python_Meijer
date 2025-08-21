package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Ds0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Ds0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private String zzd = "";
    private C7957ds0 zze;

    public static Ds0 e0() {
        return zza;
    }

    public final String g0() {
        return this.zzd;
    }

    static {
        Ds0 ds0 = new Ds0();
        zza = ds0;
        Gu0.E(Ds0.class, ds0);
    }

    public static Bs0 c0() {
        return (Bs0) zza.n();
    }

    public static Ds0 f0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (Ds0) Gu0.N(zza, zt0, c9350qu0);
    }

    public final C7957ds0 b0() {
        C7957ds0 c7957ds0 = this.zze;
        return c7957ds0 == null ? C7957ds0.e0() : c7957ds0;
    }

    private Ds0() {
    }

    static /* synthetic */ void h0(Ds0 ds0, C7957ds0 c7957ds0) {
        c7957ds0.getClass();
        ds0.zze = c7957ds0;
        ds0.zzc |= 1;
    }

    static /* synthetic */ void i0(Ds0 ds0, String str) {
        str.getClass();
        ds0.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Cs0 cs0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Ds0.class) {
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
                    return new Bs0(cs0);
                }
                return new Ds0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
