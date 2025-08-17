package com.google.android.gms.internal.pal;

import java.util.List;

/* loaded from: classes6.dex */
public final class Fd extends B0 implements InterfaceC10706h1 {
    private static final Fd zzb;
    private int zze;
    private I0 zzf = B0.q();

    public final int u() {
        return this.zze;
    }

    public final List z() {
        return this.zzf;
    }

    static {
        Fd fd2 = new Fd();
        zzb = fd2;
        B0.j(Fd.class, fd2);
    }

    public static Bd v() {
        return (Bd) zzb.l();
    }

    public static Fd y(byte[] bArr, C10833p0 c10833p0) throws zzadi {
        return (Fd) B0.o(zzb, bArr, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", Ed.class});
        }
        if (i11 == 3) {
            return new Fd();
        }
        Ad ad2 = null;
        if (i11 == 4) {
            return new Bd(ad2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int t() {
        return this.zzf.size();
    }

    private Fd() {
    }

    static /* synthetic */ void E(Fd fd2, Ed ed2) {
        ed2.getClass();
        I0 i02 = fd2.zzf;
        if (!i02.zzc()) {
            fd2.zzf = B0.f(i02);
        }
        fd2.zzf.add(ed2);
    }
}
