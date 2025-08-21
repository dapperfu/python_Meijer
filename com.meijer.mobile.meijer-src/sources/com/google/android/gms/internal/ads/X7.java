package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class X7 extends Gu0 implements InterfaceC9352qv0 {
    private static final X7 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private Z7 zzd;
    private C7776c8 zze;

    static {
        X7 x72 = new X7();
        zza = x72;
        Gu0.E(X7.class, x72);
    }

    private X7() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7883d8 c7883d8 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (X7.class) {
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
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new W7(c7883d8);
                }
                return new X7();
            }
            return Gu0.x(zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
