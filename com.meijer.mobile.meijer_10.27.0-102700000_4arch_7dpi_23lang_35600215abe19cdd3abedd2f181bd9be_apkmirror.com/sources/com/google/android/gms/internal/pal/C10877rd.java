package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.rd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10877rd extends B0 implements InterfaceC10706h1 {
    private static final C10877rd zzb;
    private String zze = "";
    private AbstractC10605b0 zzf = AbstractC10605b0.f83055b;
    private int zzg;

    public static C10877rd w() {
        return zzb;
    }

    public final AbstractC10605b0 y() {
        return this.zzf;
    }

    public final String z() {
        return this.zze;
    }

    static {
        C10877rd c10877rd = new C10877rd();
        zzb = c10877rd;
        B0.j(C10877rd.class, c10877rd);
    }

    public static C10830od t() {
        return (C10830od) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C10877rd();
        }
        C10814nd c10814nd = null;
        if (i11 == 4) {
            return new C10830od(c10814nd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final EnumC10862qd u() {
        EnumC10862qd enumC10862qdA = EnumC10862qd.a(this.zzg);
        return enumC10862qdA == null ? EnumC10862qd.UNRECOGNIZED : enumC10862qdA;
    }

    private C10877rd() {
    }

    static /* synthetic */ void A(C10877rd c10877rd, String str) {
        str.getClass();
        c10877rd.zze = str;
    }
}
