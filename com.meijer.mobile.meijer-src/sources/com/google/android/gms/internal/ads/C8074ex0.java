package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ex0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8074ex0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C8074ex0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        C8074ex0 c8074ex0 = new C8074ex0();
        zza = c8074ex0;
        Gu0.E(C8074ex0.class, c8074ex0);
    }

    private C8074ex0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Nx0 nx0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C8074ex0.class) {
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
                    return new C7861cx0(nx0);
                }
                return new C8074ex0();
            }
            return Gu0.x(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", C7967dx0.f74565a, "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
