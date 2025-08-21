package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.rd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11002rd extends B0 implements InterfaceC10831h1 {
    private static final C11002rd zzb;
    private String zze = "";
    private AbstractC10730b0 zzf = AbstractC10730b0.f83895b;
    private int zzg;

    public static C11002rd w() {
        return zzb;
    }

    public final AbstractC10730b0 y() {
        return this.zzf;
    }

    public final String z() {
        return this.zze;
    }

    static {
        C11002rd c11002rd = new C11002rd();
        zzb = c11002rd;
        B0.j(C11002rd.class, c11002rd);
    }

    public static C10955od t() {
        return (C10955od) zzb.l();
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
            return new C11002rd();
        }
        C10939nd c10939nd = null;
        if (i11 == 4) {
            return new C10955od(c10939nd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final EnumC10987qd u() {
        EnumC10987qd enumC10987qdA = EnumC10987qd.a(this.zzg);
        return enumC10987qdA == null ? EnumC10987qd.UNRECOGNIZED : enumC10987qdA;
    }

    private C11002rd() {
    }

    static /* synthetic */ void A(C11002rd c11002rd, String str) {
        str.getClass();
        c11002rd.zze = str;
    }
}
