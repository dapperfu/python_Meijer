package Dd;

import Bf.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class K2 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final K2 f5267a = new K2();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f5268b;

    static {
        b.C0047b c0047bA = Bf.b.a("format");
        M0 m02 = new M0();
        m02.a(1);
        f5268b = c0047bA.b(m02.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        ((Bf.d) obj2).f(f5268b, ((C3334w9) obj).a());
    }

    private K2() {
    }
}
