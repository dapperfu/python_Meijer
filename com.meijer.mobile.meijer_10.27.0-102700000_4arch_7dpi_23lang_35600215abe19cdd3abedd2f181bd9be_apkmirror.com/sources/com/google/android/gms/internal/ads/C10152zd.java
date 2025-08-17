package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10152zd extends Gu0<C10152zd, C10045yd> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private static final C10152zd zzl;
    private static volatile InterfaceC9868wv0<C10152zd> zzm;
    private int zzA;
    private int zzB;
    private C6584Bd zzC;
    private int zzn;
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        C10152zd c10152zd = new C10152zd();
        zzl = c10152zd;
        Gu0.E(C10152zd.class, c10152zd);
    }

    private C10152zd() {
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
                                InterfaceC9868wv0<C10152zd> interfaceC9868wv0 = zzm;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C10152zd.class) {
                                        try {
                                            bu0 = zzm;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzl);
                                                zzm = bu0;
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
                        return zzl;
                    }
                    return new C10045yd();
                }
                return new C10152zd();
            }
            return Gu0.x(zzl, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", EnumC6756Ge.b(), "zzp", EnumC6756Ge.b(), "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
        }
        return (byte) 1;
    }
}
