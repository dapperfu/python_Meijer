package Ed;

import Bf.b;
import java.io.IOException;

/* renamed from: Ed.p1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3531p1 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3531p1 f8649a = new C3531p1();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f8650b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f8651c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f8652d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bf.b f8653e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bf.b f8654f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bf.b f8655g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bf.b f8656h;

    static {
        b.C0047b c0047bA = Bf.b.a("durationMs");
        C3459f c3459f = new C3459f();
        c3459f.a(1);
        f8650b = c0047bA.b(c3459f.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("imageSource");
        C3459f c3459f2 = new C3459f();
        c3459f2.a(2);
        f8651c = c0047bA2.b(c3459f2.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("imageFormat");
        C3459f c3459f3 = new C3459f();
        c3459f3.a(3);
        f8652d = c0047bA3.b(c3459f3.b()).a();
        b.C0047b c0047bA4 = Bf.b.a("imageByteSize");
        C3459f c3459f4 = new C3459f();
        c3459f4.a(4);
        f8653e = c0047bA4.b(c3459f4.b()).a();
        b.C0047b c0047bA5 = Bf.b.a("imageWidth");
        C3459f c3459f5 = new C3459f();
        c3459f5.a(5);
        f8654f = c0047bA5.b(c3459f5.b()).a();
        b.C0047b c0047bA6 = Bf.b.a("imageHeight");
        C3459f c3459f6 = new C3459f();
        c3459f6.a(6);
        f8655g = c0047bA6.b(c3459f6.b()).a();
        b.C0047b c0047bA7 = Bf.b.a("rotationDegrees");
        C3459f c3459f7 = new C3459f();
        c3459f7.a(7);
        f8656h = c0047bA7.b(c3459f7.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        A3 a32 = (A3) obj;
        Bf.d dVar = (Bf.d) obj2;
        dVar.f(f8650b, a32.g());
        dVar.f(f8651c, a32.b());
        dVar.f(f8652d, a32.a());
        dVar.f(f8653e, a32.c());
        dVar.f(f8654f, a32.e());
        dVar.f(f8655g, a32.d());
        dVar.f(f8656h, a32.f());
    }

    private C3531p1() {
    }
}
