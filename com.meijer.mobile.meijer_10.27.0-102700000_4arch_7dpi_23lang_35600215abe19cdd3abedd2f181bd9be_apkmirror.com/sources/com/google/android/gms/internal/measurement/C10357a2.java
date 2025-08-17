package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10357a2 extends AbstractC10396e5 implements L5 {
    private static final C10357a2 zzi;
    private int zzb;
    private boolean zzg;
    private InterfaceC10477n5 zzd = AbstractC10396e5.z();
    private InterfaceC10477n5 zze = AbstractC10396e5.z();
    private InterfaceC10477n5 zzf = AbstractC10396e5.z();
    private InterfaceC10477n5 zzh = AbstractC10396e5.z();

    public static C10357a2 K() {
        return zzi;
    }

    public final List E() {
        return this.zzd;
    }

    public final List F() {
        return this.zze;
    }

    public final List G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzb & 1) != 0;
    }

    public final boolean I() {
        return this.zzg;
    }

    public final List J() {
        return this.zzh;
    }

    static {
        C10357a2 c10357a2 = new C10357a2();
        zzi = c10357a2;
        AbstractC10396e5.t(C10357a2.class, c10357a2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", O1.class, "zze", Q1.class, "zzf", X1.class, "zzg", "zzh", O1.class});
        }
        if (i11 == 3) {
            return new C10357a2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new M1(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    private C10357a2() {
    }
}
