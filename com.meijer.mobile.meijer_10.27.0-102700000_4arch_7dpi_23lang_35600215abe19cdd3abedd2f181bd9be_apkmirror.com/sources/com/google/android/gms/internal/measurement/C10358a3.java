package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10358a3 extends AbstractC10396e5 implements L5 {
    private static final C10358a3 zzat;
    private int zzA;
    private boolean zzD;
    private int zzG;
    private int zzH;
    private int zzI;
    private long zzK;
    private long zzL;
    private int zzO;
    private C10385d3 zzQ;
    private long zzS;
    private long zzT;
    private int zzW;
    private boolean zzX;
    private boolean zzZ;
    private U2 zzaa;
    private long zzae;
    private boolean zzaf;
    private boolean zzah;
    private int zzaj;
    private A2 zzal;
    private int zzam;
    private C10554w2 zzan;
    private C10493p3 zzap;
    private long zzaq;
    private K2 zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private int zzq;
    private long zzu;
    private long zzv;
    private boolean zzx;
    private long zzz;
    private InterfaceC10477n5 zzf = AbstractC10396e5.z();
    private InterfaceC10477n5 zzg = AbstractC10396e5.z();
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzw = "";
    private String zzy = "";
    private String zzB = "";
    private String zzC = "";
    private InterfaceC10477n5 zzE = AbstractC10396e5.z();
    private String zzF = "";
    private String zzJ = "";
    private String zzM = "";
    private String zzN = "";
    private String zzP = "";
    private InterfaceC10459l5 zzR = AbstractC10396e5.w();
    private String zzU = "";
    private String zzV = "";
    private String zzY = "";
    private String zzab = "";
    private InterfaceC10477n5 zzac = AbstractC10396e5.z();
    private String zzad = "";
    private String zzag = "";
    private String zzai = "";
    private String zzak = "";
    private String zzao = "";
    private String zzar = "";

    final /* synthetic */ void A0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    public final String A2() {
        return this.zzm;
    }

    final /* synthetic */ void B0(long j10) {
        this.zzb |= 32;
        this.zzl = j10;
    }

    final /* synthetic */ void B1(int i10) {
        this.zzd |= 8388608;
        this.zzam = i10;
    }

    public final String B2() {
        return this.zzn;
    }

    final /* synthetic */ void C0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    public final String C2() {
        return this.zzo;
    }

    final /* synthetic */ void D0(String str) {
        this.zzb |= 64;
        this.zzm = "android";
    }

    final /* synthetic */ void D1(C10493p3 c10493p3) {
        this.zzap = c10493p3;
        this.zzd |= 67108864;
    }

    public final String D2() {
        return this.zzp;
    }

    public final String E() {
        return this.zzs;
    }

    final /* synthetic */ void E1(long j10) {
        this.zzd |= 134217728;
        this.zzaq = j10;
    }

    public final boolean E2() {
        return (this.zzb & 1024) != 0;
    }

    public final String F() {
        return this.zzt;
    }

    public final boolean F0() {
        return (this.zzd & 2) != 0;
    }

    final /* synthetic */ void F1(String str) {
        this.zzd |= 268435456;
        this.zzar = "";
    }

    public final int F2() {
        return this.zzq;
    }

    public final boolean G() {
        return (this.zzb & 16384) != 0;
    }

    public final int G0() {
        return this.zzO;
    }

    public final String G2() {
        return this.zzr;
    }

    public final long H() {
        return this.zzu;
    }

    public final boolean H0() {
        return (this.zzd & 16) != 0;
    }

    public final boolean I() {
        return (this.zzb & 32768) != 0;
    }

    public final long I0() {
        return this.zzS;
    }

    final /* synthetic */ void I1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    public final long J() {
        return this.zzv;
    }

    public final boolean J0() {
        return (this.zzd & 128) != 0;
    }

    public final String K() {
        return this.zzw;
    }

    public final String K0() {
        return this.zzV;
    }

    final /* synthetic */ void K1(int i10) {
        this.zzb |= 1024;
        this.zzq = i10;
    }

    public final boolean L() {
        return (this.zzb & 131072) != 0;
    }

    public final boolean L0() {
        return (this.zzd & 8192) != 0;
    }

    public final boolean M() {
        return this.zzx;
    }

    public final String M0() {
        return this.zzab;
    }

    public final String N() {
        return this.zzy;
    }

    public final boolean N0() {
        return (this.zzd & 32768) != 0;
    }

    public final boolean O() {
        return (this.zzb & 524288) != 0;
    }

    public final long O0() {
        return this.zzae;
    }

    final /* synthetic */ void O1(long j10) {
        this.zzb |= 16384;
        this.zzu = j10;
    }

    public final long P() {
        return this.zzz;
    }

    public final boolean P0() {
        return this.zzaf;
    }

    final /* synthetic */ void P1(long j10) {
        this.zzb |= 32768;
        this.zzv = 133005L;
    }

    public final boolean Q() {
        return (this.zzb & 1048576) != 0;
    }

    public final boolean Q0() {
        return (this.zzd & 131072) != 0;
    }

    public final int R() {
        return this.zzA;
    }

    public final String R0() {
        return this.zzag;
    }

    final /* synthetic */ void R1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }

    public final String S() {
        return this.zzB;
    }

    public final boolean S0() {
        return (this.zzd & 262144) != 0;
    }

    final /* synthetic */ void S1(boolean z10) {
        this.zzb |= 131072;
        this.zzx = z10;
    }

    public final String T() {
        return this.zzC;
    }

    public final boolean T0() {
        return this.zzah;
    }

    final /* synthetic */ void T1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    public final boolean U() {
        return (this.zzb & 8388608) != 0;
    }

    public final boolean U0() {
        return (this.zzd & 524288) != 0;
    }

    public final boolean V() {
        return this.zzD;
    }

    public final String V0() {
        return this.zzai;
    }

    final /* synthetic */ void V1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    public final List W() {
        return this.zzE;
    }

    public final int W0() {
        return this.zzaj;
    }

    final /* synthetic */ void W1(long j10) {
        this.zzb |= 524288;
        this.zzz = j10;
    }

    public final String X() {
        return this.zzF;
    }

    public final boolean X0() {
        return (this.zzd & 4194304) != 0;
    }

    final /* synthetic */ void X1(int i10) {
        this.zzb |= 1048576;
        this.zzA = i10;
    }

    public final boolean Y() {
        return (this.zzb & 33554432) != 0;
    }

    final /* synthetic */ void Y1(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    public final int Z() {
        return this.zzG;
    }

    public final boolean Z0() {
        return (this.zzd & 8388608) != 0;
    }

    final /* synthetic */ void Z1() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    public final boolean a0() {
        return (this.zzb & 536870912) != 0;
    }

    public final int a1() {
        return this.zzam;
    }

    public final long b0() {
        return this.zzK;
    }

    public final boolean b1() {
        return (this.zzd & 16777216) != 0;
    }

    final /* synthetic */ void b2(boolean z10) {
        this.zzb |= 8388608;
        this.zzD = z10;
    }

    public final boolean c0() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final String d0() {
        return this.zzM;
    }

    public final boolean d1() {
        return (this.zzd & 67108864) != 0;
    }

    public final boolean e0() {
        return (this.zzb & 1) != 0;
    }

    public final boolean f0() {
        return (this.zzd & 134217728) != 0;
    }

    public final int f1() {
        return this.zze;
    }

    final /* synthetic */ void f2(int i10) {
        this.zzb |= 33554432;
        this.zzG = i10;
    }

    public final long g0() {
        return this.zzaq;
    }

    final /* synthetic */ void g2() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    public final boolean h0() {
        return (this.zzd & 536870912) != 0;
    }

    final /* synthetic */ void h1(long j10) {
        this.zzb |= 536870912;
        this.zzK = j10;
    }

    public final List h2() {
        return this.zzf;
    }

    final /* synthetic */ void j1() {
        this.zzb &= a.e.API_PRIORITY_OTHER;
        this.zzM = zzat.zzM;
    }

    final /* synthetic */ void k1(int i10) {
        this.zzd |= 2;
        this.zzO = i10;
    }

    final /* synthetic */ void l0(int i10) {
        this.zzb |= 1;
        this.zze = 1;
    }

    final /* synthetic */ void n1(long j10) {
        this.zzd |= 16;
        this.zzS = j10;
    }

    public final List n2() {
        return this.zzg;
    }

    final /* synthetic */ void o1(long j10) {
        this.zzd |= 32;
        this.zzT = j10;
    }

    final /* synthetic */ void p1(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final boolean q2() {
        return (this.zzb & 2) != 0;
    }

    final /* synthetic */ void r1() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final long r2() {
        return this.zzh;
    }

    public final boolean s2() {
        return (this.zzb & 4) != 0;
    }

    public final long t2() {
        return this.zzi;
    }

    final /* synthetic */ void u1(long j10) {
        this.zzd |= 32768;
        this.zzae = j10;
    }

    public final boolean u2() {
        return (this.zzb & 8) != 0;
    }

    final /* synthetic */ void v0(long j10) {
        this.zzb |= 2;
        this.zzh = j10;
    }

    final /* synthetic */ void v1(boolean z10) {
        this.zzd |= 65536;
        this.zzaf = z10;
    }

    public final long v2() {
        return this.zzj;
    }

    final /* synthetic */ void w0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    final /* synthetic */ void w1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    public final boolean w2() {
        return (this.zzb & 16) != 0;
    }

    final /* synthetic */ void x0(long j10) {
        this.zzb |= 4;
        this.zzi = j10;
    }

    final /* synthetic */ void x1(boolean z10) {
        this.zzd |= 262144;
        this.zzah = z10;
    }

    public final long x2() {
        return this.zzk;
    }

    final /* synthetic */ void y0(long j10) {
        this.zzb |= 8;
        this.zzj = j10;
    }

    public final boolean y2() {
        return (this.zzb & 32) != 0;
    }

    final /* synthetic */ void z0(long j10) {
        this.zzb |= 16;
        this.zzk = j10;
    }

    final /* synthetic */ void z1(int i10) {
        this.zzd |= 1048576;
        this.zzaj = i10;
    }

    public final long z2() {
        return this.zzl;
    }

    static {
        C10358a3 c10358a3 = new C10358a3();
        zzat = c10358a3;
        AbstractC10396e5.t(C10358a3.class, c10358a3);
    }

    public static Z2 j0() {
        return (Z2) zzat.p();
    }

    private final void j2() {
        InterfaceC10477n5 interfaceC10477n5 = this.zzf;
        if (interfaceC10477n5.zza()) {
            return;
        }
        this.zzf = AbstractC10396e5.A(interfaceC10477n5);
    }

    public static Z2 k0(C10358a3 c10358a3) {
        C10360a5 c10360a5P = zzat.p();
        c10360a5P.r(c10358a3);
        return (Z2) c10360a5P;
    }

    private final void k2() {
        InterfaceC10477n5 interfaceC10477n5 = this.zzg;
        if (interfaceC10477n5.zza()) {
            return;
        }
        this.zzg = AbstractC10396e5.A(interfaceC10477n5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", O2.class, "zzg", C10510r3.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", C2.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", C10509r2.f82361a, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i11 == 3) {
            return new C10358a3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new Z2(bArr);
        }
        if (i11 == 5) {
            return zzat;
        }
        throw null;
    }

    public final A2 Y0() {
        A2 a22 = this.zzal;
        return a22 == null ? A2.M() : a22;
    }

    public final C10554w2 c1() {
        C10554w2 c10554w2 = this.zzan;
        return c10554w2 == null ? C10554w2.f0() : c10554w2;
    }

    final /* synthetic */ void c2(Iterable iterable) {
        InterfaceC10477n5 interfaceC10477n5 = this.zzE;
        if (!interfaceC10477n5.zza()) {
            this.zzE = AbstractC10396e5.A(interfaceC10477n5);
        }
        AbstractC10503q4.i(iterable, this.zzE);
    }

    public final C10493p3 e1() {
        C10493p3 c10493p3 = this.zzap;
        return c10493p3 == null ? C10493p3.G() : c10493p3;
    }

    public final K2 i0() {
        K2 k22 = this.zzas;
        return k22 == null ? K2.G() : k22;
    }

    public final int l2() {
        return this.zzf.size();
    }

    final /* synthetic */ void m1(Iterable iterable) {
        InterfaceC10459l5 interfaceC10459l5 = this.zzR;
        if (!interfaceC10459l5.zza()) {
            int size = interfaceC10459l5.size();
            this.zzR = interfaceC10459l5.zzg(size + size);
        }
        AbstractC10503q4.i(iterable, this.zzR);
    }

    public final O2 m2(int i10) {
        return (O2) this.zzf.get(i10);
    }

    public final int o2() {
        return this.zzg.size();
    }

    public final C10510r3 p2(int i10) {
        return (C10510r3) this.zzg.get(i10);
    }

    final /* synthetic */ void s1(Iterable iterable) {
        InterfaceC10477n5 interfaceC10477n5 = this.zzac;
        if (!interfaceC10477n5.zza()) {
            this.zzac = AbstractC10396e5.A(interfaceC10477n5);
        }
        AbstractC10503q4.i(iterable, this.zzac);
    }

    private C10358a3() {
    }

    final /* synthetic */ void A1(A2 a22) {
        a22.getClass();
        this.zzal = a22;
        this.zzd |= 4194304;
    }

    final /* synthetic */ void C1(C10554w2 c10554w2) {
        c10554w2.getClass();
        this.zzan = c10554w2;
        this.zzd |= 16777216;
    }

    final /* synthetic */ void E0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    final /* synthetic */ void G1(K2 k22) {
        k22.getClass();
        this.zzas = k22;
        this.zzd |= 536870912;
    }

    final /* synthetic */ void H1(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    final /* synthetic */ void J1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    final /* synthetic */ void L1(String str) {
        str.getClass();
        this.zzb |= RecyclerView.m.FLAG_MOVED;
        this.zzr = str;
    }

    final /* synthetic */ void M1(String str) {
        str.getClass();
        this.zzb |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        this.zzs = str;
    }

    final /* synthetic */ void N1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    final /* synthetic */ void Q1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzw = str;
    }

    final /* synthetic */ void U1(String str) {
        str.getClass();
        this.zzb |= 262144;
        this.zzy = str;
    }

    final /* synthetic */ void a2(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    final /* synthetic */ void d2() {
        this.zzE = AbstractC10396e5.z();
    }

    final /* synthetic */ void e2(String str) {
        str.getClass();
        this.zzb |= 16777216;
        this.zzF = str;
    }

    final /* synthetic */ void i1(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    final /* synthetic */ void l1(C10385d3 c10385d3) {
        c10385d3.getClass();
        this.zzQ = c10385d3;
        this.zzd |= 8;
    }

    final /* synthetic */ void m0(int i10, O2 o22) {
        o22.getClass();
        j2();
        this.zzf.set(i10, o22);
    }

    final /* synthetic */ void n0(O2 o22) {
        o22.getClass();
        j2();
        this.zzf.add(o22);
    }

    final /* synthetic */ void o0(Iterable iterable) {
        j2();
        AbstractC10503q4.i(iterable, this.zzf);
    }

    final /* synthetic */ void p0() {
        this.zzf = AbstractC10396e5.z();
    }

    final /* synthetic */ void q0(int i10) {
        j2();
        this.zzf.remove(i10);
    }

    final /* synthetic */ void q1(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    final /* synthetic */ void r0(int i10, C10510r3 c10510r3) {
        c10510r3.getClass();
        k2();
        this.zzg.set(i10, c10510r3);
    }

    final /* synthetic */ void s0(C10510r3 c10510r3) {
        c10510r3.getClass();
        k2();
        this.zzg.add(c10510r3);
    }

    final /* synthetic */ void t0(Iterable iterable) {
        k2();
        AbstractC10503q4.i(iterable, this.zzg);
    }

    final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    final /* synthetic */ void u0(int i10) {
        k2();
        this.zzg.remove(i10);
    }

    final /* synthetic */ void y1(String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }
}
