package com.google.android.gms.internal.ads;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.bx0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7630bx0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C7630bx0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;
    private C7523ax0 zze;
    private C7523ax0 zzf;

    static {
        C7630bx0 c7630bx0 = new C7630bx0();
        zza = c7630bx0;
        Gu0.E(C7630bx0.class, c7630bx0);
    }

    private C7630bx0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Nx0 nx0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C7630bx0.class) {
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
                                return interfaceC9868wv0;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new Xw0(nx0);
                }
                return new C7630bx0();
            }
            return Gu0.x(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", Yw0.f71864a, "zze", "zzf"});
        }
        return (byte) 1;
    }
}
