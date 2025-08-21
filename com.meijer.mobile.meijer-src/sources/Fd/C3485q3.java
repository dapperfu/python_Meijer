package Fd;

import Df.b;
import java.io.IOException;

/* renamed from: Fd.q3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3485q3 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3485q3 f10256a = new C3485q3();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f10257b;

    /* renamed from: c, reason: collision with root package name */
    private static final Df.b f10258c;

    /* renamed from: d, reason: collision with root package name */
    private static final Df.b f10259d;

    /* renamed from: e, reason: collision with root package name */
    private static final Df.b f10260e;

    /* renamed from: f, reason: collision with root package name */
    private static final Df.b f10261f;

    /* renamed from: g, reason: collision with root package name */
    private static final Df.b f10262g;

    static {
        b.C0116b c0116bA = Df.b.a("maxMs");
        M0 m02 = new M0();
        m02.a(1);
        f10257b = c0116bA.b(m02.b()).a();
        b.C0116b c0116bA2 = Df.b.a("minMs");
        M0 m03 = new M0();
        m03.a(2);
        f10258c = c0116bA2.b(m03.b()).a();
        b.C0116b c0116bA3 = Df.b.a("avgMs");
        M0 m04 = new M0();
        m04.a(3);
        f10259d = c0116bA3.b(m04.b()).a();
        b.C0116b c0116bA4 = Df.b.a("firstQuartileMs");
        M0 m05 = new M0();
        m05.a(4);
        f10260e = c0116bA4.b(m05.b()).a();
        b.C0116b c0116bA5 = Df.b.a("medianMs");
        M0 m06 = new M0();
        m06.a(5);
        f10261f = c0116bA5.b(m06.b()).a();
        b.C0116b c0116bA6 = Df.b.a("thirdQuartileMs");
        M0 m07 = new M0();
        m07.a(6);
        f10262g = c0116bA6.b(m07.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        C3586z6 c3586z6 = (C3586z6) obj;
        Df.d dVar = (Df.d) obj2;
        dVar.a(f10257b, c3586z6.c());
        dVar.a(f10258c, c3586z6.e());
        dVar.a(f10259d, c3586z6.a());
        dVar.a(f10260e, c3586z6.b());
        dVar.a(f10261f, c3586z6.d());
        dVar.a(f10262g, c3586z6.f());
    }

    private C3485q3() {
    }
}
