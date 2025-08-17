package Ed;

import Bf.b;
import java.io.IOException;

/* renamed from: Ed.n2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3518n2 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3518n2 f8617a = new C3518n2();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f8618b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f8619c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f8620d;

    static {
        b.C0047b c0047bA = Bf.b.a("detectorMode");
        C3459f c3459f = new C3459f();
        c3459f.a(1);
        f8618b = c0047bA.b(c3459f.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("streamModeSmoothingRatio");
        C3459f c3459f2 = new C3459f();
        c3459f2.a(2);
        f8619c = c0047bA2.b(c3459f2.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("rawSizeMaskEnabled");
        C3459f c3459f3 = new C3459f();
        c3459f3.a(3);
        f8620d = c0047bA3.b(c3459f3.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        throw null;
    }

    private C3518n2() {
    }
}
