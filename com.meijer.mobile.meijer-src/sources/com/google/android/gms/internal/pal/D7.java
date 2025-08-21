package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class D7 {

    /* renamed from: a, reason: collision with root package name */
    private final C11082wd f83409a;

    private D7(C11082wd c11082wd) {
        this.f83409a = c11082wd;
    }

    public static D7 d(String str, byte[] bArr, int i10) {
        C11066vd c11066vdT = C11082wd.t();
        c11066vdT.m(str);
        c11066vdT.n(AbstractC10730b0.s(bArr));
        int i11 = i10 - 1;
        c11066vdT.o(i11 != 0 ? i11 != 1 ? 5 : 4 : 3);
        return new D7((C11082wd) c11066vdT.j());
    }

    public final String a() {
        return this.f83409a.y();
    }

    public final byte[] b() {
        return this.f83409a.w().z();
    }

    public final int c() {
        int iE = this.f83409a.E() - 2;
        int i10 = 1;
        if (iE != 1) {
            i10 = 2;
            if (iE != 2) {
                i10 = 3;
                if (iE != 3) {
                    if (iE == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i10;
    }
}
