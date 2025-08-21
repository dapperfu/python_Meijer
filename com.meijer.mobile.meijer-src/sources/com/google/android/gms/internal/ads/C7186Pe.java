package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7186Pe extends Gu0<C7186Pe, C7152Oe> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C7186Pe zze;
    private static volatile InterfaceC9993wv0<C7186Pe> zzf;
    private int zzg;
    private C7051Le zzh;
    private Su0<C6845Fd> zzi = Gu0.s();
    private int zzj;
    private C6913Hd zzk;

    static {
        C7186Pe c7186Pe = new C7186Pe();
        zze = c7186Pe;
        Gu0.E(C7186Pe.class, c7186Pe);
    }

    private C7186Pe() {
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
                                InterfaceC9993wv0<C7186Pe> interfaceC9993wv0 = zzf;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C7186Pe.class) {
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
                    return new C7152Oe();
                }
                return new C7186Pe();
            }
            return Gu0.x(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", C6845Fd.class, "zzj", EnumC6881Ge.b(), "zzk"});
        }
        return (byte) 1;
    }
}
