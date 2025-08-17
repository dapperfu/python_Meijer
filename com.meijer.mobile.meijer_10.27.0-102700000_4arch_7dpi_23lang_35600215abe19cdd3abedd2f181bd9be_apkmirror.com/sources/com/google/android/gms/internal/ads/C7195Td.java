package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Td, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7195Td extends Gu0<C7195Td, C7161Sd> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C7195Td zze;
    private static volatile InterfaceC9868wv0<C7195Td> zzf;
    private int zzg;
    private C6856Jd zzh;
    private int zzi = 1000;
    private C7127Rd zzj;
    private C6788Hd zzk;

    static {
        C7195Td c7195Td = new C7195Td();
        zze = c7195Td;
        Gu0.E(C7195Td.class, c7195Td);
    }

    private C7195Td() {
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
                                InterfaceC9868wv0<C7195Td> interfaceC9868wv0 = zzf;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C7195Td.class) {
                                        try {
                                            bu0 = zzf;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zze);
                                                zzf = bu0;
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
                        return zze;
                    }
                    return new C7161Sd();
                }
                return new C7195Td();
            }
            return Gu0.x(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", EnumC6756Ge.b(), "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
