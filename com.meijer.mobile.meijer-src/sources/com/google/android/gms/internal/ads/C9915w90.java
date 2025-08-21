package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w90, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9915w90 extends Gu0 implements InterfaceC9352qv0 {
    private static final C9915w90 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zze;
    private String zzd = "";
    private String zzf = "";

    static {
        C9915w90 c9915w90 = new C9915w90();
        zza = c9915w90;
        Gu0.E(C9915w90.class, c9915w90);
    }

    private C9915w90() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9808v90 c9808v90 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C9915w90.class) {
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
                    return new C9701u90(c9808v90);
                }
                return new C9915w90();
            }
            return Gu0.x(zza, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
