package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class Q2 extends AbstractC10396e5 implements L5 {
    private static final Q2 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    final /* synthetic */ void G(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }

    static {
        Q2 q22 = new Q2();
        zzf = q22;
        AbstractC10396e5.t(Q2.class, q22);
    }

    public static P2 E() {
        return (P2) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new Q2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new P2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    private Q2() {
    }

    final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
