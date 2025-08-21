package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Z7 extends Gu0 implements InterfaceC9352qv0 {
    private static final Z7 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd = 2;

    static {
        Z7 z72 = new Z7();
        zza = z72;
        Gu0.E(Z7.class, z72);
    }

    private Z7() {
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
                                    synchronized (Z7.class) {
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
                    return new Y7(c7883d8);
                }
                return new Z7();
            }
            return Gu0.x(zza, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzc", "zzd", C7563a8.f73204a});
        }
        return (byte) 1;
    }
}
