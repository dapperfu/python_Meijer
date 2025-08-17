package Dd;

import Bf.b;
import java.io.IOException;

/* renamed from: Dd.q3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3263q3 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3263q3 f6223a = new C3263q3();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f6224b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f6225c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f6226d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bf.b f6227e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bf.b f6228f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bf.b f6229g;

    static {
        b.C0047b c0047bA = Bf.b.a("maxMs");
        M0 m02 = new M0();
        m02.a(1);
        f6224b = c0047bA.b(m02.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("minMs");
        M0 m03 = new M0();
        m03.a(2);
        f6225c = c0047bA2.b(m03.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("avgMs");
        M0 m04 = new M0();
        m04.a(3);
        f6226d = c0047bA3.b(m04.b()).a();
        b.C0047b c0047bA4 = Bf.b.a("firstQuartileMs");
        M0 m05 = new M0();
        m05.a(4);
        f6227e = c0047bA4.b(m05.b()).a();
        b.C0047b c0047bA5 = Bf.b.a("medianMs");
        M0 m06 = new M0();
        m06.a(5);
        f6228f = c0047bA5.b(m06.b()).a();
        b.C0047b c0047bA6 = Bf.b.a("thirdQuartileMs");
        M0 m07 = new M0();
        m07.a(6);
        f6229g = c0047bA6.b(m07.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        C3364z6 c3364z6 = (C3364z6) obj;
        Bf.d dVar = (Bf.d) obj2;
        dVar.f(f6224b, c3364z6.c());
        dVar.f(f6225c, c3364z6.e());
        dVar.f(f6226d, c3364z6.a());
        dVar.f(f6227e, c3364z6.b());
        dVar.f(f6228f, c3364z6.d());
        dVar.f(f6229g, c3364z6.f());
    }

    private C3263q3() {
    }
}
