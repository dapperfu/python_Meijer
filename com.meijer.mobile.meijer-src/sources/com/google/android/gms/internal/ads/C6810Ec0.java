package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ec0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6810Ec0 extends Gu0 implements InterfaceC9352qv0 {
    private static final C6810Ec0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private C6674Ac0 zzg;

    static /* synthetic */ void f0(C6810Ec0 c6810Ec0, int i10) {
        c6810Ec0.zzd = 1;
        c6810Ec0.zzc = 1 | c6810Ec0.zzc;
    }

    static {
        C6810Ec0 c6810Ec0 = new C6810Ec0();
        zza = c6810Ec0;
        Gu0.E(C6810Ec0.class, c6810Ec0);
    }

    public static C6708Bc0 b0() {
        return (C6708Bc0) zza.n();
    }

    private C6810Ec0() {
    }

    static /* synthetic */ void d0(C6810Ec0 c6810Ec0, String str) {
        str.getClass();
        c6810Ec0.zzc |= 2;
        c6810Ec0.zze = str;
    }

    static /* synthetic */ void e0(C6810Ec0 c6810Ec0, C6674Ac0 c6674Ac0) {
        c6674Ac0.getClass();
        c6810Ec0.zzg = c6674Ac0;
        c6810Ec0.zzc |= 8;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C6776Dc0 c6776Dc0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C6810Ec0.class) {
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
                    return new C6708Bc0(c6776Dc0);
                }
                return new C6810Ec0();
            }
            return Gu0.x(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", C6742Cc0.f66653a, "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
