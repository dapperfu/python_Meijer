package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Le, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6926Le extends Gu0<C6926Le, C6892Ke> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C6926Le zze;
    private static volatile InterfaceC9868wv0<C6926Le> zzf;
    private int zzg;
    private int zzi;
    private C6788Hd zzk;
    private String zzh = "";
    private Ou0 zzj = Gu0.o();

    static {
        C6926Le c6926Le = new C6926Le();
        zze = c6926Le;
        Gu0.E(C6926Le.class, c6926Le);
    }

    private C6926Le() {
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
                                InterfaceC9868wv0<C6926Le> interfaceC9868wv0 = zzf;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C6926Le.class) {
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
                    return new C6892Ke();
                }
                return new C6926Le();
            }
            return Gu0.x(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", EnumC6756Ge.b(), "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
