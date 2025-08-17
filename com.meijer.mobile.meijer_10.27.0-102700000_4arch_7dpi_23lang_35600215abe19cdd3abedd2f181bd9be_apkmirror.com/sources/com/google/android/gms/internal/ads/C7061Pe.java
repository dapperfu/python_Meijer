package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7061Pe extends Gu0<C7061Pe, C7027Oe> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C7061Pe zze;
    private static volatile InterfaceC9868wv0<C7061Pe> zzf;
    private int zzg;
    private C6926Le zzh;
    private Su0<C6720Fd> zzi = Gu0.s();
    private int zzj;
    private C6788Hd zzk;

    static {
        C7061Pe c7061Pe = new C7061Pe();
        zze = c7061Pe;
        Gu0.E(C7061Pe.class, c7061Pe);
    }

    private C7061Pe() {
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
                                InterfaceC9868wv0<C7061Pe> interfaceC9868wv0 = zzf;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C7061Pe.class) {
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
                    return new C7027Oe();
                }
                return new C7061Pe();
            }
            return Gu0.x(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", C6720Fd.class, "zzj", EnumC6756Ge.b(), "zzk"});
        }
        return (byte) 1;
    }
}
