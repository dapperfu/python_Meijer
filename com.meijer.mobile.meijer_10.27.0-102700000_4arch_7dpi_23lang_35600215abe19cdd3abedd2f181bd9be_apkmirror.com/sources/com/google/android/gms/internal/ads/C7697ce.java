package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ce, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7697ce extends Gu0<C7697ce, C7591be> implements InterfaceC9227qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C7697ce zzd;
    private static volatile InterfaceC9868wv0<C7697ce> zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(boolean z10) {
        this.zzf |= 1;
        this.zzg = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(boolean z10) {
        this.zzf |= 2;
        this.zzh = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i10) {
        this.zzf |= 4;
        this.zzi = i10;
    }

    static {
        C7697ce c7697ce = new C7697ce();
        zzd = c7697ce;
        Gu0.E(C7697ce.class, c7697ce);
    }

    public static C7591be h0() {
        return zzd.n();
    }

    private C7697ce() {
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
                                InterfaceC9868wv0<C7697ce> interfaceC9868wv0 = zze;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C7697ce.class) {
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
                    return new C7591be();
                }
                return new C7697ce();
            }
            return Gu0.x(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
