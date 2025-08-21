package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10705z1 extends AbstractC10521e5 implements L5 {
    private static final C10705z1 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC10602n5 zzf = AbstractC10521e5.z();
    private boolean zzg;
    private F1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }

    public final List H() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzj;
    }

    public final boolean O() {
        return (this.zzb & 64) != 0;
    }

    public final boolean P() {
        return this.zzk;
    }

    final /* synthetic */ void R(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    static {
        C10705z1 c10705z1 = new C10705z1();
        zzl = c10705z1;
        AbstractC10521e5.t(C10705z1.class, c10705z1);
    }

    public static C10696y1 Q() {
        return (C10696y1) zzl.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", B1.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C10705z1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10696y1(bArr);
        }
        if (i11 == 5) {
            return zzl;
        }
        throw null;
    }

    public final int I() {
        return this.zzf.size();
    }

    public final B1 J(int i10) {
        return (B1) this.zzf.get(i10);
    }

    public final F1 L() {
        F1 f12 = this.zzh;
        return f12 == null ? F1.N() : f12;
    }

    private C10705z1() {
    }

    final /* synthetic */ void S(int i10, B1 b12) {
        b12.getClass();
        InterfaceC10602n5 interfaceC10602n5 = this.zzf;
        if (!interfaceC10602n5.zza()) {
            this.zzf = AbstractC10521e5.A(interfaceC10602n5);
        }
        this.zzf.set(i10, b12);
    }
}
