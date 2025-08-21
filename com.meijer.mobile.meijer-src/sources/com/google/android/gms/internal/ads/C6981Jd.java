package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6981Jd extends Gu0<C6981Jd, C6947Id> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C6981Jd zzd;
    private static volatile InterfaceC9993wv0<C6981Jd> zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i10) {
        this.zzf |= 1;
        this.zzg = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i10) {
        this.zzf |= 4;
        this.zzi = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i10) {
        this.zzf |= 2;
        this.zzh = i10;
    }

    static {
        C6981Jd c6981Jd = new C6981Jd();
        zzd = c6981Jd;
        Gu0.E(C6981Jd.class, c6981Jd);
    }

    public static C6947Id h0() {
        return zzd.n();
    }

    private C6981Jd() {
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
                                InterfaceC9993wv0<C6981Jd> interfaceC9993wv0 = zze;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C6981Jd.class) {
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
                    return new C6947Id();
                }
                return new C6981Jd();
            }
            return Gu0.x(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
