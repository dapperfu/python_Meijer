package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class S2 extends AbstractC10396e5 implements L5 {
    private static final S2 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private InterfaceC10477n5 zzi = AbstractC10396e5.z();

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final String F() {
        return this.zzd;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final long J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final float L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzb & 16) != 0;
    }

    public final double N() {
        return this.zzh;
    }

    public final List O() {
        return this.zzi;
    }

    final /* synthetic */ void T() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    final /* synthetic */ void U(long j10) {
        this.zzb |= 4;
        this.zzf = j10;
    }

    final /* synthetic */ void V() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    final /* synthetic */ void W(double d10) {
        this.zzb |= 16;
        this.zzh = d10;
    }

    final /* synthetic */ void X() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    static {
        S2 s22 = new S2();
        zzj = s22;
        AbstractC10396e5.t(S2.class, s22);
    }

    public static R2 Q() {
        return (R2) zzj.p();
    }

    private final void c0() {
        InterfaceC10477n5 interfaceC10477n5 = this.zzi;
        if (interfaceC10477n5.zza()) {
            return;
        }
        this.zzi = AbstractC10396e5.A(interfaceC10477n5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", S2.class});
        }
        if (i11 == 3) {
            return new S2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new R2(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final int P() {
        return this.zzi.size();
    }

    private S2() {
    }

    final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void Y(S2 s22) {
        s22.getClass();
        c0();
        this.zzi.add(s22);
    }

    final /* synthetic */ void Z(Iterable iterable) {
        c0();
        AbstractC10503q4.i(iterable, this.zzi);
    }

    final /* synthetic */ void a0() {
        this.zzi = AbstractC10396e5.z();
    }
}
