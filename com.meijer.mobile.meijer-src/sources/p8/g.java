package p8;

/* loaded from: classes4.dex */
enum g {
    CREATED(true, false),
    ENABLED(true, true),
    DISABLED(false, true);


    /* renamed from: a, reason: collision with root package name */
    private boolean f156241a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f156242b;

    boolean b() {
        return this.f156241a;
    }

    boolean e() {
        return this.f156242b;
    }

    g(boolean z10, boolean z11) {
        this.f156241a = z10;
        this.f156242b = z11;
    }
}
