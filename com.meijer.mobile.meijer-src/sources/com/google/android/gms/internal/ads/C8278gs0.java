package com.google.android.gms.internal.ads;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.gs0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8278gs0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C8278gs0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zze;
    private boolean zzf;
    private String zzc = "";
    private String zzd = "";
    private String zzg = "";

    static {
        C8278gs0 c8278gs0 = new C8278gs0();
        zza = c8278gs0;
        Gu0.E(C8278gs0.class, c8278gs0);
    }

    private C8278gs0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8171fs0 c8171fs0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C8278gs0.class) {
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
                    return new C8064es0(c8171fs0);
                }
                return new C8278gs0();
            }
            return Gu0.x(zza, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
