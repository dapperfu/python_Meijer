package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xs0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9969xs0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C9969xs0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private String zzc = "";

    public static C9969xs0 d0() {
        return zza;
    }

    public final String f0() {
        return this.zzc;
    }

    static {
        C9969xs0 c9969xs0 = new C9969xs0();
        zza = c9969xs0;
        Gu0.E(C9969xs0.class, c9969xs0);
    }

    public static C9755vs0 b0() {
        return (C9755vs0) zza.n();
    }

    public static C9969xs0 e0(Zt0 zt0, C9225qu0 c9225qu0) throws zzgyg {
        return (C9969xs0) Gu0.N(zza, zt0, c9225qu0);
    }

    private C9969xs0() {
    }

    static /* synthetic */ void g0(C9969xs0 c9969xs0, String str) {
        str.getClass();
        c9969xs0.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9862ws0 c9862ws0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9969xs0.class) {
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
                    return new C9755vs0(c9862ws0);
                }
                return new C9969xs0();
            }
            return Gu0.x(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        return (byte) 1;
    }
}
