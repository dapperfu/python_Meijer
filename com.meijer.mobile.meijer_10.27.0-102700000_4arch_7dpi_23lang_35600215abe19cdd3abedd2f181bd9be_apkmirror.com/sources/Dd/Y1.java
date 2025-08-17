package Dd;

import Bf.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class Y1 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final Y1 f5591a = new Y1();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f5592b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f5593c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f5594d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bf.b f5595e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bf.b f5596f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bf.b f5597g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bf.b f5598h;

    static {
        b.C0047b c0047bA = Bf.b.a("errorCode");
        M0 m02 = new M0();
        m02.a(1);
        f5592b = c0047bA.b(m02.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("hasResult");
        M0 m03 = new M0();
        m03.a(2);
        f5593c = c0047bA2.b(m03.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("isColdCall");
        M0 m04 = new M0();
        m04.a(3);
        f5594d = c0047bA3.b(m04.b()).a();
        b.C0047b c0047bA4 = Bf.b.a("imageInfo");
        M0 m05 = new M0();
        m05.a(4);
        f5595e = c0047bA4.b(m05.b()).a();
        b.C0047b c0047bA5 = Bf.b.a("options");
        M0 m06 = new M0();
        m06.a(5);
        f5596f = c0047bA5.b(m06.b()).a();
        b.C0047b c0047bA6 = Bf.b.a("detectedBarcodeFormats");
        M0 m07 = new M0();
        m07.a(6);
        f5597g = c0047bA6.b(m07.b()).a();
        b.C0047b c0047bA7 = Bf.b.a("detectedBarcodeValueTypes");
        M0 m08 = new M0();
        m08.a(7);
        f5598h = c0047bA7.b(m08.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        C3131f1 c3131f1 = (C3131f1) obj;
        Bf.d dVar = (Bf.d) obj2;
        dVar.f(f5592b, c3131f1.c());
        dVar.f(f5593c, null);
        dVar.f(f5594d, c3131f1.e());
        dVar.f(f5595e, null);
        dVar.f(f5596f, c3131f1.d());
        dVar.f(f5597g, c3131f1.a());
        dVar.f(f5598h, c3131f1.b());
    }

    private Y1() {
    }
}
