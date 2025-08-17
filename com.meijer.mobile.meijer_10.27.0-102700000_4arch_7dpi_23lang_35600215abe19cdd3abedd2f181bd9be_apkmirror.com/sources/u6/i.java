package u6;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f162702a = new String[5];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f162703b = new long[5];

    /* renamed from: c, reason: collision with root package name */
    private int f162704c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f162705d = 0;

    public void a(String str) {
        int i10 = this.f162704c;
        if (i10 == 5) {
            this.f162705d++;
            return;
        }
        this.f162702a[i10] = str;
        this.f162703b[i10] = System.nanoTime();
        j2.n.a(str);
        this.f162704c++;
    }

    public float b(String str) {
        int i10 = this.f162705d;
        if (i10 > 0) {
            this.f162705d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f162704c - 1;
        this.f162704c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f162702a[i11])) {
            j2.n.b();
            return (System.nanoTime() - this.f162703b[this.f162704c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f162702a[this.f162704c] + ".");
    }
}
