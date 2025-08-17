package Dd;

import Bf.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class W3 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final W3 f5564a = new W3();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f5565b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f5566c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f5567d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bf.b f5568e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bf.b f5569f;

    static {
        b.C0047b c0047bA = Bf.b.a("inferenceCommonLogEvent");
        M0 m02 = new M0();
        m02.a(1);
        f5565b = c0047bA.b(m02.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("options");
        M0 m03 = new M0();
        m03.a(2);
        f5566c = c0047bA2.b(m03.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("detectedBarcodeFormats");
        M0 m04 = new M0();
        m04.a(3);
        f5567d = c0047bA3.b(m04.b()).a();
        b.C0047b c0047bA4 = Bf.b.a("detectedBarcodeValueTypes");
        M0 m05 = new M0();
        m05.a(4);
        f5568e = c0047bA4.b(m05.b()).a();
        b.C0047b c0047bA5 = Bf.b.a("imageInfo");
        M0 m06 = new M0();
        m06.a(5);
        f5569f = c0047bA5.b(m06.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        C3245o7 c3245o7 = (C3245o7) obj;
        Bf.d dVar = (Bf.d) obj2;
        dVar.f(f5565b, c3245o7.d());
        dVar.f(f5566c, c3245o7.e());
        dVar.f(f5567d, c3245o7.a());
        dVar.f(f5568e, c3245o7.b());
        dVar.f(f5569f, c3245o7.c());
    }

    private W3() {
    }
}
