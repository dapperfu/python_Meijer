package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10573y3 extends AbstractC10396e5 implements L5 {
    private static final C10573y3 zzf;
    private int zzb;
    private InterfaceC10477n5 zzd = AbstractC10396e5.z();
    private C10528t3 zze;

    public final List E() {
        return this.zzd;
    }

    static {
        C10573y3 c10573y3 = new C10573y3();
        zzf = c10573y3;
        AbstractC10396e5.t(C10573y3.class, c10573y3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", C3.class, "zze"});
        }
        if (i11 == 3) {
            return new C10573y3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10555w3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final C10528t3 F() {
        C10528t3 c10528t3 = this.zze;
        return c10528t3 == null ? C10528t3.G() : c10528t3;
    }

    private C10573y3() {
    }
}
