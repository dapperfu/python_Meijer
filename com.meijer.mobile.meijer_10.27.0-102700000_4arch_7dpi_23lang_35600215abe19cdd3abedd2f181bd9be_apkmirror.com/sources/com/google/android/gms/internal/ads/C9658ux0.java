package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ux0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9658ux0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C9658ux0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static /* synthetic */ void d0(C9658ux0 c9658ux0, String str) {
        c9658ux0.zzc |= 1;
        c9658ux0.zzd = str;
    }

    static /* synthetic */ void e0(C9658ux0 c9658ux0, long j10) {
        c9658ux0.zzc |= 2;
        c9658ux0.zze = j10;
    }

    static /* synthetic */ void f0(C9658ux0 c9658ux0, boolean z10) {
        c9658ux0.zzc |= 4;
        c9658ux0.zzf = z10;
    }

    static {
        C9658ux0 c9658ux0 = new C9658ux0();
        zza = c9658ux0;
        Gu0.E(C9658ux0.class, c9658ux0);
    }

    public static C9551tx0 b0() {
        return (C9551tx0) zza.n();
    }

    private C9658ux0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Nx0 nx0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9658ux0.class) {
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
                    return new C9551tx0(nx0);
                }
                return new C9658ux0();
            }
            return Gu0.x(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", C9765vx0.f79387a, "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
