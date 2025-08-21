package v;

/* renamed from: v.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C17533l1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f165122a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final w.B f165123b;

    /* renamed from: c, reason: collision with root package name */
    private int f165124c;

    public int a() {
        int i10;
        synchronized (this.f165122a) {
            i10 = this.f165124c;
        }
        return i10;
    }

    void b(int i10) {
        synchronized (this.f165122a) {
            this.f165124c = i10;
        }
    }

    C17533l1(w.B b10, int i10) {
        this.f165123b = b10;
        this.f165124c = i10;
    }
}
