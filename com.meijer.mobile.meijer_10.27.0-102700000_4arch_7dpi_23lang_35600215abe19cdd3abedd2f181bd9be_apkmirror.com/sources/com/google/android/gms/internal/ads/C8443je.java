package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.je, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8443je extends Gu0<C8443je, C8338ie> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C8443je zzg;
    private static volatile InterfaceC9868wv0<C8443je> zzh;
    private int zzi;
    private int zzj = 1000;
    private C7127Rd zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;

    static {
        C8443je c8443je = new C8443je();
        zzg = c8443je;
        Gu0.E(C8443je.class, c8443je);
    }

    private C8443je() {
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
                                InterfaceC9868wv0<C8443je> interfaceC9868wv0 = zzh;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C8443je.class) {
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
                    return new C8338ie();
                }
                return new C8443je();
            }
            return Gu0.x(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", EnumC6756Ge.b(), "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        return (byte) 1;
    }
}
