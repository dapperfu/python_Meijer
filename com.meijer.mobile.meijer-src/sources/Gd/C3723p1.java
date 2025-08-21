package Gd;

import Df.b;
import java.io.IOException;

/* renamed from: Gd.p1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3723p1 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3723p1 f12201a = new C3723p1();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f12202b;

    /* renamed from: c, reason: collision with root package name */
    private static final Df.b f12203c;

    /* renamed from: d, reason: collision with root package name */
    private static final Df.b f12204d;

    /* renamed from: e, reason: collision with root package name */
    private static final Df.b f12205e;

    /* renamed from: f, reason: collision with root package name */
    private static final Df.b f12206f;

    /* renamed from: g, reason: collision with root package name */
    private static final Df.b f12207g;

    /* renamed from: h, reason: collision with root package name */
    private static final Df.b f12208h;

    static {
        b.C0116b c0116bA = Df.b.a("durationMs");
        C3651f c3651f = new C3651f();
        c3651f.a(1);
        f12202b = c0116bA.b(c3651f.b()).a();
        b.C0116b c0116bA2 = Df.b.a("imageSource");
        C3651f c3651f2 = new C3651f();
        c3651f2.a(2);
        f12203c = c0116bA2.b(c3651f2.b()).a();
        b.C0116b c0116bA3 = Df.b.a("imageFormat");
        C3651f c3651f3 = new C3651f();
        c3651f3.a(3);
        f12204d = c0116bA3.b(c3651f3.b()).a();
        b.C0116b c0116bA4 = Df.b.a("imageByteSize");
        C3651f c3651f4 = new C3651f();
        c3651f4.a(4);
        f12205e = c0116bA4.b(c3651f4.b()).a();
        b.C0116b c0116bA5 = Df.b.a("imageWidth");
        C3651f c3651f5 = new C3651f();
        c3651f5.a(5);
        f12206f = c0116bA5.b(c3651f5.b()).a();
        b.C0116b c0116bA6 = Df.b.a("imageHeight");
        C3651f c3651f6 = new C3651f();
        c3651f6.a(6);
        f12207g = c0116bA6.b(c3651f6.b()).a();
        b.C0116b c0116bA7 = Df.b.a("rotationDegrees");
        C3651f c3651f7 = new C3651f();
        c3651f7.a(7);
        f12208h = c0116bA7.b(c3651f7.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        A3 a32 = (A3) obj;
        Df.d dVar = (Df.d) obj2;
        dVar.a(f12202b, a32.g());
        dVar.a(f12203c, a32.b());
        dVar.a(f12204d, a32.a());
        dVar.a(f12205e, a32.c());
        dVar.a(f12206f, a32.e());
        dVar.a(f12207g, a32.d());
        dVar.a(f12208h, a32.f());
    }

    private C3723p1() {
    }
}
