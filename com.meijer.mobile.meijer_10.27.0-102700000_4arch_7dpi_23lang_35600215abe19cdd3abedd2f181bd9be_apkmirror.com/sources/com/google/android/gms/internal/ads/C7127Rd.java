package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7127Rd extends Gu0<C7127Rd, C7025Od> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    private static final C7127Rd zzb;
    private static volatile InterfaceC9868wv0<C7127Rd> zzc;
    private int zzd;
    private int zze;

    static {
        C7127Rd c7127Rd = new C7127Rd();
        zzb = c7127Rd;
        Gu0.E(C7127Rd.class, c7127Rd);
    }

    private C7127Rd() {
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
                                InterfaceC9868wv0<C7127Rd> interfaceC9868wv0 = zzc;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C7127Rd.class) {
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
                    return new C7025Od();
                }
                return new C7127Rd();
            }
            return Gu0.x(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", EnumC7059Pd.b()});
        }
        return (byte) 1;
    }
}
