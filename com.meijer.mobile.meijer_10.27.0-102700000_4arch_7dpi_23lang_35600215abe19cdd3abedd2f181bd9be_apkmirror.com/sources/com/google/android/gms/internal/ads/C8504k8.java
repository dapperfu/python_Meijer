package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8504k8 extends Gu0 implements InterfaceC9227qv0 {
    public static final /* synthetic */ int zza = 0;
    private static final C8504k8 zzb;
    private static volatile InterfaceC9868wv0 zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    public static C8504k8 c0() {
        return zzb;
    }

    static {
        C8504k8 c8504k8 = new C8504k8();
        zzb = c8504k8;
        Gu0.E(C8504k8.class, c8504k8);
    }

    private C8504k8() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8397j8 c8397j8 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzc;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C8504k8.class) {
                                        try {
                                            bu0 = zzc;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzb);
                                                zzc = bu0;
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
                        return zzb;
                    }
                    return new C8185h8(c8397j8);
                }
                return new C8504k8();
            }
            return Gu0.x(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
