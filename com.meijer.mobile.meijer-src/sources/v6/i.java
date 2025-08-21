package v6;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f165631a = new String[5];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f165632b = new long[5];

    /* renamed from: c, reason: collision with root package name */
    private int f165633c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f165634d = 0;

    public void a(String str) {
        int i10 = this.f165633c;
        if (i10 == 5) {
            this.f165634d++;
            return;
        }
        this.f165631a[i10] = str;
        this.f165632b[i10] = System.nanoTime();
        j2.n.a(str);
        this.f165633c++;
    }

    public float b(String str) {
        int i10 = this.f165634d;
        if (i10 > 0) {
            this.f165634d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f165633c - 1;
        this.f165633c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f165631a[i11])) {
            j2.n.b();
            return (System.nanoTime() - this.f165632b[this.f165633c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f165631a[this.f165633c] + ".");
    }
}
