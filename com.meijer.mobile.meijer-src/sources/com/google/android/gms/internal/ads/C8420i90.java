package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i90, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8420i90 extends Gu0 implements InterfaceC9352qv0 {
    private static final C8420i90 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private Su0 zzc = Gu0.s();

    static {
        C8420i90 c8420i90 = new C8420i90();
        zza = c8420i90;
        Gu0.E(C8420i90.class, c8420i90);
    }

    public static C7992e90 c0() {
        return (C7992e90) zza.n();
    }

    public final int b0() {
        return this.zzc.size();
    }

    private C8420i90() {
    }

    static /* synthetic */ void e0(C8420i90 c8420i90, C8206g90 c8206g90) {
        c8206g90.getClass();
        Su0 su0 = c8420i90.zzc;
        if (!su0.zzc()) {
            c8420i90.zzc = Gu0.t(su0);
        }
        c8420i90.zzc.add(c8206g90);
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8313h90 c8313h90 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C8420i90.class) {
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
                    return new C7992e90(c8313h90);
                }
                return new C8420i90();
            }
            return Gu0.x(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C8206g90.class});
        }
        return (byte) 1;
    }
}
