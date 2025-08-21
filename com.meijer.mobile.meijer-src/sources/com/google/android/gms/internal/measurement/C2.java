package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class C2 extends AbstractC10521e5 implements L5 {
    private static final C2 zzh;
    private int zzb;
    private int zzd;
    private C10528f3 zze;
    private C10528f3 zzf;
    private boolean zzg;

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final boolean K() {
        return this.zzg;
    }

    final /* synthetic */ void M(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void O(C10528f3 c10528f3) {
        this.zzf = c10528f3;
        this.zzb |= 4;
    }

    final /* synthetic */ void P(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }

    static {
        C2 c22 = new C2();
        zzh = c22;
        AbstractC10521e5.t(C2.class, c22);
    }

    public static B2 L() {
        return (B2) zzh.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new B2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final C10528f3 G() {
        C10528f3 c10528f3 = this.zze;
        return c10528f3 == null ? C10528f3.N() : c10528f3;
    }

    public final C10528f3 I() {
        C10528f3 c10528f3 = this.zzf;
        return c10528f3 == null ? C10528f3.N() : c10528f3;
    }

    private C2() {
    }

    final /* synthetic */ void N(C10528f3 c10528f3) {
        c10528f3.getClass();
        this.zze = c10528f3;
        this.zzb |= 2;
    }
}
