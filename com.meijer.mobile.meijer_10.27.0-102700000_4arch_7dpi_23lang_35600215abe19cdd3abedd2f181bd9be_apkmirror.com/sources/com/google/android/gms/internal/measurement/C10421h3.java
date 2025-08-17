package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10421h3 extends AbstractC10396e5 implements L5 {
    private static final C10421h3 zzf;
    private int zzb;
    private int zzd;
    private InterfaceC10468m5 zze = AbstractC10396e5.x();

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final List G() {
        return this.zze;
    }

    final /* synthetic */ void K(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    static {
        C10421h3 c10421h3 = new C10421h3();
        zzf = c10421h3;
        AbstractC10396e5.t(C10421h3.class, c10421h3);
    }

    public static C10412g3 J() {
        return (C10412g3) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C10421h3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10412g3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int H() {
        return this.zze.size();
    }

    public final long I(int i10) {
        return this.zze.zzc(i10);
    }

    final /* synthetic */ void L(Iterable iterable) {
        InterfaceC10468m5 interfaceC10468m5 = this.zze;
        if (!interfaceC10468m5.zza()) {
            this.zze = AbstractC10396e5.y(interfaceC10468m5);
        }
        AbstractC10503q4.i(iterable, this.zze);
    }

    private C10421h3() {
    }
}
