package ud;

/* renamed from: ud.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17383c {

    /* renamed from: c, reason: collision with root package name */
    private static C17383c f163909c;

    /* renamed from: a, reason: collision with root package name */
    private final C17382b f163910a = new C17382b();

    /* renamed from: b, reason: collision with root package name */
    private final C17385e f163911b = new C17385e();

    static {
        C17383c c17383c = new C17383c();
        synchronized (C17383c.class) {
            f163909c = c17383c;
        }
    }

    private static C17383c b() {
        C17383c c17383c;
        synchronized (C17383c.class) {
            c17383c = f163909c;
        }
        return c17383c;
    }

    private C17383c() {
    }

    public static C17382b a() {
        return b().f163910a;
    }
}
