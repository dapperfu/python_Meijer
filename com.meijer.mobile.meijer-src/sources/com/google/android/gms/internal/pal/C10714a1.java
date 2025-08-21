package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.a1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10714a1 extends B0 implements InterfaceC10831h1 {
    private static final C10714a1 zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;

    static /* synthetic */ void A(C10714a1 c10714a1, long j10) {
        c10714a1.zze |= 32;
        c10714a1.zzk = j10;
    }

    static /* synthetic */ void v(C10714a1 c10714a1, long j10) {
        c10714a1.zze |= 1;
        c10714a1.zzf = j10;
    }

    static /* synthetic */ void w(C10714a1 c10714a1, long j10) {
        c10714a1.zze |= 4;
        c10714a1.zzh = j10;
    }

    static /* synthetic */ void y(C10714a1 c10714a1, long j10) {
        c10714a1.zze |= 8;
        c10714a1.zzi = j10;
    }

    static /* synthetic */ void z(C10714a1 c10714a1, long j10) {
        c10714a1.zze |= 16;
        c10714a1.zzj = j10;
    }

    static {
        C10714a1 c10714a1 = new C10714a1();
        zzb = c10714a1;
        B0.j(C10714a1.class, c10714a1);
    }

    public static C0 t() {
        return (C0) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C10714a1();
        }
        C11111ya c11111ya = null;
        if (i11 == 4) {
            return new C0(c11111ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10714a1() {
    }
}
