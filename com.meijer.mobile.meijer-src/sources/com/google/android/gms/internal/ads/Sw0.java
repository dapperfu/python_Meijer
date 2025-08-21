package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Sw0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Sw0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private Rw0 zzd;
    private Zt0 zzf;
    private Zt0 zzg;
    private int zzh;
    private byte zzi = 2;
    private Su0 zze = Gu0.s();

    static {
        Sw0 sw0 = new Sw0();
        zza = sw0;
        Gu0.E(Sw0.class, sw0);
    }

    public static Pw0 b0() {
        return (Pw0) zza.n();
    }

    private Sw0() {
        Zt0 zt0 = Zt0.f73122b;
        this.zzf = zt0;
        this.zzg = zt0;
    }

    static /* synthetic */ void d0(Sw0 sw0, Nw0 nw0) {
        nw0.getClass();
        Su0 su0 = sw0.zze;
        if (!su0.zzc()) {
            sw0.zze = Gu0.t(su0);
        }
        sw0.zze.add(nw0);
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        byte b10;
        InterfaceC9993wv0 bu0;
        Nx0 nx0 = null;
        switch (fu0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b10 = 0;
                } else {
                    b10 = 1;
                }
                this.zzi = b10;
                return null;
            case BUILD_MESSAGE_INFO:
                return Gu0.x(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", Nw0.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new Sw0();
            case NEW_BUILDER:
                return new Pw0(nx0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                if (interfaceC9993wv0 == null) {
                    synchronized (Sw0.class) {
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
            default:
                throw null;
        }
    }
}
