package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Zr0 extends Gu0 implements InterfaceC9227qv0 {
    private static final Zr0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private String zzc = "";
    private Zt0 zzd = Zt0.f72282b;
    private int zze;

    public static Zr0 e0() {
        return zza;
    }

    public final Xr0 c0() {
        int i10 = this.zze;
        Xr0 xr0 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : Xr0.REMOTE : Xr0.ASYMMETRIC_PUBLIC : Xr0.ASYMMETRIC_PRIVATE : Xr0.SYMMETRIC : Xr0.UNKNOWN_KEYMATERIAL;
        return xr0 == null ? Xr0.UNRECOGNIZED : xr0;
    }

    public final Zt0 f0() {
        return this.zzd;
    }

    public final String g0() {
        return this.zzc;
    }

    static {
        Zr0 zr0 = new Zr0();
        zza = zr0;
        Gu0.E(Zr0.class, zr0);
    }

    public static Wr0 b0() {
        return (Wr0) zza.n();
    }

    private Zr0() {
    }

    static /* synthetic */ void i0(Zr0 zr0, String str) {
        str.getClass();
        zr0.zzc = str;
    }

    static /* synthetic */ void j0(Zr0 zr0, Zt0 zt0) {
        zt0.getClass();
        zr0.zzd = zt0;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Yr0 yr0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (Zr0.class) {
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
                    return new Wr0(yr0);
                }
                return new Zr0();
            }
            return Gu0.x(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
