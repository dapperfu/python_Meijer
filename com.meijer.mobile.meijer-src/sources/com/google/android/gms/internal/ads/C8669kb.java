package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8669kb extends Gu0 implements InterfaceC9352qv0 {
    private static final C8669kb zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    public static C8669kb g0() {
        return zza;
    }

    static /* synthetic */ void m0(C8669kb c8669kb, long j10) {
        c8669kb.zzc |= 8;
        c8669kb.zzg = j10;
    }

    static /* synthetic */ void n0(C8669kb c8669kb, long j10) {
        c8669kb.zzc |= 4;
        c8669kb.zzf = j10;
    }

    static /* synthetic */ void o0(C8669kb c8669kb, long j10) {
        c8669kb.zzc |= 16;
        c8669kb.zzh = j10;
    }

    public final long b0() {
        return this.zzg;
    }

    public final long c0() {
        return this.zzf;
    }

    public final long d0() {
        return this.zzh;
    }

    public final String j0() {
        return this.zze;
    }

    public final String k0() {
        return this.zzd;
    }

    static {
        C8669kb c8669kb = new C8669kb();
        zza = c8669kb;
        Gu0.E(C8669kb.class, c8669kb);
    }

    public static C8457ib e0() {
        return (C8457ib) zza.n();
    }

    public static C8669kb h0(Zt0 zt0) throws zzgyg {
        return (C8669kb) Gu0.L(zza, zt0);
    }

    public static C8669kb i0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (C8669kb) Gu0.N(zza, zt0, c9350qu0);
    }

    private C8669kb() {
    }

    static /* synthetic */ void l0(C8669kb c8669kb, String str) {
        str.getClass();
        c8669kb.zzc |= 2;
        c8669kb.zze = str;
    }

    static /* synthetic */ void p0(C8669kb c8669kb, String str) {
        str.getClass();
        c8669kb.zzc |= 1;
        c8669kb.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8562jb c8562jb = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C8669kb.class) {
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
                    return new C8457ib(c8562jb);
                }
                return new C8669kb();
            }
            return Gu0.x(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
