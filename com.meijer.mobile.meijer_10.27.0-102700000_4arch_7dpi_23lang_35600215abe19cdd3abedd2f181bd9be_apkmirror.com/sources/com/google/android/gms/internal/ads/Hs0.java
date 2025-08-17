package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes6.dex */
public final class Hs0 extends Gu0 implements InterfaceC9227qv0 {
    public static final /* synthetic */ int zza = 0;
    private static final Hs0 zzb;
    private static volatile InterfaceC9868wv0 zzc;
    private String zzd = "";
    private Su0 zze = Gu0.s();

    static {
        Hs0 hs0 = new Hs0();
        zzb = hs0;
        Gu0.E(Hs0.class, hs0);
    }

    private Hs0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Gs0 gs0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzc;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (Hs0.class) {
                                        try {
                                            bu0 = zzc;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzb);
                                                zzc = bu0;
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
                        return zzb;
                    }
                    return new Fs0(gs0);
                }
                return new Hs0();
            }
            return Gu0.x(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", C8153gs0.class});
        }
        return (byte) 1;
    }
}
