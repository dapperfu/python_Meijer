package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Nw0 extends Gu0 implements InterfaceC9352qv0 {
    private static final Nw0 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private Zt0 zzd;
    private Zt0 zze;
    private byte zzf = 2;

    static /* synthetic */ void d0(Nw0 nw0, Zt0 zt0) {
        nw0.zzc |= 1;
        nw0.zzd = zt0;
    }

    static /* synthetic */ void e0(Nw0 nw0, Zt0 zt0) {
        nw0.zzc |= 2;
        nw0.zze = zt0;
    }

    static {
        Nw0 nw0 = new Nw0();
        zza = nw0;
        Gu0.E(Nw0.class, nw0);
    }

    public static Mw0 b0() {
        return (Mw0) zza.n();
    }

    private Nw0() {
        Zt0 zt0 = Zt0.f73122b;
        this.zzd = zt0;
        this.zze = zt0;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        byte b10;
        InterfaceC9993wv0 bu0;
        Nx0 nx0 = null;
        switch (fu0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b10 = 0;
                } else {
                    b10 = 1;
                }
                this.zzf = b10;
                return null;
            case BUILD_MESSAGE_INFO:
                return Gu0.x(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new Nw0();
            case NEW_BUILDER:
                return new Mw0(nx0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                if (interfaceC9993wv0 == null) {
                    synchronized (Nw0.class) {
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
