package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class O2 extends AbstractC10396e5 implements L5 {
    private static final O2 zzj;
    private int zzb;
    private InterfaceC10477n5 zzd = AbstractC10396e5.z();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    public final List E() {
        return this.zzd;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 2) != 0;
    }

    public final long J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 4) != 0;
    }

    public final long L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzb & 8) != 0;
    }

    public final int N() {
        return this.zzh;
    }

    final /* synthetic */ void V(long j10) {
        this.zzb |= 2;
        this.zzf = j10;
    }

    final /* synthetic */ void W(long j10) {
        this.zzb |= 4;
        this.zzg = j10;
    }

    final /* synthetic */ void X(long j10) {
        this.zzb |= 16;
        this.zzi = j10;
    }

    static {
        O2 o22 = new O2();
        zzj = o22;
        AbstractC10396e5.t(O2.class, o22);
    }

    public static N2 O() {
        return (N2) zzj.p();
    }

    private final void Z() {
        InterfaceC10477n5 interfaceC10477n5 = this.zzd;
        if (interfaceC10477n5.zza()) {
            return;
        }
        this.zzd = AbstractC10396e5.A(interfaceC10477n5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", S2.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new O2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new N2(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final int F() {
        return this.zzd.size();
    }

    public final S2 G(int i10) {
        return (S2) this.zzd.get(i10);
    }

    private O2() {
    }

    final /* synthetic */ void P(int i10, S2 s22) {
        s22.getClass();
        Z();
        this.zzd.set(i10, s22);
    }

    final /* synthetic */ void Q(S2 s22) {
        s22.getClass();
        Z();
        this.zzd.add(s22);
    }

    final /* synthetic */ void R(Iterable iterable) {
        Z();
        AbstractC10503q4.i(iterable, this.zzd);
    }

    final /* synthetic */ void S() {
        this.zzd = AbstractC10396e5.z();
    }

    final /* synthetic */ void T(int i10) {
        Z();
        this.zzd.remove(i10);
    }

    final /* synthetic */ void U(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
