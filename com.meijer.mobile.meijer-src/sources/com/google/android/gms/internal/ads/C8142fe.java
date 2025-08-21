package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8142fe extends Gu0<C8142fe, C8035ee> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C8142fe zzf;
    private static volatile InterfaceC9993wv0<C8142fe> zzg;
    private int zzh;
    private int zzi = 1000;
    private C7252Rd zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        C8142fe c8142fe = new C8142fe();
        zzf = c8142fe;
        Gu0.E(C8142fe.class, c8142fe);
    }

    private C8142fe() {
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
                                InterfaceC9993wv0<C8142fe> interfaceC9993wv0 = zzg;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C8142fe.class) {
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
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zzf;
                    }
                    return new C8035ee();
                }
                return new C8142fe();
            }
            return Gu0.x(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", EnumC6881Ge.b(), "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
