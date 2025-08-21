package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mx0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8928mx0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C8928mx0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private Zt0 zzf;
    private Zt0 zzg;

    static /* synthetic */ void e0(C8928mx0 c8928mx0, String str) {
        c8928mx0.zzc |= 2;
        c8928mx0.zze = "image/png";
    }

    static /* synthetic */ void f0(C8928mx0 c8928mx0, int i10) {
        c8928mx0.zzd = 1;
        c8928mx0.zzc = 1 | c8928mx0.zzc;
    }

    static {
        C8928mx0 c8928mx0 = new C8928mx0();
        zza = c8928mx0;
        Gu0.E(C8928mx0.class, c8928mx0);
    }

    public static C8714kx0 b0() {
        return (C8714kx0) zza.n();
    }

    private C8928mx0() {
        Zt0 zt0 = Zt0.f73122b;
        this.zzf = zt0;
        this.zzg = zt0;
    }

    static /* synthetic */ void d0(C8928mx0 c8928mx0, Zt0 zt0) {
        zt0.getClass();
        c8928mx0.zzc |= 4;
        c8928mx0.zzf = zt0;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Nx0 nx0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C8928mx0.class) {
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
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new C8714kx0(nx0);
                }
                return new C8928mx0();
            }
            return Gu0.x(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", C8821lx0.f77524a, "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
