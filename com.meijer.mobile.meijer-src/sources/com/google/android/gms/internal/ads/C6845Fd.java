package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6845Fd extends Gu0<C6845Fd, C6811Ed> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C6845Fd zzd;
    private static volatile InterfaceC9993wv0<C6845Fd> zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private C6913Hd zzi;

    static {
        C6845Fd c6845Fd = new C6845Fd();
        zzd = c6845Fd;
        Gu0.E(C6845Fd.class, c6845Fd);
    }

    private C6845Fd() {
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
                                InterfaceC9993wv0<C6845Fd> interfaceC9993wv0 = zze;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C6845Fd.class) {
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
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zzd;
                    }
                    return new C6811Ed();
                }
                return new C6845Fd();
            }
            return Gu0.x(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", EnumC6881Ge.b(), "zzi"});
        }
        return (byte) 1;
    }
}
