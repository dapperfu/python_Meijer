package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7955dr0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C7955dr0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private C8595jr0 zze;
    private Zt0 zzf = Zt0.f73122b;

    public static C7955dr0 e0() {
        return zza;
    }

    public final int b0() {
        return this.zzd;
    }

    public final Zt0 g0() {
        return this.zzf;
    }

    static {
        C7955dr0 c7955dr0 = new C7955dr0();
        zza = c7955dr0;
        Gu0.E(C7955dr0.class, c7955dr0);
    }

    public static C7743br0 c0() {
        return (C7743br0) zza.n();
    }

    public final C8595jr0 f0() {
        C8595jr0 c8595jr0 = this.zze;
        return c8595jr0 == null ? C8595jr0.e0() : c8595jr0;
    }

    private C7955dr0() {
    }

    static /* synthetic */ void i0(C7955dr0 c7955dr0, C8595jr0 c8595jr0) {
        c8595jr0.getClass();
        c7955dr0.zze = c8595jr0;
        c7955dr0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7849cr0 c7849cr0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C7955dr0.class) {
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
                    return new C7743br0(c7849cr0);
                }
                return new C7955dr0();
            }
            return Gu0.x(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
