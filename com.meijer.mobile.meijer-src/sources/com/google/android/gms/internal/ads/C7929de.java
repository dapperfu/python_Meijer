package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.de, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7929de extends Gu0<C7929de, C7420Wd> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    private static final C7929de zzb;
    private static volatile InterfaceC9993wv0<C7929de> zzc;
    private Su0<C7387Vd> zzd = Gu0.s();

    static {
        C7929de c7929de = new C7929de();
        zzb = c7929de;
        Gu0.E(C7929de.class, c7929de);
    }

    private void c0() {
        Su0<C7387Vd> su0 = this.zzd;
        if (su0.zzc()) {
            return;
        }
        this.zzd = Gu0.t(su0);
    }

    public static C7420Wd d0() {
        return zzb.n();
    }

    private C7929de() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(C7387Vd c7387Vd) {
        c7387Vd.getClass();
        c0();
        this.zzd.add(c7387Vd);
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7220Qe c7220Qe = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0<C7929de> interfaceC9993wv0 = zzc;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C7929de.class) {
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
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zzb;
                    }
                    return new C7420Wd();
                }
                return new C7929de();
            }
            return Gu0.x(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C7387Vd.class});
        }
        return (byte) 1;
    }
}
