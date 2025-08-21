package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Kd extends B0 implements InterfaceC10831h1 {
    private static final Kd zzb;
    private int zze;
    private I0 zzf = B0.q();

    static {
        Kd kd2 = new Kd();
        zzb = kd2;
        B0.j(Kd.class, kd2);
    }

    public static Hd t() {
        return (Hd) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", Jd.class});
        }
        if (i11 == 3) {
            return new Kd();
        }
        Gd gd2 = null;
        if (i11 == 4) {
            return new Hd(gd2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private Kd() {
    }

    static /* synthetic */ void w(Kd kd2, Jd jd2) {
        jd2.getClass();
        I0 i02 = kd2.zzf;
        if (!i02.zzc()) {
            kd2.zzf = B0.f(i02);
        }
        kd2.zzf.add(jd2);
    }
}
