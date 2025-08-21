package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class V8 extends Gu0 implements InterfaceC9352qv0 {
    private static final V8 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private String zzd = "";

    static {
        V8 v82 = new V8();
        zza = v82;
        Gu0.E(V8.class, v82);
    }

    private V8() {
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
                                    synchronized (V8.class) {
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
                    return new U8(y82);
                }
                return new V8();
            }
            return Gu0.x(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
