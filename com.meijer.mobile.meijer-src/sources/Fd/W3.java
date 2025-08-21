package Fd;

import Df.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class W3 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final W3 f9597a = new W3();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f9598b;

    /* renamed from: c, reason: collision with root package name */
    private static final Df.b f9599c;

    /* renamed from: d, reason: collision with root package name */
    private static final Df.b f9600d;

    /* renamed from: e, reason: collision with root package name */
    private static final Df.b f9601e;

    /* renamed from: f, reason: collision with root package name */
    private static final Df.b f9602f;

    static {
        b.C0116b c0116bA = Df.b.a("inferenceCommonLogEvent");
        M0 m02 = new M0();
        m02.a(1);
        f9598b = c0116bA.b(m02.b()).a();
        b.C0116b c0116bA2 = Df.b.a("options");
        M0 m03 = new M0();
        m03.a(2);
        f9599c = c0116bA2.b(m03.b()).a();
        b.C0116b c0116bA3 = Df.b.a("detectedBarcodeFormats");
        M0 m04 = new M0();
        m04.a(3);
        f9600d = c0116bA3.b(m04.b()).a();
        b.C0116b c0116bA4 = Df.b.a("detectedBarcodeValueTypes");
        M0 m05 = new M0();
        m05.a(4);
        f9601e = c0116bA4.b(m05.b()).a();
        b.C0116b c0116bA5 = Df.b.a("imageInfo");
        M0 m06 = new M0();
        m06.a(5);
        f9602f = c0116bA5.b(m06.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        C3467o7 c3467o7 = (C3467o7) obj;
        Df.d dVar = (Df.d) obj2;
        dVar.a(f9598b, c3467o7.d());
        dVar.a(f9599c, c3467o7.e());
        dVar.a(f9600d, c3467o7.a());
        dVar.a(f9601e, c3467o7.b());
        dVar.a(f9602f, c3467o7.c());
    }

    private W3() {
    }
}
