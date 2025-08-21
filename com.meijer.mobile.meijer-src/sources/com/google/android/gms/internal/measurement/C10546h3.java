package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10546h3 extends AbstractC10521e5 implements L5 {
    private static final C10546h3 zzf;
    private int zzb;
    private int zzd;
    private InterfaceC10593m5 zze = AbstractC10521e5.x();

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
        C10546h3 c10546h3 = new C10546h3();
        zzf = c10546h3;
        AbstractC10521e5.t(C10546h3.class, c10546h3);
    }

    public static C10537g3 J() {
        return (C10537g3) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C10546h3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10537g3(bArr);
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
        InterfaceC10593m5 interfaceC10593m5 = this.zze;
        if (!interfaceC10593m5.zza()) {
            this.zze = AbstractC10521e5.y(interfaceC10593m5);
        }
        AbstractC10628q4.i(iterable, this.zze);
    }

    private C10546h3() {
    }
}
