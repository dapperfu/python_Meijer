package Fd;

import Df.b;
import java.io.IOException;

/* renamed from: Fd.y5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3574y5 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3574y5 f10375a = new C3574y5();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f10376b;

    /* renamed from: c, reason: collision with root package name */
    private static final Df.b f10377c;

    /* renamed from: d, reason: collision with root package name */
    private static final Df.b f10378d;

    /* renamed from: e, reason: collision with root package name */
    private static final Df.b f10379e;

    /* renamed from: f, reason: collision with root package name */
    private static final Df.b f10380f;

    /* renamed from: g, reason: collision with root package name */
    private static final Df.b f10381g;

    static {
        b.C0116b c0116bA = Df.b.a("appName");
        M0 m02 = new M0();
        m02.a(1);
        f10376b = c0116bA.b(m02.b()).a();
        b.C0116b c0116bA2 = Df.b.a("sessionId");
        M0 m03 = new M0();
        m03.a(2);
        f10377c = c0116bA2.b(m03.b()).a();
        b.C0116b c0116bA3 = Df.b.a("startZoomLevel");
        M0 m04 = new M0();
        m04.a(3);
        f10378d = c0116bA3.b(m04.b()).a();
        b.C0116b c0116bA4 = Df.b.a("endZoomLevel");
        M0 m05 = new M0();
        m05.a(4);
        f10379e = c0116bA4.b(m05.b()).a();
        b.C0116b c0116bA5 = Df.b.a("durationMs");
        M0 m06 = new M0();
        m06.a(5);
        f10380f = c0116bA5.b(m06.b()).a();
        b.C0116b c0116bA6 = Df.b.a("predictedArea");
        M0 m07 = new M0();
        m07.a(6);
        f10381g = c0116bA6.b(m07.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        P8 p82 = (P8) obj;
        Df.d dVar = (Df.d) obj2;
        dVar.a(f10376b, p82.e());
        dVar.a(f10377c, p82.f());
        dVar.a(f10378d, p82.c());
        dVar.a(f10379e, p82.b());
        dVar.a(f10380f, p82.d());
        dVar.a(f10381g, p82.a());
    }

    private C3574y5() {
    }
}
