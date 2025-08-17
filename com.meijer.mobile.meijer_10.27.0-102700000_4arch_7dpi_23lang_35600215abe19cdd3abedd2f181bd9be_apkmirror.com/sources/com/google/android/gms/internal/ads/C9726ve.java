package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ve, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9726ve extends Gu0<C9726ve, C9619ue> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C9726ve zzd;
    private static volatile InterfaceC9868wv0<C9726ve> zze;
    private int zzf;
    private String zzg = "";
    private Su0<C9512te> zzh = Gu0.s();
    private int zzi;

    static {
        C9726ve c9726ve = new C9726ve();
        zzd = c9726ve;
        Gu0.E(C9726ve.class, c9726ve);
    }

    private C9726ve() {
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
                                InterfaceC9868wv0<C9726ve> interfaceC9868wv0 = zze;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9726ve.class) {
                                        try {
                                            bu0 = zze;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzd);
                                                zze = bu0;
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
                        return zzd;
                    }
                    return new C9619ue();
                }
                return new C9726ve();
            }
            return Gu0.x(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", C9512te.class, "zzi", EnumC6756Ge.b()});
        }
        return (byte) 1;
    }
}
