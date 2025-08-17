package tt;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    final int f162090a = 60;

    /* renamed from: b, reason: collision with root package name */
    double[] f162091b = new double[60];

    /* renamed from: c, reason: collision with root package name */
    int f162092c;

    /* renamed from: d, reason: collision with root package name */
    private final Za.e f162093d;

    public final synchronized double a() {
        double d10;
        c();
        d10 = 0.0d;
        for (int i10 = 0; i10 < this.f162090a; i10++) {
            d10 += this.f162091b[i10];
        }
        return d10;
    }

    public final synchronized void b(double d10) {
        c();
        double[] dArr = this.f162091b;
        dArr[0] = dArr[0] + d10;
    }

    private void c() {
        int iA = (int) ((this.f162093d.a() / 1000) / 60);
        int i10 = iA - this.f162092c;
        if (i10 < 0) {
            for (int i11 = 0; i11 < this.f162090a; i11++) {
                this.f162091b[i11] = 0.0d;
            }
        } else if (i10 != 0) {
            for (int i12 = this.f162090a - 1; i12 >= i10; i12--) {
                double[] dArr = this.f162091b;
                dArr[i12] = dArr[i12 - i10];
            }
            for (int iMin = Math.min(i10 - 1, this.f162090a - 1); iMin >= 0; iMin--) {
                this.f162091b[iMin] = 0.0d;
            }
        }
        this.f162092c = iA;
    }

    public b(Za.e eVar) {
        this.f162093d = eVar;
    }
}
