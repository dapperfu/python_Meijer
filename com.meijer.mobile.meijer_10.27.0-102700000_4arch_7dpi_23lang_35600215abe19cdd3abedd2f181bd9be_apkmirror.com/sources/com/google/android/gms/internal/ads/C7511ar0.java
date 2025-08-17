package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ar0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7511ar0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C7511ar0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private C8151gr0 zzd;
    private Sr0 zze;

    static {
        C7511ar0 c7511ar0 = new C7511ar0();
        zza = c7511ar0;
        Gu0.E(C7511ar0.class, c7511ar0);
    }

    public static Yq0 b0() {
        return (Yq0) zza.n();
    }

    public static C7511ar0 d0(Zt0 zt0, C9225qu0 c9225qu0) throws zzgyg {
        return (C7511ar0) Gu0.N(zza, zt0, c9225qu0);
    }

    public final C8151gr0 e0() {
        C8151gr0 c8151gr0 = this.zzd;
        return c8151gr0 == null ? C8151gr0.e0() : c8151gr0;
    }

    public final Sr0 f0() {
        Sr0 sr0 = this.zze;
        return sr0 == null ? Sr0.f0() : sr0;
    }

    private C7511ar0() {
    }

    static /* synthetic */ void g0(C7511ar0 c7511ar0, C8151gr0 c8151gr0) {
        c8151gr0.getClass();
        c7511ar0.zzd = c8151gr0;
        c7511ar0.zzc |= 1;
    }

    static /* synthetic */ void h0(C7511ar0 c7511ar0, Sr0 sr0) {
        sr0.getClass();
        c7511ar0.zze = sr0;
        c7511ar0.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Zq0 zq0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C7511ar0.class) {
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
                    return new Yq0(zq0);
                }
                return new C7511ar0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
