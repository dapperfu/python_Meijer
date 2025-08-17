package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class Y2 extends AbstractC10396e5 implements L5 {
    private static final Y2 zzh;
    private int zzb;
    private InterfaceC10477n5 zzd = AbstractC10396e5.z();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    public final List E() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzb & 1) != 0;
    }

    public final String I() {
        return this.zze;
    }

    public final boolean J() {
        return (this.zzb & 2) != 0;
    }

    public final String K() {
        return this.zzf;
    }

    static {
        Y2 y22 = new Y2();
        zzh = y22;
        AbstractC10396e5.t(Y2.class, y22);
    }

    public static V2 L() {
        return (V2) zzh.p();
    }

    public static V2 M(Y2 y22) {
        C10360a5 c10360a5P = zzh.p();
        c10360a5P.r(y22);
        return (V2) c10360a5P;
    }

    private final void U() {
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
            return AbstractC10396e5.u(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", C10358a3.class, "zze", "zzf", "zzg", X2.f82094a});
        }
        if (i11 == 3) {
            return new Y2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new V2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final int F() {
        return this.zzd.size();
    }

    public final C10358a3 G(int i10) {
        return (C10358a3) this.zzd.get(i10);
    }

    private Y2() {
    }

    final /* synthetic */ void N(int i10, C10358a3 c10358a3) {
        c10358a3.getClass();
        U();
        this.zzd.set(i10, c10358a3);
    }

    final /* synthetic */ void O(C10358a3 c10358a3) {
        c10358a3.getClass();
        U();
        this.zzd.add(c10358a3);
    }

    final /* synthetic */ void P(Iterable iterable) {
        U();
        AbstractC10503q4.i(iterable, this.zzd);
    }

    final /* synthetic */ void Q() {
        this.zzd = AbstractC10396e5.z();
    }

    final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
