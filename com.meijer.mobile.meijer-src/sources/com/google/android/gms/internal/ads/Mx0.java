package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Mx0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Mx0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private boolean zzj;
    private double zzk;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;
    private String zzd = "";
    private String zze = "";
    private int zzf = 4;
    private Su0 zzg = Gu0.s();
    private String zzh = "";
    private String zzi = "";
    private Su0 zzl = Gu0.s();

    static {
        Mx0 mx0 = new Mx0();
        zza = mx0;
        Gu0.E(Mx0.class, mx0);
    }

    private Mx0() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Nx0 nx0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Mx0.class) {
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
                    return new Hx0(nx0);
                }
                return new Mx0();
            }
            return Gu0.x(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", Lx0.f69297a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", Kx0.class, "zze", "zzm", Ix0.f68574a, "zzn", "zzo", "zzp", "zzu"});
        }
        return (byte) 1;
    }
}
