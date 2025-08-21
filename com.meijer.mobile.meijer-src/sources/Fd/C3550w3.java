package Fd;

import Df.b;
import java.io.IOException;

/* renamed from: Fd.w3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3550w3 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3550w3 f10348a = new C3550w3();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f10349b;

    /* renamed from: c, reason: collision with root package name */
    private static final Df.b f10350c;

    /* renamed from: d, reason: collision with root package name */
    private static final Df.b f10351d;

    /* renamed from: e, reason: collision with root package name */
    private static final Df.b f10352e;

    static {
        b.C0116b c0116bA = Df.b.a("imageFormat");
        M0 m02 = new M0();
        m02.a(1);
        f10349b = c0116bA.b(m02.b()).a();
        b.C0116b c0116bA2 = Df.b.a("originalImageSize");
        M0 m03 = new M0();
        m03.a(2);
        f10350c = c0116bA2.b(m03.b()).a();
        b.C0116b c0116bA3 = Df.b.a("compressedImageSize");
        M0 m04 = new M0();
        m04.a(3);
        f10351d = c0116bA3.b(m04.b()).a();
        b.C0116b c0116bA4 = Df.b.a("isOdmlImage");
        M0 m05 = new M0();
        m05.a(4);
        f10352e = c0116bA4.b(m05.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        G6 g62 = (G6) obj;
        Df.d dVar = (Df.d) obj2;
        dVar.a(f10349b, g62.a());
        dVar.a(f10350c, g62.b());
        dVar.a(f10351d, null);
        dVar.a(f10352e, null);
    }

    private C3550w3() {
    }
}
