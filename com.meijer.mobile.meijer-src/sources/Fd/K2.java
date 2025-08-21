package Fd;

import Df.b;
import java.io.IOException;

/* loaded from: classes6.dex */
final class K2 implements Df.c {

    /* renamed from: a, reason: collision with root package name */
    static final K2 f9300a = new K2();

    /* renamed from: b, reason: collision with root package name */
    private static final Df.b f9301b;

    static {
        b.C0116b c0116bA = Df.b.a("format");
        M0 m02 = new M0();
        m02.a(1);
        f9301b = c0116bA.b(m02.b()).a();
    }

    @Override // Df.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        ((Df.d) obj2).a(f9301b, ((C3556w9) obj).a());
    }

    private K2() {
    }
}
