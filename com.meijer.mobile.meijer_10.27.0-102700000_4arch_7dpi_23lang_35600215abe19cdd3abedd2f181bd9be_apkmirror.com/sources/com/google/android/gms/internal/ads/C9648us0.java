package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.us0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9648us0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C9648us0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;
    private C9969xs0 zze;

    public final int b0() {
        return this.zzd;
    }

    static {
        C9648us0 c9648us0 = new C9648us0();
        zza = c9648us0;
        Gu0.E(C9648us0.class, c9648us0);
    }

    public static C9434ss0 c0() {
        return (C9434ss0) zza.n();
    }

    public static C9648us0 e0(Zt0 zt0, C9225qu0 c9225qu0) throws zzgyg {
        return (C9648us0) Gu0.N(zza, zt0, c9225qu0);
    }

    public static InterfaceC9868wv0 g0() {
        return zza.u();
    }

    public final C9969xs0 f0() {
        C9969xs0 c9969xs0 = this.zze;
        return c9969xs0 == null ? C9969xs0.d0() : c9969xs0;
    }

    private C9648us0() {
    }

    static /* synthetic */ void h0(C9648us0 c9648us0, C9969xs0 c9969xs0) {
        c9969xs0.getClass();
        c9648us0.zze = c9969xs0;
        c9648us0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9541ts0 c9541ts0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9648us0.class) {
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
                    return new C9434ss0(c9541ts0);
                }
                return new C9648us0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
