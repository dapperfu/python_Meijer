package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class G8 extends Gu0 implements InterfaceC9227qv0 {
    private static final G8 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static /* synthetic */ void d0(G8 g82, long j10) {
        g82.zzc |= 32;
        g82.zzi = j10;
    }

    static /* synthetic */ void e0(G8 g82, long j10) {
        g82.zzc |= 4;
        g82.zzf = j10;
    }

    static /* synthetic */ void f0(G8 g82, long j10) {
        g82.zzc |= 1;
        g82.zzd = j10;
    }

    static /* synthetic */ void g0(G8 g82, long j10) {
        g82.zzc |= 8;
        g82.zzg = j10;
    }

    static /* synthetic */ void h0(G8 g82, long j10) {
        g82.zzc |= 16;
        g82.zzh = j10;
    }

    static {
        G8 g82 = new G8();
        zza = g82;
        Gu0.E(G8.class, g82);
    }

    public static F8 b0() {
        return (F8) zza.n();
    }

    private G8() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Y8 y82 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (G8.class) {
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
                    return new F8(y82);
                }
                return new G8();
            }
            return Gu0.x(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
