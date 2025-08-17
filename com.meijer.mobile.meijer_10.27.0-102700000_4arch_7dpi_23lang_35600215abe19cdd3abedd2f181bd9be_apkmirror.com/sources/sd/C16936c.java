package sd;

/* renamed from: sd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16936c {

    /* renamed from: c, reason: collision with root package name */
    private static C16936c f160423c;

    /* renamed from: a, reason: collision with root package name */
    private final C16935b f160424a = new C16935b();

    /* renamed from: b, reason: collision with root package name */
    private final C16938e f160425b = new C16938e();

    static {
        C16936c c16936c = new C16936c();
        synchronized (C16936c.class) {
            f160423c = c16936c;
        }
    }

    private static C16936c b() {
        C16936c c16936c;
        synchronized (C16936c.class) {
            c16936c = f160423c;
        }
        return c16936c;
    }

    private C16936c() {
    }

    public static C16935b a() {
        return b().f160424a;
    }
}
