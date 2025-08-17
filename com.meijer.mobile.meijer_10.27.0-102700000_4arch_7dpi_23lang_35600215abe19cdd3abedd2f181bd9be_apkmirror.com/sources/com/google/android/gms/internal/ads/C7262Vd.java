package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7262Vd extends Gu0<C7262Vd, C7229Ud> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C7262Vd zzd;
    private static volatile InterfaceC9868wv0<C7262Vd> zze;
    private int zzf;
    private int zzg;
    private C7484ae zzh;
    private C7697ce zzi;

    static {
        C7262Vd c7262Vd = new C7262Vd();
        zzd = c7262Vd;
        Gu0.E(C7262Vd.class, c7262Vd);
    }

    public static C7229Ud h0() {
        return zzd.n();
    }

    private C7262Vd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(EnumC7328Xd enumC7328Xd) {
        this.zzg = enumC7328Xd.zza();
        this.zzf |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(C7484ae c7484ae) {
        c7484ae.getClass();
        this.zzh = c7484ae;
        this.zzf |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(C7697ce c7697ce) {
        c7697ce.getClass();
        this.zzi = c7697ce;
        this.zzf |= 4;
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
                                InterfaceC9868wv0<C7262Vd> interfaceC9868wv0 = zze;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C7262Vd.class) {
                                        try {
                                            bu0 = zze;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzd);
                                                zze = bu0;
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
                        return zzd;
                    }
                    return new C7229Ud();
                }
                return new C7262Vd();
            }
            return Gu0.x(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", EnumC7328Xd.b(), "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
