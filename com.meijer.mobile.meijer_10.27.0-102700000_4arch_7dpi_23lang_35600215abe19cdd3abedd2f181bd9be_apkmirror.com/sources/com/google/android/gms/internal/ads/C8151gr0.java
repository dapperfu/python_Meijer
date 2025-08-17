package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8151gr0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C8151gr0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private C8470jr0 zzd;
    private int zze;

    public static C8151gr0 e0() {
        return zza;
    }

    public final int b0() {
        return this.zze;
    }

    static {
        C8151gr0 c8151gr0 = new C8151gr0();
        zza = c8151gr0;
        Gu0.E(C8151gr0.class, c8151gr0);
    }

    public static C7937er0 c0() {
        return (C7937er0) zza.n();
    }

    public final C8470jr0 f0() {
        C8470jr0 c8470jr0 = this.zzd;
        return c8470jr0 == null ? C8470jr0.e0() : c8470jr0;
    }

    private C8151gr0() {
    }

    static /* synthetic */ void h0(C8151gr0 c8151gr0, C8470jr0 c8470jr0) {
        c8470jr0.getClass();
        c8151gr0.zzd = c8470jr0;
        c8151gr0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8044fr0 c8044fr0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C8151gr0.class) {
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
                    return new C7937er0(c8044fr0);
                }
                return new C8151gr0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
