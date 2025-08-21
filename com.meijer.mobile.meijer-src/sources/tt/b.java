package tt;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    final int f163392a = 60;

    /* renamed from: b, reason: collision with root package name */
    double[] f163393b = new double[60];

    /* renamed from: c, reason: collision with root package name */
    int f163394c;

    /* renamed from: d, reason: collision with root package name */
    private final bb.e f163395d;

    public final synchronized double a() {
        double d10;
        c();
        d10 = 0.0d;
        for (int i10 = 0; i10 < this.f163392a; i10++) {
            d10 += this.f163393b[i10];
        }
        return d10;
    }

    public final synchronized void b(double d10) {
        c();
        double[] dArr = this.f163393b;
        dArr[0] = dArr[0] + d10;
    }

    private void c() {
        int iA = (int) ((this.f163395d.a() / 1000) / 60);
        int i10 = iA - this.f163394c;
        if (i10 < 0) {
            for (int i11 = 0; i11 < this.f163392a; i11++) {
                this.f163393b[i11] = 0.0d;
            }
        } else if (i10 != 0) {
            for (int i12 = this.f163392a - 1; i12 >= i10; i12--) {
                double[] dArr = this.f163393b;
                dArr[i12] = dArr[i12 - i10];
            }
            for (int iMin = Math.min(i10 - 1, this.f163392a - 1); iMin >= 0; iMin--) {
                this.f163393b[iMin] = 0.0d;
            }
        }
        this.f163394c = iA;
    }

    public b(bb.e eVar) {
        this.f163395d = eVar;
    }
}
