package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Kr0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Kr0 zza;
    private static volatile InterfaceC9993wv0 zzb;

    public static Kr0 c0() {
        return zza;
    }

    static {
        Kr0 kr0 = new Kr0();
        zza = kr0;
        Gu0.E(Kr0.class, kr0);
    }

    public static Kr0 d0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (Kr0) Gu0.N(zza, zt0, c9350qu0);
    }

    private Kr0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            Jr0 jr0 = null;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Kr0.class) {
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
                    return new Ir0(jr0);
                }
                return new Kr0();
            }
            return Gu0.x(zza, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
