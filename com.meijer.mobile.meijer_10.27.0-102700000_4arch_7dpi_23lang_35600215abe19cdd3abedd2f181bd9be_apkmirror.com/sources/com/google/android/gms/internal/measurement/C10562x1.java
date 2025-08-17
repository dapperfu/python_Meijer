package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10562x1 extends AbstractC10396e5 implements L5 {
    private static final C10562x1 zzi;
    private int zzb;
    private int zzd;
    private InterfaceC10477n5 zze = AbstractC10396e5.z();
    private InterfaceC10477n5 zzf = AbstractC10396e5.z();
    private boolean zzg;
    private boolean zzh;

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final List G() {
        return this.zze;
    }

    public final List J() {
        return this.zzf;
    }

    static {
        C10562x1 c10562x1 = new C10562x1();
        zzi = c10562x1;
        AbstractC10396e5.t(C10562x1.class, c10562x1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", H1.class, "zzf", C10580z1.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C10562x1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10553w1(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final int H() {
        return this.zze.size();
    }

    public final H1 I(int i10) {
        return (H1) this.zze.get(i10);
    }

    public final int K() {
        return this.zzf.size();
    }

    public final C10580z1 L(int i10) {
        return (C10580z1) this.zzf.get(i10);
    }

    private C10562x1() {
    }

    final /* synthetic */ void M(int i10, H1 h12) {
        h12.getClass();
        InterfaceC10477n5 interfaceC10477n5 = this.zze;
        if (!interfaceC10477n5.zza()) {
            this.zze = AbstractC10396e5.A(interfaceC10477n5);
        }
        this.zze.set(i10, h12);
    }

    final /* synthetic */ void N(int i10, C10580z1 c10580z1) {
        c10580z1.getClass();
        InterfaceC10477n5 interfaceC10477n5 = this.zzf;
        if (!interfaceC10477n5.zza()) {
            this.zzf = AbstractC10396e5.A(interfaceC10477n5);
        }
        this.zzf.set(i10, c10580z1);
    }
}
