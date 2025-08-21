package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class M2 extends AbstractC10521e5 implements L5 {
    private static final M2 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final long H() {
        return this.zze;
    }

    final /* synthetic */ void J(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void K(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }

    static {
        M2 m22 = new M2();
        zzf = m22;
        AbstractC10521e5.t(M2.class, m22);
    }

    public static L2 I() {
        return (L2) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new M2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new L2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    private M2() {
    }
}
