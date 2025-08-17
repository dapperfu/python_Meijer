package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10493p3 extends AbstractC10396e5 implements L5 {
    private static final C10493p3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    public static C10493p3 G() {
        return zzg;
    }

    public final EnumC10448k3 E() {
        EnumC10448k3 enumC10448k3A = EnumC10448k3.a(this.zze);
        return enumC10448k3A == null ? EnumC10448k3.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : enumC10448k3A;
    }

    public final int J() {
        int iA = C10484o3.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int K() {
        int iA = C10466m3.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final /* synthetic */ void L(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void M(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }

    static {
        C10493p3 c10493p3 = new C10493p3();
        zzg = c10493p3;
        AbstractC10396e5.t(C10493p3.class, c10493p3);
    }

    public static C10430i3 F() {
        return (C10430i3) zzg.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C10475n3.f82282a, "zze", C10439j3.f82223a, "zzf", C10457l3.f82261a});
        }
        if (i11 == 3) {
            return new C10493p3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10430i3(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    private C10493p3() {
    }

    final /* synthetic */ void H(EnumC10448k3 enumC10448k3) {
        this.zze = enumC10448k3.zza();
        this.zzb |= 2;
    }
}
