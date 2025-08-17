package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6584Bd extends Gu0<C6584Bd, C6550Ad> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C6584Bd zzc;
    private static volatile InterfaceC9868wv0<C6584Bd> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C6584Bd c6584Bd = new C6584Bd();
        zzc = c6584Bd;
        Gu0.E(C6584Bd.class, c6584Bd);
    }

    private C6584Bd() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7095Qe c7095Qe = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0<C6584Bd> interfaceC9868wv0 = zzd;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C6584Bd.class) {
                                        try {
                                            bu0 = zzd;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzc);
                                                zzd = bu0;
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
                        return zzc;
                    }
                    return new C6550Ad();
                }
                return new C6584Bd();
            }
            return Gu0.x(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
