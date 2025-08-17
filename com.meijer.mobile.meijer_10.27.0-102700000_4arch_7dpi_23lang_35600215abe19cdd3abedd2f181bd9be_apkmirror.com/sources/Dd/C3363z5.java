package Dd;

import Bf.b;
import java.io.IOException;

/* renamed from: Dd.z5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3363z5 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3363z5 f6356a = new C3363z5();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f6357b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f6358c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f6359d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bf.b f6360e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bf.b f6361f;

    static {
        b.C0047b c0047bA = Bf.b.a("xMin");
        M0 m02 = new M0();
        m02.a(1);
        f6357b = c0047bA.b(m02.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("yMin");
        M0 m03 = new M0();
        m03.a(2);
        f6358c = c0047bA2.b(m03.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("xMax");
        M0 m04 = new M0();
        m04.a(3);
        f6359d = c0047bA3.b(m04.b()).a();
        b.C0047b c0047bA4 = Bf.b.a("yMax");
        M0 m05 = new M0();
        m05.a(4);
        f6360e = c0047bA4.b(m05.b()).a();
        b.C0047b c0047bA5 = Bf.b.a("confidenceScore");
        M0 m06 = new M0();
        m06.a(5);
        f6361f = c0047bA5.b(m06.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        O8 o82 = (O8) obj;
        Bf.d dVar = (Bf.d) obj2;
        dVar.f(f6357b, o82.c());
        dVar.f(f6358c, o82.e());
        dVar.f(f6359d, o82.b());
        dVar.f(f6360e, o82.d());
        dVar.f(f6361f, o82.a());
    }

    private C3363z5() {
    }
}
