package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yx0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10086yx0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C10086yx0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private String zzd = "";
    private Zt0 zze = Zt0.f72282b;

    static {
        C10086yx0 c10086yx0 = new C10086yx0();
        zza = c10086yx0;
        Gu0.E(C10086yx0.class, c10086yx0);
    }

    private C10086yx0() {
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
                                    synchronized (C10086yx0.class) {
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
                    return new C9979xx0(nx0);
                }
                return new C10086yx0();
            }
            return Gu0.x(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
