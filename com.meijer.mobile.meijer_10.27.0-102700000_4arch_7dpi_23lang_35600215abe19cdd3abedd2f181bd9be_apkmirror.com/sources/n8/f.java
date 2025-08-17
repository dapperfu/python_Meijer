package n8;

/* loaded from: classes4.dex */
enum f {
    CREATED(true, false),
    ENABLED(true, true),
    DISABLED(false, true);


    /* renamed from: a, reason: collision with root package name */
    private boolean f151110a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f151111b;

    boolean b() {
        return this.f151110a;
    }

    boolean e() {
        return this.f151111b;
    }

    f(boolean z10, boolean z11) {
        this.f151110a = z10;
        this.f151111b = z11;
    }
}
