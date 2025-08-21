package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7118Ne extends Gu0<C7118Ne, C7084Me> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C7118Ne zzc;
    private static volatile InterfaceC9993wv0<C7118Ne> zzd;
    private int zze;
    private int zzf;
    private Ou0 zzg = Gu0.o();

    static {
        C7118Ne c7118Ne = new C7118Ne();
        zzc = c7118Ne;
        Gu0.E(C7118Ne.class, c7118Ne);
    }

    private C7118Ne() {
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
                                InterfaceC9993wv0<C7118Ne> interfaceC9993wv0 = zzd;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C7118Ne.class) {
                                        try {
                                            bu0 = zzd;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzc);
                                                zzd = bu0;
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
                        return zzc;
                    }
                    return new C7084Me();
                }
                return new C7118Ne();
            }
            return Gu0.x(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", EnumC6881Ge.b(), "zzg"});
        }
        return (byte) 1;
    }
}
