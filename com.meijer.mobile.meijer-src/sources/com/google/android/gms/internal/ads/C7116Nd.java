package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Nd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7116Nd extends Gu0<C7116Nd, C7082Md> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C7116Nd zzd;
    private static volatile InterfaceC9993wv0<C7116Nd> zze;
    private int zzf;
    private int zzg = 1000;
    private C7252Rd zzh;
    private C6913Hd zzi;

    static {
        C7116Nd c7116Nd = new C7116Nd();
        zzd = c7116Nd;
        Gu0.E(C7116Nd.class, c7116Nd);
    }

    private C7116Nd() {
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
                                InterfaceC9993wv0<C7116Nd> interfaceC9993wv0 = zze;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C7116Nd.class) {
                                        try {
                                            bu0 = zze;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzd);
                                                zze = bu0;
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
                        return zzd;
                    }
                    return new C7082Md();
                }
                return new C7116Nd();
            }
            return Gu0.x(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", EnumC6881Ge.b(), "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
