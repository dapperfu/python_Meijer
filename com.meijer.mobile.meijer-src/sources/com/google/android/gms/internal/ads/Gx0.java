package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Gx0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Gx0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private Ou0 zzf = Gu0.o();
    private Su0 zzh = Gu0.s();
    private Zt0 zzi = Zt0.f73122b;

    static {
        Gx0 gx0 = new Gx0();
        zza = gx0;
        Gu0.E(Gx0.class, gx0);
    }

    private Gx0() {
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
                                    synchronized (Gx0.class) {
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
                    return new Fx0(nx0);
                }
                return new Gx0();
            }
            return Gu0.x(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", Ex0.class, "zzi"});
        }
        return (byte) 1;
    }
}
