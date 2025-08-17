package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9083pd extends Gu0<C9083pd, C8548kd> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C9083pd zzc;
    private static volatile InterfaceC9868wv0<C9083pd> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C9083pd c9083pd = new C9083pd();
        zzc = c9083pd;
        Gu0.E(C9083pd.class, c9083pd);
    }

    public static C8548kd d0() {
        return zzc.n();
    }

    private C9083pd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(EnumC8655ld enumC8655ld) {
        this.zzg = enumC8655ld.zza();
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(EnumC8869nd enumC8869nd) {
        this.zzf = enumC8869nd.zza();
        this.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7095Qe c7095Qe = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0<C9083pd> interfaceC9868wv0 = zzd;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9083pd.class) {
                                        try {
                                            bu0 = zzd;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzc);
                                                zzd = bu0;
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
                        return zzc;
                    }
                    return new C8548kd();
                }
                return new C9083pd();
            }
            return Gu0.x(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", EnumC8869nd.b(), "zzg", EnumC8655ld.b()});
        }
        return (byte) 1;
    }
}
