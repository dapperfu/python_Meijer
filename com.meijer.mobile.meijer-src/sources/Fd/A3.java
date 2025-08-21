package Fd;

import Df.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class A3 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final A3 f9182a = new A3();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f9183b;

    /* renamed from: c, reason: collision with root package name */
    private static final Df.b f9184c;

    /* renamed from: d, reason: collision with root package name */
    private static final Df.b f9185d;

    /* renamed from: e, reason: collision with root package name */
    private static final Df.b f9186e;

    /* renamed from: f, reason: collision with root package name */
    private static final Df.b f9187f;

    /* renamed from: g, reason: collision with root package name */
    private static final Df.b f9188g;

    /* renamed from: h, reason: collision with root package name */
    private static final Df.b f9189h;

    /* renamed from: i, reason: collision with root package name */
    private static final Df.b f9190i;

    /* renamed from: j, reason: collision with root package name */
    private static final Df.b f9191j;

    /* renamed from: k, reason: collision with root package name */
    private static final Df.b f9192k;

    static {
        b.C0116b c0116bA = Df.b.a("durationMs");
        M0 m02 = new M0();
        m02.a(1);
        f9183b = c0116bA.b(m02.b()).a();
        b.C0116b c0116bA2 = Df.b.a("errorCode");
        M0 m03 = new M0();
        m03.a(2);
        f9184c = c0116bA2.b(m03.b()).a();
        b.C0116b c0116bA3 = Df.b.a("isColdCall");
        M0 m04 = new M0();
        m04.a(3);
        f9185d = c0116bA3.b(m04.b()).a();
        b.C0116b c0116bA4 = Df.b.a("autoManageModelOnBackground");
        M0 m05 = new M0();
        m05.a(4);
        f9186e = c0116bA4.b(m05.b()).a();
        b.C0116b c0116bA5 = Df.b.a("autoManageModelOnLowMemory");
        M0 m06 = new M0();
        m06.a(5);
        f9187f = c0116bA5.b(m06.b()).a();
        b.C0116b c0116bA6 = Df.b.a("isNnApiEnabled");
        M0 m07 = new M0();
        m07.a(6);
        f9188g = c0116bA6.b(m07.b()).a();
        b.C0116b c0116bA7 = Df.b.a("eventsCount");
        M0 m08 = new M0();
        m08.a(7);
        f9189h = c0116bA7.b(m08.b()).a();
        b.C0116b c0116bA8 = Df.b.a("otherErrors");
        M0 m09 = new M0();
        m09.a(8);
        f9190i = c0116bA8.b(m09.b()).a();
        b.C0116b c0116bA9 = Df.b.a("remoteConfigValueForAcceleration");
        M0 m010 = new M0();
        m010.a(9);
        f9191j = c0116bA9.b(m010.b()).a();
        b.C0116b c0116bA10 = Df.b.a("isAccelerated");
        M0 m011 = new M0();
        m011.a(10);
        f9192k = c0116bA10.b(m011.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        M6 m62 = (M6) obj;
        Df.d dVar = (Df.d) obj2;
        dVar.a(f9183b, m62.e());
        dVar.a(f9184c, m62.a());
        dVar.a(f9185d, m62.d());
        dVar.a(f9186e, m62.b());
        dVar.a(f9187f, m62.c());
        dVar.a(f9188g, null);
        dVar.a(f9189h, null);
        dVar.a(f9190i, null);
        dVar.a(f9191j, null);
        dVar.a(f9192k, null);
    }

    private A3() {
    }
}
