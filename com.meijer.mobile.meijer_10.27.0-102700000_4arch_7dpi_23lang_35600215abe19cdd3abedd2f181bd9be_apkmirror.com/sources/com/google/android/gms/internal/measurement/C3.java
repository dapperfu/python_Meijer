package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class C3 extends AbstractC10396e5 implements L5 {
    private static final C3 zzj;
    private int zzb;
    private int zzd;
    private InterfaceC10477n5 zze = AbstractC10396e5.z();
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    public final List E() {
        return this.zze;
    }

    public final String F() {
        return this.zzf;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final String H() {
        return this.zzg;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final boolean J() {
        return this.zzh;
    }

    public final boolean K() {
        return (this.zzb & 16) != 0;
    }

    public final double L() {
        return this.zzi;
    }

    public final int N() {
        int iA = B3.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static {
        C3 c32 = new C3();
        zzj = c32;
        AbstractC10396e5.t(C3.class, c32);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", A3.f81656a, "zze", C3.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10582z3(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    private C3() {
    }
}
