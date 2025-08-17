package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g90, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8081g90 extends Gu0 implements InterfaceC9227qv0 {
    private static final C8081g90 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private C7761d90 zzd;

    static {
        C8081g90 c8081g90 = new C8081g90();
        zza = c8081g90;
        Gu0.E(C8081g90.class, c8081g90);
    }

    public static C7974f90 b0() {
        return (C7974f90) zza.n();
    }

    private C8081g90() {
    }

    static /* synthetic */ void d0(C8081g90 c8081g90, C7761d90 c7761d90) {
        c7761d90.getClass();
        c8081g90.zzd = c7761d90;
        c8081g90.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8188h90 c8188h90 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C8081g90.class) {
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
                    return new C7974f90(c8188h90);
                }
                return new C8081g90();
            }
            return Gu0.x(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
