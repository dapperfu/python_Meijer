package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class D7 {

    /* renamed from: a, reason: collision with root package name */
    private final C10957wd f82569a;

    private D7(C10957wd c10957wd) {
        this.f82569a = c10957wd;
    }

    public static D7 d(String str, byte[] bArr, int i10) {
        C10941vd c10941vdT = C10957wd.t();
        c10941vdT.m(str);
        c10941vdT.n(AbstractC10605b0.s(bArr));
        int i11 = i10 - 1;
        c10941vdT.o(i11 != 0 ? i11 != 1 ? 5 : 4 : 3);
        return new D7((C10957wd) c10941vdT.j());
    }

    public final String a() {
        return this.f82569a.y();
    }

    public final byte[] b() {
        return this.f82569a.w().z();
    }

    public final int c() {
        int iE = this.f82569a.E() - 2;
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
