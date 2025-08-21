package Fd;

import Df.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class Y1 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final Y1 f9624a = new Y1();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f9625b;

    /* renamed from: c, reason: collision with root package name */
    private static final Df.b f9626c;

    /* renamed from: d, reason: collision with root package name */
    private static final Df.b f9627d;

    /* renamed from: e, reason: collision with root package name */
    private static final Df.b f9628e;

    /* renamed from: f, reason: collision with root package name */
    private static final Df.b f9629f;

    /* renamed from: g, reason: collision with root package name */
    private static final Df.b f9630g;

    /* renamed from: h, reason: collision with root package name */
    private static final Df.b f9631h;

    static {
        b.C0116b c0116bA = Df.b.a("errorCode");
        M0 m02 = new M0();
        m02.a(1);
        f9625b = c0116bA.b(m02.b()).a();
        b.C0116b c0116bA2 = Df.b.a("hasResult");
        M0 m03 = new M0();
        m03.a(2);
        f9626c = c0116bA2.b(m03.b()).a();
        b.C0116b c0116bA3 = Df.b.a("isColdCall");
        M0 m04 = new M0();
        m04.a(3);
        f9627d = c0116bA3.b(m04.b()).a();
        b.C0116b c0116bA4 = Df.b.a("imageInfo");
        M0 m05 = new M0();
        m05.a(4);
        f9628e = c0116bA4.b(m05.b()).a();
        b.C0116b c0116bA5 = Df.b.a("options");
        M0 m06 = new M0();
        m06.a(5);
        f9629f = c0116bA5.b(m06.b()).a();
        b.C0116b c0116bA6 = Df.b.a("detectedBarcodeFormats");
        M0 m07 = new M0();
        m07.a(6);
        f9630g = c0116bA6.b(m07.b()).a();
        b.C0116b c0116bA7 = Df.b.a("detectedBarcodeValueTypes");
        M0 m08 = new M0();
        m08.a(7);
        f9631h = c0116bA7.b(m08.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        C3353f1 c3353f1 = (C3353f1) obj;
        Df.d dVar = (Df.d) obj2;
        dVar.a(f9625b, c3353f1.c());
        dVar.a(f9626c, null);
        dVar.a(f9627d, c3353f1.e());
        dVar.a(f9628e, null);
        dVar.a(f9629f, c3353f1.d());
        dVar.a(f9630g, c3353f1.a());
        dVar.a(f9631h, c3353f1.b());
    }

    private Y1() {
    }
}
