package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6722Fe extends Gu0<C6722Fe, C6620Ce> implements InterfaceC9227qv0 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final C6722Fe zze;
    private static volatile InterfaceC9868wv0<C6722Fe> zzf;
    private int zzg;
    private int zzh;
    private C6856Jd zzi;
    private String zzj = "";
    private String zzk = "";

    static {
        C6722Fe c6722Fe = new C6722Fe();
        zze = c6722Fe;
        Gu0.E(C6722Fe.class, c6722Fe);
    }

    private C6722Fe() {
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
                                InterfaceC9868wv0<C6722Fe> interfaceC9868wv0 = zzf;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C6722Fe.class) {
                                        try {
                                            bu0 = zzf;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zze);
                                                zzf = bu0;
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
                        return zze;
                    }
                    return new C6620Ce();
                }
                return new C6722Fe();
            }
            return Gu0.x(zze, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", EnumC6654De.b(), "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
