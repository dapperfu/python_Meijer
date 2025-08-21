package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ld, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7049Ld extends Gu0<C7049Ld, C7015Kd> implements InterfaceC9352qv0 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private static final C7049Ld zzu;
    private static volatile InterfaceC9993wv0<C7049Ld> zzv;
    private C8996ne zzA;
    private C7116Nd zzB;
    private C8356he zzC;
    private C7320Td zzD;
    private int zzE;
    private int zzF;
    private C6913Hd zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzM;
    private int zzw;
    private C8142fe zzx;
    private C8568je zzy;
    private C8782le zzz;

    static {
        C7049Ld c7049Ld = new C7049Ld();
        zzu = c7049Ld;
        Gu0.E(C7049Ld.class, c7049Ld);
    }

    private C7049Ld() {
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
                                InterfaceC9993wv0<C7049Ld> interfaceC9993wv0 = zzv;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C7049Ld.class) {
                                        try {
                                            bu0 = zzv;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzu);
                                                zzv = bu0;
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
                        return zzu;
                    }
                    return new C7015Kd();
                }
                return new C7049Ld();
            }
            return Gu0.x(zzu, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
        }
        return (byte) 1;
    }
}
