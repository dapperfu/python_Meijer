package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Uq0 extends Gu0 implements InterfaceC9227qv0 {
    private static final Uq0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;

    public static Uq0 e0() {
        return zza;
    }

    public final int b0() {
        return this.zzc;
    }

    static {
        Uq0 uq0 = new Uq0();
        zza = uq0;
        Gu0.E(Uq0.class, uq0);
    }

    public static Sq0 c0() {
        return (Sq0) zza.n();
    }

    private Uq0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Tq0 tq0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (Uq0.class) {
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
                    return new Sq0(tq0);
                }
                return new Uq0();
            }
            return Gu0.x(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        return (byte) 1;
    }
}
