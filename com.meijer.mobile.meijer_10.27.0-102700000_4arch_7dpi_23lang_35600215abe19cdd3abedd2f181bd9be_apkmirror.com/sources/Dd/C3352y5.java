package Dd;

import Bf.b;
import java.io.IOException;

/* renamed from: Dd.y5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3352y5 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3352y5 f6342a = new C3352y5();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f6343b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f6344c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f6345d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bf.b f6346e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bf.b f6347f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bf.b f6348g;

    static {
        b.C0047b c0047bA = Bf.b.a("appName");
        M0 m02 = new M0();
        m02.a(1);
        f6343b = c0047bA.b(m02.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("sessionId");
        M0 m03 = new M0();
        m03.a(2);
        f6344c = c0047bA2.b(m03.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("startZoomLevel");
        M0 m04 = new M0();
        m04.a(3);
        f6345d = c0047bA3.b(m04.b()).a();
        b.C0047b c0047bA4 = Bf.b.a("endZoomLevel");
        M0 m05 = new M0();
        m05.a(4);
        f6346e = c0047bA4.b(m05.b()).a();
        b.C0047b c0047bA5 = Bf.b.a("durationMs");
        M0 m06 = new M0();
        m06.a(5);
        f6347f = c0047bA5.b(m06.b()).a();
        b.C0047b c0047bA6 = Bf.b.a("predictedArea");
        M0 m07 = new M0();
        m07.a(6);
        f6348g = c0047bA6.b(m07.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        P8 p82 = (P8) obj;
        Bf.d dVar = (Bf.d) obj2;
        dVar.f(f6343b, p82.e());
        dVar.f(f6344c, p82.f());
        dVar.f(f6345d, p82.c());
        dVar.f(f6346e, p82.b());
        dVar.f(f6347f, p82.d());
        dVar.f(f6348g, p82.a());
    }

    private C3352y5() {
    }
}
