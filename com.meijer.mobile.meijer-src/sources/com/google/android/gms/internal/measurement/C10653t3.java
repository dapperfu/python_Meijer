package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10653t3 extends AbstractC10521e5 implements L5 {
    private static final C10653t3 zzd;
    private InterfaceC10602n5 zzb = AbstractC10521e5.z();

    public static C10653t3 G() {
        return zzd;
    }

    public final List E() {
        return this.zzb;
    }

    static {
        C10653t3 c10653t3 = new C10653t3();
        zzd = c10653t3;
        AbstractC10521e5.t(C10653t3.class, c10653t3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C10671v3.class});
        }
        if (i11 == 3) {
            return new C10653t3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10644s3(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final int F() {
        return this.zzb.size();
    }

    private C10653t3() {
    }
}
