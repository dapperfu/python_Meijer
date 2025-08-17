package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.he, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8231he extends Gu0<C8231he, C8124ge> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C8231he zzd;
    private static volatile InterfaceC9868wv0<C8231he> zze;
    private int zzf;
    private int zzg = 1000;
    private C7127Rd zzh;
    private C6788Hd zzi;

    static {
        C8231he c8231he = new C8231he();
        zzd = c8231he;
        Gu0.E(C8231he.class, c8231he);
    }

    private C8231he() {
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
                                InterfaceC9868wv0<C8231he> interfaceC9868wv0 = zze;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C8231he.class) {
                                        try {
                                            bu0 = zze;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzd);
                                                zze = bu0;
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
                        return zzd;
                    }
                    return new C8124ge();
                }
                return new C8231he();
            }
            return Gu0.x(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", EnumC6756Ge.b(), "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
