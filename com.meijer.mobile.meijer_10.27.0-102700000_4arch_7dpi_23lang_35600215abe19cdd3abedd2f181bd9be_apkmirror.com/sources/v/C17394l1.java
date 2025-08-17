package v;

/* renamed from: v.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C17394l1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f164088a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final w.B f164089b;

    /* renamed from: c, reason: collision with root package name */
    private int f164090c;

    public int a() {
        int i10;
        synchronized (this.f164088a) {
            i10 = this.f164090c;
        }
        return i10;
    }

    void b(int i10) {
        synchronized (this.f164088a) {
            this.f164090c = i10;
        }
    }

    C17394l1(w.B b10, int i10) {
        this.f164089b = b10;
        this.f164090c = i10;
    }
}
