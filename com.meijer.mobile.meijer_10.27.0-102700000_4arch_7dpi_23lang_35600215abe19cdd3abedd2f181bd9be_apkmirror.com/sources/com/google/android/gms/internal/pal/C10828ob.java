package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.ob, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10828ob extends B0 implements InterfaceC10706h1 {
    private static final C10828ob zzb;
    private int zze;
    private C10875rb zzf;

    public final int t() {
        return this.zze;
    }

    static {
        C10828ob c10828ob = new C10828ob();
        zzb = c10828ob;
        B0.j(C10828ob.class, c10828ob);
    }

    public static C10812nb u() {
        return (C10812nb) zzb.l();
    }

    public static C10828ob w(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10828ob) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new C10828ob();
        }
        C10796mb c10796mb = null;
        if (i11 == 4) {
            return new C10812nb(c10796mb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C10875rb y() {
        C10875rb c10875rb = this.zzf;
        return c10875rb == null ? C10875rb.w() : c10875rb;
    }

    private C10828ob() {
    }

    static /* synthetic */ void A(C10828ob c10828ob, C10875rb c10875rb) {
        c10875rb.getClass();
        c10828ob.zzf = c10875rb;
    }
}
