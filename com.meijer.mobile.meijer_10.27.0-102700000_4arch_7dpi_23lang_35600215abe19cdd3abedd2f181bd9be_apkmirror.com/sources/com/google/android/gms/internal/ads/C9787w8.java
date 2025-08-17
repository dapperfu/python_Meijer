package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9787w8 extends Gu0 implements InterfaceC9227qv0 {
    private static final C9787w8 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private long zzd = -1;

    static {
        C9787w8 c9787w8 = new C9787w8();
        zza = c9787w8;
        Gu0.E(C9787w8.class, c9787w8);
    }

    private C9787w8() {
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
                                    synchronized (C9787w8.class) {
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
                    return new C9680v8(y82);
                }
                return new C9787w8();
            }
            return Gu0.x(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
