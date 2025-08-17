package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class X8 extends Gu0 implements InterfaceC9227qv0 {
    private static final X8 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private Su0 zzd = Gu0.s();
    private Zt0 zze = Zt0.f72282b;
    private int zzf = 1;
    private int zzg = 1;

    static /* synthetic */ void e0(X8 x82, Zt0 zt0) {
        x82.zzc |= 1;
        x82.zze = zt0;
    }

    static /* synthetic */ void f0(X8 x82, int i10) {
        x82.zzg = i10 - 1;
        x82.zzc |= 4;
    }

    static /* synthetic */ void g0(X8 x82, int i10) {
        x82.zzf = 4;
        x82.zzc |= 2;
    }

    static {
        X8 x82 = new X8();
        zza = x82;
        Gu0.E(X8.class, x82);
    }

    public static W8 b0() {
        return (W8) zza.n();
    }

    static /* synthetic */ void d0(X8 x82, Zt0 zt0) {
        Su0 su0 = x82.zzd;
        if (!su0.zzc()) {
            x82.zzd = Gu0.t(su0);
        }
        x82.zzd.add(zt0);
    }

    private X8() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Y8 y82 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (X8.class) {
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
                    return new W8(y82);
                }
                return new X8();
            }
            return Gu0.x(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", R8.f69789a, "zzg", N8.f68822a});
        }
        return (byte) 1;
    }
}
