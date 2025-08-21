package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9208pd extends Gu0<C9208pd, C8673kd> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C9208pd zzc;
    private static volatile InterfaceC9993wv0<C9208pd> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C9208pd c9208pd = new C9208pd();
        zzc = c9208pd;
        Gu0.E(C9208pd.class, c9208pd);
    }

    public static C8673kd d0() {
        return zzc.n();
    }

    private C9208pd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(EnumC8780ld enumC8780ld) {
        this.zzg = enumC8780ld.zza();
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(EnumC8994nd enumC8994nd) {
        this.zzf = enumC8994nd.zza();
        this.zze |= 1;
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
                                InterfaceC9993wv0<C9208pd> interfaceC9993wv0 = zzd;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C9208pd.class) {
                                        try {
                                            bu0 = zzd;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzc);
                                                zzd = bu0;
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
                        return zzc;
                    }
                    return new C8673kd();
                }
                return new C9208pd();
            }
            return Gu0.x(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", EnumC8994nd.b(), "zzg", EnumC8780ld.b()});
        }
        return (byte) 1;
    }
}
