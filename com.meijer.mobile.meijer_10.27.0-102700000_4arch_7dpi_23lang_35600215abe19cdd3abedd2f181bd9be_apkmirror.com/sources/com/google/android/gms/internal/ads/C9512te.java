package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.te, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9512te extends Gu0<C9512te, C9405se> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C9512te zzc;
    private static volatile InterfaceC9868wv0<C9512te> zzd;
    private int zze;
    private int zzf;
    private C6652Dd zzg;

    static {
        C9512te c9512te = new C9512te();
        zzc = c9512te;
        Gu0.E(C9512te.class, c9512te);
    }

    private C9512te() {
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
                                InterfaceC9868wv0<C9512te> interfaceC9868wv0 = zzd;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9512te.class) {
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
                    return new C9405se();
                }
                return new C9512te();
            }
            return Gu0.x(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", EnumC9192qe.b(), "zzg"});
        }
        return (byte) 1;
    }
}
