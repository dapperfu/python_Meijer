package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Bx0 extends Gu0 implements InterfaceC9227qv0 {
    private static final Bx0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;
    private String zze = "";

    static {
        Bx0 bx0 = new Bx0();
        zza = bx0;
        Gu0.E(Bx0.class, bx0);
    }

    private Bx0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Nx0 nx0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (Bx0.class) {
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
                    return new C10193zx0(nx0);
                }
                return new Bx0();
            }
            return Gu0.x(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", Ax0.f65374a, "zze"});
        }
        return (byte) 1;
    }
}
