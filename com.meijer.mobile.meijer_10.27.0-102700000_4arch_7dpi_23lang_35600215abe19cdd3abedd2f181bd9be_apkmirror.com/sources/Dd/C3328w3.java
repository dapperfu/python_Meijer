package Dd;

import Bf.b;
import java.io.IOException;

/* renamed from: Dd.w3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3328w3 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3328w3 f6315a = new C3328w3();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f6316b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f6317c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f6318d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bf.b f6319e;

    static {
        b.C0047b c0047bA = Bf.b.a("imageFormat");
        M0 m02 = new M0();
        m02.a(1);
        f6316b = c0047bA.b(m02.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("originalImageSize");
        M0 m03 = new M0();
        m03.a(2);
        f6317c = c0047bA2.b(m03.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("compressedImageSize");
        M0 m04 = new M0();
        m04.a(3);
        f6318d = c0047bA3.b(m04.b()).a();
        b.C0047b c0047bA4 = Bf.b.a("isOdmlImage");
        M0 m05 = new M0();
        m05.a(4);
        f6319e = c0047bA4.b(m05.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        G6 g62 = (G6) obj;
        Bf.d dVar = (Bf.d) obj2;
        dVar.f(f6316b, g62.a());
        dVar.f(f6317c, g62.b());
        dVar.f(f6318d, null);
        dVar.f(f6319e, null);
    }

    private C3328w3() {
    }
}
