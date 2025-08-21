package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10635r3 extends AbstractC10521e5 implements L5 {
    private static final C10635r3 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final long F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final String I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final long K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzb & 16) != 0;
    }

    public final float M() {
        return this.zzh;
    }

    public final boolean N() {
        return (this.zzb & 32) != 0;
    }

    public final double O() {
        return this.zzi;
    }

    final /* synthetic */ void Q(long j10) {
        this.zzb |= 1;
        this.zzd = j10;
    }

    final /* synthetic */ void T() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    final /* synthetic */ void U(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }

    final /* synthetic */ void V() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    final /* synthetic */ void W(double d10) {
        this.zzb |= 32;
        this.zzi = d10;
    }

    final /* synthetic */ void X() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }

    static {
        C10635r3 c10635r3 = new C10635r3();
        zzj = c10635r3;
        AbstractC10521e5.t(C10635r3.class, c10635r3);
    }

    public static C10627q3 P() {
        return (C10627q3) zzj.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C10635r3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10627q3(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    private C10635r3() {
    }

    final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }
}
