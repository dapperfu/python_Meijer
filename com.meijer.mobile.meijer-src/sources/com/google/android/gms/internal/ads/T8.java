package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class T8 extends Gu0 implements InterfaceC9352qv0 {
    private static final T8 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private Zt0 zzf = Zt0.f73122b;

    public static T8 d0() {
        return zza;
    }

    public final long b0() {
        return this.zzd;
    }

    public final Zt0 e0() {
        return this.zzf;
    }

    public final String f0() {
        return this.zze;
    }

    public final boolean g0() {
        return (this.zzc & 1) != 0;
    }

    static {
        T8 t82 = new T8();
        zza = t82;
        Gu0.E(T8.class, t82);
    }

    private T8() {
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Y8 y82 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (T8.class) {
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
                    return new S8(y82);
                }
                return new T8();
            }
            return Gu0.x(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
