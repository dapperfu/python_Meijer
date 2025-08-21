package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9557sr0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C9557sr0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;

    public static C9557sr0 e0() {
        return zza;
    }

    public final int b0() {
        return this.zzc;
    }

    static {
        C9557sr0 c9557sr0 = new C9557sr0();
        zza = c9557sr0;
        Gu0.E(C9557sr0.class, c9557sr0);
    }

    public static C9344qr0 c0() {
        return (C9344qr0) zza.n();
    }

    private C9557sr0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9450rr0 c9450rr0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C9557sr0.class) {
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
                    return new C9344qr0(c9450rr0);
                }
                return new C9557sr0();
            }
            return Gu0.x(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        return (byte) 1;
    }
}
