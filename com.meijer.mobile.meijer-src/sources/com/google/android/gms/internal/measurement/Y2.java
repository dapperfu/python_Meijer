package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class Y2 extends AbstractC10521e5 implements L5 {
    private static final Y2 zzh;
    private int zzb;
    private InterfaceC10602n5 zzd = AbstractC10521e5.z();
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
        AbstractC10521e5.t(Y2.class, y22);
    }

    public static V2 L() {
        return (V2) zzh.p();
    }

    public static V2 M(Y2 y22) {
        C10485a5 c10485a5P = zzh.p();
        c10485a5P.r(y22);
        return (V2) c10485a5P;
    }

    private final void U() {
        InterfaceC10602n5 interfaceC10602n5 = this.zzd;
        if (interfaceC10602n5.zza()) {
            return;
        }
        this.zzd = AbstractC10521e5.A(interfaceC10602n5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", C10483a3.class, "zze", "zzf", "zzg", X2.f82934a});
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

    public final C10483a3 G(int i10) {
        return (C10483a3) this.zzd.get(i10);
    }

    private Y2() {
    }

    final /* synthetic */ void N(int i10, C10483a3 c10483a3) {
        c10483a3.getClass();
        U();
        this.zzd.set(i10, c10483a3);
    }

    final /* synthetic */ void O(C10483a3 c10483a3) {
        c10483a3.getClass();
        U();
        this.zzd.add(c10483a3);
    }

    final /* synthetic */ void P(Iterable iterable) {
        U();
        AbstractC10628q4.i(iterable, this.zzd);
    }

    final /* synthetic */ void Q() {
        this.zzd = AbstractC10521e5.z();
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
