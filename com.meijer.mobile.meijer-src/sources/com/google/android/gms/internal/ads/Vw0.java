package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Vw0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Vw0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private Zt0 zze;
    private Zt0 zzf;

    static {
        Vw0 vw0 = new Vw0();
        zza = vw0;
        Gu0.E(Vw0.class, vw0);
    }

    private Vw0() {
        Zt0 zt0 = Zt0.f73122b;
        this.zze = zt0;
        this.zzf = zt0;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Nx0 nx0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Vw0.class) {
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
                    return new Uw0(nx0);
                }
                return new Vw0();
            }
            return Gu0.x(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
