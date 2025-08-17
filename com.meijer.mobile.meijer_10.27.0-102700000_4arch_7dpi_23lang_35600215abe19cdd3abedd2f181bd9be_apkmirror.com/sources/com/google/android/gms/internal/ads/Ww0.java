package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Ww0 extends Gu0 implements InterfaceC9227qv0 {
    private static final Ww0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private Vw0 zzd;
    private Zt0 zzf;
    private Zt0 zzg;
    private int zzh;
    private Zt0 zzi;
    private byte zzj = 2;
    private Su0 zze = Gu0.s();

    static {
        Ww0 ww0 = new Ww0();
        zza = ww0;
        Gu0.E(Ww0.class, ww0);
    }

    private Ww0() {
        Zt0 zt0 = Zt0.f72282b;
        this.zzf = zt0;
        this.zzg = zt0;
        this.zzi = zt0;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        byte b10;
        InterfaceC9868wv0 bu0;
        Nx0 nx0 = null;
        switch (fu0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzj);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b10 = 0;
                } else {
                    b10 = 1;
                }
                this.zzj = b10;
                return null;
            case BUILD_MESSAGE_INFO:
                return Gu0.x(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", Nw0.class, "zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new Ww0();
            case NEW_BUILDER:
                return new Tw0(nx0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                if (interfaceC9868wv0 == null) {
                    synchronized (Ww0.class) {
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
                return interfaceC9868wv0;
            default:
                throw null;
        }
    }
}
