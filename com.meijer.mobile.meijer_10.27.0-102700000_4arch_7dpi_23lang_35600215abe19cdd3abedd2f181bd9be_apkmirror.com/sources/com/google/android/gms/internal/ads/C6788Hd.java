package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Hd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6788Hd extends Gu0<C6788Hd, C6754Gd> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C6788Hd zzc;
    private static volatile InterfaceC9868wv0<C6788Hd> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C6788Hd c6788Hd = new C6788Hd();
        zzc = c6788Hd;
        Gu0.E(C6788Hd.class, c6788Hd);
    }

    private C6788Hd() {
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
                                InterfaceC9868wv0<C6788Hd> interfaceC9868wv0 = zzd;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C6788Hd.class) {
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
                    return new C6754Gd();
                }
                return new C6788Hd();
            }
            return Gu0.x(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
