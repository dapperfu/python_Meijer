package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sx0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9444sx0 extends Gu0 implements InterfaceC9227qv0 {
    private static final C9444sx0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private int zzc;
    private int zzd;
    private Sw0 zzf;
    private Ww0 zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private Ou0 zzi = Gu0.o();
    private String zzj = "";
    private Su0 zzl = Gu0.s();

    static /* synthetic */ void g0(C9444sx0 c9444sx0, int i10) {
        c9444sx0.zzc |= 1;
        c9444sx0.zzd = i10;
    }

    static /* synthetic */ void j0(C9444sx0 c9444sx0, int i10) {
        c9444sx0.zzk = i10 - 1;
        c9444sx0.zzc |= 64;
    }

    public final String e0() {
        return this.zze;
    }

    static {
        C9444sx0 c9444sx0 = new C9444sx0();
        zza = c9444sx0;
        Gu0.E(C9444sx0.class, c9444sx0);
    }

    public static C9337rx0 c0() {
        return (C9337rx0) zza.n();
    }

    public final int b0() {
        return this.zzl.size();
    }

    private C9444sx0() {
    }

    static /* synthetic */ void f0(C9444sx0 c9444sx0, String str) {
        str.getClass();
        Su0 su0 = c9444sx0.zzl;
        if (!su0.zzc()) {
            c9444sx0.zzl = Gu0.t(su0);
        }
        c9444sx0.zzl.add(str);
    }

    static /* synthetic */ void h0(C9444sx0 c9444sx0, Sw0 sw0) {
        sw0.getClass();
        c9444sx0.zzf = sw0;
        c9444sx0.zzc |= 4;
    }

    static /* synthetic */ void i0(C9444sx0 c9444sx0, String str) {
        str.getClass();
        c9444sx0.zzc |= 2;
        c9444sx0.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        byte b10;
        InterfaceC9868wv0 bu0;
        Nx0 nx0 = null;
        switch (fu0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzm);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b10 = 0;
                } else {
                    b10 = 1;
                }
                this.zzm = b10;
                return null;
            case BUILD_MESSAGE_INFO:
                return Gu0.x(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C9017ox0.f77450a, "zzl"});
            case NEW_MUTABLE_INSTANCE:
                return new C9444sx0();
            case NEW_BUILDER:
                return new C9337rx0(nx0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                if (interfaceC9868wv0 == null) {
                    synchronized (C9444sx0.class) {
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
