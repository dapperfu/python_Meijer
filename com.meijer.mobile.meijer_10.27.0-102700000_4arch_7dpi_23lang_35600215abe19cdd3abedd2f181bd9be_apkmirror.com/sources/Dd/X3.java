package Dd;

import Bf.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class X3 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final X3 f5581a = new X3();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f5582b;

    static {
        b.C0047b c0047bA = Bf.b.a("errorCode");
        M0 m02 = new M0();
        m02.a(1);
        f5582b = c0047bA.b(m02.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        ((Bf.d) obj2).f(f5582b, ((C3277r7) obj).a());
    }

    private X3() {
    }
}
