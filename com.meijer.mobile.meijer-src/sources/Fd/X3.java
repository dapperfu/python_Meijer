package Fd;

import Df.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class X3 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final X3 f9614a = new X3();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f9615b;

    static {
        b.C0116b c0116bA = Df.b.a("errorCode");
        M0 m02 = new M0();
        m02.a(1);
        f9615b = c0116bA.b(m02.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        ((Df.d) obj2).a(f9615b, ((C3499r7) obj).a());
    }

    private X3() {
    }
}
