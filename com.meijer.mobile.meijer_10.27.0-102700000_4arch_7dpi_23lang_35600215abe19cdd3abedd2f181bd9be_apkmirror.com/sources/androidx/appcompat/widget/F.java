package androidx.appcompat.widget;

/* loaded from: classes.dex */
class F {

    /* renamed from: a, reason: collision with root package name */
    private int f46639a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f46640b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f46641c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f46642d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f46643e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f46644f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46645g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46646h = false;

    public void e(int i10, int i11) {
        this.f46646h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f46643e = i10;
            this.f46639a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f46644f = i11;
            this.f46640b = i11;
        }
    }

    public int a() {
        return this.f46645g ? this.f46639a : this.f46640b;
    }

    public int b() {
        return this.f46639a;
    }

    public int c() {
        return this.f46640b;
    }

    public int d() {
        return this.f46645g ? this.f46640b : this.f46639a;
    }

    public void f(boolean z10) {
        if (z10 == this.f46645g) {
            return;
        }
        this.f46645g = z10;
        if (!this.f46646h) {
            this.f46639a = this.f46643e;
            this.f46640b = this.f46644f;
            return;
        }
        if (z10) {
            int i10 = this.f46642d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f46643e;
            }
            this.f46639a = i10;
            int i11 = this.f46641c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f46644f;
            }
            this.f46640b = i11;
            return;
        }
        int i12 = this.f46641c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f46643e;
        }
        this.f46639a = i12;
        int i13 = this.f46642d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f46644f;
        }
        this.f46640b = i13;
    }

    public void g(int i10, int i11) {
        this.f46641c = i10;
        this.f46642d = i11;
        this.f46646h = true;
        if (this.f46645g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f46639a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f46640b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f46639a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f46640b = i11;
        }
    }

    F() {
    }
}
