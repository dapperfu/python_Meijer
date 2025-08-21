package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Sr0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Sr0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private Vr0 zzd;
    private int zze;
    private int zzf;

    public static Sr0 f0() {
        return zza;
    }

    public final int b0() {
        return this.zze;
    }

    public final int c0() {
        return this.zzf;
    }

    static {
        Sr0 sr0 = new Sr0();
        zza = sr0;
        Gu0.E(Sr0.class, sr0);
    }

    public static Qr0 d0() {
        return (Qr0) zza.n();
    }

    public static Sr0 g0(Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        return (Sr0) Gu0.N(zza, zt0, c9350qu0);
    }

    public final Vr0 h0() {
        Vr0 vr0 = this.zzd;
        return vr0 == null ? Vr0.f0() : vr0;
    }

    private Sr0() {
    }

    static /* synthetic */ void j0(Sr0 sr0, Vr0 vr0) {
        vr0.getClass();
        sr0.zzd = vr0;
        sr0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Rr0 rr0 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (Sr0.class) {
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
                    return new Qr0(rr0);
                }
                return new Sr0();
            }
            return Gu0.x(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
