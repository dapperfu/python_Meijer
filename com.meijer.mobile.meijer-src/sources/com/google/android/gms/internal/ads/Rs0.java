package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Rs0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Rs0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;

    public static Rs0 e0() {
        return zza;
    }

    public final int b0() {
        return this.zzc;
    }

    static {
        Rs0 rs0 = new Rs0();
        zza = rs0;
        Gu0.E(Rs0.class, rs0);
    }

    public static Os0 c0() {
        return (Os0) zza.n();
    }

    private Rs0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Qs0 qs0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Rs0.class) {
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
                    return new Os0(qs0);
                }
                return new Rs0();
            }
            return Gu0.x(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        return (byte) 1;
    }
}
