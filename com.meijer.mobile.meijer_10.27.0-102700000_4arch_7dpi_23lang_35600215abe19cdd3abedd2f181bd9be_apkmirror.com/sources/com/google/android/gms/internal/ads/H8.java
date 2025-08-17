package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class H8 extends Gu0 implements InterfaceC9227qv0 {
    private static final H8 zza;
    private static volatile InterfaceC9868wv0 zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzI;
    private long zzJ;
    private long zzK;
    private long zzM;
    private K8 zzP;
    private C8 zzaG;
    private long zzaM;
    private C9573u8 zzaP;
    private C9787w8 zzaQ;
    private int zzaT;
    private long zzaU;
    private boolean zzaX;
    private long zzaZ;
    private E8 zzah;
    private G8 zzaj;
    private int zzau;
    private int zzav;
    private int zzaw;
    private int zzax;
    private V8 zzay;
    private T8 zzba;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzu;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzf = "";
    private String zzg = "";
    private String zzv = "";
    private String zzF = "";
    private String zzG = "D";
    private String zzH = "";
    private String zzL = "";
    private long zzN = -1;
    private long zzO = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private long zzV = -1;
    private String zzW = "D";
    private String zzX = "D";
    private long zzY = -1;
    private int zzZ = 1000;
    private int zzaa = 1000;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private long zzaf = -1;
    private int zzag = 1000;
    private Su0 zzai = Gu0.s();
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private long zzar = -1;
    private String zzas = "D";
    private long zzat = -1;
    private long zzaz = -1;
    private int zzaA = 1000;
    private int zzaB = 1000;
    private String zzaC = "D";
    private Su0 zzaD = Gu0.s();
    private int zzaE = 1000;
    private Su0 zzaF = Gu0.s();
    private String zzaH = "";
    private long zzaI = -1;
    private long zzaJ = -1;
    private long zzaK = -1;
    private long zzaL = -1;
    private long zzaN = -1;
    private String zzaO = "";
    private long zzaR = -1;
    private long zzaS = -1;
    private String zzaV = "";
    private int zzaW = 2;
    private String zzaY = "";
    private long zzbb = -1;
    private String zzbc = "";

    static /* synthetic */ void C0(H8 h82, long j10) {
        h82.zzc |= 67108864;
        h82.zzJ = j10;
    }

    static /* synthetic */ void D0(H8 h82, long j10) {
        h82.zzc |= 65536;
        h82.zzz = j10;
    }

    static /* synthetic */ void E0(H8 h82, long j10) {
        h82.zzc |= 2097152;
        h82.zzE = j10;
    }

    static /* synthetic */ void F0(H8 h82, long j10) {
        h82.zzc |= 134217728;
        h82.zzK = j10;
    }

    static /* synthetic */ void G0(H8 h82, long j10) {
        h82.zzc |= 33554432;
        h82.zzI = j10;
    }

    static /* synthetic */ void H0(H8 h82, long j10) {
        h82.zzc |= 536870912;
        h82.zzM = j10;
    }

    static /* synthetic */ void O0(H8 h82, int i10) {
        h82.zzaa = i10 - 1;
        h82.zzd |= RecyclerView.m.FLAG_MOVED;
    }

    static /* synthetic */ void P0(H8 h82, int i10) {
        h82.zzaW = 5;
        h82.zze |= 16777216;
    }

    static /* synthetic */ void Q0(H8 h82, int i10) {
        h82.zzag = i10 - 1;
        h82.zzd |= 131072;
    }

    static /* synthetic */ void R0(H8 h82, int i10) {
        h82.zzaB = i10 - 1;
        h82.zze |= 32;
    }

    static /* synthetic */ void S0(H8 h82, int i10) {
        h82.zzaT = i10 - 1;
        h82.zze |= 2097152;
    }

    static /* synthetic */ void T0(H8 h82, int i10) {
        h82.zzaA = i10 - 1;
        h82.zze |= 16;
    }

    static /* synthetic */ void U0(H8 h82, int i10) {
        h82.zzZ = i10 - 1;
        h82.zzd |= 1024;
    }

    public static H8 W0() {
        return zza;
    }

    static /* synthetic */ void c0(H8 h82, long j10) {
        h82.zze |= 134217728;
        h82.zzaZ = j10;
    }

    static /* synthetic */ void d0(H8 h82, long j10) {
        h82.zze |= 8192;
        h82.zzaL = j10;
    }

    static /* synthetic */ void d1(H8 h82, long j10) {
        h82.zzd |= 67108864;
        h82.zzaq = j10;
    }

    static /* synthetic */ void e0(H8 h82, long j10) {
        h82.zze |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        h82.zzaK = j10;
    }

    static /* synthetic */ void f1(H8 h82, long j10) {
        h82.zzd |= 134217728;
        h82.zzar = j10;
    }

    static /* synthetic */ void g1(H8 h82, long j10) {
        h82.zze |= RecyclerView.m.FLAG_MOVED;
        h82.zzaJ = j10;
    }

    static /* synthetic */ void h0(H8 h82, long j10) {
        h82.zzc |= 1048576;
        h82.zzD = j10;
    }

    static /* synthetic */ void i0(H8 h82, long j10) {
        h82.zzc |= 1024;
        h82.zzp = j10;
    }

    static /* synthetic */ void j0(H8 h82, long j10) {
        h82.zzc |= RecyclerView.m.FLAG_MOVED;
        h82.zzu = j10;
    }

    static /* synthetic */ void k1(H8 h82, long j10) {
        h82.zzc |= 4;
        h82.zzh = j10;
    }

    static /* synthetic */ void l0(H8 h82, long j10) {
        h82.zzd |= 4194304;
        h82.zzam = j10;
    }

    static /* synthetic */ void l1(H8 h82, long j10) {
        h82.zzd |= 2097152;
        h82.zzal = j10;
    }

    static /* synthetic */ void m0(H8 h82, long j10) {
        h82.zzc |= 524288;
        h82.zzC = j10;
    }

    static /* synthetic */ void m1(H8 h82, long j10) {
        h82.zzc |= 32;
        h82.zzk = j10;
    }

    static /* synthetic */ void n0(H8 h82, long j10) {
        h82.zzd |= 8388608;
        h82.zzan = j10;
    }

    static /* synthetic */ void n1(H8 h82, long j10) {
        h82.zzc |= 16;
        h82.zzj = j10;
    }

    static /* synthetic */ void o0(H8 h82, long j10) {
        h82.zzd |= 64;
        h82.zzV = j10;
    }

    static /* synthetic */ void p0(H8 h82, long j10) {
        h82.zzd |= 16;
        h82.zzT = j10;
    }

    static /* synthetic */ void p1(H8 h82, long j10) {
        h82.zzd |= 32;
        h82.zzU = j10;
    }

    static /* synthetic */ void q0(H8 h82, long j10) {
        h82.zzc |= Integer.MIN_VALUE;
        h82.zzO = j10;
    }

    static /* synthetic */ void q1(H8 h82, long j10) {
        h82.zzd |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        h82.zzab = j10;
    }

    static /* synthetic */ void r0(H8 h82, long j10) {
        h82.zzd |= 8;
        h82.zzS = j10;
    }

    static /* synthetic */ void r1(H8 h82, long j10) {
        h82.zzd |= 8192;
        h82.zzac = j10;
    }

    static /* synthetic */ void s0(H8 h82, long j10) {
        h82.zzd |= 4;
        h82.zzR = j10;
    }

    static /* synthetic */ void s1(H8 h82, boolean z10) {
        h82.zze |= 33554432;
        h82.zzaX = z10;
    }

    static /* synthetic */ void t0(H8 h82, long j10) {
        h82.zzc |= 1073741824;
        h82.zzN = j10;
    }

    static /* synthetic */ void u0(H8 h82, long j10) {
        h82.zzc |= 32768;
        h82.zzy = j10;
    }

    static /* synthetic */ void v0(H8 h82, long j10) {
        h82.zzd |= 2;
        h82.zzQ = j10;
    }

    static /* synthetic */ void w0(H8 h82, long j10) {
        h82.zzc |= 8192;
        h82.zzw = j10;
    }

    static /* synthetic */ void x0(H8 h82, long j10) {
        h82.zzc |= 16384;
        h82.zzx = j10;
    }

    static /* synthetic */ void y0(H8 h82, long j10) {
        h82.zzd |= 16384;
        h82.zzad = j10;
    }

    static /* synthetic */ void z0(H8 h82, long j10) {
        h82.zze |= 1024;
        h82.zzaI = j10;
    }

    public final boolean K0() {
        return this.zzaX;
    }

    public final boolean L0() {
        return (this.zzc & 4194304) != 0;
    }

    public final boolean M0() {
        return (this.zze & 268435456) != 0;
    }

    public final int N0() {
        int iA = C9146q8.a(this.zzaW);
        if (iA == 0) {
            return 3;
        }
        return iA;
    }

    public final String Z0() {
        return this.zzaV;
    }

    public final String a1() {
        return this.zzF;
    }

    static {
        H8 h82 = new H8();
        zza = h82;
        Gu0.E(H8.class, h82);
    }

    public static C8611l8 B0() {
        return (C8611l8) zza.n();
    }

    public static H8 X0(byte[] bArr, C9225qu0 c9225qu0) throws zzgyg {
        return (H8) Gu0.P(zza, bArr, c9225qu0);
    }

    public final T8 Y0() {
        T8 t82 = this.zzba;
        return t82 == null ? T8.d0() : t82;
    }

    private H8() {
    }

    static /* synthetic */ void A0(H8 h82, E8 e82) {
        e82.getClass();
        h82.zzah = e82;
        h82.zzd |= 262144;
    }

    static /* synthetic */ void I0(H8 h82, G8 g82) {
        g82.getClass();
        h82.zzaj = g82;
        h82.zzd |= 524288;
    }

    static /* synthetic */ void J0(H8 h82, String str) {
        str.getClass();
        h82.zzc |= 268435456;
        h82.zzL = str;
    }

    static /* synthetic */ void b0(H8 h82, String str) {
        str.getClass();
        h82.zze |= 8388608;
        h82.zzaV = str;
    }

    static /* synthetic */ void b1(H8 h82, E8 e82) {
        e82.getClass();
        Su0 su0 = h82.zzai;
        if (!su0.zzc()) {
            h82.zzai = Gu0.t(su0);
        }
        h82.zzai.add(e82);
    }

    static /* synthetic */ void e1(H8 h82, String str) {
        str.getClass();
        h82.zzd |= 268435456;
        h82.zzas = str;
    }

    static /* synthetic */ void f0(H8 h82, String str) {
        str.getClass();
        h82.zzd |= 256;
        h82.zzX = str;
    }

    static /* synthetic */ void g0(H8 h82, String str) {
        str.getClass();
        h82.zzc |= 4194304;
        h82.zzF = str;
    }

    static /* synthetic */ void h1(H8 h82, String str) {
        str.getClass();
        h82.zze |= 65536;
        h82.zzaO = str;
    }

    static /* synthetic */ void i1(H8 h82, String str) {
        str.getClass();
        h82.zzc |= 2;
        h82.zzg = str;
    }

    static /* synthetic */ void j1(H8 h82, String str) {
        str.getClass();
        h82.zzd |= 128;
        h82.zzW = str;
    }

    static /* synthetic */ void k0(H8 h82, String str) {
        str.getClass();
        h82.zzc |= 1;
        h82.zzf = str;
    }

    static /* synthetic */ void o1(H8 h82, String str) {
        str.getClass();
        h82.zzc |= 16777216;
        h82.zzH = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Y8 y82 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0 interfaceC9868wv0 = zzb;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (H8.class) {
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
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new C8611l8(y82);
                }
                return new H8();
            }
            Mu0 mu0 = C9039p8.f77512a;
            Mu0 mu02 = O8.f69009a;
            return Gu0.x(zza, "\u0001b\u0000\u0003\u0001Įb\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂV\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈW\u0019ဂ[\u001a᠌X\u001bဈ\u0016\u001cဇY\u001dဈ\u0018\u001eဈZ\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈISဂJTဂKUဂLVဂMWဂNXဂOYဈPZဉQ[ဉR\\ဂS]ဂT^᠌U_᠌@Éဉ\\ĭဂ]Įဈ^", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzaU", "zzD", "zzE", "zzaV", "zzaZ", "zzaW", mu0, "zzF", "zzaX", "zzH", "zzaY", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzai", E8.class, "zzU", "zzV", "zzW", "zzX", "zzZ", mu02, "zzaa", mu02, "zzah", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", mu02, "zzaj", "zzak", "zzal", "zzam", "zzan", "zzaq", "zzar", "zzat", "zzau", N8.f68822a, "zzav", R8.f69789a, "zzas", "zzax", C8718m8.f76744a, "zzay", "zzaz", "zzao", "zzap", "zzaA", mu02, "zzY", "zzG", "zzaB", mu02, "zzaC", "zzaD", A8.class, "zzaE", mu02, "zzaF", C8932o8.class, "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", "zzaT", C9894x8.f79683a, "zzaw", C9252r8.f77947a, "zzba", "zzbb", "zzbc"});
        }
        return (byte) 1;
    }
}
