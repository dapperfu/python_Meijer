package Ed;

import Bf.b;
import java.io.IOException;

/* renamed from: Ed.y1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3593y1 implements Bf.c {

    /* renamed from: a, reason: collision with root package name */
    static final C3593y1 f8912a = new C3593y1();

    /* renamed from: b, reason: collision with root package name */
    private static final Bf.b f8913b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bf.b f8914c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bf.b f8915d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bf.b f8916e;

    static {
        b.C0047b c0047bA = Bf.b.a("isChargingRequired");
        C3459f c3459f = new C3459f();
        c3459f.a(1);
        f8913b = c0047bA.b(c3459f.b()).a();
        b.C0047b c0047bA2 = Bf.b.a("isWifiRequired");
        C3459f c3459f2 = new C3459f();
        c3459f2.a(2);
        f8914c = c0047bA2.b(c3459f2.b()).a();
        b.C0047b c0047bA3 = Bf.b.a("isDeviceIdleRequired");
        C3459f c3459f3 = new C3459f();
        c3459f3.a(3);
        f8915d = c0047bA3.b(c3459f3.b()).a();
        b.C0047b c0047bA4 = Bf.b.a("canDownloadInBackground");
        C3459f c3459f4 = new C3459f();
        c3459f4.a(4);
        f8916e = c0047bA4.b(c3459f4.b()).a();
    }

    @Override // Bf.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        throw null;
    }

    private C3593y1() {
    }
}
