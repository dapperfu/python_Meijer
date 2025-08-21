package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ps0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9239ps0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C9239ps0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C9239ps0 c9239ps0 = new C9239ps0();
        zza = c9239ps0;
        Gu0.E(C9239ps0.class, c9239ps0);
    }

    public static C9025ns0 b0() {
        return (C9025ns0) zza.n();
    }

    private C9239ps0() {
    }

    static /* synthetic */ void f0(C9239ps0 c9239ps0, String str) {
        str.getClass();
        c9239ps0.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9346qs0 c9346qs0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C9239ps0.class) {
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
                    return new C9025ns0(c9346qs0);
                }
                return new C9239ps0();
            }
            return Gu0.x(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
