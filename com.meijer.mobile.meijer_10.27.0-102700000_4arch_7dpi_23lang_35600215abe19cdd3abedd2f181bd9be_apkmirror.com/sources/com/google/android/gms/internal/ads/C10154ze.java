package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ze, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10154ze extends Gu0<C10154ze, C10047ye> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C10154ze zzg;
    private static volatile InterfaceC9868wv0<C10154ze> zzh;
    private int zzi;
    private int zzj;
    private C6788Hd zzk;
    private C6788Hd zzl;
    private C6788Hd zzm;
    private Su0<C6788Hd> zzn = Gu0.s();
    private int zzo;

    static {
        C10154ze c10154ze = new C10154ze();
        zzg = c10154ze;
        Gu0.E(C10154ze.class, c10154ze);
    }

    private C10154ze() {
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
                                InterfaceC9868wv0<C10154ze> interfaceC9868wv0 = zzh;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C10154ze.class) {
                                        try {
                                            bu0 = zzh;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzg);
                                                zzh = bu0;
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
                        return zzg;
                    }
                    return new C10047ye();
                }
                return new C10154ze();
            }
            return Gu0.x(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", C6788Hd.class, "zzo"});
        }
        return (byte) 1;
    }
}
