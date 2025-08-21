package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Le, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7051Le extends Gu0<C7051Le, C7017Ke> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C7051Le zze;
    private static volatile InterfaceC9993wv0<C7051Le> zzf;
    private int zzg;
    private int zzi;
    private C6913Hd zzk;
    private String zzh = "";
    private Ou0 zzj = Gu0.o();

    static {
        C7051Le c7051Le = new C7051Le();
        zze = c7051Le;
        Gu0.E(C7051Le.class, c7051Le);
    }

    private C7051Le() {
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
                                InterfaceC9993wv0<C7051Le> interfaceC9993wv0 = zzf;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C7051Le.class) {
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
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zze;
                    }
                    return new C7017Ke();
                }
                return new C7051Le();
            }
            return Gu0.x(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", EnumC6881Ge.b(), "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
