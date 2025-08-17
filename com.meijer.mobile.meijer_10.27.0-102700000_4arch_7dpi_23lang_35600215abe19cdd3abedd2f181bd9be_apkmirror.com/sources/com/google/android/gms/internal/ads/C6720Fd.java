package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6720Fd extends Gu0<C6720Fd, C6686Ed> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C6720Fd zzd;
    private static volatile InterfaceC9868wv0<C6720Fd> zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private C6788Hd zzi;

    static {
        C6720Fd c6720Fd = new C6720Fd();
        zzd = c6720Fd;
        Gu0.E(C6720Fd.class, c6720Fd);
    }

    private C6720Fd() {
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
                                InterfaceC9868wv0<C6720Fd> interfaceC9868wv0 = zze;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C6720Fd.class) {
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
                    return new C6686Ed();
                }
                return new C6720Fd();
            }
            return Gu0.x(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", EnumC6756Ge.b(), "zzi"});
        }
        return (byte) 1;
    }
}
