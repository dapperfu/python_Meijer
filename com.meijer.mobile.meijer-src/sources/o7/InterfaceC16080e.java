package o7;

/* renamed from: o7.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC16080e {

    /* renamed from: o7.e$a */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: a, reason: collision with root package name */
        private final boolean f153696a;

        boolean b() {
            return this.f153696a;
        }

        a(boolean z10) {
            this.f153696a = z10;
        }
    }

    boolean a();

    boolean b(InterfaceC16079d interfaceC16079d);

    boolean c(InterfaceC16079d interfaceC16079d);

    boolean d(InterfaceC16079d interfaceC16079d);

    void f(InterfaceC16079d interfaceC16079d);

    void g(InterfaceC16079d interfaceC16079d);

    InterfaceC16080e getRoot();
}
