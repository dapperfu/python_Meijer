package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8078g8 extends Gu0 implements InterfaceC9227qv0 {
    private static final C8078g8 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private boolean zzd;
    private int zze = 5000;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    public static C8078g8 d0() {
        return zza;
    }

    public final int b0() {
        return this.zze;
    }

    public final boolean e0() {
        return this.zzd;
    }

    public final boolean f0() {
        return this.zzg;
    }

    public final boolean g0() {
        return this.zzf;
    }

    public final boolean h0() {
        return this.zzh;
    }

    static {
        C8078g8 c8078g8 = new C8078g8();
        zza = c8078g8;
        Gu0.E(C8078g8.class, c8078g8);
    }

    private C8078g8() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7971f8 c7971f8 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C8078g8.class) {
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
                    return new C7864e8(c7971f8);
                }
                return new C8078g8();
            }
            return Gu0.x(zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
