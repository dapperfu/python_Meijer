package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l90, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8739l90 extends Gu0 implements InterfaceC9352qv0 {
    private static final C8739l90 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private String zzc = "";

    static {
        C8739l90 c8739l90 = new C8739l90();
        zza = c8739l90;
        Gu0.E(C8739l90.class, c8739l90);
    }

    private C8739l90() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8632k90 c8632k90 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C8739l90.class) {
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
                    return new C8525j90(c8632k90);
                }
                return new C8739l90();
            }
            return Gu0.x(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        return (byte) 1;
    }
}
