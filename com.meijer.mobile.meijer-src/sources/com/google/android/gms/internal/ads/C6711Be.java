package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Be, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6711Be extends Gu0<C6711Be, C6677Ae> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C6711Be zzi;
    private static volatile InterfaceC9993wv0<C6711Be> zzj;
    private int zzk;
    private C6913Hd zzm;
    private int zzn;
    private C6981Jd zzo;
    private int zzp;
    private String zzl = "";
    private int zzu = 1000;
    private int zzv = 1000;
    private int zzw = 1000;

    public static C6711Be g0() {
        return zzi;
    }

    static {
        C6711Be c6711Be = new C6711Be();
        zzi = c6711Be;
        Gu0.E(C6711Be.class, c6711Be);
    }

    private C6711Be() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(String str) {
        str.getClass();
        this.zzk |= 1;
        this.zzl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(C6981Jd c6981Jd) {
        c6981Jd.getClass();
        this.zzo = c6981Jd;
        this.zzk |= 8;
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
                                InterfaceC9993wv0<C6711Be> interfaceC9993wv0 = zzj;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C6711Be.class) {
                                        try {
                                            bu0 = zzj;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzi);
                                                zzj = bu0;
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
                        return zzi;
                    }
                    return new C6677Ae();
                }
                return new C6711Be();
            }
            return Gu0.x(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", EnumC6881Ge.b(), "zzv", EnumC6881Ge.b(), "zzw", EnumC6881Ge.b()});
        }
        return (byte) 1;
    }
}
