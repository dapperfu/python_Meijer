package m7;

/* renamed from: m7.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC15570e {

    /* renamed from: m7.e$a */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: a, reason: collision with root package name */
        private final boolean f149909a;

        boolean b() {
            return this.f149909a;
        }

        a(boolean z10) {
            this.f149909a = z10;
        }
    }

    boolean a();

    boolean b(InterfaceC15569d interfaceC15569d);

    void c(InterfaceC15569d interfaceC15569d);

    boolean d(InterfaceC15569d interfaceC15569d);

    void g(InterfaceC15569d interfaceC15569d);

    InterfaceC15570e getRoot();

    boolean h(InterfaceC15569d interfaceC15569d);
}
