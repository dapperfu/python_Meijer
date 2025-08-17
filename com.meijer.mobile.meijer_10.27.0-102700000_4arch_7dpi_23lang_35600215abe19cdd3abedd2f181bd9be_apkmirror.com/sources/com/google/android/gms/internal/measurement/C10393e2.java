package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10393e2 extends AbstractC10396e5 implements L5 {
    private static final C10393e2 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public final String E() {
        return this.zzd;
    }

    public final boolean F() {
        return (this.zzb & 2) != 0;
    }

    public final boolean G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final boolean I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final int K() {
        return this.zzg;
    }

    static {
        C10393e2 c10393e2 = new C10393e2();
        zzh = c10393e2;
        AbstractC10396e5.t(C10393e2.class, c10393e2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C10393e2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10384d2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    private C10393e2() {
    }

    final /* synthetic */ void L(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
