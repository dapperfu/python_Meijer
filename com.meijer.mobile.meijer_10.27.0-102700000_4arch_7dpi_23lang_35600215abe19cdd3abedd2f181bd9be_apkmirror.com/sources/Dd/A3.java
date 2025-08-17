package Dd;

import Bf.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class A3 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final A3 f5149a = new A3();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f5150b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f5151c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f5152d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bf.b f5153e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bf.b f5154f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bf.b f5155g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bf.b f5156h;

    /* renamed from: i, reason: collision with root package name */
    private static final Bf.b f5157i;

    /* renamed from: j, reason: collision with root package name */
    private static final Bf.b f5158j;

    /* renamed from: k, reason: collision with root package name */
    private static final Bf.b f5159k;

    static {
        b.C0047b c0047bA = Bf.b.a("durationMs");
        M0 m02 = new M0();
        m02.a(1);
        f5150b = c0047bA.b(m02.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("errorCode");
        M0 m03 = new M0();
        m03.a(2);
        f5151c = c0047bA2.b(m03.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("isColdCall");
        M0 m04 = new M0();
        m04.a(3);
        f5152d = c0047bA3.b(m04.b()).a();
        b.C0047b c0047bA4 = Bf.b.a("autoManageModelOnBackground");
        M0 m05 = new M0();
        m05.a(4);
        f5153e = c0047bA4.b(m05.b()).a();
        b.C0047b c0047bA5 = Bf.b.a("autoManageModelOnLowMemory");
        M0 m06 = new M0();
        m06.a(5);
        f5154f = c0047bA5.b(m06.b()).a();
        b.C0047b c0047bA6 = Bf.b.a("isNnApiEnabled");
        M0 m07 = new M0();
        m07.a(6);
        f5155g = c0047bA6.b(m07.b()).a();
        b.C0047b c0047bA7 = Bf.b.a("eventsCount");
        M0 m08 = new M0();
        m08.a(7);
        f5156h = c0047bA7.b(m08.b()).a();
        b.C0047b c0047bA8 = Bf.b.a("otherErrors");
        M0 m09 = new M0();
        m09.a(8);
        f5157i = c0047bA8.b(m09.b()).a();
        b.C0047b c0047bA9 = Bf.b.a("remoteConfigValueForAcceleration");
        M0 m010 = new M0();
        m010.a(9);
        f5158j = c0047bA9.b(m010.b()).a();
        b.C0047b c0047bA10 = Bf.b.a("isAccelerated");
        M0 m011 = new M0();
        m011.a(10);
        f5159k = c0047bA10.b(m011.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        M6 m62 = (M6) obj;
        Bf.d dVar = (Bf.d) obj2;
        dVar.f(f5150b, m62.e());
        dVar.f(f5151c, m62.a());
        dVar.f(f5152d, m62.d());
        dVar.f(f5153e, m62.b());
        dVar.f(f5154f, m62.c());
        dVar.f(f5155g, null);
        dVar.f(f5156h, null);
        dVar.f(f5157i, null);
        dVar.f(f5158j, null);
        dVar.f(f5159k, null);
    }

    private A3() {
    }
}
