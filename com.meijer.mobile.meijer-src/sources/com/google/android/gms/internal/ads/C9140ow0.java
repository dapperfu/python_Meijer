package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ow0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9140ow0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C9140ow0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        C9140ow0 c9140ow0 = new C9140ow0();
        zza = c9140ow0;
        Gu0.E(C9140ow0.class, c9140ow0);
    }

    public static C8926mw0 b0() {
        return (C8926mw0) zza.n();
    }

    private C9140ow0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9460rw0 c9460rw0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C9140ow0.class) {
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
                    return new C8926mw0(c9460rw0);
                }
                return new C9140ow0();
            }
            return Gu0.x(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
