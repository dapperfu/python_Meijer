package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.te, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9637te extends Gu0<C9637te, C9530se> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C9637te zzc;
    private static volatile InterfaceC9993wv0<C9637te> zzd;
    private int zze;
    private int zzf;
    private C6777Dd zzg;

    static {
        C9637te c9637te = new C9637te();
        zzc = c9637te;
        Gu0.E(C9637te.class, c9637te);
    }

    private C9637te() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7220Qe c7220Qe = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0<C9637te> interfaceC9993wv0 = zzd;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C9637te.class) {
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
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zzc;
                    }
                    return new C9530se();
                }
                return new C9637te();
            }
            return Gu0.x(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", EnumC9317qe.b(), "zzg"});
        }
        return (byte) 1;
    }
}
