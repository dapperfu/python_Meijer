package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Hd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6913Hd extends Gu0<C6913Hd, C6879Gd> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C6913Hd zzc;
    private static volatile InterfaceC9993wv0<C6913Hd> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C6913Hd c6913Hd = new C6913Hd();
        zzc = c6913Hd;
        Gu0.E(C6913Hd.class, c6913Hd);
    }

    private C6913Hd() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7220Qe c7220Qe = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0<C6913Hd> interfaceC9993wv0 = zzd;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C6913Hd.class) {
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
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zzc;
                    }
                    return new C6879Gd();
                }
                return new C6913Hd();
            }
            return Gu0.x(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
