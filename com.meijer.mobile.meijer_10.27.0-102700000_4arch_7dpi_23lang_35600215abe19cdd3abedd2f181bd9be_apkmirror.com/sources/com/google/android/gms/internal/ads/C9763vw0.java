package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vw0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9763vw0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C9763vw0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private Zt0 zzf = Zt0.f72282b;

    static {
        C9763vw0 c9763vw0 = new C9763vw0();
        zza = c9763vw0;
        Gu0.E(C9763vw0.class, c9763vw0);
    }

    private C9763vw0() {
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
                                    synchronized (C9763vw0.class) {
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
                    return new C9549tw0(nx0);
                }
                return new C9763vw0();
            }
            return Gu0.x(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", C9656uw0.f78946a, "zze", "zzf"});
        }
        return (byte) 1;
    }
}
