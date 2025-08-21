package Gd;

import Df.b;
import java.io.IOException;

/* renamed from: Gd.n2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3710n2 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3710n2 f12169a = new C3710n2();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f12170b;

    /* renamed from: c, reason: collision with root package name */
    private static final Df.b f12171c;

    /* renamed from: d, reason: collision with root package name */
    private static final Df.b f12172d;

    static {
        b.C0116b c0116bA = Df.b.a("detectorMode");
        C3651f c3651f = new C3651f();
        c3651f.a(1);
        f12170b = c0116bA.b(c3651f.b()).a();
        b.C0116b c0116bA2 = Df.b.a("streamModeSmoothingRatio");
        C3651f c3651f2 = new C3651f();
        c3651f2.a(2);
        f12171c = c0116bA2.b(c3651f2.b()).a();
        b.C0116b c0116bA3 = Df.b.a("rawSizeMaskEnabled");
        C3651f c3651f3 = new C3651f();
        c3651f3.a(3);
        f12172d = c0116bA3.b(c3651f3.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        throw null;
    }

    private C3710n2() {
    }
}
