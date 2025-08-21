package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class L1 extends AbstractC10521e5 implements L5 {
    private static final L1 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private InterfaceC10602n5 zzg = AbstractC10521e5.z();

    public static L1 L() {
        return zzh;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final boolean F() {
        return (this.zzb & 2) != 0;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final boolean I() {
        return this.zzf;
    }

    public final List J() {
        return this.zzg;
    }

    public final int N() {
        int iA = K1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static {
        L1 l12 = new L1();
        zzh = l12;
        AbstractC10521e5.t(L1.class, l12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", J1.f82644a, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new L1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new I1(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final int K() {
        return this.zzg.size();
    }

    private L1() {
    }
}
