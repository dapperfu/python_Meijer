package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g90, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8206g90 extends Gu0 implements InterfaceC9352qv0 {
    private static final C8206g90 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private C7886d90 zzd;

    static {
        C8206g90 c8206g90 = new C8206g90();
        zza = c8206g90;
        Gu0.E(C8206g90.class, c8206g90);
    }

    public static C8099f90 b0() {
        return (C8099f90) zza.n();
    }

    private C8206g90() {
    }

    static /* synthetic */ void d0(C8206g90 c8206g90, C7886d90 c7886d90) {
        c7886d90.getClass();
        c8206g90.zzd = c7886d90;
        c8206g90.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8313h90 c8313h90 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C8206g90.class) {
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
                    return new C8099f90(c8313h90);
                }
                return new C8206g90();
            }
            return Gu0.x(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        }
        return (byte) 1;
    }
}
