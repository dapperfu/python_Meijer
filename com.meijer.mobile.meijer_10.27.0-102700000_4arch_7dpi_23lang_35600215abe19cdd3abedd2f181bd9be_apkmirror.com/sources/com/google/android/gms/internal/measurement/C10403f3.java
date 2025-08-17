package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10403f3 extends AbstractC10396e5 implements L5 {
    private static final C10403f3 zzg;
    private InterfaceC10468m5 zzb = AbstractC10396e5.x();
    private InterfaceC10468m5 zzd = AbstractC10396e5.x();
    private InterfaceC10477n5 zze = AbstractC10396e5.z();
    private InterfaceC10477n5 zzf = AbstractC10396e5.z();

    public static C10403f3 N() {
        return zzg;
    }

    public final List E() {
        return this.zzb;
    }

    public final List G() {
        return this.zzd;
    }

    public final List I() {
        return this.zze;
    }

    public final List K() {
        return this.zzf;
    }

    static {
        C10403f3 c10403f3 = new C10403f3();
        zzg = c10403f3;
        AbstractC10396e5.t(C10403f3.class, c10403f3);
    }

    public static C10394e3 M() {
        return (C10394e3) zzg.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", M2.class, "zzf", C10421h3.class});
        }
        if (i11 == 3) {
            return new C10403f3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10394e3(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int F() {
        return this.zzb.size();
    }

    public final int H() {
        return this.zzd.size();
    }

    public final int J() {
        return this.zze.size();
    }

    public final int L() {
        return this.zzf.size();
    }

    final /* synthetic */ void O(Iterable iterable) {
        InterfaceC10468m5 interfaceC10468m5 = this.zzb;
        if (!interfaceC10468m5.zza()) {
            this.zzb = AbstractC10396e5.y(interfaceC10468m5);
        }
        AbstractC10503q4.i(iterable, this.zzb);
    }

    final /* synthetic */ void Q(Iterable iterable) {
        InterfaceC10468m5 interfaceC10468m5 = this.zzd;
        if (!interfaceC10468m5.zza()) {
            this.zzd = AbstractC10396e5.y(interfaceC10468m5);
        }
        AbstractC10503q4.i(iterable, this.zzd);
    }

    final /* synthetic */ void S(Iterable iterable) {
        InterfaceC10477n5 interfaceC10477n5 = this.zze;
        if (!interfaceC10477n5.zza()) {
            this.zze = AbstractC10396e5.A(interfaceC10477n5);
        }
        AbstractC10503q4.i(iterable, this.zze);
    }

    final /* synthetic */ void U(Iterable iterable) {
        InterfaceC10477n5 interfaceC10477n5 = this.zzf;
        if (!interfaceC10477n5.zza()) {
            this.zzf = AbstractC10396e5.A(interfaceC10477n5);
        }
        AbstractC10503q4.i(iterable, this.zzf);
    }

    private C10403f3() {
    }

    final /* synthetic */ void P() {
        this.zzb = AbstractC10396e5.x();
    }

    final /* synthetic */ void R() {
        this.zzd = AbstractC10396e5.x();
    }

    final /* synthetic */ void T() {
        this.zze = AbstractC10396e5.z();
    }

    final /* synthetic */ void V() {
        this.zzf = AbstractC10396e5.z();
    }
}
