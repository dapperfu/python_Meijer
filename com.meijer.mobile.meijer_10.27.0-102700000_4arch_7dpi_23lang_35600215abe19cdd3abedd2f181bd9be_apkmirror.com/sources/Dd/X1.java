package Dd;

import Bf.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class X1 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final X1 f5576a = new X1();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f5577b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f5578c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f5579d;

    static {
        b.C0047b c0047bA = Bf.b.a("logEventKey");
        M0 m02 = new M0();
        m02.a(1);
        f5577b = c0047bA.b(m02.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("eventCount");
        M0 m03 = new M0();
        m03.a(2);
        f5578c = c0047bA2.b(m03.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("inferenceDurationStats");
        M0 m04 = new M0();
        m04.a(3);
        f5579d = c0047bA3.b(m04.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        C3155h1 c3155h1 = (C3155h1) obj;
        Bf.d dVar = (Bf.d) obj2;
        dVar.f(f5577b, c3155h1.a());
        dVar.f(f5578c, c3155h1.c());
        dVar.f(f5579d, c3155h1.b());
    }

    private X1() {
    }
}
