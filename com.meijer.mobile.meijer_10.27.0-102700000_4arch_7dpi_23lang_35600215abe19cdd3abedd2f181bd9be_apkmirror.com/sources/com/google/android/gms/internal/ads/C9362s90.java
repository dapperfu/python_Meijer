package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s90, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9362s90 extends Gu0 implements InterfaceC9227qv0 {
    private static final C9362s90 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private String zzc = "";

    static {
        C9362s90 c9362s90 = new C9362s90();
        zza = c9362s90;
        Gu0.E(C9362s90.class, c9362s90);
    }

    private C9362s90() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9255r90 c9255r90 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9362s90.class) {
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
                    return new C9149q90(c9255r90);
                }
                return new C9362s90();
            }
            return Gu0.x(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        return (byte) 1;
    }
}
