package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10536g2 extends AbstractC10521e5 implements L5 {
    private static final C10536g2 zzu;
    private int zzb;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private C10482a2 zzp;
    private C10572k2 zzq;
    private C10626q2 zzr;
    private C10590m2 zzs;
    private C10554i2 zzt;
    private String zze = "";
    private InterfaceC10602n5 zzg = AbstractC10521e5.z();
    private InterfaceC10602n5 zzh = AbstractC10521e5.z();
    private InterfaceC10602n5 zzi = AbstractC10521e5.z();
    private String zzj = "";
    private InterfaceC10602n5 zzl = AbstractC10521e5.z();
    private InterfaceC10602n5 zzm = AbstractC10521e5.z();
    private String zzn = "";
    private String zzo = "";

    public static C10536g2 V() {
        return zzu;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final long F() {
        return this.zzd;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final String H() {
        return this.zze;
    }

    public final List I() {
        return this.zzg;
    }

    public final List L() {
        return this.zzi;
    }

    public final List M() {
        return this.zzl;
    }

    public final List O() {
        return this.zzm;
    }

    public final String P() {
        return this.zzn;
    }

    public final boolean Q() {
        return (this.zzb & 128) != 0;
    }

    public final boolean S() {
        return (this.zzb & 512) != 0;
    }

    static {
        C10536g2 c10536g2 = new C10536g2();
        zzu = c10536g2;
        AbstractC10521e5.t(C10536g2.class, c10536g2);
    }

    public static C10527f2 U() {
        return (C10527f2) zzu.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", C10608o2.class, "zzh", C10518e2.class, "zzi", C10687x1.class, "zzj", "zzk", "zzl", C10698y3.class, "zzm", C10500c2.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new C10536g2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10527f2(bArr);
        }
        if (i11 == 5) {
            return zzu;
        }
        throw null;
    }

    public final int J() {
        return this.zzh.size();
    }

    public final C10518e2 K(int i10) {
        return (C10518e2) this.zzh.get(i10);
    }

    public final int N() {
        return this.zzl.size();
    }

    public final C10482a2 R() {
        C10482a2 c10482a2 = this.zzp;
        return c10482a2 == null ? C10482a2.K() : c10482a2;
    }

    public final C10626q2 T() {
        C10626q2 c10626q2 = this.zzr;
        return c10626q2 == null ? C10626q2.I() : c10626q2;
    }

    private C10536g2() {
    }

    final /* synthetic */ void W(int i10, C10518e2 c10518e2) {
        c10518e2.getClass();
        InterfaceC10602n5 interfaceC10602n5 = this.zzh;
        if (!interfaceC10602n5.zza()) {
            this.zzh = AbstractC10521e5.A(interfaceC10602n5);
        }
        this.zzh.set(i10, c10518e2);
    }

    final /* synthetic */ void X() {
        this.zzi = AbstractC10521e5.z();
    }

    final /* synthetic */ void Y() {
        this.zzl = AbstractC10521e5.z();
    }
}
