package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class K2 extends AbstractC10396e5 implements L5 {
    private static final K2 zzd;
    private InterfaceC10477n5 zzb = AbstractC10396e5.z();

    public static K2 G() {
        return zzd;
    }

    public final List E() {
        return this.zzb;
    }

    static {
        K2 k22 = new K2();
        zzd = k22;
        AbstractC10396e5.t(K2.class, k22);
    }

    public static D2 F() {
        return (D2) zzd.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", H2.class});
        }
        if (i11 == 3) {
            return new K2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new D2(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    final /* synthetic */ void H(Iterable iterable) {
        InterfaceC10477n5 interfaceC10477n5 = this.zzb;
        if (!interfaceC10477n5.zza()) {
            this.zzb = AbstractC10396e5.A(interfaceC10477n5);
        }
        AbstractC10503q4.i(iterable, this.zzb);
    }

    private K2() {
    }
}
