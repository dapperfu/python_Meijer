package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o90, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8935o90 extends Gu0 implements InterfaceC9227qv0 {
    private static final C8935o90 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private String zzc = "";
    private int zzd;

    static {
        C8935o90 c8935o90 = new C8935o90();
        zza = c8935o90;
        Gu0.E(C8935o90.class, c8935o90);
    }

    private C8935o90() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8828n90 c8828n90 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C8935o90.class) {
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
                    return new C8721m90(c8828n90);
                }
                return new C8935o90();
            }
            return Gu0.x(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
