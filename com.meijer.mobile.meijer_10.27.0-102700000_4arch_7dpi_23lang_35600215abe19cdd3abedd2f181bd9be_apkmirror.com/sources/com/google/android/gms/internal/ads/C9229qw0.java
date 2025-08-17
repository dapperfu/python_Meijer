package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qw0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9229qw0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C9229qw0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private Su0 zzc = Gu0.s();

    static {
        C9229qw0 c9229qw0 = new C9229qw0();
        zza = c9229qw0;
        Gu0.E(C9229qw0.class, c9229qw0);
    }

    public static C9122pw0 b0() {
        return (C9122pw0) zza.n();
    }

    private C9229qw0() {
    }

    static /* synthetic */ void d0(C9229qw0 c9229qw0, C9015ow0 c9015ow0) {
        c9015ow0.getClass();
        Su0 su0 = c9229qw0.zzc;
        if (!su0.zzc()) {
            c9229qw0.zzc = Gu0.t(su0);
        }
        c9229qw0.zzc.add(c9015ow0);
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C9335rw0 c9335rw0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9229qw0.class) {
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
                    return new C9122pw0(c9335rw0);
                }
                return new C9229qw0();
            }
            return Gu0.x(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C9015ow0.class});
        }
        return (byte) 1;
    }
}
