package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Eb extends B0 implements InterfaceC10706h1 {
    private static final Eb zzb;
    private Hb zze;
    private int zzf;

    public static Eb w() {
        return zzb;
    }

    public final int t() {
        return this.zzf;
    }

    static {
        Eb eb2 = new Eb();
        zzb = eb2;
        B0.j(Eb.class, eb2);
    }

    public static Db u() {
        return (Db) zzb.l();
    }

    public static Eb y(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (Eb) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new Eb();
        }
        Cb cb2 = null;
        if (i11 == 4) {
            return new Db(cb2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Hb z() {
        Hb hb2 = this.zze;
        return hb2 == null ? Hb.w() : hb2;
    }

    private Eb() {
    }

    static /* synthetic */ void A(Eb eb2, Hb hb2) {
        hb2.getClass();
        eb2.zze = hb2;
    }
}
