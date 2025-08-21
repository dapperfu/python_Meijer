package com.google.android.gms.internal.pal;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.gms.internal.pal.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10764d0 extends B0 implements InterfaceC10831h1 {
    private static final C10764d0 zzb;
    private int zze;
    private long zzu;
    private long zzv;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static /* synthetic */ void A(C10764d0 c10764d0) {
        c10764d0.zze &= -9;
        c10764d0.zzi = -1L;
    }

    static /* synthetic */ void E(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 16;
        c10764d0.zzj = j10;
    }

    static /* synthetic */ void G(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 32;
        c10764d0.zzk = j10;
    }

    static /* synthetic */ void H(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 128;
        c10764d0.zzm = j10;
    }

    static /* synthetic */ void I(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 256;
        c10764d0.zzn = j10;
    }

    static /* synthetic */ void J(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 512;
        c10764d0.zzo = j10;
    }

    static /* synthetic */ void K(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= RecyclerView.m.FLAG_MOVED;
        c10764d0.zzq = j10;
    }

    static /* synthetic */ void L(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        c10764d0.zzr = j10;
    }

    static /* synthetic */ void M(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 8192;
        c10764d0.zzs = j10;
    }

    static /* synthetic */ void N(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 16384;
        c10764d0.zzt = j10;
    }

    static /* synthetic */ void O(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 32768;
        c10764d0.zzu = j10;
    }

    static /* synthetic */ void P(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 65536;
        c10764d0.zzv = j10;
    }

    static /* synthetic */ void Q(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 131072;
        c10764d0.zzw = j10;
    }

    static /* synthetic */ void R(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 262144;
        c10764d0.zzx = j10;
    }

    static /* synthetic */ void S(C10764d0 c10764d0, int i10) {
        c10764d0.zzl = i10 - 1;
        c10764d0.zze |= 64;
    }

    static /* synthetic */ void T(C10764d0 c10764d0, int i10) {
        c10764d0.zzp = i10 - 1;
        c10764d0.zze |= 1024;
    }

    static /* synthetic */ void v(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 1;
        c10764d0.zzf = j10;
    }

    static /* synthetic */ void w(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 2;
        c10764d0.zzg = j10;
    }

    static /* synthetic */ void y(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 4;
        c10764d0.zzh = j10;
    }

    static /* synthetic */ void z(C10764d0 c10764d0, long j10) {
        c10764d0.zze |= 8;
        c10764d0.zzi = j10;
    }

    static {
        C10764d0 c10764d0 = new C10764d0();
        zzb = c10764d0;
        B0.j(C10764d0.class, c10764d0);
    }

    public static C t() {
        return (C) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            G0 g02 = C10976q2.f84128a;
            return B0.h(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", g02, "zzm", "zzn", "zzo", "zzp", g02, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i11 == 3) {
            return new C10764d0();
        }
        C11111ya c11111ya = null;
        if (i11 == 4) {
            return new C(c11111ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10764d0() {
    }
}
