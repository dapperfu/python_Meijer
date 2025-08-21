package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rs0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9452rs0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C9452rs0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private Su0 zzd = Gu0.s();

    static {
        C9452rs0 c9452rs0 = new C9452rs0();
        zza = c9452rs0;
        Gu0.E(C9452rs0.class, c9452rs0);
    }

    public static C8918ms0 b0() {
        return (C8918ms0) zza.n();
    }

    private C9452rs0() {
    }

    static /* synthetic */ void d0(C9452rs0 c9452rs0, C9239ps0 c9239ps0) {
        c9239ps0.getClass();
        Su0 su0 = c9452rs0.zzd;
        if (!su0.zzc()) {
            c9452rs0.zzd = Gu0.t(su0);
        }
        c9452rs0.zzd.add(c9239ps0);
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
                                    synchronized (C9452rs0.class) {
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
                    return new C8918ms0(c9346qs0);
                }
                return new C9452rs0();
            }
            return Gu0.x(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", C9239ps0.class});
        }
        return (byte) 1;
    }
}
