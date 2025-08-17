package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.de, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7804de extends Gu0<C7804de, C7295Wd> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    private static final C7804de zzb;
    private static volatile InterfaceC9868wv0<C7804de> zzc;
    private Su0<C7262Vd> zzd = Gu0.s();

    static {
        C7804de c7804de = new C7804de();
        zzb = c7804de;
        Gu0.E(C7804de.class, c7804de);
    }

    private void c0() {
        Su0<C7262Vd> su0 = this.zzd;
        if (su0.zzc()) {
            return;
        }
        this.zzd = Gu0.t(su0);
    }

    public static C7295Wd d0() {
        return zzb.n();
    }

    private C7804de() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(C7262Vd c7262Vd) {
        c7262Vd.getClass();
        c0();
        this.zzd.add(c7262Vd);
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7095Qe c7095Qe = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0<C7804de> interfaceC9868wv0 = zzc;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C7804de.class) {
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
                    return new C7295Wd();
                }
                return new C7804de();
            }
            return Gu0.x(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C7262Vd.class});
        }
        return (byte) 1;
    }
}
