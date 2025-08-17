package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ds0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7832ds0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C7832ds0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private String zzc = "";
    private Zt0 zzd = Zt0.f72282b;
    private int zze;

    public static C7832ds0 e0() {
        return zza;
    }

    public final Es0 g0() {
        Es0 es0A = Es0.a(this.zze);
        return es0A == null ? Es0.UNRECOGNIZED : es0A;
    }

    public final Zt0 h0() {
        return this.zzd;
    }

    public final String i0() {
        return this.zzc;
    }

    static {
        C7832ds0 c7832ds0 = new C7832ds0();
        zza = c7832ds0;
        Gu0.E(C7832ds0.class, c7832ds0);
    }

    public static C7620bs0 b0() {
        return (C7620bs0) zza.n();
    }

    public static C7620bs0 c0(C7832ds0 c7832ds0) {
        return (C7620bs0) zza.F(c7832ds0);
    }

    public static C7832ds0 f0(byte[] bArr, C9225qu0 c9225qu0) throws zzgyg {
        return (C7832ds0) Gu0.P(zza, bArr, c9225qu0);
    }

    private C7832ds0() {
    }

    static /* synthetic */ void k0(C7832ds0 c7832ds0, String str) {
        str.getClass();
        c7832ds0.zzc = str;
    }

    static /* synthetic */ void l0(C7832ds0 c7832ds0, Zt0 zt0) {
        zt0.getClass();
        c7832ds0.zzd = zt0;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7726cs0 c7726cs0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C7832ds0.class) {
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
                    return new C7620bs0(c7726cs0);
                }
                return new C7832ds0();
            }
            return Gu0.x(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
