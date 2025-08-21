package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10618p3 extends AbstractC10521e5 implements L5 {
    private static final C10618p3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    public static C10618p3 G() {
        return zzg;
    }

    public final EnumC10573k3 E() {
        EnumC10573k3 enumC10573k3A = EnumC10573k3.a(this.zze);
        return enumC10573k3A == null ? EnumC10573k3.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : enumC10573k3A;
    }

    public final int J() {
        int iA = C10609o3.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int K() {
        int iA = C10591m3.a(this.zzf);
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
        C10618p3 c10618p3 = new C10618p3();
        zzg = c10618p3;
        AbstractC10521e5.t(C10618p3.class, c10618p3);
    }

    public static C10555i3 F() {
        return (C10555i3) zzg.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C10600n3.f83122a, "zze", C10564j3.f83063a, "zzf", C10582l3.f83101a});
        }
        if (i11 == 3) {
            return new C10618p3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10555i3(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    private C10618p3() {
    }

    final /* synthetic */ void H(EnumC10573k3 enumC10573k3) {
        this.zze = enumC10573k3.zza();
        this.zzb |= 2;
    }
}
