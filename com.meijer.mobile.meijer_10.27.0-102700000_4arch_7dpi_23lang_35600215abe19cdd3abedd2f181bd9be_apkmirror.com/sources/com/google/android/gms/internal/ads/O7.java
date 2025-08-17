package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class O7 extends Gu0 implements InterfaceC9227qv0 {
    private static final O7 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private C8078g8 zzi;
    private C8504k8 zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static /* synthetic */ void g0(O7 o72, boolean z10) {
        o72.zzc |= 8;
        o72.zzg = z10;
    }

    public final String f0() {
        return this.zzf;
    }

    public final boolean i0() {
        return this.zzg;
    }

    static {
        O7 o72 = new O7();
        zza = o72;
        Gu0.E(O7.class, o72);
    }

    public static M7 b0() {
        return (M7) zza.n();
    }

    public final C8078g8 d0() {
        C8078g8 c8078g8 = this.zzi;
        return c8078g8 == null ? C8078g8.d0() : c8078g8;
    }

    public final C8504k8 e0() {
        C8504k8 c8504k8 = this.zzj;
        return c8504k8 == null ? C8504k8.c0() : c8504k8;
    }

    private O7() {
    }

    static /* synthetic */ void h0(O7 o72, String str) {
        str.getClass();
        o72.zzc |= 4;
        o72.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    N7 n72 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (O7.class) {
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
                    return new M7(n72);
                }
                return new O7();
            }
            return Gu0.x(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", P7.f69266a, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
