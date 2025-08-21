package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Br0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Br0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private Zt0 zzd = Zt0.f73122b;

    public final int b0() {
        return this.zzc;
    }

    public final Zt0 f0() {
        return this.zzd;
    }

    static {
        Br0 br0 = new Br0();
        zza = br0;
        Gu0.E(Br0.class, br0);
    }

    public static C10306zr0 c0() {
        return (C10306zr0) zza.n();
    }

    public static Br0 e0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (Br0) Gu0.N(zza, zt0, c9350qu0);
    }

    public static InterfaceC9993wv0 g0() {
        return zza.u();
    }

    private Br0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Ar0 ar0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Br0.class) {
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
                    return new C10306zr0(ar0);
                }
                return new Br0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
