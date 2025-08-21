package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9698u8 extends Gu0 implements InterfaceC9352qv0 {
    private static final C9698u8 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;
    private int zzf = 1000;

    static {
        C9698u8 c9698u8 = new C9698u8();
        zza = c9698u8;
        Gu0.E(C9698u8.class, c9698u8);
    }

    private C9698u8() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Y8 y82 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C9698u8.class) {
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
                    return new C9591t8(y82);
                }
                return new C9698u8();
            }
            Mu0 mu0 = O8.f69849a;
            return Gu0.x(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", mu0, "zzf", mu0});
        }
        return (byte) 1;
    }
}
