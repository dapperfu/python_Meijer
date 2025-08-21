package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7387Vd extends Gu0<C7387Vd, C7354Ud> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C7387Vd zzd;
    private static volatile InterfaceC9993wv0<C7387Vd> zze;
    private int zzf;
    private int zzg;
    private C7609ae zzh;
    private C7822ce zzi;

    static {
        C7387Vd c7387Vd = new C7387Vd();
        zzd = c7387Vd;
        Gu0.E(C7387Vd.class, c7387Vd);
    }

    public static C7354Ud h0() {
        return zzd.n();
    }

    private C7387Vd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(EnumC7453Xd enumC7453Xd) {
        this.zzg = enumC7453Xd.zza();
        this.zzf |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(C7609ae c7609ae) {
        c7609ae.getClass();
        this.zzh = c7609ae;
        this.zzf |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(C7822ce c7822ce) {
        c7822ce.getClass();
        this.zzi = c7822ce;
        this.zzf |= 4;
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
                                InterfaceC9993wv0<C7387Vd> interfaceC9993wv0 = zze;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C7387Vd.class) {
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
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zzd;
                    }
                    return new C7354Ud();
                }
                return new C7387Vd();
            }
            return Gu0.x(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", EnumC7453Xd.b(), "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
