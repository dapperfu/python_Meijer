package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9237pr0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C9237pr0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private C9557sr0 zzd;
    private int zze;

    public final int b0() {
        return this.zze;
    }

    static {
        C9237pr0 c9237pr0 = new C9237pr0();
        zza = c9237pr0;
        Gu0.E(C9237pr0.class, c9237pr0);
    }

    public static C9023nr0 c0() {
        return (C9023nr0) zza.n();
    }

    public static C9237pr0 e0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (C9237pr0) Gu0.N(zza, zt0, c9350qu0);
    }

    public final C9557sr0 f0() {
        C9557sr0 c9557sr0 = this.zzd;
        return c9557sr0 == null ? C9557sr0.e0() : c9557sr0;
    }

    private C9237pr0() {
    }

    static /* synthetic */ void h0(C9237pr0 c9237pr0, C9557sr0 c9557sr0) {
        c9557sr0.getClass();
        c9237pr0.zzd = c9557sr0;
        c9237pr0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9130or0 c9130or0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C9237pr0.class) {
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
                    return new C9023nr0(c9130or0);
                }
                return new C9237pr0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
