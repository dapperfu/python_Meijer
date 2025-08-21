package androidx.appcompat.widget;

/* loaded from: classes.dex */
class F {

    /* renamed from: a, reason: collision with root package name */
    private int f46863a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f46864b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f46865c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f46866d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f46867e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f46868f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46869g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46870h = false;

    public void e(int i10, int i11) {
        this.f46870h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f46867e = i10;
            this.f46863a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f46868f = i11;
            this.f46864b = i11;
        }
    }

    public int a() {
        return this.f46869g ? this.f46863a : this.f46864b;
    }

    public int b() {
        return this.f46863a;
    }

    public int c() {
        return this.f46864b;
    }

    public int d() {
        return this.f46869g ? this.f46864b : this.f46863a;
    }

    public void f(boolean z10) {
        if (z10 == this.f46869g) {
            return;
        }
        this.f46869g = z10;
        if (!this.f46870h) {
            this.f46863a = this.f46867e;
            this.f46864b = this.f46868f;
            return;
        }
        if (z10) {
            int i10 = this.f46866d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f46867e;
            }
            this.f46863a = i10;
            int i11 = this.f46865c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f46868f;
            }
            this.f46864b = i11;
            return;
        }
        int i12 = this.f46865c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f46867e;
        }
        this.f46863a = i12;
        int i13 = this.f46866d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f46868f;
        }
        this.f46864b = i13;
    }

    public void g(int i10, int i11) {
        this.f46865c = i10;
        this.f46866d = i11;
        this.f46870h = true;
        if (this.f46869g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f46863a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f46864b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f46863a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f46864b = i11;
        }
    }

    F() {
    }
}
