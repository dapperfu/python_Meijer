package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10429i2 extends AbstractC10396e5 implements L5 {
    private static final C10429i2 zzd;
    private InterfaceC10477n5 zzb = AbstractC10396e5.z();

    static {
        C10429i2 c10429i2 = new C10429i2();
        zzd = c10429i2;
        AbstractC10396e5.t(C10429i2.class, c10429i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new C10429i2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10420h2(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    private C10429i2() {
    }
}
