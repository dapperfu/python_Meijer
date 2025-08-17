package Ed;

import Bf.b;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;

/* renamed from: Ed.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3475h1 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3475h1 f8490a = new C3475h1();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f8491b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f8492c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f8493d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bf.b f8494e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bf.b f8495f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bf.b f8496g;

    static {
        b.C0047b c0047bA = Bf.b.a("mode");
        C3459f c3459f = new C3459f();
        c3459f.a(1);
        f8491b = c0047bA.b(c3459f.b()).a();
        b.C0047b c0047bA2 = Bf.b.a(PlaceTypes.LANDMARK);
        C3459f c3459f2 = new C3459f();
        c3459f2.a(2);
        f8492c = c0047bA2.b(c3459f2.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("classification");
        C3459f c3459f3 = new C3459f();
        c3459f3.a(3);
        f8493d = c0047bA3.b(c3459f3.b()).a();
        b.C0047b c0047bA4 = Bf.b.a("prominentFaceOnly");
        C3459f c3459f4 = new C3459f();
        c3459f4.a(4);
        f8494e = c0047bA4.b(c3459f4.b()).a();
        b.C0047b c0047bA5 = Bf.b.a("tracking");
        C3459f c3459f5 = new C3459f();
        c3459f5.a(5);
        f8495f = c0047bA5.b(c3459f5.b()).a();
        b.C0047b c0047bA6 = Bf.b.a("minFaceSize");
        C3459f c3459f6 = new C3459f();
        c3459f6.a(6);
        f8496g = c0047bA6.b(c3459f6.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        throw null;
    }

    private C3475h1() {
    }
}
