package Fd;

import Df.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class X1 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final X1 f9609a = new X1();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f9610b;

    /* renamed from: c, reason: collision with root package name */
    private static final Df.b f9611c;

    /* renamed from: d, reason: collision with root package name */
    private static final Df.b f9612d;

    static {
        b.C0116b c0116bA = Df.b.a("logEventKey");
        M0 m02 = new M0();
        m02.a(1);
        f9610b = c0116bA.b(m02.b()).a();
        b.C0116b c0116bA2 = Df.b.a("eventCount");
        M0 m03 = new M0();
        m03.a(2);
        f9611c = c0116bA2.b(m03.b()).a();
        b.C0116b c0116bA3 = Df.b.a("inferenceDurationStats");
        M0 m04 = new M0();
        m04.a(3);
        f9612d = c0116bA3.b(m04.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        C3377h1 c3377h1 = (C3377h1) obj;
        Df.d dVar = (Df.d) obj2;
        dVar.a(f9610b, c3377h1.a());
        dVar.a(f9611c, c3377h1.c());
        dVar.a(f9612d, c3377h1.b());
    }

    private X1() {
    }
}
