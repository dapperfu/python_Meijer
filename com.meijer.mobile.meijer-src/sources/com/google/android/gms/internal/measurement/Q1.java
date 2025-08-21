package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class Q1 extends AbstractC10521e5 implements L5 {
    private static final Q1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    public final int F() {
        int iA = V1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int G() {
        int iA = V1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static {
        Q1 q12 = new Q1();
        zzf = q12;
        AbstractC10521e5.t(Q1.class, q12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC10566j5 interfaceC10566j5 = T1.f82829a;
            return AbstractC10521e5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", interfaceC10566j5, "zze", interfaceC10566j5});
        }
        if (i11 == 3) {
            return new Q1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new P1(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    private Q1() {
    }
}
