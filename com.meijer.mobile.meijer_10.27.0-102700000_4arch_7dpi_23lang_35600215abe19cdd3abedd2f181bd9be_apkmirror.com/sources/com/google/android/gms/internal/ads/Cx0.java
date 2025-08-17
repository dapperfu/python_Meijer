package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes6.dex */
public final class Cx0 extends Gu0 implements InterfaceC9227qv0 {
    private static final Cx0 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private C10086yx0 zzC;
    private Hw0 zzE;
    private C10191zw0 zzG;
    private C7630bx0 zzI;
    private int zzJ;
    private long zzM;
    private Bx0 zzN;
    private C8163gx0 zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private Dw0 zzi;
    private C8803mx0 zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private C9658ux0 zzx;
    private boolean zzy;
    private byte zzQ = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private Su0 zzj = Gu0.s();
    private Su0 zzk = Gu0.s();
    private String zzl = "";
    private Su0 zzo = Gu0.s();
    private String zzp = "";
    private Zt0 zzw = Zt0.f72282b;
    private String zzz = "";
    private Su0 zzA = Gu0.s();
    private Su0 zzB = Gu0.s();
    private Su0 zzD = Gu0.s();
    private String zzF = "";
    private Su0 zzH = Gu0.s();
    private Su0 zzK = Gu0.s();
    private Su0 zzL = Gu0.s();
    private String zzP = "";

    static /* synthetic */ void j0(Cx0 cx0) {
        cx0.zzc &= -65;
        cx0.zzl = zza.zzl;
    }

    static /* synthetic */ void k0(Cx0 cx0, String str) {
        cx0.zzc |= 64;
        cx0.zzl = str;
    }

    static /* synthetic */ void q0(Cx0 cx0, int i10) {
        cx0.zzd = i10 - 1;
        cx0.zzc |= 1;
    }

    public final String d0() {
        return this.zzl;
    }

    public final String e0() {
        return this.zzf;
    }

    public final List f0() {
        return this.zzj;
    }

    static {
        Cx0 cx0 = new Cx0();
        zza = cx0;
        Gu0.E(Cx0.class, cx0);
    }

    public static Bw0 b0() {
        return (Bw0) zza.n();
    }

    static /* synthetic */ void g0(Cx0 cx0, Iterable iterable) {
        Su0 su0 = cx0.zzA;
        if (!su0.zzc()) {
            cx0.zzA = Gu0.t(su0);
        }
        Ht0.g(iterable, cx0.zzA);
    }

    static /* synthetic */ void h0(Cx0 cx0, Iterable iterable) {
        Su0 su0 = cx0.zzB;
        if (!su0.zzc()) {
            cx0.zzB = Gu0.t(su0);
        }
        Ht0.g(iterable, cx0.zzB);
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        Nx0 nx0 = null;
        switch (fu0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return Gu0.x(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", C9444sx0.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", C8910nx0.f77268a, "zze", Aw0.f65367a, "zzi", "zzl", "zzm", "zzw", "zzk", Gx0.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", Mx0.class, "zzE", "zzF", "zzG", "zzH", Lw0.class, "zzI", "zzJ", C9872wx0.f79621a, "zzK", C7949ex0.class, "zzL", C8482jx0.class, "zzM", "zzN", "zzO", "zzP"});
            case NEW_MUTABLE_INSTANCE:
                return new Cx0();
            case NEW_BUILDER:
                return new Bw0(nx0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                if (interfaceC9868wv0 != null) {
                    return interfaceC9868wv0;
                }
                synchronized (Cx0.class) {
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
            default:
                throw null;
        }
    }

    private Cx0() {
    }

    static /* synthetic */ void i0(Cx0 cx0, C9444sx0 c9444sx0) {
        c9444sx0.getClass();
        Su0 su0 = cx0.zzj;
        if (!su0.zzc()) {
            cx0.zzj = Gu0.t(su0);
        }
        cx0.zzj.add(c9444sx0);
    }

    static /* synthetic */ void l0(Cx0 cx0, C9658ux0 c9658ux0) {
        c9658ux0.getClass();
        cx0.zzx = c9658ux0;
        cx0.zzc |= 8192;
    }

    static /* synthetic */ void m0(Cx0 cx0, Dw0 dw0) {
        dw0.getClass();
        cx0.zzi = dw0;
        cx0.zzc |= 32;
    }

    static /* synthetic */ void n0(Cx0 cx0, String str) {
        str.getClass();
        cx0.zzc |= 8;
        cx0.zzg = str;
    }

    static /* synthetic */ void o0(Cx0 cx0, C8803mx0 c8803mx0) {
        c8803mx0.getClass();
        cx0.zzm = c8803mx0;
        cx0.zzc |= 128;
    }

    static /* synthetic */ void p0(Cx0 cx0, String str) {
        str.getClass();
        cx0.zzc |= 4;
        cx0.zzf = str;
    }
}
