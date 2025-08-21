package Fd;

import Df.b;
import java.io.IOException;

/* renamed from: Fd.z5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3585z5 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3585z5 f10389a = new C3585z5();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f10390b;

    /* renamed from: c, reason: collision with root package name */
    private static final Df.b f10391c;

    /* renamed from: d, reason: collision with root package name */
    private static final Df.b f10392d;

    /* renamed from: e, reason: collision with root package name */
    private static final Df.b f10393e;

    /* renamed from: f, reason: collision with root package name */
    private static final Df.b f10394f;

    static {
        b.C0116b c0116bA = Df.b.a("xMin");
        M0 m02 = new M0();
        m02.a(1);
        f10390b = c0116bA.b(m02.b()).a();
        b.C0116b c0116bA2 = Df.b.a("yMin");
        M0 m03 = new M0();
        m03.a(2);
        f10391c = c0116bA2.b(m03.b()).a();
        b.C0116b c0116bA3 = Df.b.a("xMax");
        M0 m04 = new M0();
        m04.a(3);
        f10392d = c0116bA3.b(m04.b()).a();
        b.C0116b c0116bA4 = Df.b.a("yMax");
        M0 m05 = new M0();
        m05.a(4);
        f10393e = c0116bA4.b(m05.b()).a();
        b.C0116b c0116bA5 = Df.b.a("confidenceScore");
        M0 m06 = new M0();
        m06.a(5);
        f10394f = c0116bA5.b(m06.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        O8 o82 = (O8) obj;
        Df.d dVar = (Df.d) obj2;
        dVar.a(f10390b, o82.c());
        dVar.a(f10391c, o82.e());
        dVar.a(f10392d, o82.b());
        dVar.a(f10393e, o82.d());
        dVar.a(f10394f, o82.a());
    }

    private C3585z5() {
    }
}
