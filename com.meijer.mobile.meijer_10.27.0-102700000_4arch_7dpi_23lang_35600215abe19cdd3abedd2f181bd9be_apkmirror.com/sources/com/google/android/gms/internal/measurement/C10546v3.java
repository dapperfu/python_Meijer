package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10546v3 extends AbstractC10396e5 implements L5 {
    private static final C10546v3 zzf;
    private int zzb;
    private String zzd = "";
    private InterfaceC10477n5 zze = AbstractC10396e5.z();

    public final String E() {
        return this.zzd;
    }

    public final List F() {
        return this.zze;
    }

    static {
        C10546v3 c10546v3 = new C10546v3();
        zzf = c10546v3;
        AbstractC10396e5.t(C10546v3.class, c10546v3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", C3.class});
        }
        if (i11 == 3) {
            return new C10546v3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10537u3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    private C10546v3() {
    }
}
