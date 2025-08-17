package Ed;

import Bf.b;
import java.io.IOException;

/* renamed from: Ed.s1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3551s1 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3551s1 f8687a = new C3551s1();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f8688b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f8689c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f8690d;

    static {
        b.C0047b c0047bA = Bf.b.a("identifyLanguageConfidenceThreshold");
        C3459f c3459f = new C3459f();
        c3459f.a(1);
        f8688b = c0047bA.b(c3459f.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("identifyAllLanguagesConfidenceThreshold");
        C3459f c3459f2 = new C3459f();
        c3459f2.a(2);
        f8689c = c0047bA2.b(c3459f2.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("confidenceThreshold");
        C3459f c3459f3 = new C3459f();
        c3459f3.a(3);
        f8690d = c0047bA3.b(c3459f3.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        throw null;
    }

    private C3551s1() {
    }
}
