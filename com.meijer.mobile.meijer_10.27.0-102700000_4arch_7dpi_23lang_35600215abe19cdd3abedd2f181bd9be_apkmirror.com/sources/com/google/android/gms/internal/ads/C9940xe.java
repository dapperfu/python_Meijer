package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9940xe extends Gu0<C9940xe, C9833we> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C9940xe zzf;
    private static volatile InterfaceC9868wv0<C9940xe> zzg;
    private int zzh;
    private String zzi = "";
    private Su0<C9512te> zzj = Gu0.s();
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    public static C9940xe e0() {
        return zzf;
    }

    static {
        C9940xe c9940xe = new C9940xe();
        zzf = c9940xe;
        Gu0.E(C9940xe.class, c9940xe);
    }

    private C9940xe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(String str) {
        str.getClass();
        this.zzh |= 1;
        this.zzi = str;
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
                                InterfaceC9868wv0<C9940xe> interfaceC9868wv0 = zzg;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9940xe.class) {
                                        try {
                                            bu0 = zzg;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzf);
                                                zzg = bu0;
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
                        return zzf;
                    }
                    return new C9833we();
                }
                return new C9940xe();
            }
            return Gu0.x(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", C9512te.class, "zzk", EnumC6756Ge.b(), "zzl", EnumC6756Ge.b(), "zzm", EnumC6756Ge.b()});
        }
        return (byte) 1;
    }
}
