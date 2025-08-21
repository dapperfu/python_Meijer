package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7252Rd extends Gu0<C7252Rd, C7150Od> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    private static final C7252Rd zzb;
    private static volatile InterfaceC9993wv0<C7252Rd> zzc;
    private int zzd;
    private int zze;

    static {
        C7252Rd c7252Rd = new C7252Rd();
        zzb = c7252Rd;
        Gu0.E(C7252Rd.class, c7252Rd);
    }

    private C7252Rd() {
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
                                InterfaceC9993wv0<C7252Rd> interfaceC9993wv0 = zzc;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C7252Rd.class) {
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
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zzb;
                    }
                    return new C7150Od();
                }
                return new C7252Rd();
            }
            return Gu0.x(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", EnumC7184Pd.b()});
        }
        return (byte) 1;
    }
}
