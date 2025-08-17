package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10554w2 extends AbstractC10396e5 implements L5 {
    private static final C10554w2 zzn;
    private int zzb;
    private long zzg;
    private long zzk;
    private E5 zzl = E5.a();
    private E5 zzm = E5.a();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    public static C10554w2 f0() {
        return zzn;
    }

    final /* synthetic */ void E(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    final /* synthetic */ void F() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    final /* synthetic */ void G(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    final /* synthetic */ void H() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    final /* synthetic */ void I(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    final /* synthetic */ void J() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    final /* synthetic */ void K(long j10) {
        this.zzb |= 128;
        this.zzk = j10;
    }

    public final boolean O() {
        return (this.zzb & 1) != 0;
    }

    public final String P() {
        return this.zzd;
    }

    public final boolean Q() {
        return (this.zzb & 2) != 0;
    }

    public final String R() {
        return this.zze;
    }

    public final boolean S() {
        return (this.zzb & 4) != 0;
    }

    public final String T() {
        return this.zzf;
    }

    public final boolean U() {
        return (this.zzb & 8) != 0;
    }

    public final long V() {
        return this.zzg;
    }

    public final boolean W() {
        return (this.zzb & 16) != 0;
    }

    public final String X() {
        return this.zzh;
    }

    public final boolean Y() {
        return (this.zzb & 32) != 0;
    }

    public final String Z() {
        return this.zzi;
    }

    public final boolean a0() {
        return (this.zzb & 64) != 0;
    }

    public final String b0() {
        return this.zzj;
    }

    public final boolean c0() {
        return (this.zzb & 128) != 0;
    }

    public final long d0() {
        return this.zzk;
    }

    final /* synthetic */ void g0(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void h0() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    final /* synthetic */ void i0(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void j0() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    final /* synthetic */ void k0(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    final /* synthetic */ void l0() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    final /* synthetic */ void m0(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }

    static {
        C10554w2 c10554w2 = new C10554w2();
        zzn = c10554w2;
        AbstractC10396e5.t(C10554w2.class, c10554w2);
    }

    public static C10518s2 e0() {
        return (C10518s2) zzn.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C10527t2.f82417a, "zzm", C10536u2.f82424a});
        }
        if (i11 == 3) {
            return new C10554w2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10518s2(bArr);
        }
        if (i11 == 5) {
            return zzn;
        }
        throw null;
    }

    final /* synthetic */ Map L() {
        if (!this.zzl.f()) {
            this.zzl = this.zzl.c();
        }
        return this.zzl;
    }

    final /* synthetic */ Map M() {
        if (!this.zzm.f()) {
            this.zzm = this.zzm.c();
        }
        return this.zzm;
    }

    private C10554w2() {
    }
}
