package com.google.android.gms.internal.ads;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.bx0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7755bx0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C7755bx0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private C7648ax0 zze;
    private C7648ax0 zzf;

    static {
        C7755bx0 c7755bx0 = new C7755bx0();
        zza = c7755bx0;
        Gu0.E(C7755bx0.class, c7755bx0);
    }

    private C7755bx0() {
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
                                    synchronized (C7755bx0.class) {
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
                    return new Xw0(nx0);
                }
                return new C7755bx0();
            }
            return Gu0.x(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", Yw0.f72704a, "zze", "zzf"});
        }
        return (byte) 1;
    }
}
