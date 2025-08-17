package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10074yr0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C10074yr0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;

    public final int b0() {
        return this.zzc;
    }

    public final int c0() {
        return this.zzd;
    }

    static {
        C10074yr0 c10074yr0 = new C10074yr0();
        zza = c10074yr0;
        Gu0.E(C10074yr0.class, c10074yr0);
    }

    public static C9860wr0 d0() {
        return (C9860wr0) zza.n();
    }

    public static C10074yr0 f0(Zt0 zt0, C9225qu0 c9225qu0) throws zzgyg {
        return (C10074yr0) Gu0.N(zza, zt0, c9225qu0);
    }

    private C10074yr0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9967xr0 c9967xr0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C10074yr0.class) {
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
                    return new C9860wr0(c9967xr0);
                }
                return new C10074yr0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
