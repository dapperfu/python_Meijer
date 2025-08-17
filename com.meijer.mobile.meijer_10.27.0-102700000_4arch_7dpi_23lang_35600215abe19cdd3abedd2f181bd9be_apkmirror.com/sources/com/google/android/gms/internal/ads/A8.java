package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class A8 extends Gu0 implements InterfaceC9227qv0 {
    private static final A8 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        A8 a82 = new A8();
        zza = a82;
        Gu0.E(A8.class, a82);
    }

    private A8() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Y8 y82 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (A8.class) {
                                        try {
                                            bu0 = zzb;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zza);
                                                zzb = bu0;
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
                        return zza;
                    }
                    return new C10108z8(y82);
                }
                return new A8();
            }
            return Gu0.x(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", C9039p8.f77512a, "zze"});
        }
        return (byte) 1;
    }
}
