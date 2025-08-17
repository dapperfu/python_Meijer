package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9112pr0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C9112pr0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private C9432sr0 zzd;
    private int zze;

    public final int b0() {
        return this.zze;
    }

    static {
        C9112pr0 c9112pr0 = new C9112pr0();
        zza = c9112pr0;
        Gu0.E(C9112pr0.class, c9112pr0);
    }

    public static C8898nr0 c0() {
        return (C8898nr0) zza.n();
    }

    public static C9112pr0 e0(Zt0 zt0, C9225qu0 c9225qu0) throws zzgyg {
        return (C9112pr0) Gu0.N(zza, zt0, c9225qu0);
    }

    public final C9432sr0 f0() {
        C9432sr0 c9432sr0 = this.zzd;
        return c9432sr0 == null ? C9432sr0.e0() : c9432sr0;
    }

    private C9112pr0() {
    }

    static /* synthetic */ void h0(C9112pr0 c9112pr0, C9432sr0 c9432sr0) {
        c9432sr0.getClass();
        c9112pr0.zzd = c9432sr0;
        c9112pr0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9005or0 c9005or0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9112pr0.class) {
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
                    return new C8898nr0(c9005or0);
                }
                return new C9112pr0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
