package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10510d3 extends AbstractC10521e5 implements L5 {
    private static final C10510d3 zzf;
    private int zzb;
    private int zzd = 1;
    private InterfaceC10602n5 zze = AbstractC10521e5.z();

    static {
        C10510d3 c10510d3 = new C10510d3();
        zzf = c10510d3;
        AbstractC10521e5.t(C10510d3.class, c10510d3);
    }

    public static C10492b3 E() {
        return (C10492b3) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", C10501c3.f82986a, "zze", Q2.class});
        }
        if (i11 == 3) {
            return new C10510d3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10492b3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    private C10510d3() {
    }

    final /* synthetic */ void F(Q2 q22) {
        q22.getClass();
        InterfaceC10602n5 interfaceC10602n5 = this.zze;
        if (!interfaceC10602n5.zza()) {
            this.zze = AbstractC10521e5.A(interfaceC10602n5);
        }
        this.zze.add(q22);
    }
}
